package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Aluno;
import grupox.moedaestudantil.entity.Resgate;
import grupox.moedaestudantil.entity.Vantagem;
import grupox.moedaestudantil.repository.AlunoRepository;
import grupox.moedaestudantil.repository.ResgateRepository;
import grupox.moedaestudantil.repository.VantagemRepository;


@Service
public class ResgateService {

    @Autowired
    private ResgateRepository resgateRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private VantagemRepository vantagemRepository;

    


    public Resgate createResgate(Resgate resgate) {

        Resgate salvo = resgateRepository.save(resgate);

        // --- 2. Enviar email apenas se for ENTRADA ---
        if ("ENTRADA".equalsIgnoreCase(resgate.getTipo()) && resgate.getAlunoId() != null) {

            Aluno aluno = alunoRepository.findById(resgate.getAlunoId()).orElse(null);

            if (aluno != null && aluno.getEmail() != null) {

                String mensagem =
                        "Olá " + aluno.getNome() + ",\n\n" +
                        "Você recebeu um depósito de saldo!\n\n" +
                        "Valor: R$ " + String.format("%.2f", resgate.getValor()) + "\n" +
                        "Descrição: " + resgate.getDescricao() + "\n" +
                        "Data: " + resgate.getData() + "\n\n" +
                        "Atenciosamente,\n" +
                        "Sistema de Moeda Estudantil.";

                emailService.enviar(
                        aluno.getEmail(),
                        "Você recebeu saldo!",
                        mensagem
                );
            }
        }

        if ("SAIDA".equalsIgnoreCase(resgate.getTipo())
        && resgate.getAlunoId() != null
        && resgate.getVantagemId() != null) {

    Aluno aluno = alunoRepository.findById(resgate.getAlunoId()).orElse(null);
    Vantagem vantagem = vantagemRepository.findById(resgate.getVantagemId()).orElse(null);

    if (aluno != null && aluno.getEmail() != null) {

        String nomeVantagem = (vantagem != null ? vantagem.getDescricao() : "Vantagem não informada");

        String mensagem =
                "Olá " + aluno.getNome() + ",\n\n" +
                "Você resgatou uma vantagem utilizando seu saldo!\n\n" +
                "Vantagem: " + nomeVantagem + "\n" +
                "Valor gasto: R$ " + String.format("%.2f", resgate.getValor()) + "\n" +
                "Código gerado: " + resgate.getCodigo() + "\n" +
                "Data: " + resgate.getData() + "\n\n" +
                "Aproveite sua recompensa!\n" +
                "Sistema de Moeda Estudantil.";

        emailService.enviar(
                aluno.getEmail(),
                "Você resgatou uma vantagem!",
                mensagem
        );
    }
}
        return salvo;
    }


    public Resgate updateResgate(Long id, Resgate updateResgates) {
        return resgateRepository.findById(id)
        .map(resgate -> {
            resgate.setAlunoId(updateResgates.getAlunoId());
            resgate.setProfessorId(updateResgates.getProfessorId());
            resgate.setVantagemId(updateResgates.getVantagemId());
            resgate.setTipo(updateResgates.getTipo());
            resgate.setDescricao(updateResgates.getDescricao());
            resgate.setValor(updateResgates.getValor());
            resgate.setData(updateResgates.getData());
            return resgateRepository.save(resgate);
        }).orElseThrow(() -> new RuntimeException("Resgate não encontrado"));
    }


    public void deleteResgate(Long id) {
        resgateRepository.deleteById(id);
    }

    public Resgate getResgateById(Long id) {
        return resgateRepository.findById(id).orElse(null);
    }

    public List<Resgate> getAllResgates() {
        return resgateRepository.findAll();
    }
}

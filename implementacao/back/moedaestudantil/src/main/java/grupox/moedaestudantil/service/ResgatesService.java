package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Resgates;
import grupox.moedaestudantil.repository.ResgatesRepository;

@Service
public class ResgatesService {

    private final ResgatesRepository repository;

    public ResgatesService(ResgatesRepository repository) {
        this.repository = repository;
    }

    public List<Resgates> getAllResgates() {
        return repository.findAll();
    }

    public Resgates createResgates(Resgates resgate) {
        return repository.save(resgate);
    }

    public Resgates getResgatesById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteResgate(Long id) {
        repository.deleteById(id);
    }

    public List<Resgates> getResgatesByAlunoId(Long alunoId) {
        return repository.findByAlunoIdOrderByIdDesc(alunoId);
    }


    // 🔥 MÉTODO NOVO → registrar entradas de saldo
    public Resgates registrarEntradaSaldo(Long alunoId, Double valor) {
        Resgates entrada = new Resgates();

        entrada.setAlunoId(alunoId);
        entrada.setTipo("ENTRADA");
        entrada.setDescricao("Saldo adicionado pelo professor");
        entrada.setValor(valor);
        entrada.setData(java.time.LocalDateTime.now().toString());

        return repository.save(entrada);
    }
}

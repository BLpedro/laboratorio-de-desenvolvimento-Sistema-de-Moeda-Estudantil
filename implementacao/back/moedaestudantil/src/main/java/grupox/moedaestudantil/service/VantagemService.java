package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Vantagem;
import grupox.moedaestudantil.repository.VantagemRepository;

@Service
public class VantagemService {

    @Autowired
    private AlunoRepository alunoRepository; 

    public Vantagem createVantagem(VantagemCreateDTO dto) {
        Aluno aluno = alunoRepository.findById(dto.getAlunoId())
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado!"));
            
        Vantagem vantagem = new Vantagem();
        vantagem.setFoto(dto.getFoto());
        vantagem.setValor(dto.getValor());
        vantagem.setQuant(dto.getQuant());
        vantagem.setDescricao(dto.getDescricao());
        vantagem.setEmpresaId(String.valueOf(dto.getEmpresaId()));
        vantagem.setAluno(aluno);
        
        return vantagemRepository.save(vantagem);
    }
    // Atualizar vantagem
    public Vantagem updateVantagem(Long id, Vantagem updateVantagem) {
        return vantagemRepository.findById(id)
            .map(vantagem -> {
                vantagem.setFoto(updateVantagem.getFoto());
                vantagem.setValor(updateVantagem.getValor());
                vantagem.setQuant(updateVantagem.getQuant());
                vantagem.setDescricao(updateVantagem.getDescricao());
                return vantagemRepository.save(vantagem);
            }).orElseThrow(() -> new RuntimeException("Vantagem não encontrada"));
    }

    // Deletar
    public void deleteVantagem(Long id) {
        vantagemRepository.deleteById(id);
    }

    // Buscar por ID
    public Vantagem getVantagemById(Long id) {
        return vantagemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Vantagem não encontrada"));
    }

    // Listar todas
    public List<Vantagem> getAllVantagens() {
        return vantagemRepository.findAll();
    }
}

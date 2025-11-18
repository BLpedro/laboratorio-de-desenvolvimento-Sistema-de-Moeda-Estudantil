package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Vantagem;
import grupox.moedaestudantil.repository.VantagemRepository;

@Service
public class VantagemService {

    @Autowired
    private VantagemRepository vantagemRepository;

    // Criar novo usuário
    public Vantagem createVantagem(Vantagem vantagem) {
        return vantagemRepository.save(vantagem);
    }

    // Atualizar usuário
    public Vantagem updateVantagem(Long id, Vantagem updateVantagem) {
        return vantagemRepository.findById(id)
            .map(vantagem -> {
                vantagem.setFoto(updateVantagem.getFoto());
                vantagem.setValor(updateVantagem.getValor());
                vantagem.setQuant(updateVantagem.getQuant());
                vantagem.setDescricao(updateVantagem.getDescricao());
                return vantagemRepository.save(vantagem);
            }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // Deletar
    public void deleteVantagem(Long id) {
        vantagemRepository.deleteById(id);
    }

    // Buscar por ID
    public Vantagem getVantagemById(Long id) {
        return vantagemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }


    // Listar todos
    public List<Vantagem> getAllVantagens() {
        return vantagemRepository.findAll();
    }
}

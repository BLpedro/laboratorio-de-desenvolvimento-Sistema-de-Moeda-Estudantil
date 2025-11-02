package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Instituicao;
import grupox.moedaestudantil.repository.InstituicaoRepository;


@Service
public class InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;


    public Instituicao createInstituicao(Instituicao instituicao) {
        return instituicaoRepository.save(instituicao);
    }

public Instituicao updateInstituicao(Long id, Instituicao updateInstituicao) {
        return instituicaoRepository.findById(id)
            .map(instituicao -> {
                instituicao.setNome(updateInstituicao.getNome());
                instituicao.setCnpj(updateInstituicao.getCnpj());
                return instituicaoRepository.save(instituicao);
            }).orElseThrow(() -> new RuntimeException("Instituição não encontrada"));
    }

    public void deleteInstituicao(Long id) {
        instituicaoRepository.deleteById(id);
    }

    public Instituicao getInstituicaoById(Long id) {
        return instituicaoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Instituição não encontrada"));
    }

    public List<Instituicao> getAllInstituicoes() {
        return instituicaoRepository.findAll();
    }




    
}
package grupox.moedaestudantil.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Aluno;
import grupox.moedaestudantil.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno updateAluno(Long id, Aluno updateAluno) {
        return alunoRepository.findById(id)
        .map(aluno -> {
            aluno.setCpf(updateAluno.getCpf());
            aluno.setNome(updateAluno.getNome());
            aluno.setEmail(updateAluno.getEmail());
            aluno.setRg(updateAluno.getRg());
            aluno.setCurso(updateAluno.getCurso());
            aluno.setInstituicaoId(updateAluno.getInstituicaoId());
            aluno.setSaldo(updateAluno.getSaldo());
            aluno.setEndereco(updateAluno.getEndereco());
            return alunoRepository.save(aluno);
        }).orElseThrow(() -> new RuntimeException("Aluno not found with id " + id));
    }

        public void deleteAluno(Long id) {
            alunoRepository.deleteById(id);
        }

        public Aluno getAlunoById(Long id) {
            return alunoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Aluno not found with id " + id));
        }


        public List<Aluno> getAllAlunos() {
            return alunoRepository.findAll();
        }
}
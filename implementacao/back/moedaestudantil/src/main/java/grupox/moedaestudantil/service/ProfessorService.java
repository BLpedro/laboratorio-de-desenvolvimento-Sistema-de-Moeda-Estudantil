package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Professor;
import grupox.moedaestudantil.repository.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;


    public Professor createProfessor(Professor professor){
        return professorRepository.save(professor);
    }
    

    public void deleteProfessor(Long id){
        professorRepository.deleteById(id);
    }



    public Professor updateProfessores(Long id, Professor updateProfessor) {
        return professorRepository.findById(id)
            .map(professor -> {
                professor.setSaldo(updateProfessor.getSaldo());
                professor.setDepartamento(updateProfessor.getDepartamento());
                return professorRepository.save(professor);
            }).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }



       public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }
}


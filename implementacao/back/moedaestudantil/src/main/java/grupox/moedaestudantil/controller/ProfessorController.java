package grupox.moedaestudantil.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import grupox.moedaestudantil.entity.Professor;
import grupox.moedaestudantil.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {


 @Autowired
 private ProfessorService professorService;

 @GetMapping
 public List<Professor> getAllProfessores() {
     return professorService.getAllProfessores();
 }

 @GetMapping("/{id}")
 public Professor getProfessorById(@PathVariable Long id) {
     return professorService.getProfessorById(id);
 }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.createProfessor(professor);
    }

    @PutMapping("/{id}")
    public Professor updateProfessores(@PathVariable Long id, @RequestBody Professor professor) {
        return professorService.updateProfessores(id, professor);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessor(@PathVariable Long id) {
        professorService.deleteProfessor(id);
    }


}

package grupox.moedaestudantil.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import grupox.moedaestudantil.entity.Aluno;
import grupox.moedaestudantil.service.AlunoService;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    

    @Autowired
    private AlunoService alunoService;


      @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }


    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.createAluno(aluno);
    }



    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.updateAluno(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoService.deleteAluno(id);
    }


}
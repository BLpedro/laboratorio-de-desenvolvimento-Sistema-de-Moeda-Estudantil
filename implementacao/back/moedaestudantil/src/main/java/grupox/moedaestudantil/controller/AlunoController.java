package grupox.moedaestudantil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupox.moedaestudantil.entity.Aluno;
import grupox.moedaestudantil.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<Page<AlunoDTO>> getAllAlunos(
            @PageableDefault(page = 0, size = 10, sort = "nome") Pageable pageable) {
        Page<Aluno> pageAlunos = alunoService.getAllAlunos(pageable);

        Page<AlunoDTO> pageDtos = pageAlunos.map(aluno -> new AlunoDTO(
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getCurso()));

        return ResponseEntity.ok(pageDtos);
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
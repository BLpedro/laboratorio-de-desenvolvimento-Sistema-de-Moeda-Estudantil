package grupox.moedaestudantil.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import grupox.moedaestudantil.entity.Instituicao;
import grupox.moedaestudantil.service.InstituicaoService;

@RestController
@RequestMapping("/instituicoes")
public class InstituicaoController {


 @Autowired
 private InstituicaoService instituicaoService;

 @GetMapping
 public List<Instituicao> getAllInstituicoes() {
     return instituicaoService.getAllInstituicoes();
 }

 @GetMapping("/{id}")
 public Instituicao getInstituicaoById(@PathVariable Long id) {
     return instituicaoService.getInstituicaoById(id);
 }

    @PostMapping
    public Instituicao createInstituicao(@RequestBody Instituicao instituicao) {
        return instituicaoService.createInstituicao(instituicao);
    }

    @PutMapping("/{id}")
    public Instituicao updateInstituicao(@PathVariable Long id, @RequestBody Instituicao instituicao) {
        return instituicaoService.updateInstituicao(id, instituicao);
    }

    @DeleteMapping("/{id}")
    public void deleteInstituicao(@PathVariable Long id) {
        instituicaoService.deleteInstituicao(id);
    }


}

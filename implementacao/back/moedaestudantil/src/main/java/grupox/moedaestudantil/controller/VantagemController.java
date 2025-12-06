package grupox.moedaestudantil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import grupox.moedaestudantil.dto.VantagemCreateDTO;
import grupox.moedaestudantil.entity.Aluno;
import grupox.moedaestudantil.entity.Vantagem;
import grupox.moedaestudantil.repository.AlunoRepository;
import grupox.moedaestudantil.service.VantagemService;

@RestController
@RequestMapping("/vantagens")
public class VantagemController {

    @Autowired
    private VantagemService vantagemService;

    @Autowired
    private AlunoRepository alunoRepository; // necessário para buscar o Aluno

    @GetMapping
    public List<Vantagem> getAllVantagens() {
        return vantagemService.getAllVantagens();
    }

    @GetMapping("/{id}")
    public Vantagem getVantagemById(@PathVariable Long id) {
        return vantagemService.getVantagemById(id);
    }

    @PostMapping
    public Vantagem create(@RequestBody VantagemCreateDTO dto) {
        return vantagemService.createVantagem(dto);
    }

    @PutMapping("/{id}")
    public Vantagem updateVantagem(@PathVariable Long id, @RequestBody Vantagem vantagem) {
        return vantagemService.updateVantagem(id, vantagem);
    }

    @DeleteMapping("/{id}")
    public void deleteVantagem(@PathVariable Long id) {
        vantagemService.deleteVantagem(id);
    }
}

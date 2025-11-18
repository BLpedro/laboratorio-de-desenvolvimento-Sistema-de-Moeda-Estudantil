package grupox.moedaestudantil.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import grupox.moedaestudantil.entity.Resgates;
import grupox.moedaestudantil.service.ResgatesService;

@RestController
@RequestMapping("/resgates")
public class ResgatesController {

    @Autowired
    private ResgatesService resgatesService;

    // -----------------------------
    // 1) Buscar resgates de um aluno
    // -----------------------------
    @GetMapping("/aluno/{alunoId}")
    public List<Resgates> getResgatesByAlunoId(@PathVariable Long alunoId) {
        return resgatesService.getResgatesByAlunoId(alunoId);
    }

    // -----------------------------
    // 2) Buscar todos os resgates
    // -----------------------------
    @GetMapping
    public List<Resgates> getAllResgates() {
        return resgatesService.getAllResgates();
    }

    // -----------------------------
    // 3) Criar um novo resgate (SAÍDA)
    // -----------------------------
    @PostMapping
    public Resgates createResgates(@RequestBody Resgates resgate) {
        return resgatesService.createResgates(resgate);
    }

    // -----------------------------
    // 4) Buscar resgate por ID
    // -----------------------------
    @GetMapping("/{id}")
    public Resgates getResgatesById(@PathVariable Long id) {
        return resgatesService.getResgatesById(id);
    }

    // -----------------------------
    // 5) Deletar resgate por ID
    // -----------------------------
    @DeleteMapping("/{id}")
    public void deleteResgate(@PathVariable Long id) {
        resgatesService.deleteResgate(id);
    }


    // -----------------------------------------------------
    // 6) 🔥 Registrar ENTRADA DE SALDO pelo professor
    // -----------------------------------------------------
    @PostMapping("/entrada/{alunoId}")
    public Resgates registrarEntradaSaldo(
            @PathVariable Long alunoId,
            @RequestBody EntradaSaldoRequest request) {

        return resgatesService.registrarEntradaSaldo(alunoId, request.getValor());
    }


    // Classe auxiliar para receber o JSON { "valor": 50 }
    public static class EntradaSaldoRequest {
        private Double valor;

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }
    }
}

package grupox.moedaestudantil.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import grupox.moedaestudantil.entity.Empresa;
import grupox.moedaestudantil.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {


 @Autowired
 private EmpresaService empresaService;

 @GetMapping
 public List<Empresa> getAllEmpresas() {
     return empresaService.getAllEmpresas();
 }

 @GetMapping("/{id}")
 public Empresa getEmpresaById(@PathVariable Long id) {
     return empresaService.getEmpresaById(id);
 }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.createEmpresa(empresa);
    }

    @PutMapping("/{id}")
    public Empresa updateEmpresa(@PathVariable Long id, @RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable Long id) {
        empresaService.deleteEmpresa(id);
    }


}

package grupox.moedaestudantil.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import grupox.moedaestudantil.entity.Resgate;
import grupox.moedaestudantil.service.ResgateService;

@RestController
@RequestMapping("/resgates")
public class ResgateController{


@Autowired
private ResgateService resgateService;

 @GetMapping
 public List<Resgate> getAllResgates() {
     return resgateService.getAllResgates();
 }

  @GetMapping("/{id}")
 public Resgate getResgateById(@PathVariable Long id) {
     return resgateService.getResgateById(id);
 }

 @PostMapping
    public Resgate createResgate(@RequestBody Resgate resgate) {
        return resgateService.createResgate(resgate);
    }

    @PutMapping("/{id}")
    public Resgate updateResgate(@PathVariable Long id, @RequestBody Resgate resgate) {
        return resgateService.updateResgate(id, resgate);
    }

    @DeleteMapping("/{id}")
    public void deleteResgate(@PathVariable Long id) {
        resgateService.deleteResgate(id);
    }
 
}
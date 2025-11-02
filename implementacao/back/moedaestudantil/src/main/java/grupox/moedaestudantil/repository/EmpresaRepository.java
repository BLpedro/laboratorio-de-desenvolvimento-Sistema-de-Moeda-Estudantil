package grupox.moedaestudantil.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import grupox.moedaestudantil.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
}

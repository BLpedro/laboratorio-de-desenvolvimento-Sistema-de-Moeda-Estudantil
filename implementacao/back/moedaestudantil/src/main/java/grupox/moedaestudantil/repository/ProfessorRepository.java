package grupox.moedaestudantil.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import grupox.moedaestudantil.entity.Professor;

public interface  ProfessorRepository  extends  JpaRepository<Professor, Long>{
    
}

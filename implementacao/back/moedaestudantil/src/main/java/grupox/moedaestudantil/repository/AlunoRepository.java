package grupox.moedaestudantil.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import grupox.moedaestudantil.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

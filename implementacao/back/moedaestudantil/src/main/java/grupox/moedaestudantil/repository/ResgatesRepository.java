package grupox.moedaestudantil.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import grupox.moedaestudantil.entity.Resgates;

public interface ResgatesRepository extends JpaRepository<Resgates, Long> {
    List<Resgates> findByAlunoId(Long alunoId);
    List<Resgates> findByAlunoIdOrderByIdDesc(Long alunoId);
}

package grupox.moedaestudantil.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import grupox.moedaestudantil.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByLoginAndSenha(String login, String senha);
}
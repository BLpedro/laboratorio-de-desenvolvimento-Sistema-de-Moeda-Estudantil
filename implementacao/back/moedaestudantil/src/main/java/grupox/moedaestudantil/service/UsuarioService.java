package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Usuario;
import grupox.moedaestudantil.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Criar novo usuário
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Atualizar usuário
    public Usuario updateUsuario(Long id, Usuario updateUsuario) {
        return usuarioRepository.findById(id)
            .map(usuario -> {
                usuario.setLogin(updateUsuario.getLogin());
                usuario.setSenha(updateUsuario.getSenha());
                return usuarioRepository.save(usuario);
            }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // Deletar
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    // Buscar por ID
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // Login
    public Usuario login(String login, String senha) {
        return usuarioRepository.findByLoginAndSenha(login, senha)
                .orElseThrow(() -> new RuntimeException("Credenciais inválidas"));
    }

    // Alterar senha
    public void alterarSenha(Long id, String novaSenha) {
        Usuario usuario = getUsuarioById(id);
        usuario.setSenha(novaSenha);
        usuarioRepository.save(usuario);
    }

    // Listar todos
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
}

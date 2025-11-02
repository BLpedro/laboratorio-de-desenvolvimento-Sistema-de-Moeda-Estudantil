package grupox.moedaestudantil.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import grupox.moedaestudantil.entity.Usuario;
import grupox.moedaestudantil.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        try {
            Usuario usuarioLogado = usuarioService.login(usuario.getLogin(), usuario.getSenha());
            return ResponseEntity.ok(usuarioLogado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(401).build(); // 401 Unauthorized
        }
    }

    @PutMapping("/{id}/senha")
    public void alterarSenha(@PathVariable Long id, @RequestParam String novaSenha) {
        usuarioService.alterarSenha(id, novaSenha);
    }
}

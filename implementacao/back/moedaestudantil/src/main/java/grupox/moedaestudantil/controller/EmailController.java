package grupox.moedaestudantil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import grupox.moedaestudantil.dto.EmailDTO;
import grupox.moedaestudantil.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/enviar")
    public ResponseEntity<String> enviar(@RequestBody EmailDTO dto) {
        emailService.enviar(dto.getEmail(), dto.getAssunto(), dto.getMensagem());
        return ResponseEntity.ok("Email enviado com sucesso");
    }
}
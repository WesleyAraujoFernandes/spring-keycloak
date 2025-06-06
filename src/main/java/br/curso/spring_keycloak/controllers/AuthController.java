package br.curso.spring_keycloak.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.curso.spring_keycloak.models.User;
import br.curso.spring_keycloak.services.LoginService;
import jakarta.validation.Valid;

@RestController
public class AuthController {

    @Autowired
    private LoginService<String> loginService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody User user) {
        return loginService.login(user);
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestParam("refresh_token") String refreshToken) {
        return loginService.refreshToken(refreshToken);
    }
}

package br.curso.spring_keycloak.services;

import org.springframework.http.ResponseEntity;

import br.curso.spring_keycloak.models.User;

public interface LoginService<T> {
    ResponseEntity<T> login(User user);

    ResponseEntity<T> refreshToken(String refresToken);
}

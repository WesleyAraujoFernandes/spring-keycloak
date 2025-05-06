package br.curso.spring_keycloak.models;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
}

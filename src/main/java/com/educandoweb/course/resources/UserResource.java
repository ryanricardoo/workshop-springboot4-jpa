package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController // Prepara a classe para receber requisição http
@RequestMapping(value = "/users") // Rota ou caminho para o recurso, tudo relacionado a usuários passará por esse
                                  // endereço
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "9864854659", "12345");
        return ResponseEntity.ok().body(u);
    }
}

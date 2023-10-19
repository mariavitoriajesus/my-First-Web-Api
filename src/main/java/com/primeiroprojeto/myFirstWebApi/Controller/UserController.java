package com.primeiroprojeto.myFirstWebApi.Controller;

import com.primeiroprojeto.myFirstWebApi.Model.Usuario;
import com.primeiroprojeto.myFirstWebApi.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PostMapping
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}

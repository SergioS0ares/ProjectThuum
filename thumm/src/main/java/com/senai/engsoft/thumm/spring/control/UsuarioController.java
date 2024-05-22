package com.senai.engsoft.thumm.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.engsoft.thumm.spring.model.UsuarioModel;
import com.senai.engsoft.thumm.spring.repository.UsuarioRepository;

import java.util.List;
import java.util.UUID;

@RestController // Usar @RestController em vez de @Controller para respostas JSON por padrão
@RequestMapping("/usuarios") // Definir um caminho base para todos os endpoints
public class UsuarioController {

    @Autowired
    UsuarioRepository userRepository;

    @PostMapping
    public @ResponseBody UsuarioModel addUser(@RequestBody UsuarioModel userModel) {
        userRepository.save(userModel);
        return userModel;
    }

    @PutMapping("/{id}")
    public @ResponseBody UsuarioModel updateUser(@PathVariable UUID id, @RequestBody UsuarioModel userModel) {
        userModel.setIdUser(id);
        userRepository.save(userModel);
        return userModel;
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void removeUser(@PathVariable UUID id) {
        userRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public @ResponseBody UsuarioModel getUser(@PathVariable UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping
    public @ResponseBody List<UsuarioModel> getAllUsers() {
        return userRepository.findAll();
    }
}

package com.senai.engsoft.thumm.spring.service;

import com.senai.engsoft.thumm.spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repo;
}

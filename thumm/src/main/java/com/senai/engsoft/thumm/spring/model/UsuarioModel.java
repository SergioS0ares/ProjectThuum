package com.senai.engsoft.thumm.spring.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "User_Model")
public class UsuarioModel {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID idUser;

        @Column(name = "nome")
        private String nome;

        @Column(name = "log")
        private String log;

        @Column(name = "senha")
        private String senha;

        // Você pode adicionar mais atributos específicos do UserModel aqui, se necessário.

        // Getters e Setters
        public UUID getIdUser() {
            return idUser;
        }

        public void setIdUser(UUID idUser) {
            this.idUser = idUser;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getLog() {
            return log;
        }

        public void setLog(String log) {
            this.log = log;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }


    }

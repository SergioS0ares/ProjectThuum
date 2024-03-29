package com.thuum.main.classes;

import java.util.List;
import java.util.UUID;

public abstract class Usuarios {

    // atributos

    private UUID idUser;
    private String nome;
    private String log;
    private String senha;
    private List<Tarefas> tarefasVinculadas;

    // getters e setters

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

    public List<Tarefas> getTarefasVinculadas() {
        return tarefasVinculadas;
    }

    public void setTarefasVinculadas(List<Tarefas> tarefasVinculadas) {
        this.tarefasVinculadas = tarefasVinculadas;
    }
}

package com.thuum.main.Spring.MODEL;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tarefa_Model")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTarefa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "lista_checkBoxesIds")
    private String checkBoxesIds;

    @Column(name = "usuario_atribuido")
    private UUID idUsuarioAtribuido;

    @Column(name = "lista_assistentes")
    private String assistentesIds;

    // Getters
    public UUID getIdTarefa() {
        return idTarefa;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCheckBoxesIds() {
        return checkBoxesIds;
    }

    public UUID getIdUsuarioAtribuido() {
        return idUsuarioAtribuido;
    }

    public String getAssistentesIds() {
        return assistentesIds;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCheckBoxesIds(String checkBoxesIds) {
        this.checkBoxesIds = checkBoxesIds;
    }

    public void setIdUsuarioAtribuido(UUID idUsuarioAtribuido) {
        this.idUsuarioAtribuido = idUsuarioAtribuido;
    }

    public void setAssistentesIds(String assistentesIds) {
        this.assistentesIds = assistentesIds;
    }

    // Método toString
    @Override
    public String toString() {
        return "TaskModel{" +
                "idTarefa=" + idTarefa +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", checkBoxesIds='" + checkBoxesIds + '\'' +
                ", idUsuarioAtribuido=" + idUsuarioAtribuido +
                ", assistentesIds='" + assistentesIds + '\'' +
                '}';
    }

	public void setIdTask(UUID id) {
		this.idTarefa = id;
	}

	public String getUsuario() {
		String user = "";
		
		return user;
	}
}

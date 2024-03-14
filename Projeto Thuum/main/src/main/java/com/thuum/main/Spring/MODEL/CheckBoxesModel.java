package com.thuum.main.Spring.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "CheckBoxes_Model")
public class CheckBoxesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCheckbox;

    @Column(name = "complete")
    private boolean complete;

    @Column(name = "descricao")
    private String descricao;

    // Construtor padrão
    public CheckBoxesModel() {
        this.idCheckbox = UUID.randomUUID();
    }

    // Construtor com parâmetros
    public CheckBoxesModel(boolean complete, String descricao) {
        this.idCheckbox = UUID.randomUUID();
        this.complete = complete;
        this.descricao = descricao;
    }

    // Getters e setters
    public UUID getIdCheckbox() {
        return idCheckbox;
    }

    public void setIdCheckbox(UUID idCheckbox) {
        this.idCheckbox = idCheckbox;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para alternar o estado da checkbox (completo/incompleto)
    public void toggleComplete() {
        this.complete = !this.complete;
    }
}

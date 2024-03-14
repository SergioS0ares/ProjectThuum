package com.thuum.main.classes;

import java.util.UUID;

public class CheckBox {

    // atributos

    UUID idCheckbox;
    boolean complete;
    String descricao;

    // metodos

    public void setBox() {
        if (complete == true) {
            complete = false;
        } else if (complete == false) {
            complete = true;
        } else {
            complete = false;
        }
    }

    public void setDescricao(String text) {
        descricao = text;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getComplete(UUID id) {
        boolean check = false;
        if (complete == true && id == idCheckbox) {
            check = true;
        } else if (id != idCheckbox) {
            System.out.println("id com erro");
        }
        return check;
    }

	public UUID getIdCheckbox() {
		return idCheckbox;
	}
}

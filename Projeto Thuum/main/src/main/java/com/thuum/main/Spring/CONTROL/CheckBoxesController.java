package com.thuum.main.Spring.CONTROL;

import com.thuum.main.classes.CheckBox;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/checkboxes")
public class CheckBoxesController extends CheckBox {

    // Simulação de um repositório de checkboxes em memória
    private List<CheckBox> checkboxes = new ArrayList<>();

    // Endpoint para obter todas as checkboxes
    @GetMapping
    public List<CheckBox> getAllCheckBoxes() {
        return checkboxes;
    }

    // Endpoint para obter uma checkbox por ID
    @GetMapping("/{id}")
    public CheckBox getCheckBoxById(@PathVariable UUID id) {
        for (CheckBox checkbox : checkboxes) {
            if (checkbox.getIdCheckbox().equals(id)) {
                return checkbox;
            }
        }
        return null; // Ou lançar uma exceção se a checkbox não for encontrada
    }

    // Endpoint para criar uma nova checkbox
    @PostMapping
    public CheckBox createCheckBox(@RequestBody CheckBox newCheckBox) {
        checkboxes.add(newCheckBox);
        return newCheckBox;
    }

    // Endpoint para atualizar uma checkbox existente
    @PutMapping("/{id}")
    public CheckBox updateCheckBox(@PathVariable UUID id, @RequestBody CheckBox updatedCheckBox) {
        for (int i = 0; i < checkboxes.size(); i++) {
            if (checkboxes.get(i).getIdCheckbox().equals(id)) {
                checkboxes.set(i, updatedCheckBox);
                return updatedCheckBox;
            }
        }
        return null; // Ou lançar uma exceção se a checkbox não for encontrada
    }

    // Endpoint para excluir uma checkbox
    @DeleteMapping("/{id}")
    public void deleteCheckBox(@PathVariable UUID id) {
        checkboxes.removeIf(checkbox -> checkbox.getIdCheckbox().equals(id));
    }
}

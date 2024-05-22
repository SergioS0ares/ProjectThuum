package com.senai.engsoft.thumm.spring.control;


import com.senai.engsoft.thumm.spring.model.TarefaModel;
import com.senai.engsoft.thumm.spring.repository.TarefaRepository;
import com.senai.engsoft.thumm.spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class TarefaController {

    @Autowired
    TarefaRepository repoTask;

    @Autowired
    UsuarioRepository repoUser;

    @PostMapping("/tasks")
    public @ResponseBody TarefaModel addTask(@RequestBody TarefaModel taskModel) {
        repoTask.save(taskModel);
        return taskModel;
    }

    @PutMapping("/tasks/{id}")
    public @ResponseBody TarefaModel updateTask(@PathVariable UUID id, @RequestBody TarefaModel taskModel) {
        taskModel.setIdTask(id);
        repoTask.save(taskModel);
        return taskModel;
    }

    @DeleteMapping("/tasks/{id}")
    public @ResponseBody void removeTask(@PathVariable UUID id) {
        repoTask.deleteById(id);
    }

    @GetMapping("/tasks/{id}")
    public @ResponseBody TarefaModel getTask(@PathVariable UUID id) {
        return repoTask.findById(id).orElse(null);
    }
}
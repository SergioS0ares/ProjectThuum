package com.thuum.main.Spring.CONTROL;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.thuum.main.Spring.MODEL.TaskModel;
import com.thuum.main.Spring.REPOSITORY.TaskRepository;
import com.thuum.main.Spring.REPOSITORY.UserRepository;

@Controller
public class TaskController {

    @Autowired
    TaskRepository repoTask;

    @Autowired
    UserRepository repoUser;

    @PostMapping("/tasks")
    public @ResponseBody TaskModel addTask(@RequestBody TaskModel taskModel) {
        repoTask.save(taskModel);
        //TODO: process POST request
        return taskModel;
    }

    @PutMapping("/tasks/{id}")
    public @ResponseBody TaskModel updateTask(@PathVariable UUID id, @RequestBody TaskModel taskModel) {
        taskModel.setIdTask(id);
        repoTask.save(taskModel);
        //TODO: process PUT request
        return taskModel;
    }

    @DeleteMapping("/tasks/{id}")
    public @ResponseBody void removeTask(@PathVariable UUID id) {
        repoTask.deleteById(id);
        //TODO: process DELETE request
    }

    @GetMapping("/tasks/{id}")
    public @ResponseBody TaskModel getTask(@PathVariable UUID id) {
        //TODO: process GET request
        return repoTask.findById(id).orElse(null);
    }
}


package com.thuum.main.Spring.SERVICE;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuum.main.Spring.MODEL.TaskModel;
import com.thuum.main.Spring.REPOSITORY.TaskRepository;

@Service
public class TaskService {

    @Autowired
    TaskRepository repo;

    public List<TaskModel> findAllByUsuario(String name) {
        // Buscar todos os usuários que tenham a string fornecida dentro do nome (string.has('bla bla bla'))
        List<TaskModel> tasks = new ArrayList<>();
        List<TaskModel> allTasks = repo.findAll();
        for (TaskModel task : allTasks) {
            String taskIdsString = task.getUsuario();
            String[] taskIdsArray = taskIdsString.split(",");
            for (String taskIdStr : taskIdsArray) {
                UUID taskId = UUID.fromString(taskIdStr.trim());
                tasks.addAll(repo.findAllByTaskId(taskId));
            }
        }
        return tasks;
    }
    
}

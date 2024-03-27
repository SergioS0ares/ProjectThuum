package com.thuum.main.Spring.SERVICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    
    public List<TaskModel> findAllByDataCriada(String data) {
    	List<TaskModel> tasks = new ArrayList<>();
    	List<TaskModel> allTasks = repo.findAll();
    	for (TaskModel task : allTasks) {
    		String taskIdString = task.getDataCriacao() + "";
    		String[] taskIdArray = taskIdString.split(",");
    		for (String taskIdStr : taskIdArray) {
    			UUID taskid = UUID.fromString(taskIdStr.trim());
    			tasks.addAll(repo.findAllByTaskId(taskid));
    		}
    	}
    	return tasks;
    }
    
    public List<TaskModel> findAllByDataFinalizada(String data){
    	List<TaskModel> tasks = new ArrayList<>();
    	List<TaskModel> allTasks = repo.findAll();
    	for (TaskModel task : allTasks) {
    		String taskIdString = task.getDataConclusao() + "";
    		String[] taskIdArray = taskIdString.split(",");
    		for (String taskIdStr : taskIdArray) {
    			UUID taskId = UUID.fromString(taskIdStr.trim());
    			tasks.addAll(repo.findAllByTaskId(taskId));
    		}
    	}
    	return tasks;
    }
    
    public List<TaskModel> findALLByDataUltimaAtualizacao(String data){
    	List<TaskModel> tasks = new ArrayList<>();
    	List<TaskModel> allTasks = repo.findAll();
    	for (TaskModel task : allTasks) {
    		String taskidString = task.getDataAlteracao() + "";
    		String[] taskIdArray = taskidString.split(",");
    		for (String taskIdStr : taskIdArray) {
    			UUID taskId = UUID.fromString(taskIdStr.trim());
    			tasks.addAll(repo.findAllByTaskId(taskId));
    		}
    	}
    	return tasks;
    }
    
    public List<TaskModel> findAllByNome(String nome) {
    	Optional<TaskModel> treco;
    	List<TaskModel> tasks = new ArrayList<>();
    	List<TaskModel> allTasks = repo.findAll();
    	for (TaskModel task : allTasks) {
    		String taskIdString = task.getNome();
    		String[] taskIdArray = taskIdString.split(",");
    		for (String taskIdStr : taskIdArray) {
    			UUID taskId = UUID.fromString(taskIdStr.trim());
    			treco = repo.findById(taskId);
    			if (treco.get().getNome().contains(nome)) {
    				tasks.addAll(repo.findAllByTaskId(taskId));
    			}
    		}
    	}
    	return tasks;
    }
}

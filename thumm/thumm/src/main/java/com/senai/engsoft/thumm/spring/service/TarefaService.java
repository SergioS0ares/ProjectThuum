package com.senai.engsoft.thumm.spring.service;

import com.senai.engsoft.thumm.spring.model.TarefaModel;
import com.senai.engsoft.thumm.spring.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TarefaService {
    @Autowired
    TarefaRepository repo;

    public List<TarefaModel> findAllByUsuario(String name) {
        // Buscar todos os usuários que tenham a string fornecida dentro do nome (string.has('bla bla bla'))
        List<TarefaModel> tasks = new ArrayList<>();
        List<TarefaModel> allTasks = repo.findAll();
        for (TarefaModel task : allTasks) {
            String taskIdsString = task.getUsuario();
            String[] taskIdsArray = taskIdsString.split(",");
            for (String taskIdStr : taskIdsArray) {
                UUID taskId = UUID.fromString(taskIdStr.trim());
                tasks.addAll(repo.findAllByTaskId(taskId));
            }
        }
        return tasks;
    }

    public List<TarefaModel> findAllByDataCriada(String data) {
        List<TarefaModel> tasks = new ArrayList<>();
        List<TarefaModel> allTasks = repo.findAll();
        for (TarefaModel task : allTasks) {
            String taskIdString = task.getDataCriada() + "";
            String[] taskIdArray = taskIdString.split(",");
            for (String taskIdStr : taskIdArray) {
                UUID taskid = UUID.fromString(taskIdStr.trim());
                tasks.addAll(repo.findAllByTaskId(taskid));
            }
        }
        return tasks;
    }

    public List<TarefaModel> findAllByDataFinalizada(String data){
        List<TarefaModel> tasks = new ArrayList<>();
        List<TarefaModel> allTasks = repo.findAll();
        for (TarefaModel task : allTasks) {
            String taskIdString = task.getDataConclusao() + "";
            String[] taskIdArray = taskIdString.split(",");
            for (String taskIdStr : taskIdArray) {
                UUID taskId = UUID.fromString(taskIdStr.trim());
                tasks.addAll(repo.findAllByTaskId(taskId));
            }
        }
        return tasks;
    }

    public List<TarefaModel> findALLByDataUltimaAtualizacao(String data){
        List<TarefaModel> tasks = new ArrayList<>();
        List<TarefaModel> allTasks = repo.findAll();
        for (TarefaModel task : allTasks) {
            String taskidString = task.getDataAlteracao() + "";
            String[] taskIdArray = taskidString.split(",");
            for (String taskIdStr : taskIdArray) {
                UUID taskId = UUID.fromString(taskIdStr.trim());
                tasks.addAll(repo.findAllByTaskId(taskId));
            }
        }
        return tasks;
    }

    public List<TarefaModel> findAllByNome(String nome) {
        Optional<TarefaModel> treco;
        List<TarefaModel> tasks = new ArrayList<>();
        List<TarefaModel> allTasks = repo.findAll();
        for (TarefaModel task : allTasks) {
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
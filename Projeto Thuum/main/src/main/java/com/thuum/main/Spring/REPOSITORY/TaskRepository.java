package com.thuum.main.Spring.REPOSITORY;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thuum.main.Spring.MODEL.TaskModel;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, UUID>{
	List<TaskModel> findAllByUsuario(String name);
	List<TaskModel> findAllByDataCriada(String date);
	List<TaskModel> findAllByDataFinalizada (String date);
	List<TaskModel> findALLByDataUltimaAtualizacao (String date);
	List<TaskModel> findAllByNome(String name);
	List<TaskModel> findAllByTaskId(UUID id);
}
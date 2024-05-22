package com.senai.engsoft.thumm.spring.repository;

import com.senai.engsoft.thumm.spring.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, UUID> {
    List<TarefaModel> findAllByUsuario(String name);

    List<TarefaModel> findAllByDataCriada(String date);

    List<TarefaModel> findAllByDataFinalizada (String date);

    List<TarefaModel> findALLByDataUltimaAtualizacao (String date);

    List<TarefaModel> findAllByNome(String name);

    List<TarefaModel> findAllByTaskId(UUID id);
}
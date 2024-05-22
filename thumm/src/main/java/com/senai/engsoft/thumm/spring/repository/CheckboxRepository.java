package com.senai.engsoft.thumm.spring.repository;

import com.senai.engsoft.thumm.spring.model.CheckboxModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckboxRepository extends JpaRepository <CheckboxModel, UUID> {
}

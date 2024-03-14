package com.thuum.main.Spring.REPOSITORY;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuum.main.Spring.MODEL.CommentsModel;

public interface CommentRepository extends JpaRepository<CommentsModel, UUID>{

}
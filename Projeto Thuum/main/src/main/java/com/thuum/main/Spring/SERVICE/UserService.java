package com.thuum.main.Spring.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuum.main.Spring.REPOSITORY.TaskRepository;

@Service
public class UserService {

	@Autowired
	TaskRepository repo;
	
	// vamo ver o q vai ser necessário.
}

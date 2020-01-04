package com.rezaak.web.app.LearningRestFull1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rezaak.web.app.LearningRestFull1.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository <UserEntity, Long> {
	
	UserEntity findByEmail(String email);

}

package com.rezaak.web.app.LearningRestFull1.service.implement;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezaak.web.app.LearningRestFull1.io.entity.UserEntity;
import com.rezaak.web.app.LearningRestFull1.repository.UserRepository;
import com.rezaak.web.app.LearningRestFull1.service.UserService;
import com.rezaak.web.app.LearningRestFull1.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("Sorry,record already exists");
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword("TestForNow");
		userEntity.setUserId("testUserIdforNow");
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		return returnValue;
	}

}

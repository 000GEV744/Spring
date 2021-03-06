package com.example.demo.entity.service;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.dto.UserDto;
import com.example.demo.repository.UserEntityRepository;


@Service
public class UserServiceImpl implements UserService{

	
	private UserEntityRepository userEntityRepository;

	public UserServiceImpl(UserEntityRepository userEntityRepository) {
		super();
		this.userEntityRepository = userEntityRepository;
	}


	@Override
	public UserDto createUser(UserDto userDetails) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity user = mapper.map(userDetails, UserEntity.class);
		UserDto userDto = mapper.map(user, UserDto.class);
		userEntityRepository.save(user);
		return userDto;
	}




	@Override
	public UserDto findById(int id) {
	    
	    Optional<UserEntity> result =userEntityRepository.findById(id);
        UserEntity u = null ;
        if(result.isPresent()) {
        	u=result.get();
        }
        ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = mapper.map(u, UserDto.class);
		return userDto;
	}


	@Override
	public UserDto findByEmail(String email) {
		UserEntity  user  = userEntityRepository.findByEmail(email);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}


	@Override
	public UserDto findByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

package com.hugonsantos.testapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hugonsantos.testapi.entities.User;
import com.hugonsantos.testapi.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public TestConfig() {
			
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Hugo Nascimento", "hugonsantos03@gmail.com", "948523236", "Hugo100");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}

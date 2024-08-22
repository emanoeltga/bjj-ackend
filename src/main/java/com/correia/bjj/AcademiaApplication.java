package com.correia.bjj;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.correia.bjj.model.Role;
import com.correia.bjj.model.Users;
import com.correia.bjj.repository.RoleRepository;
import com.correia.bjj.repository.UsersRepository;

@SpringBootApplication
public class AcademiaApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(AcademiaApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}


}

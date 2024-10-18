package com.j3ware.sf.restful_webservices;

import com.j3ware.sf.restful_webservices.entity.UserGroup;
import com.j3ware.sf.restful_webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class J3waresvcApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(J3waresvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.userRepository.findAll().forEach(System.out::println);

		var user = this.userRepository.findById(6L).orElseThrow();


		var userGroup = UserGroup.builder().groupName("ASG_USERS").description("all users").build();
		var userGroup2 = UserGroup.builder().groupName("ASG_GUEST").description("all guest").build();

		var users = List.of(userGroup, userGroup2);

		user.setUserGroups(users);

		users.forEach(us -> us.setUser(user));

		this.userRepository.save(user);


	}
}

package com.cogent.infotech;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.infotech.entity.Author;
import com.cogent.infotech.entity.User;
import com.cogent.infotech.repository.AuthorRepository;
import com.cogent.infotech.repository.UserRepository;
import com.cogent.infotech.service.AuthorService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Assessment2Application {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AuthorRepository authorRepo;
	
	@PostConstruct
	public void initUsers() {
		List<Author> authors = Stream.of(
				new Author(101,"Tiffany","123abc",12345),
				new Author(102,"Jessica","345xyz",67890),
				new Author(103,"John","234dcvh",34567)
				).collect(Collectors.toList());
		authorRepo.saveAll(authors);
		
		List<User> users = Stream.of(
				new User(101, "thanh", "thanh", "thanh@gmail.com"),
	                new User(102, "user1", "pwd1", "user1@gmail.com"),
	                new User(103, "user2", "pwd2", "user2@gmail.com")
				).collect(Collectors.toList());
		userRepo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(Assessment2Application.class, args);
	}

}

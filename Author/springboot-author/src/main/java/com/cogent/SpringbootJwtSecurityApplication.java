package com.cogent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.entity.Author;
import com.cogent.entity.User;
import com.cogent.repository.UserRepository;
import com.cogent.repository.AuthorRepository;

@SpringBootApplication
public class SpringbootJwtSecurityApplication {
	 @Autowired
	    private UserRepository repository;
	 @Autowired
	    private AuthorRepository authorRepository;

	    @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "Jialin", "password", "Jialin@gmail.com"),
	                new User(102, "user1", "pwd1", "user1@gmail.com"),
	                new User(103, "user2", "pwd2", "user2@gmail.com"),
	                new User(104, "user3", "pwd3", "user3@gmail.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	        
	        
	        List<Author> authors = Stream.of(
	        		new Author(1,"Jialin","231 sw 28th st","954-232-2222"),
	        		new Author(2,"Jayent","232 sw 28th st","646-232-2222"),
	        		new Author(3,"Gyanedra","233 sw 28th st","731-232-2222")
	        		).collect(Collectors.toList());
	        authorRepository.saveAll(authors);
	    }
	    
	   

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtSecurityApplication.class, args);
	}

}

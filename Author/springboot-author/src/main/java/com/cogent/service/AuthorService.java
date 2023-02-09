package com.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Author;
import com.cogent.repository.AuthorRepository;



@Service
public class AuthorService {
	@Autowired
	AuthorRepository authorRepository;

	public Optional<Author> get(int AuthorId) {
		// TODO Auto-generated method stub
		return authorRepository.findById(AuthorId);
	}

	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return (List<Author>) authorRepository.findAll();
	}

	
	public Author update(Author author) {
		// TODO Auto-generated method stub
		 return authorRepository.save(author);
	}

	
	public void delete(Author author) {
		authorRepository.delete(author);
		
	}

	
	 public void deleteAll() {
		 authorRepository.deleteAll();
	  }

	
}




	

		

	
	
package com.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Author;
import com.cogent.service.AuthorService;

@RestController
public class AuhtorController {
	@Autowired
	private AuthorService authorService;
	
	
	@GetMapping("/author/{id}")
	public Author get(@PathVariable("id") Integer id) {
		Optional<Author> i = authorService.get(id);
		return i.get();
	}
	
	
	@PostMapping("/author")
	public Author add(@Validated @RequestBody Author author){
		return authorService.update(author);
	}
	
	//Get All authors
		@GetMapping(value= {"/authors"})
		public List<Author> getAll(){
			List<Author> items = authorService.getAll();
			System.out.println("items retrieved "+items.size());
			return items;
		}
	
		//Update an author
		@PutMapping("/author")
		public Author edit(@RequestBody Author author) {
			return authorService.update(author);
		}
		//Delete an author
		@DeleteMapping("/author")
		public String delete(@RequestParam(value="id") Integer id) {
			Optional<Author> i = authorService.get(id);
			authorService.delete(i.get());
			return "author id "+id+" deleted successfully";
		}
	
}





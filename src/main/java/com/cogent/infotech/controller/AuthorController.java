package com.cogent.infotech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.infotech.entity.Author;
import com.cogent.infotech.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("author")
	public List<Author> getAll(){
		List<Author> authors = authorService.getAll();
		return authors;
	}
	
	@GetMapping("author/{id}")
	public Author get(@PathVariable("id") Integer id) {
		Optional<Author> a = authorService.get(id);
		return a.get();
	}
	
	@PostMapping("author")
	public Author add(@RequestBody Author author) {
		return authorService.update(author);
	}
	
	@PutMapping("author")
	public Author edit(@RequestBody Author author) {
		return authorService.update(author);
	}
	
	public String delete(@RequestParam(value = "id") Integer id) {
		Optional<Author> d = authorService.get(id);
		authorService.delete(d.get());
		return "Author ID "+id +" deleted successfully!!";
	}

}

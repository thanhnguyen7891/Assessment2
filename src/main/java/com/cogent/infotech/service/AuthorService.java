package com.cogent.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.infotech.entity.Author;
import com.cogent.infotech.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;

	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return (List<Author>) authorRepo.findAll();
	}

	public Optional<Author> get(Integer id) {
		// TODO Auto-generated method stub
		return authorRepo.findById(id);
	}

	public Author update(Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}

	public void delete(Author author) {
		// TODO Auto-generated method stub
		authorRepo.delete(author);
		
	}

}

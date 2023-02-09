package com.cogent.infotech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

	void saveAll(List<Author> authors);


}

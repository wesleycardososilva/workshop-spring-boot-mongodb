package com.wesley.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wesley.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post,String>{

}

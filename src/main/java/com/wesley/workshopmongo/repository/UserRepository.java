package com.wesley.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wesley.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User,String>{

}

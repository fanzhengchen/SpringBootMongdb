package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by fanzhengchen on 2/7/16.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRespository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("name") String name);
}

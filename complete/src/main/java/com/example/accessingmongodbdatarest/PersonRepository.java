
package com.example.accessingmongodbdatarest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// @RepositoryRestResource annotation to direct Spring MVC to create RESTful endpoints at /people instead of /person
//Both the name of the resource and the path can be customized by using @RepositoryRestResource on the repository interface
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
//MongoRepository provides all the necessary methods which help to create a CRUD application 
//and it also supports the custom derived query methods.
//public interface MongoRepository<T,ID>
//T: Domain type that repository manages (Generally the Entity/Model class name)(here Person)
//ID: Type of the id of the entity that repository manages (Generally the wrapper class of your @Id that is created 
//inside the Entity/Model class)(here String)
public interface PersonRepository extends MongoRepository<Person, String> {
	//Person is JPA Entity, and @Param is used to bind the method parameter name to (monogdb)Query parameter name
	List<Person> findByLastName(@Param("name") String name);

}

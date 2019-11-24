package me.rrsn.dogms.repository;


import me.rrsn.dogms.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}

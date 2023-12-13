package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> getByUserName(String userName);
    List<User> getByCity(String city);
    List<User> getByState(String state);
    List<User> getByZipcode(String zipcode);
    List<User> getByPeanutInterest(Boolean peanutInterest);
    List<User> getByEggInterest(Boolean eggInterest);
    List<User> getByDairyInterest(Boolean dairyInterest);
}
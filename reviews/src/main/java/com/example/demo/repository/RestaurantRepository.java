package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Restaurant;
import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> getByName(String name);
    List<Restaurant> getAllByOrderByNameAsc();
    List<Restaurant> getAllByOrderByNameDesc();
    List<Restaurant> getAllByCityAsc();
    List<Restaurant> getAllByCityDesc();
    List<Restaurant> getAllByCuisineAsc();
    List<Restaurant> getAllByCuisineDesc();
}
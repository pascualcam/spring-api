package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Review;
import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> getByStatus(String status);
    List<Review> getByUserName(String userName);
    List<Review> getAllByOrderByUserNameAsc();
    List<Review> getAllByOrderByUserNameDesc();
    List<Review> getAllByPeanutScoreAsc();
    List<Review> getAllByPeanutScoreDesc();
    List<Review> getAllByEggScoreAsc();
    List<Review> getAllByEggScoreDesc();
    List<Review> getAllByDairyScoreAsc();
    List<Review> getAllByDairyScoreDesc();
}
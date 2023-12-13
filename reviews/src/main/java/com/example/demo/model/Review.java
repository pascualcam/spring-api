package com.example.demo.model;//who submitted, represented by their unique display name (String)
//the restaurant, represented by its Id (Long)
//an optional peanut score, on a scale of 1-5
//an optional egg score, on a scale of 1-5
//an optional dairy score, on a scale of 1-5
//an

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="REVIEWS")
public class Review{
    // user name
    @Column(name="NAME")
    private String name;

    @Id
    @GeneratedValue
    private Long Id;

    // optional peanut score, 1-5
    @Column(name="PEANUT_SCORE")
    private Integer peanutScore;

    // optional egg score, 1-5
    @Column(name="EGG_SCORE")
    private Integer eggScore;

    // optional dairy score, 1-5
    @Column(name="DAIRY_SCORE")
    private Integer dairyScore;

    // optional commentary
    @Column(name="COMMENT")
    private String comment;
}
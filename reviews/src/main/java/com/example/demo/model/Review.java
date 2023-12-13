package com.example.demo.model;

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

@Entity
public class Review{
    // user name
    @Getter
    @Setter
    @Column(name="USER_NAME")
    private String userName;

    @Id
    @Getter
    @Setter
    @GeneratedValue
    @Column(name="ID")
    private Long Id;

    // optional peanut score, 1-5
    @Getter
    @Setter
    @Column(name = "PEANUT_SCORE")
    private Integer peanutScore;

    // optional egg score, 1-5
    @Getter
    @Setter
    @Column(name = "EGG_SCORE")
    private Integer eggScore;

    // optional dairy score, 1-5
    @Getter
    @Setter
    @Column(name = "DAIRY_SCORE")
    private Integer dairyScore;

    // optional commentary
    @Getter
    @Setter
    @Column(name = "COMMENT")
    private String comment;

    @Getter
    @Setter
    @Column(name = "STATUS")
    private Enum status;
}
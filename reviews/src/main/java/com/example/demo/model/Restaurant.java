package com.example.demo.model;

import jakarta.persistence.*;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="RESTAURANTS")
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant{

    @Id
    @GeneratedValue
    @NonNull @Setter @Getter private Long id;

    @Column(name="NAME")
    @NonNull @Setter @Getter private String name;

    @Column(name="CITY")
    @NonNull @Setter @Getter private String city;

    @Column(name="CUISINE")
    @NonNull @Setter @Getter private String cuisine;

}
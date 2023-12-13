package com.example.demo.model;//their display name, one that’s unique to only that user
//city
//        state
//zipcode
//whether they’re interested in peanut allergies
//whether they’re interested in egg allergies
//whether they’re interested in dairy allergies

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USERS")
public class User{
    public User(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue
    @Setter
    @Getter
    @Column(name="ID")
    private Long id;

    @Setter
    @Getter
    @Column(name="USER_NAME")
    private final String userName;

    @Setter
    @Getter
    @Column(name="CITY")
    private String city;

    @Setter
    @Getter
    @Column(name="STATE")
    private String state;

    @Setter
    @Getter
    @Column(name="ZIPCODE")
    private Integer zipcode;

    @Setter
    @Getter
    @Column(name="PEANUT_INTEREST")
    private Boolean peanutInterest;

    @Setter
    @Getter
    @Column(name="EGG_INTEREST")
    private Boolean eggInterest;

    @Setter
    @Getter
    @Column(name="DAIRY_INTEREST")
    private Boolean dairyInterest;
}
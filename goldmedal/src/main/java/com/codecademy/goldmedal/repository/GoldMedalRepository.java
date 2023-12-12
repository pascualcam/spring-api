package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    int countByCountry(String country);
    int countBySeason(String season);
    int countByCountryAndGender(String country, String gender);

    // get by country, order by year ASC
    List<GoldMedal> getByCountryOrderByYearAsc(String country);

    // get by country, order by year DESC
    List<GoldMedal> getByCountryOrderByYearDesc(String country);

    // get by country, order by season ASC
    List<GoldMedal> getByCountryOrderBySeasonAsc(String country);

    // get by country, order by season DESC
    List<GoldMedal> getByCountryOrderBySeasonDesc(String country);

    // get by country, order by city ASC
    List<GoldMedal> getByCountryOrderByCityAsc(String country);

    // get by country, order by city DESC
    List<GoldMedal> getByCountryOrderByCityDesc(String country);

    // get by country, order by Athlete's name ASC
    List<GoldMedal> getByCountryOrderByNameAsc(String country);

    // get by country, order by Athlete's name DESC
    List<GoldMedal> getByCountryOrderByNameDesc(String country);

    // get by country, order by Event ASC
    List<GoldMedal> getByCountryOrderByEventAsc(String country);

    // get by country, order by Event DESC
    List<GoldMedal> getByCountryOrderByEventDesc(String country);

    // get by country and season, order by year ASC
    List<GoldMedal> getByCountryAndSeasonOrderByYearAsc(String country, String season);
}
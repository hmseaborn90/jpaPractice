package com.lsio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsio.springboot.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

  City findByCityname(String cityname);
  
}

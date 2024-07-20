package com.lsio.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsio.springboot.entities.City;
import com.lsio.springboot.repositories.CityRepository;

@Service
public class CityService {
  
  @Autowired CityRepository cityresRepository;

  public CityService(){

  }

  public List<City> getCities(){
    return cityresRepository.findAll();
  }

  public City saveCity(City city){
   return cityresRepository.save(city);
  }

  public City getCity(String cityname) {
    return cityresRepository.findByCityname(cityname);
    
  }

}

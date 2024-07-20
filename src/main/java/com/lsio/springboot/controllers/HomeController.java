package com.lsio.springboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.lsio.springboot.entities.City;
import com.lsio.springboot.services.CityService;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HomeController {
  @Autowired
  CityService cityService;
 

  @GetMapping("sayhello")  
  public String sayHello(){
    return "Hello User";
  }

  @GetMapping("getcities")
  public List<City> getCities() {
      return cityService.getCities();
  }

  @PostMapping("addcity")
  public City postCity(@RequestBody City city) {
      return cityService.saveCity(city);
  }

  @GetMapping("getcity")
  public City getCity(String cityname) {
    return cityService.getCity(cityname);
  }
  
}

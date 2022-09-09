package com.example.Airline.repositories;

import com.example.Airline.models.Passenger;

import java.util.List;
import java.util.Map;


public interface PassengerRepository extends JpaRepository<Passenger, Long>{
    List<Passenger> findAll();

    Map<Object, Object> findById(Long id);
}

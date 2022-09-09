package com.example.Airline.repositories;

import com.example.Airline.models.Flight;
import com.example.Airline.models.Passenger;

import java.util.List;
import java.util.Map;

public interface FlightRepository extends JpaRepository<Flight, Long>{
    List<Flight> findAll();

    Map<Object, Object> findById(long id);

    void save(Flight flight);
}
{
}

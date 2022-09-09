package com.example.Airline.services;

import com.example.Airline.models.Flight;
import com.example.Airline.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;


    //displays flights
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    //displays specific flight
    public Flight getFlightById(long id){
        return flightRepository.findById(id).get();
    }

    //adds new flight
    public Flight addNewFlight(Flight flight){
        flightRepository.save(flight);
        return flight;
    }
}

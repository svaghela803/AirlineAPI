package com.example.Airline.services;

import com.example.Airline.models.Passenger;
import com.example.Airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    //displays all flights
    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }

    public Passenger getPassengerById(Long id){
        return passengerRepository.findById(id).get();
    }

}

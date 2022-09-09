package com.example.Airline.controllers;

import com.example.Airline.models.Flight;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/flights")
public class FlightsController {

//    INDEX
   @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
       List<Flight> flights = flightService.getAllFlights();
       return new ResponseEntity<>(flights, HttpStatus.OK);
   }

}

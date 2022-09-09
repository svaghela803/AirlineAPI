package com.example.Airline.models;

public class Flight {

//    POJO

    //properties
    private long id;
    private long capacity;
    private String departureDate;
    private String departureTime;

    //constructor
    public Flight(long id, long capacity, String departureDate, String departureTime) {
        this.id = id;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }
}

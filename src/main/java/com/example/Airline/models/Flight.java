package com.example.Airline.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity(name = "flights")
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

    //getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}

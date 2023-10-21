package com.Reservation;

public class Flights {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers=30;
    private int numPassengers_WantToReserve;
    private double price;
    private int confirmationNumber;
    public Flights(){};
    public Flights(int flightNumber, String passengerName, String origin, String destination, String date, double price) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
       // this.numPassengers_WantToReserve=numPassengers_WantToReserve;
        this.numPassengers = 30;
        this.price = price;
    }


    public void setNumPassengers_WantToReserve(int numPassengers_WantToReserve) {
        this.numPassengers_WantToReserve = numPassengers_WantToReserve;
    }

    public int getNumPassengers_WantToReserve() {
        return numPassengers_WantToReserve;
    }

    public double getPrice() {
        return price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int addNumPass(int pass)
    {
       return this.numPassengers-=pass;
    }
    @Override
    public String toString() {
        //NumPass =30 in Flight
        return "flightNumber=" + flightNumber +
                ", passengerNumber='" + numPassengers + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", numPassengers=" + numPassengers +
                ", price=" + price
                ;
    }
}

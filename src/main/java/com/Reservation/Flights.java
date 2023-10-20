package com.Reservation;

public class Flights {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
    private double price;
    private int confirmationNumber;
    public Flights(){};
    public Flights(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
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

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
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


    @Override
    public String toString() {
        return "Flights{" +
                "flightNumber=" + flightNumber +
                ", passengerName='" + passengerName + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", numPassengers=" + numPassengers +
                ", price=" + price +
                ", confirmationNumber=" + confirmationNumber +
                '}';
    }
}

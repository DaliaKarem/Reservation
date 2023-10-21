package com.Reservation;

import com.Bank.Account;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Company {
    //company 1:many flights/hotels  Association
    private  Flights flights;
    private  Hotel hotel;
//Dale With this Hotel
    ArrayList<Hotel> HotelsInfo;
    ArrayList<Flights>FlightsInfo;
    public Company()
    {
     this.HotelsInfo=new ArrayList<>();
     this.FlightsInfo=new ArrayList<>();
     addHotel();
     addFlights();
    }
    private void addHotel()
    {
        for (int i=0;i<5;i++)
        {
            HotelsInfo.add(new Hotel(i, "Martin Nadine"+i, "London"+i, "2022-09-01  "+i, "2022-09-05 "+i, 1, 100.00));
        }
    }
    private void addFlights()
    {
        for (int i=0;i<5;i++)
        {
            FlightsInfo.add(new Flights(i, "Martin Nadine "+i, "New York "+i, "London "+i, "2022-08-01 "+i, 700.00*i));
        }
    }
    //show Hotels info

    public void  showHotels()
    {
        System.out.println("Our Hotels : ");
        for (int i=0;i<HotelsInfo.size();i++)
        {
            System.out.println(HotelsInfo.get(i).toString());
        }
    }
    //show Flights info

    public void  showFlights()
    {
        System.out.println("Our Flights  : ");
        for (int i=0;i<HotelsInfo.size();i++)
        {
            System.out.println(FlightsInfo.get(i).toString());
            //System.out.println(i +" :" +FlightsInfo.get(i).getDate() +"  from "+FlightsInfo.get(i).getOrigin()+" To "+FlightsInfo.get(i).getDestination()+ " Free Sets : "+FlightsInfo.get(i).getNumPassengers());
        }
    }

    public boolean checkAccountExistence(int accountNumber) {
        for (Flights account : FlightsInfo) {
            if (account.getFlightNumber()==accountNumber) {
                //String newAccount = account.getAccountInfo();
                return true;
            }
        }
        return false; // Return null if the account does not exist
    }
    public boolean checkAccountExistenceHotel(int accountNumber) {
        for (Hotel account : HotelsInfo) {
            if (account.getHotelId()==accountNumber) {
                //String newAccount = account.getAccountInfo();
                return true;
            }
        }
        return false; // Return null if the account does not exist
    }


    public double FlightCost(int numPass ,double price)
    {
        return  numPass*price;
    }
    public double getFlightCost(int FlightNum) {
        for (Flights account :FlightsInfo) {
            if (account.getFlightNumber()==FlightNum) {
                double newAccount = account.getPrice();
                return newAccount;
            }
        }
        return 0;
        // Return null if the account does not exist
    }
    //offers
    //Hotels Offers
}

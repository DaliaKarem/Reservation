package com.Reservation;

import java.util.ArrayList;

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
            FlightsInfo.add(new Flights(i, "Martin Nadine "+i, "New York "+i, "London "+i, "2022-08-01 "+i, 1, 700.00));
        }
    }
    //show Hotels info

    public void  showHotels()
    {
        System.out.println("Our Hotels : ");
        for (int i=0;i<HotelsInfo.size();i++)
        {
            System.out.println(i +" :" +HotelsInfo.get(i).getName() + "Loc :"+HotelsInfo.get(i).getLocation());
        }
    }
    //show Flights info

    public void  showFlights()
    {
        System.out.println("Our Flights  : ");
        for (int i=0;i<HotelsInfo.size();i++)
        {
            System.out.println(i +" :" +FlightsInfo.get(i).getDate() +"  from "+FlightsInfo.get(i).getOrigin()+" To "+FlightsInfo.get(i).getDestination());
        }
    }
    //offers
    //Hotels Offers
}

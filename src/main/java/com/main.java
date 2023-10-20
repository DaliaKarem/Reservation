package com;
import com.Reservation.Company;
import com.Reservation.Flights;
import com.Reservation.Hotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public  class main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Company company=new Company();
        Hotel hotel=new Hotel();
        Flights flights=new Flights();
        System.out.println("Hello Our Client Do You want to reserve Flights or Hotels With Us ?");
        String in=input.nextLine();
        if(in.equals("y".toUpperCase())||in.equals("y".toLowerCase() )||in.equals("yes".toLowerCase())||in.equals("yes".toUpperCase()))
        {
            System.out.println("Want to Reserve 1-Flight Or 2-Hotel ");
            int num=input.nextInt();
            if(num==1)
            {
                company.showFlights();
                System.out.println("Which Flight Would You prefer to reserve Entre Num");
                int FlightNum=input.nextInt();
                if()

            }
            else if(num==2)
            {
                company.showHotels();
            }

        }
        else {
            System.exit(0);
        }

    }
}
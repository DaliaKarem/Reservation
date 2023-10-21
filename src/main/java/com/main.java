package com;
import com.Bank.Bank;
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
        Flights flights=new Flights();
        Bank accounts=new Bank();
        System.out.println("Hello Our Client Do You want to reserve Flights or Hotels With Us ?");
        String in=input.nextLine();
        if(in.equals("y".toUpperCase())||in.equals("y".toLowerCase() )||in.equals("yes".toLowerCase())||in.equals("yes".toUpperCase()))
        {
            System.out.println("Want to Reserve\n: 1-Flight \n 2-Hotel ");
            int num=input.nextInt();
            if(num==1)
            {
                company.showFlights();
                System.out.println("Which Flight Would You prefer to reserve Entre FlightNumber ");
                int FlightNum=input.nextInt();
                flights.setFlightNumber(FlightNum);
                System.out.println(flights.getNumPassengers());
                if (flights.getNumPassengers() <= 30) {
                    System.out.println("Now There is " + flights.getNumPassengers() + " Free");
                    System.out.println("How Many Sets do u want Reserve");
                    int pass = input.nextInt();
                    if (pass < flights.getNumPassengers()) {
                        flights.setNumPassengers_WantToReserve(pass);
                        flights.addNumPass(pass);
                        System.out.println("Now You Reserve " + pass + "\n Enter Now Your AccountNumber In bank");
                        String accountNumber=input.nextLine();
                        System.out.println("Acc "+accountNumber);
                        if(accounts.getAccounts().contains(accountNumber))
                        {
                            System.out.println("Donnne");
                            System.out.println("account Exist "+accounts.toString());
                        }


                    }
                }
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
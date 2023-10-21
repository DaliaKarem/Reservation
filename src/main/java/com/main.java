package com;
import com.Bank.Account;
import com.Bank.Bank;
import com.Reservation.Company;
import com.Reservation.Flights;
import com.Reservation.Hotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company company = new Company();
        Flights flights = new Flights();
        Bank accounts = new Bank();

        System.out.println("=========================Hello Our Client========================= \nDo you want to reserve Flights or Hotels with us?");
        String in = input.nextLine();

        if (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes")) {
            System.out.println("Want to Reserve:\n1- Flight\n2- Hotel");
            int num = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (num == 1) {
                company.showFlights();
                System.out.println("Which Flight Would You prefer to reserve? Enter Flight Number: ");
                int flightNum = input.nextInt();
                input.nextLine(); // Consume the newline character
                if (company.checkAccountExistence(flightNum)) {
                    flights.setFlightNumber(flightNum);
                    System.out.println(flights.getNumPassengers());

                    if (flights.getNumPassengers() <= 30) {
                        System.out.println("Now There are " + flights.getNumPassengers() + " available seats");
                        System.out.println("How Many Seats do you want to reserve?");
                        int pass = input.nextInt();
                        input.nextLine(); // Consume the newline character

                        if (pass <= flights.getNumPassengers()) {
                            flights.setNumPassengers_WantToReserve(pass);
                            flights.addNumPass(pass);
                            System.out.println("Now You Reserved " + pass + " seats.\nEnter Your Account Number: ");
                            String accountNumber = input.nextLine();
                            System.out.println("Account Number: " + accountNumber);

                            String accountInfo = accounts.checkAccountExistence(accountNumber);
                            if (accountInfo != null) {
                                System.out.println("Hello " + accountInfo + "\nFlight Costs Will be: " + company.FlightCost(pass, company.getFlightCost(flights.getFlightNumber())));
                                System.out.println("Continue ?");
                                in = input.nextLine();
                                if (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes")) {
                                    System.out.println("Will Withdraw From your Account " + accountInfo);
                                    // Withdraw money from the account
                                    Account account = accounts.getAccountByNumber(accountNumber);
                                    double withdrawalAmount = company.FlightCost(pass, company.getFlightCost(flights.getFlightNumber()));
                                    accounts.withdrawMoney(account, withdrawalAmount);
                                    System.out.println("Now your account Balance: " + account.getBalance());
                                }
                            } else {
                                System.out.println("Account Does Not Exist.");
                            }
                        }
                    }
                }

            }
            else if (num == 2) {
                company.showHotels();
                System.out.println("Which Hotel Would You prefer to reserve? Enter Hotel Number: ");
                int HotelNum = input.nextInt();
                input.nextLine(); // Consume the newline character
                if (company.checkAccountExistenceHotel(HotelNum)) {
                    flights.setFlightNumber(HotelNum);
                    System.out.println(flights.getNumPassengers());

                    if (flights.getNumPassengers() <= 30) {
                        System.out.println("Now There are " + flights.getNumPassengers() + " available seats");
                        System.out.println("How Many Seats do you want to reserve?");
                        int pass = input.nextInt();
                        input.nextLine(); // Consume the newline character

                        if (pass <= flights.getNumPassengers()) {
                            flights.setNumPassengers_WantToReserve(pass);
                            flights.addNumPass(pass);
                            System.out.println("Now You Reserved " + pass + " seats.\nEnter Your Account Number: ");
                            String accountNumber = input.nextLine();
                            System.out.println("Account Number: " + accountNumber);

                            String accountInfo = accounts.checkAccountExistence(accountNumber);
                            if (accountInfo != null) {
                                System.out.println("Hello " + accountInfo + "\nFlight Costs Will be: " + company.FlightCost(pass, company.getFlightCost(flights.getFlightNumber())));
                                System.out.println("Continue ?");
                                in = input.nextLine();
                                if (in.equalsIgnoreCase("y") || in.equalsIgnoreCase("yes")) {
                                    System.out.println("Will Withdraw From your Account " + accountInfo);
                                    // Withdraw money from the account
                                    Account account = accounts.getAccountByNumber(accountNumber);
                                    double withdrawalAmount = company.FlightCost(pass, company.getFlightCost(flights.getFlightNumber()));
                                    accounts.withdrawMoney(account, withdrawalAmount);
                                    System.out.println("Now your account Balance: " + account.getBalance());
                                }
                            } else {
                                System.out.println("Account Does Not Exist.");
                            }
                        }
                    }
                }
            }
        } else {
            System.exit(0);
        }
    }
}
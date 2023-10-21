package com.Reservation;

import com.Bank.Account;

public class Reservataion {
    private Company company;
    private Account account;
    Reservataion(){};

    public Company getCompany() {
        return company;
    }
    public void getReservation()
    {
        System.out.println(account.getAccountInfo()+ " "+company);
    }
}

package com.Reservation;

import com.Bank.Account;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

 class Reservation {
    private List<Pair<Account, Flights>> reservations;

    public Reservation() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Account person, Flights flight) {
        reservations.add(new Pair<>(person, flight));
    }

    public List<Flights> getReservations(Account person) {
        List<Flights> personReservations = new ArrayList<>();
        for (Pair<Account, Flights> reservation : reservations) {
            if (reservation.getKey() == person) {
                personReservations.add(reservation.getValue());
            }
        }
        return personReservations;
    }
}

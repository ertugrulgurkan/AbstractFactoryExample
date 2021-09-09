package com.ertugrul.domain;

import com.ertugrul.interfaces.*;

public class HotelB extends Hotel {
    @Override
    public Customer getCustomer() {
        return new CustomerB();
    }

    @Override
    public Room getRoom() {
        return new RoomB();
    }

    @Override
    public Payment getPayment() {
        return new PaymentB();
    }

    @Override
    public Reservation getReservation() {
        return new ReservationB();
    }
}

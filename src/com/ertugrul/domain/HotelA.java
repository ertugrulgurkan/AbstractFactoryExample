package com.ertugrul.domain;

import com.ertugrul.interfaces.*;

public class HotelA extends Hotel {
    @Override
    public Customer getCustomer() {
        return new CustomerA();
    }

    @Override
    public Room getRoom() {
        return new RoomA();
    }

    @Override
    public Payment getPayment() {
        return new PaymentA();
    }

    @Override
    public Reservation getReservation() {
        return new ReservationA();
    }
}

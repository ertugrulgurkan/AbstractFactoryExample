package com.ertugrul.domain;

public abstract class Hotel {
    public abstract Customer getCustomer();

    public abstract Room getRoom();

    public abstract Payment getPayment();

    public abstract Reservation getReservation();
}

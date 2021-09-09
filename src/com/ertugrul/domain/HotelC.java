package com.ertugrul.domain;

public class HotelC extends Hotel{
    @Override
    public Customer getCustomer() {
        return new CustomerC();
    }

    @Override
    public Room getRoom() {
        return new RoomC();
    }

    @Override
    public Payment getPayment() {
        return new PaymentC();
    }

    @Override
    public Reservation getReservation() {
        return new ReservationC();
    }
}

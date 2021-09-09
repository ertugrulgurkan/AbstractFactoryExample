package com.ertugrul.abstractfactory;

import com.ertugrul.domain.Customer;
import com.ertugrul.domain.Hotel;
import com.ertugrul.domain.Payment;
import com.ertugrul.domain.Reservation;
import com.ertugrul.domain.Room;

public interface HotelAbstractFactory {
    Hotel createHotel();
}

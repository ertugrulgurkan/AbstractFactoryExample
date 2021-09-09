package com.ertugrul.abstractfactory;

import com.ertugrul.domain.*;

public class HotelFactoryB implements HotelAbstractFactory {

    @Override
    public Hotel createHotel() {
        return new HotelB();
    }
}

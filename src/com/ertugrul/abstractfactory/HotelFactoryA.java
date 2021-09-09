package com.ertugrul.abstractfactory;

import com.ertugrul.domain.*;

public class HotelFactoryA implements HotelAbstractFactory {

    @Override
    public Hotel createHotel() {
        return new HotelA();
    }
}

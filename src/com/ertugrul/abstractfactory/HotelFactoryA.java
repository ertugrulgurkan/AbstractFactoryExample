package com.ertugrul.abstractfactory;

import com.ertugrul.domain.*;
import com.ertugrul.interfaces.Hotel;

public class HotelFactoryA implements HotelAbstractFactory {

    @Override
    public Hotel createHotel() {
        return new HotelA();
    }
}

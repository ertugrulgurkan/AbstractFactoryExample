package com.ertugrul.abstractfactory;

import com.ertugrul.domain.*;

public class HotelFactoryC implements HotelAbstractFactory {
    @Override
    public Hotel createHotel() {
        return new HotelC();
    }
}

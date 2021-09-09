package com.ertugrul.abstractfactory;

import com.ertugrul.domain.*;
import com.ertugrul.interfaces.Hotel;

public class HotelFactoryC implements HotelAbstractFactory {
    @Override
    public Hotel createHotel() {
        return new HotelC();
    }
}

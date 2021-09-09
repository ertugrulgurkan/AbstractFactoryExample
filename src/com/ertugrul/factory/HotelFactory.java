package com.ertugrul.factory;

import com.ertugrul.abstractfactory.HotelAbstractFactory;
import com.ertugrul.domain.Hotel;

public class HotelFactory {
    public static Hotel getHotel(HotelAbstractFactory factory){
        return factory.createHotel();
    }
}

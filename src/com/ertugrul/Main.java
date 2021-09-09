package com.ertugrul;

import com.ertugrul.abstractfactory.HotelFactoryA;
import com.ertugrul.abstractfactory.HotelFactoryB;
import com.ertugrul.abstractfactory.HotelFactoryC;
import com.ertugrul.interfaces.Hotel;
import com.ertugrul.factory.*;

public class Main {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Hotel hotelA = HotelFactory.getHotel(new HotelFactoryA());
        Hotel hotelB = HotelFactory.getHotel(new HotelFactoryB());
        Hotel hotelC = HotelFactory.getHotel(new HotelFactoryC());
    }
}

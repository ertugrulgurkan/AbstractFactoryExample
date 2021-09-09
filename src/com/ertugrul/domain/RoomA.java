package com.ertugrul.domain;

import com.ertugrul.interfaces.Room;

public class RoomA implements Room {
    @Override
    public void Print() {
        System.out.println("ROOM A");
    }
}

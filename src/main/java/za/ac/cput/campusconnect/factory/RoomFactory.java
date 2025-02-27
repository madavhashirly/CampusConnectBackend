package za.ac.cput.campusconnect.factory;

import za.ac.cput.campusconnect.domain.Property;
import za.ac.cput.campusconnect.domain.Room;
import za.ac.cput.campusconnect.util.Helper;

/**
 * FileName.java
 * Class:
 * Author:
 * Completion date:
 */

public class RoomFactory {
    public static Room buildRoom(Property property, int roomNumber, boolean occupied){
        if(Helper.isNullOrEmpty(property) || Helper.isNullOrEmpty(roomNumber) || Helper.isNullOrEmpty(occupied))
            return null;
        return new Room.Builder().setProperty(property).setRoomNumber(roomNumber).setOccupied(occupied).build();
    }
}

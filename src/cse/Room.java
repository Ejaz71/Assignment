package cse;

import java.net.SocketPermission;

/**
 * Created by ASUS on 9/19/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;

    public Room() {
    }

    public Room(String hallName, int roomNo) {
        this.hallName = hallName;
        this.roomNo = roomNo;
        status=false;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getRoomNo() {
        return roomNo;
    }




    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    void print(){
        if(getStatus()){
            System.out.println( "Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently alloted.");
        } else {
            System.out.println( "Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently available for allotment.");
        }
    }
}


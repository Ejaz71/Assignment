package cse;

/**
 * Created by ASUS on 9/19/2015.
 */
public class Student {
    private String studentName;

    private String studentNo;
    private Room room;

    public Student(String studentName, String studentNo, Room room) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.room = room;
    }

    public Student() {

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    void print(){
        System.out.println( "Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room no, " + room.getRoomNo() );
    }
}



package Day4.Exc24;

public class ResortReservation extends Reservation{
    private int roomNumber;
    public ResortReservation(String name, int reservationId, double date) {
        super(name, reservationId, date);
    }


    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int roomNumber() {
        return roomNumber;
    }
    @Override
    public String reservationStatus() {
        return "you have reserved a room in our resort, here is your room number " + roomNumber;
    }
}

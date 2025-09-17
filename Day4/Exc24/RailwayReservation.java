package Day4.Exc24;

public class RailwayReservation extends Reservation {
    private int seat;

    public RailwayReservation(String name, int reservationId, double date) {
        super(name, reservationId, date);
    }

    public void selectSeat(int seat) {
        this.seat = seat;
    }
    public int getSeat() {
        return seat;
    }
    @Override
    public String reservationStatus() {
        return "You have reserved a seat with us, here is your seat number " + seat;
    }
}

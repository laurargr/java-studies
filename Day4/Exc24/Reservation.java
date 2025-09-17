package Day4.Exc24;

import java.util.Objects;

public abstract class Reservation {
    protected String name;
    protected int reservationId;
    protected double date;
    protected String status;

    public Reservation(String name, int reservationId, double date) {
        this.date = date;
        this.reservationId = reservationId;
        this.name = name;
    }

    public void setId(int reservationId) {
        this.reservationId = reservationId;
    }
    public int getId () {
        return reservationId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDate(double date) {
        this.date = date;
    }
    public double getDate() {
        return date;
    }

    public abstract String reservationStatus();

}

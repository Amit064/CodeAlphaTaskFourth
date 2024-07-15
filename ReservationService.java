import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private List<Reservation> reservations;

    public ReservationService() {
        reservations = new ArrayList<>();
    }

    public void makeReservation(String customerName, Room room, int numberOfNights) {
        reservations.add(new Reservation(customerName, room, numberOfNights));
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}

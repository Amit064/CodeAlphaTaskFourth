public class Reservation {
    private String customerName;
    private Room room;
    private int numberOfNights;

    public Reservation(String customerName, Room room, int numberOfNights) {
        this.customerName = customerName;
        this.room = room;
        this.numberOfNights = numberOfNights;
        room.setAvailable(false);
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalCost() {
        return room.getPrice() * numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation for " + customerName + " in " + room.getType() + " for " + numberOfNights + " nights. Total Cost: $" + getTotalCost();
    }
}


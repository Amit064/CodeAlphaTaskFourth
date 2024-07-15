import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoomService roomService = new RoomService();
        ReservationService reservationService = new ReservationService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Search for available rooms");
            System.out.println("2. Make a reservation");
            System.out.println("3. View booking details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Rooms:");
                    for (Room room : roomService.getAvailableRooms()) {
                        System.out.println(room);
                    }
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Enter room type (Single, Double, Suite): ");
                    String type = scanner.next();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    Room room = roomService.getRoomByType(type);
                    if (room != null) {
                        reservationService.makeReservation(name, room, nights);
                        System.out.println("Reservation successful!");
                    } else {
                        System.out.println("Room type not available.");
                    }
                    break;
                case 3:
                    System.out.println("Booking Details:");
                    for (Reservation reservation : reservationService.getReservations()) {
                        System.out.println(reservation);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

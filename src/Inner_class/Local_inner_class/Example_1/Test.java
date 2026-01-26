package Inner_class.Local_inner_class.Example_1;

class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRoom;


    public Hotel(String name, int totalRooms, int reservedRoom) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRoom = reservedRoom;
    }

    public void reservation(String costumer_name, int noOfRooms) {

        class reservation_validator {

            boolean validate() {

                if (costumer_name == null || costumer_name.isBlank()) {
                    System.out.println("Guest name cannot be empty");
                    return false;
                }
                if (reservedRoom < 0) {
                    System.out.println("No. of reservation cannot be Zero");
                    return false;
                }
                if (reservedRoom + noOfRooms > totalRooms) {
                    System.out.println("Rooms are not available");
                    return false;
                }
                return true;
            }
        }


        reservation_validator validator = new reservation_validator();
        if (validator.validate()) {
            reservedRoom += noOfRooms;
            System.out.println("Guest name : " + costumer_name + " Reserved rooms : " + noOfRooms);
        } else {
            System.out.println("Reservation failed");
        }

    }
}
public class Test {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("sun hotel", 10, 5);
        hotel.reservation("sahil", 6);



    }
}



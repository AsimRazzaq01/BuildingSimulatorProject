public class StaffPassenger extends Passanger {

    private String StaffName;
    private int Staffage;
    private String StaffID;


    StaffPassenger(int startingFloor, int destinationFloor) {
        super(startingFloor, destinationFloor);
    }


    boolean isStaff() {
        return true;
    }

    @Override
    boolean prefersExpressElevator() {
        return true;
    }



}

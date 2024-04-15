public abstract class Passanger {

    int startingFloor;
    int destinationFloor;

    Passanger(int startingFloor, int destinationFloor) {
        this.startingFloor = startingFloor;
        this.destinationFloor = destinationFloor;

    }

    abstract boolean isStaff();
    abstract boolean prefersExpressElevator();
}




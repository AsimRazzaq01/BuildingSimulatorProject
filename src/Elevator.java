import java.util.ArrayList;
import java.util.List;

abstract class Elevator {

    int currentFloor;
    List<Passanger> passengers;
    int maxCapacity;

    Elevator(int maxCapacity) {
        this.currentFloor = 1;
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    abstract void move();

    boolean canAccommodatePassenger() {
        return passengers.size() < maxCapacity;
    }

    void addPassenger(Passanger passenger) {
        passengers.add(passenger);
        System.out.println((passenger.isStaff() ? "Staff" : "Patient") + " boarded the elevator at floor " + currentFloor);
    }

    void removePassenger(Passanger passenger) {
        passengers.remove(passenger);
        System.out.println((passenger.isStaff() ? "Staff" : "Patient") + " left the elevator at floor " + currentFloor);
    }

    int countPatients() {
        int count = 0;
        for (Passanger passenger : passengers) {
            if (!passenger.isStaff()) {
                count++;
            }
        }
        return count;
    }

    int countStaff() {
        int count = 0;
        for (Passanger passenger : passengers) {
            if (passenger.isStaff()) {
                count++;
            }
        }
        return count;
    }
}


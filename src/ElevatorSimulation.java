import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// ElevatorSimulation class
public class ElevatorSimulation {
    List<Elevator> elevators;
    List<Passanger> passengers;
    int numIterations;

    public ElevatorSimulation(int numElevators, int numPassengers, int numIterations) {
        elevators = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            elevators.add(new StandardElevator(10)); // Assuming all elevators are standard with max capacity 10
        }

        passengers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < numPassengers; i++) {
            int startingFloor = rand.nextInt(10) + 1; // Assuming 10 floors
            int destinationFloor = rand.nextInt(10) + 1;
            boolean isStaff = rand.nextDouble() < 0.3; // 30% chance of being a staff member
            if (isStaff) {
                passengers.add(new StaffPassenger(startingFloor, destinationFloor));
            } else {
                passengers.add(new PatientPassanger(startingFloor, destinationFloor));
            }
        }

        this.numIterations = numIterations;
    }

    public void runSimulation() {
        for (int i = 0; i < numIterations; i++) {
            // Move elevators
            for (Elevator elevator : elevators) {
                elevator.move();
            }

            // Load and unload passengers
            for (Elevator elevator : elevators) {
                List<Passanger> passengersToRemove = new ArrayList<>();
                for (Passanger passenger : elevator.passengers) {
                      // Logic - remove & add passangers at stop
                    if (passenger.destinationFloor == elevator.currentFloor) {
                        passengersToRemove.add(passenger);
                    }
                }     // Remove Passangers
                for (Passanger passenger : passengersToRemove) {
                    elevator.removePassenger(passenger);
                }
                      // ADD Passangers && pass < MaxCapacity
                for (Passanger passenger : passengers) {
                    if (passenger.startingFloor == elevator.currentFloor && elevator.canAccommodatePassenger()) {
                        elevator.addPassenger(passenger);
                    }
                }
            }

            // Display elevator status
            System.out.println();
            System.out.println("Iteration " + (i + 1) + ":");
            for (Elevator elevator : elevators) {
                System.out.println("Elevator at floor " + elevator.currentFloor + " with " + elevator.countPatients() + " patients and " + elevator.countStaff() + " staff members");
            }
            System.out.println();
        }
    }
}







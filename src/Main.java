import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Run simulation with 2 elevators, 10 passengers, and 5 iterations
        ElevatorSimulation simulation = new ElevatorSimulation(2, 100, 50);
        simulation.runSimulation();


        }
    }






















































    //SCRAP CODE !



       /* Main

        // Create elevators and passengers
        List<Elevator> elevators = new ArrayList<>();
        elevators.add(new StandardElevator(1, 4, 2));
        elevators.add(new ExpressElevator(1, 8,3));

        List<Passanger> passengers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int startingFloor = rand.nextInt(10) + 1;
            int destinationFloor = rand.nextInt(10) + 1;
            if (passengers.size() == 50) {
                passengers.add(new PatientPassanger(startingFloor, destinationFloor));
            } else {
                passengers.add(new StaffPassenger(startingFloor, destinationFloor));
            }

            // Run simulation
            ElevatorSimulation simulation = new ElevatorSimulation(elevators, passengers, 5);
            simulation.runSimulation();

         */

/*  ElevSim'

    public class ElevatorSimulation {
    List<Elevator> elevators;
    List<Passanger> passengers;
    int numIterations;

    public ElevatorSimulation(List<Elevator> elevators, List<Passanger> passengers, int numIterations) {
        this.elevators = elevators;
        this.passengers = passengers;
        this.numIterations = numIterations;
    }

    public void setPassengers(List<Passanger> passengers) {
        this.passengers = passengers;
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
                    if (passenger.destinationFloor == elevator.currentFloor) {
                        passengersToRemove.add(passenger);
                    }
                }
                for (Passanger passenger : passengersToRemove) {
                    elevator.removePassenger(passenger);
                }

                for (Passanger passenger : passengers) {
                    if (passenger.startingFloor == elevator.currentFloor && elevator.canAccommodatePassenger()) {
                        elevator.addPassenger(passenger);
                    }
                }
            }

            // Display elevator and passenger status
            System.out.println("Iteration " + (i + 1) + ":");
            for (Elevator elevator : elevators) {
                System.out.println("Elevator at floor " + elevator.currentFloor + " with " + elevator.passengers. + " passengers");
            }

    }
}
 */

/*  ExpressElev
    List<Passanger> passengers;
    int maxCapacity;
    ExpressElevator(int currentFloor, int maxCapacity, int destinationFloor) {
        super(currentFloor, destinationFloor );
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    @Override
    void move() {
        // Implement movement logic
    }
    @Override
    boolean canAccommodatePassenger(Passanger passenger) {
        return passengers.size() < maxCapacity;
    }
    @Override
    void addPassenger(Passanger passenger) {
        passengers.add(passenger);
    }
    @Override
    void removePassenger(int passenger) {
        passengers.remove(passenger);
    }
 */

/* StandElev
    List<Passanger> passengers;
    int maxCapacity;
    StandardElevator(int currentFloor, int maxCapacity, int destinationFloor) {
        super(currentFloor, destinationFloor);
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    @Override
    void move() {
        // Implement movement logic
    }
    @Override
    boolean canAccommodatePassenger(Passanger passenger) {
        return passengers.size() < maxCapacity;
    }
    @Override
    void addPassenger(Passanger passenger) {
        passengers.add(passenger);
    }
    @Override
    void removePassenger(int passenger) {
        passengers.remove(passenger);
    }
 */

 /* Elev
    public Passanger passengers;
    int destinationFloor;
    int currentFloor;
    Elevator(int currentFloor, int destinationFloor) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }
    abstract void move();

    abstract boolean canAccommodatePassenger(Passanger passenger);

    abstract void addPassenger(Passanger passenger);

    abstract void removePassenger(int passenger);
     */



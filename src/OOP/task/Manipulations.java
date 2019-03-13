package OOP.task;

import OOP.task.GUI.Initialization;
import OOP.task.PassengerClasses.Passenger;
import OOP.task.SortClasses.Sorting;
import OOP.task.TransportClasses.RailCar;
import OOP.task.TransportClasses.Train;

import java.util.Scanner;

public class Manipulations {
    public static void findAPassengerByNumberOfTicket(Initialization init) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter number of ticket:");
        number = scanner.nextInt();

        if(999 < number && number < 10000) {
            for(RailCar element : init.getTrain().getTheRailCarList()) {
                for(Passenger pasElement : element.getPassengerList()) {
                    if(number == pasElement.getTicketNumber().get()) {
                        pasElement.print();
                    }
                }
            }
        }
        else {
            System.out.println("Incorrect input of ticket!");
        }
        scanner.close();
    }
    public static void printInfromation(Train train) {
        RailCar railCar;
        Passenger passenger;
        for(int i = 0; i < train.getAmountOfRailCars(); i++) {
            railCar = train.getARailCarElement(i);
            System.out.println("\n========Car's number is: " + (i + 1) + "========");
            for(int j = 0; j < railCar.getAmountOfPassengers(); j++) {
                passenger = railCar.getAPassengerFromList(j);

                System.out.println("\n___Passanger [" + (j + 1) + "]: " + "___");
                System.out.printf("[%d] Number of ID: ", i + 1);
                System.out.println(passenger.getNumberOfID().get());
                System.out.printf("[%d] Number of Ticket: ", i + 1);
                System.out.println(passenger.getTicketNumber().get());
            }
        }
    }

    public static void completePassengerSorting(Train train) {
        RailCar railCar;
        for(int i = 0; i < train.getAmountOfRailCars(); i++) {
            railCar = train.getARailCarElement(i);
          //  Sorting.sortByTicket(railCar.getPassengerList());
            Sorting.sortPassengers(railCar, Constants.FIRST_INDEX, railCar.getAmountOfPassengers() - 1);
        }
    }
}

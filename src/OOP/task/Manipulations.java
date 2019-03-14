package OOP.task;

import OOP.task.GUI.GUIConstants;
import OOP.task.GUI.Initialization;
import OOP.task.PassengerClasses.Passenger;
import OOP.task.SortClasses.Sorting;
import OOP.task.TransportClasses.RailCar;
import OOP.task.TransportClasses.Train;
import javafx.scene.control.Alert;

public class Manipulations {
    public static void findAPassengerByNumberOfTicket(Initialization init, int number) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        boolean flag = false;
        if(999 < number && number < 10000) {
            for(RailCar element : init.getTrain().getTheRailCarList()) {
                for(Passenger pasElement : element.getPassengerList()) {
                    if(number == pasElement.getTicketNumber().get()) {
                        flag = true;
                        pasElement.print();
                    }
                }
            }
        }
        else {
            alert.setHeaderText(GUIConstants.NUMBER_ER_TEXT);
            alert.show();
            return;
        }
        if(!flag) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setHeaderText(GUIConstants.NUMBER_IF_DONT_HAVE);
            alert.show();
        }
        else {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setHeaderText(GUIConstants.NUMBER_IF_HAVE);
            alert.show();
        }
    }

    public static void printInformation(Train train) {
        RailCar railCar;
        Passenger passenger;
        Alert alert;
        boolean flagOfPrint = true;
        try {
            for(int i = 0; i < train.getAmountOfRailCars(); i++) {
                railCar = train.getARailCarElement(i);
                System.out.println("\n========Car's number is: " + (i + 1) + "========");
                for(int j = 0; j < railCar.getAmountOfPassengers(); j++) {
                    passenger = railCar.getAPassengerFromList(j);

                    System.out.println("\n___Passenger [" + (j + 1) + "]: " + "___");
                    System.out.printf("[%d] Number of ID: ", i + 1);
                    System.out.println(passenger.getNumberOfID().get());
                    System.out.printf("[%d] Number of Ticket: ", i + 1);
                    System.out.println(passenger.getTicketNumber().get());
                }
            }
        } catch (Exception exception) {
            flagOfPrint = false;
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(GUIConstants.PRINT_INFORM_TITLE);
            alert.setHeaderText(GUIConstants.PRINT_INFORM_TEXT);
            alert.show();
        } finally {
            if(flagOfPrint) {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(GUIConstants.CHECK_WHERE_IS_RESULT);
                alert.show();
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

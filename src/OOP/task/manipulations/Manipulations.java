package oop.task.manipulations;

import oop.task.gui.GUIConstants;
import oop.task.gui.Initialization;
import oop.task.model.passengers.Passenger;
import oop.task.sorting.Sorting;
import oop.task.model.transport.RailCar;
import oop.task.model.transport.Train;
import javafx.scene.control.Alert;
import oop.task.source.Constants;

public class Manipulations {
    public static void findAPassengerByNumberOfTicket(Initialization init, int number) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        boolean flag = false;
        if(Constants.FIRST_POINT < number && number < Constants.LAST_POINT) {
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

    //clearly understand that I'm able to add constants for the method,
    //however I believe this is the best way to release this case
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
            Sorting.sortByTicket(railCar.getPassengerList());
        }
    }
}

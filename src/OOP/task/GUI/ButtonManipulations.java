package OOP.task.GUI;

import OOP.task.Manipulations;
import OOP.task.MyTinyTrainFactory;
import OOP.task.TransportClasses.Train;
import javafx.scene.control.Alert;

public class ButtonManipulations {
    public static void findAnElement(Initialization init) {
        try {
            if(init.getTrain() != null) {
                Manipulations.findAPassengerByNumberOfTicket(init,
                        Integer.parseInt(init.findField.getText()));
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(GUIConstants.IF_DONT_HAVE_A_TRAIN);
                alert.show();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(GUIConstants.NUMBER_ER_TEXT);
            alert.show();
        }
    }

    public static void createATrain(Initialization init) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        init.setTrain(MyTinyTrainFactory.createTheTrain());
        if(init.getTrain() != null) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setTitle(GUIConstants.CREATING_TITLE);
            alert.setHeaderText(GUIConstants.CREATING_TEXT);
            alert.show();
        }
        else {
            alert.setAlertType(Alert.AlertType.WARNING);
            alert.setHeaderText(GUIConstants.UNCREATING_TEXT);
            alert.show();
        }
    }

    public static void printInformation(Train train) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        try {
            Manipulations.printInformation(train);
        }
        catch (Exception exception) {
            alert.setTitle(GUIConstants.PRINT_INFORM_TITLE);
            alert.setHeaderText(GUIConstants.PRINT_INFORM_TEXT);
            alert.showAndWait();
        }
    }

    public static void sortPassengers(Train train) {
        Manipulations.completePassengerSorting(train);
    }
}

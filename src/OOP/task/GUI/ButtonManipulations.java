package oop.task.gui;

import oop.task.hand_made_exception.EmptyTrainException;
import oop.task.manipulations.FileManipulations;
import oop.task.manipulations.Manipulations;
import oop.task.factory.MyTinyTrainFactory;
import oop.task.transportclasses.Train;
import javafx.scene.control.Alert;

public class ButtonManipulations {
    public static void findAnElement(Initialization init) {
        try {
            if(init.getTrain() != null) {
                Manipulations.findAPassengerByNumberOfTicket(init,
                        Integer.parseInt(init.findField.getText()));
            }
            else {
                throw new EmptyTrainException();
            }
        } catch (EmptyTrainException exception) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(GUIConstants.IF_DONT_HAVE_A_TRAIN);
            alert.show();
        }
    }

    public static void createATrain(Initialization init) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        try{
            init.setTrain(MyTinyTrainFactory.createTheTrain());
            if(init.getTrain() != null) {
                alert.setAlertType(Alert.AlertType.INFORMATION);
                alert.setTitle(GUIConstants.CREATING_TITLE);
                alert.setHeaderText(GUIConstants.CREATING_TEXT);
                alert.show();
            }
            else {
                throw new EmptyTrainException();
            }
        }
        catch (EmptyTrainException exception)  {
            alert.setAlertType(Alert.AlertType.WARNING);
            alert.setHeaderText(GUIConstants.UNCREATING_TEXT);
            alert.show();
        }
    }

    public static void printInformation(Train train) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        try {
            if(train != null) {
                Manipulations.printInformation(train);
            }
            else {
                throw new EmptyTrainException();
            }
        }
        catch (EmptyTrainException exception) {
            alert.setTitle(GUIConstants.PRINT_INFORM_TITLE);
            alert.setHeaderText(GUIConstants.PRINT_INFORM_TEXT);
            alert.showAndWait();
        }
    }

    public static void callWriter(Train train) {
        FileManipulations.writeIntoFile(train);
    }

    public static void sortPassengers(Train train) {
        Manipulations.completePassengerSorting(train);
    }
}

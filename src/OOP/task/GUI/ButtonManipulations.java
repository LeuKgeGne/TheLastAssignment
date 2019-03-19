package oop.task.gui;

import oop.task.exception.EmptyTrainException;
import oop.task.manipulations.FileManipulations;
import oop.task.manipulations.Manipulations;
import oop.task.factory.MyTinyTrainFactory;
import oop.task.source.Constants;
import oop.task.model.transport.Train;
import javafx.scene.control.Alert;

public final class ButtonManipulations {
    private ButtonManipulations() {}
    public static Alert alert = new Alert(Alert.AlertType.WARNING);

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
            alert.setHeaderText(GUIConstants.IF_DONT_HAVE_A_TRAIN);
            alert.show();
        }
    }

    public static void createATrain(Initialization init) {
        try{
            init.setTrain(MyTinyTrainFactory.createTheTrain(new Train()));
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
            alert.setHeaderText(GUIConstants.UNCREATING_TEXT);
            alert.show();
        }
    }

    public static void printInformation(Train train) {
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
            alert.setHeaderText(Constants.SORT_EX_WARNING);
            alert.showAndWait();
        }
    }

    public static void callWriter(Train train) {
        try {
            if(train != null) {
                FileManipulations.writeIntoFile(train);
            }
            else {
                throw new EmptyTrainException();
            }
        }
        catch (EmptyTrainException exception) {
            alert.setTitle(GUIConstants.PRINT_INFORM_TITLE);
            alert.setHeaderText(Constants.WRITE_FILE_ERROR);
            alert.showAndWait();
        }
    }

    public static void sortPassengers(Train train) {
        try {
            if(train != null) {
                Manipulations.completePassengerSorting(train);
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
}

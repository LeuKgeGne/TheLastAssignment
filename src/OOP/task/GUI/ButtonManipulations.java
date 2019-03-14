package OOP.task.GUI;

import OOP.task.Manipulations;
import OOP.task.MyTinyTrainFactory;
import OOP.task.TransportClasses.Train;
import javafx.scene.control.Alert;

public class ButtonManipulations {
    public static void findAnElement(Initialization init) {
        try {
            Manipulations.findAPassengerByNumberOfTicket(init,
                    Integer.parseInt(init.findField.getText()));
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(GUIConstants.NUMBER_ER_TEXT);
        }
    }

    public static void createATrain(Initialization init) {
        init.setTrain(MyTinyTrainFactory.createTheTrain());
        if(init.getTrain() != null) {
            init.setTextOfCreating(GUIConstants.CREATING_TEXT);
        }
    }

    public static void printInformation(Train train) {
        Manipulations.printInformation(train);
    }

    public static void sortPassengers(Train train) {
        Manipulations.completePassengerSorting(train);
    }
}

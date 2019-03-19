package oop.task.manipulations;

import javafx.scene.control.Alert;
import oop.task.model.passengers.Passenger;
import oop.task.model.transport.RailCar;
import oop.task.model.transport.Train;
import oop.task.source.Constants;

import java.io.*;

public class FileManipulations {
    public static void writeIntoFile(Train train) {
        try(FileWriter writer = new FileWriter(Constants.FILE_NAME,false)) {
            for(RailCar railCar : train.getTheRailCarList()) {
                for(Passenger passenger : railCar.getPassengerList()) {
                    writer.write(passenger.getNumberOfID().get() + '\n');
                    writer.write(passenger.getTicketNumber().get().toString() + '\n');
                    writer.write('\n');
                }
            }
            writer.flush();
        }
        catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(Constants.FILE_WRITING_ERROR);
        }
    }
}

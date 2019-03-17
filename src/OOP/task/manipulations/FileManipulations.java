package oop.task.manipulations;

import javafx.scene.control.Alert;
import oop.task.passenger_classes.Passenger;
import oop.task.transportclasses.RailCar;
import oop.task.transportclasses.Train;

import java.io.*;

public class FileManipulations {
    public static void writeIntoFile(Train train) {
        try(FileWriter writer = new FileWriter("Passengers.txt",false)) {
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
            alert.setHeaderText("We've got an error, while writing into file!");
        }
    }
}

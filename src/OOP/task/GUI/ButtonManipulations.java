package OOP.task.GUI;

import OOP.task.Manipulations;
import OOP.task.MyTinyTrainFactory;
import OOP.task.TransportClasses.Train;

public class ButtonManipulations {
    public static Train createATrain() {
        Train train;
        return train = MyTinyTrainFactory.createTheTrain();
    }

    public static void printInfromation(Train train) {
        Manipulations.printInfromation(train);
    }

    public static void sortPassengers(Train train) {
        Manipulations.completePassengerSorting(train);
    }
}

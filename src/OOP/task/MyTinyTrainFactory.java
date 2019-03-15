package oop.task;

import oop.task.transportclasses.RailCar;
import oop.task.transportclasses.Train;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class MyTinyTrainFactory {
    public static Train createTheTrain() {
        Train train = new Train();
        byte amountOfRailCars = randomAmountOfRailCars();

        while(amountOfRailCars > 0) {
            train.setARailCarElement(createRailCar());

            --amountOfRailCars;
        }
        train.setNumberOfWay(randomWay());
        return train;
    }

    public static RailCar createRailCar() {
        RailCar railCar = new RailCar();
        Random random = new Random();
        byte amountOfPassengers = randomAmountOfPassengers();

        while(amountOfPassengers > 0) {
            railCar.setAPassengerToList(MyTinyPassengerFactory.createAPassenger());

            --amountOfPassengers;
        }
        return railCar;
    }

    public static byte randomAmountOfPassengers() {
        return (byte)(Constants.MIN_PASSENGER_NUMBER +
                random(Constants.MAX_PASSENGER_NUMBER - Constants.MIN_PASSENGER_NUMBER));
    }

    public static byte randomAmountOfRailCars() {
        return (byte)(Constants.MIN_RAIL_CAR_NUMBER +
                random(Constants.MAX_RAIL_CAR_NUMBER - Constants.MIN_RAIL_CAR_NUMBER));
    }

    public static byte randomWay() {
        return (byte)(Constants.MIN_WAY_NUMBER +
                random(Constants.MAX_WAY_NUMBER - Constants.MIN_WAY_NUMBER));
    }
}

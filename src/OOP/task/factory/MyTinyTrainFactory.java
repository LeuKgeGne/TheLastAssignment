package oop.task.factory;

import oop.task.source.Constants;
import oop.task.model.transport.RailCar;
import oop.task.model.transport.Train;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class MyTinyTrainFactory {
    public static Train createTheTrain(Train train) {
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

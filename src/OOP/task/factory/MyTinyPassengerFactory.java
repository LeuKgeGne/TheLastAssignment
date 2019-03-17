package oop.task.factory;

import oop.task.passenger_classes.Passenger;
import oop.task.source.Constants;

import java.util.Random;

public class MyTinyPassengerFactory {
    public static Passenger createAPassenger() {
        Passenger factoryPassenger = new Passenger();
        factoryPassenger.setTicketNumber(randomTicketNumber());
        factoryPassenger.setNumberOfID(convertToString());

        return factoryPassenger;
    }

    public static char randomSymbol() {
        Random random = new Random();
        return (char)(Constants.MIN_SYMBOL_NUMBER + random.nextInt(
                Constants.MAX_SYMBOL_NUMBER - Constants.MIN_SYMBOL_NUMBER));
    }

    public static int randomIDNumber() {
            Random random = new Random();
            return (int)(Constants.MIN_ID_NUMBER + random.nextInt(
                    Constants.MAX_ID_NUMBER - Constants.MIN_ID_NUMBER));
    }

    public static String convertToString() {
        return new String(randomSymbol()
                + String.valueOf(randomSymbol()) + randomIDNumber());
    }

    public static int randomTicketNumber() {
        Random random = new Random();
        return (int)(Constants.MIN_TICKET_NUMBER + random.nextInt(
                Constants.MAX_TICKET_NUMBER - Constants.MIN_TICKET_NUMBER));
    }
}

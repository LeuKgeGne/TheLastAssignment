package oop.task.model.transport;

import oop.task.model.passengers.Passenger;
import oop.task.source.Printable;
import java.util.ArrayList;

public class RailCar implements Printable {
    private ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

    public void setAPassengerToList(Passenger _passenger) {
        passengerList.add(_passenger);
    }

    public Passenger getAPassengerFromList(Integer _IndexOfAPassenger) {
        return passengerList.get(_IndexOfAPassenger);
    }

    public byte getAmountOfPassengers() {
        return (byte)passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    @Override
    public void print() {
        System.out.printf("Amount of passengers: %d", this.passengerList.size());
    }
}
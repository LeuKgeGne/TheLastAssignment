package oop.task.sort_classes;

import oop.task.source.Constants;
import oop.task.passenger_classes.Passenger;
import oop.task.transportclasses.RailCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Sorting {
    public static Comparator<Passenger> comparingByTicket = (pas1, pas2) -> pas1.getTicketNumber().get().compareTo(pas2.getTicketNumber().get());

    public static void sortByTicket(ArrayList<Passenger> myList) {
        myList.sort(comparingByTicket);
    }

    public static void sortPassengers(RailCar railCar, int firstIndex, int secondIndex) {
        ListIterator<Passenger> first = railCar.getPassengerList().listIterator(firstIndex);
        ListIterator<Passenger> second  = railCar.getPassengerList().listIterator(firstIndex);
        ListIterator<Passenger> comparing = null;
        Passenger passenger;
        int amount = railCar.getPassengerList().size();

        boolean flag;

        try {
            while(amount > 0) {
                int max_Ticket = first.next().getTicketNumber().get(); // added previous
                first = railCar.getPassengerList().listIterator(first.previousIndex());
                flag = false;

                second = railCar.getPassengerList().listIterator(first.nextIndex() + 1);

                while(second.hasNext()) {
                    if(max_Ticket < (second.next().getTicketNumber().get())) {
                        second = railCar.getPassengerList().listIterator(second.previousIndex());
                        comparing = second;
                        max_Ticket = (second.next().getTicketNumber().get());
                        second = railCar.getPassengerList().listIterator(second.previousIndex());
                        flag = true;
                    }
                }
                if(flag && first.hasNext() && comparing.hasNext()) {
                    passenger = first.next();
                    //first = railCar.getPassengerList().listIterator(first.previousIndex());
                    first.previous();
                    first.set(comparing.next());
                   // comparing = railCar.getPassengerList().listIterator(comparing.previousIndex());
                    comparing.previous();
                    comparing.set(passenger);
                }
                amount--;
            }
        } catch (NoSuchElementException ex) {
            System.out.println(Constants.CATCH_END);
        }
    }
}

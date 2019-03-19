package oop.task.sorting;

import oop.task.model.passengers.Passenger;
import java.util.ArrayList;
import java.util.Comparator;


public class Sorting {
    public static Comparator<Passenger> comparingByTicket =
            (pas1, pas2) -> pas1.getTicketNumber().get().compareTo(pas2.getTicketNumber().get());

    public static void sortByTicket(ArrayList<Passenger> myList) {
        myList.sort(comparingByTicket);
    }
}

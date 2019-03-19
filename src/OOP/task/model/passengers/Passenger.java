package oop.task.model.passengers;

import java.util.Optional;

public class Passenger extends Human {
    private Optional<Integer> ticketNumber;

    public Passenger(Integer _ticketNumber, String _numberOfID) {
        super(_numberOfID);
        this.ticketNumber = Optional.ofNullable(_ticketNumber);
    }

    public void setTicketNumber(Integer _ticketNumber) {
        this.ticketNumber = Optional.ofNullable(_ticketNumber);
    }

    public Optional<Integer> getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public void print() {
        super.print();
        ticketNumber.ifPresent(System.out::println);
    }
}

package OOP.task.PassengerClasses;

import java.util.Optional;

public class Passenger extends Human {
    private Optional<Integer> ticketNumber;

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

package oop.task.model.passengers;

import oop.task.source.Printable;

import java.util.Optional;

public class Human implements Printable {
    private Optional<String> numberOfID;

    public Human(String _numberOfID) {
        this.numberOfID = Optional.ofNullable(_numberOfID);
    }

    public void setNumberOfID(String _numberOfID) {
        this.numberOfID = Optional.ofNullable(_numberOfID);
    }

    public Optional<String> getNumberOfID() {
        return this.numberOfID;
    }

    @Override
    public void print() {
        this.numberOfID.ifPresent(System.out::println);
    }
}

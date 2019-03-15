package oop.task.transportclasses;

import oop.task.Printable;

import java.util.Optional;

public class Transport implements Printable {
    private Optional<Byte> numberOfWay;

    public void setNumberOfWay(Byte _numberOfWay) {
        this.numberOfWay = Optional.ofNullable(_numberOfWay);
    }

    public Optional<Byte> getNumberOfWay() {
        return this.numberOfWay;
    }

    @Override
    public void print() {
        System.out.println("Number of way: %d" + Optional.ofNullable(this.numberOfWay));
    }
}
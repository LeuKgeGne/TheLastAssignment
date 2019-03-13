package OOP.task;

public class MeinException extends Exception {
    private int numberOfError;

    public MeinException(int _numberOfError) {
        this.numberOfError = _numberOfError;
    }

    public void printError() {
        System.out.println(numberOfError);
    }
}

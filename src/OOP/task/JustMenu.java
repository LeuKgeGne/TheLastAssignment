package OOP.task;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class JustMenu {
    public static int variants(Scanner scanner) {
        int changer = -1;
        try {
            System.out.println("=========================");
            System.out.println("1. Create a train(random).");
            System.out.println("2. Print piece of Info.");
            System.out.println("3. Sort passengers.");
            System.out.println("0. End program.");
            System.out.println("=========================");
            changer = scanner.nextByte();
        } catch (NoSuchElementException ex) {
            System.out.println(Constants.JUSTMENU_I_ERROR);
        }

        return changer;
    }
}

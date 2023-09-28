package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    Scanner scanner = new Scanner(System.in);

    /**
     * This method demonstrates the use of try-catch-finally block.
     * @param message - a message to the user
     * @return - a float number entered by the user
     */
    public float getUserNumber(String message) {
        float userInput = 0;
        boolean flag = true;
        do {
            try {
                System.out.print(message);
                userInput = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid input. Please try again.");
            }
        } while (flag);

        return userInput;
    }
}

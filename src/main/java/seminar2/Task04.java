package seminar2;

import java.util.Scanner;

public class Task04 {
    Scanner scanner = new Scanner(System.in);

    /**
     * This method returns a float number entered by the user.
     * @param message - a message to the user
     * @return - a float number entered by the user
     * @throws Exception - if the user enters an empty string
     */
    public String getUserString(String message) throws Exception {
        String userInput;
        System.out.print(message);
        userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            throw new Exception("You entered an empty string!");
        }

        return userInput;
    }
}

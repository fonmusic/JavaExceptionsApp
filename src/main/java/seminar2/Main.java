package seminar2;

public class Main {
    public static void main(String[] args) throws Exception {

        // Task01
        Task01 task01 = new Task01();
        float userInput = task01.getUserNumber("Enter a float number: ");
        System.out.println("You entered: " + userInput);

        // Task02
        Task02 task02 = new Task02();
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        task02.run(intArray);

        // Task03
        Task03 task03 = new Task03();
        task03.run();

        // Task04
        Task04 task04 = new Task04();
        String userString = task04.getUserString("Enter a string: ");
        System.out.println("You entered: " + userString);
    }
}

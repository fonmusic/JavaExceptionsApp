package seminar2;

public class Task02 {
    /**
     * This method demonstrates the use of try-catch-finally block.
     */
    public void run(int[] intArray) {
        try {
            int d = 0;
            double caughtRes1 = (double) intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

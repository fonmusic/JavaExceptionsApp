package seminar2;

public class Task03 {
    /**
     *  This method demonstrates the use of try-catch-finally block.
     */
    public void run() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Обращение к несуществующему объекту!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

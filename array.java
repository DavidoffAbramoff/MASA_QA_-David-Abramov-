import java.util.Random;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Введите размер массива (число больше 3): ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n > 3) {
                    break;
                } else {
                    System.out.println("Неправильно введено число. Повторите.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильно введено число. Повторите.");
            }
        }

        int[] array1 = new int[n];
        System.out.println("Random numbers: ");

        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(n + 1);

            System.out.print(array1[i] + " ");

        }

        System.out.println("\nEven numbers: ");
        for (int i = 0; i < n; i++) {
            if (array1[i]  != 0 && array1[i] % 2 == 0) {
                System.out.print(array1[i] + " ");
            }
        }
    }

}
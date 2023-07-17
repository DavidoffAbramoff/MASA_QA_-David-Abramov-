import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class homeworkmasa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите размер массива (число больше 3): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите размер массива (число больше 3): ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 3);
        int[] array = generateRandomArray(n);
        System.out.println("Массив: " + Arrays.toString(array));
        int[] evenArray = filterEvenElements(array);
        System.out.println("Массив из чётных элементов: " + Arrays.toString(evenArray));
    }
    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size + 1); // генерация случайного числа от 0 до n
        }
        return array;
    }
    // Метод для фильтрации чётных элементов из массива
    public static int[] filterEvenElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }
        return evenArray;
    }
}
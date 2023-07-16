import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray();
        int[] array2 = generateRandomArray();

        // Вывод массивов на экран
        System.out.print("Массив 1: ");
        printArray(array1);

        System.out.print("Массив 2: ");
        printArray(array2);

        // Вычисление среднего арифметического элементов каждого массива
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        // Сравнение средних арифметических и вывод результата
        if (average1 > average2) {
            System.out.println("Среднее арифметическое массива 1 больше.");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое массива 2 больше.");
        } else {
            System.out.println("Средние арифметические массивов равны.");
        }
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray() {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9); // генерация случайного числа от 0 до 8
        }
        return array;
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод для вычисления среднего арифметического элементов массива
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
import java.util.Scanner; // импортируем класс
public class workmasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Нахождение наибольшего числа
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("Наибольшее число: " + max);

        // Нахождение наименьшего числа
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Наименьшее число: " + min);

        // Нахождение среднего арифметического
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Среднее арифметическое: " + average);
    }
}
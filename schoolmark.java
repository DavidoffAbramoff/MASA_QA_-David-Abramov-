import java.util.Random;

public class schoolgrade {
    public static void main(String[] args) {
        String[] names = {"Антон", "Ваня", "Дима", "Зоя", "Катя"};
        int[] grades = new int[5];
        
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(101); // генерация случайного числа от 0 до 100
        }
        
        // Поиск индекса элемента с максимальной оценкой
        int maxIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Вывод имени и оценки ученика с наибольшей оценкой
        System.out.println("Имя: " + names[maxIndex]);
        System.out.println("Оценка: " + grades[maxIndex]);
    }
}
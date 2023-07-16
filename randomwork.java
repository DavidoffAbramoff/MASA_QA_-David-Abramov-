import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randomwork {
    public static void main(String[] args) {
        Random chisla = new Random();
        List<Integer> generatedNumbers = new ArrayList<>();

        int i = 1;
        while (i <= 6) {
            int randomNumber = generateUniqueRandomNumber(chisla, generatedNumbers);
            generatedNumbers.add(randomNumber);
            System.out.println("Number " + i + ": " + randomNumber);
            i++;
        }
    }

    // Метод для генерации уникального случайного числа
    public static int generateUniqueRandomNumber(Random random, List<Integer> generatedNumbers) {
        int randomNumber;
        do {
            randomNumber = random.nextInt(34) + 1;
        } while (generatedNumbers.contains(randomNumber));
        return randomNumber;
    }
}
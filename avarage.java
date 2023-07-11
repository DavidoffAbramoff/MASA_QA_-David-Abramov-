import java.util.Scanner;
public class avarage {
    public static void main(String[] args){
        System.out.println("Привет! Введите 3 числа:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.print("Наибольшее число: ");
        if (a > b && a > c){
            System.out.println(a);
        }

        else if (b > a && b > c){
            System.out.println(b);
        }

        else if (c > a && c > b){
            System.out.println(c);
        }
          
    System.out.print("Наименьшее число: ");
        if (a < b && a < c){
            System.out.println(a);
        }

        else if (b < a && b < c){
            System.out.println(b);
        }

        else if (c < a && c < b){
            System.out.println(c);
        }
        
    System.out.println("Среднее арифметическое: " + ((a+b+c)/3));    
    }
}
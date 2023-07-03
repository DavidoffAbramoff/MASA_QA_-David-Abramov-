import java.util.Scanner;

public class ifelse {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scan.next ();
        System.out.println();
        System.out.print("Enter your year of birth: ");
        int year = scan.nextInt();
        System.out.println();
        int age = 2023-year;
        System.out.print ("Hello" + name + " . You are "+age+" old. ");
        scan.close();
    }
}
mport java.util.Random;
 
 public class change {
     public static void main(String[] args) {
         Random chisla = new Random();
 
         int[] array1 = new int[6];
         System.out.print("Случайные числа: ");
         for (int i = 0; i < 6; i++) {
             array1[i] = chisla.nextInt(34) + 1;
             if (i == 0) {
                 System.out.print(array1[i] + " ");
             } else if (i >= 1 && array1[i] != array1[i - 1]) {
                 System.out.print(array1[i] + " ");
             }
 
         }
     }
 }
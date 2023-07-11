import java.util.Scanner;

public class homework3 {
    public static void main(String[] args){
        String username = "David96";
        String password = "12345";
        String nameIn;
        String passwordIn;
        Scanner scan = new Scanner(System.in); {

        
       System.out.print("Введите имя пользователя: ");
        nameIn = scan.next();
       
        if (nameIn.equals(username)){
            System.out.print("Введите пароль: ");
        }
        else{
            System.out.println("Нет пользователя с таким именем");
            return;
        }
        
        passwordIn = scan.next();
        if (passwordIn.equals(password)){
            System.out.println("Здравствуйте, " + username + ", Вы вошли в систему.");
        }
        else{
            System.out.println("Вы ввели неверный пароль");
            return;
        }
        scan.close();
}
}
}
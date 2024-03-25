import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(new Date());
        for (;;) {
            System.out.println("Что нужно сделать?");
            System.out.println("Введите первой число");
            int number1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число");
            int number2 = new Scanner(System.in).nextInt();
            int result = number1 + number2;
            System.out.println(result);
        }

    }
}
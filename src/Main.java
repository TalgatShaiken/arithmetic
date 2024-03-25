import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Введите первое число: ");
            int number1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число: ");
            int number2 = new Scanner(System.in).nextInt();
            int result = number1 + number2;
            System.out.println("Сумма ваших чисел: " + result);
        }
    }
}
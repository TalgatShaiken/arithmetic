import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 20;
        if (number1 < number2) {
            System.out.println("Ехала");
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(new Date());
    }
}
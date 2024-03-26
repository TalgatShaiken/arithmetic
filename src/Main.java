import java.util.Scanner;

public class Main {


    public class arithmetic {
        private int num1;
        private int num2;

        public arithmetic(int num1, int num2) {
            this.num1 = new Scanner(System.in).nextInt();
            this.num2 = new Scanner(System.in).nextInt();
        }

        public int sum() {
            return num1 + num2;
        }

        public int product() {
            return num1 * num2;
        }

        public int max() {
            return Math.max(num1, num2);
        }

        public int min() {
            return Math.min(num1, num2);
        }
    }

    public static void main(String[] args) {
        System.out.println();

    }
}
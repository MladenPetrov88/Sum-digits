import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int num1 = number;

        do {
            sum = sum + (num1 % 10);
            num1 = num1 / 10;
        }
        while (num1 > 0);

        System.out.println(sum);
    }
}

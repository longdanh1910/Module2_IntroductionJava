import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you would like to convert: ");
        usd = sc.nextDouble();
        double amount = usd * 23000;
        System.out.print("Gia tri VND: " + amount);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 100;
        while(true) {
            System.out.println("На вашем балансе - " + balance + " рублей.");
            System.out.println("Введите сумму, которую хотите положить на баланс или введите end для выхода");
            String input = scan.nextLine();
            if (input.equals("end")) {
                System.out.println("Ваш баланс - " + balance);
                break;
            }
            int newBalance = Integer.parseInt(input);
            balance += newBalance;
            if (newBalance > 1000) {
                int bonus = newBalance/100;
                balance += bonus;
                System.out.println("Ваш бонус: " + bonus);
            }

        }

    }
}

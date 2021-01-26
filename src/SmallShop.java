import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if ("Sofia".equals(town)) {
            if ("coffee".equals(product)) {
                price = 0.5;
            } else if ("water".equals(product)) {
                price = 0.8;
            } else if ("beer".equals(product)) {
                price = 1.2;
            } else if ("sweets".equals(product)) {
                price = 1.45;
            } else if ("peanuts".equals(product)) {
                price = 1.6;
            }
        } else if ("Plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                price = 0.4;
            } else if ("water".equals(product)) {
                price = 0.7;
            } else if ("beer".equals(product)) {
                price = 1.15;
            } else if ("sweets".equals(product)) {
                price = 1.3;
            } else if ("peanuts".equals(product)) {
                price = 1.5;
            }
        } else if ("Varna".equals(town)) {
            if ("coffee".equals(product)) {
                price = 0.45;
            } else if ("water".equals(product)) {
                price = 0.7;
            } else if ("beer".equals(product)) {
                price = 1.1;
            } else if ("sweets".equals(product)) {
                price = 1.35;
            } else if ("peanuts".equals(product)) {
                price = 1.55;
            }
        }
        double total = price * quantity;
        System.out.printf("%.2f", total);

    }
}
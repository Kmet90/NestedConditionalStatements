import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;

        switch (town) {
            case "Sofia":
                if (sale >= 0 && sale <= 500) {
                    commission = sale * 0.05;
                } else if (sale >= 500 && sale <= 1000) {
                    commission = sale * 0.07;
                } else if (sale >= 1000 && sale <= 10000) {
                    commission = sale * 0.08;
                } else if (sale > 10000) {
                    commission = sale * 0.12;
                }
                if (sale < 0) {
                    System.out.println("error");
                } else {
                    System.out.printf("%.2f", commission);
                }
                break;
            case "Varna":
                if (sale >= 0 && sale <= 500) {
                    commission = sale * 0.045;
                } else if (sale >= 500 && sale <= 1000) {
                    commission = sale * 0.075;
                } else if (sale >= 1000 && sale <= 10000) {
                    commission = sale * 0.10;
                } else if (sale > 10000) {
                    commission = sale * 0.13;
                }
                if (sale < 0) {
                    System.out.println("error");
                } else {
                    System.out.printf("%.2f", commission);
                }
                break;
            case "Plovdiv":
                if (sale >= 0 && sale <= 500) {
                    commission = sale * 0.055;
                } else if (sale >= 500 && sale <= 1000) {
                    commission = sale * 0.08;
                } else if (sale >= 1000 && sale <= 10000) {
                    commission = sale * 0.12;
                } else if (sale > 10000) {
                    commission = sale * 0.145;
                }
                if (sale < 0) {
                    System.out.println("error");
                } else {
                    System.out.printf("%.2f", commission);
                }
                break;
            default:
                System.out.println("error");
        }
    }
}

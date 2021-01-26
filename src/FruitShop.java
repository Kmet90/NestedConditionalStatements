import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.5;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "apple":
                        price = 1.2;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "orange":
                        price = 0.85;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "grapefruit":
                        price = 1.45;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "kiwi":
                        price = 2.7;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "pineapple":
                        price = 5.5;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "grapes":
                        price = 3.85;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.7;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "apple":
                        price = 1.25;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "orange":
                        price = 0.9;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "grapefruit":
                        price = 1.60;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "kiwi":
                        price = 3.0;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "pineapple":
                        price = 5.6;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    case "grapes":
                        price = 4.2;
                        System.out.printf("%.2f", price * quantity);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}

import java.util.Scanner;

abstract class Delivery {
    double Amount;

    Delivery() {
        Amount = 0;
    }

    Delivery(double Amount) {
        this.Amount = Amount;
    }

    abstract void DeliveryMode();
    abstract void charges();

    void CompanyInfo() {
        System.out.println("CLIIPs");
    }
}

class StandardDelivery extends Delivery {
    StandardDelivery(double Amount) {
        super(Amount);
    }

    void DeliveryMode() {
        System.out.println("You are using Standard Delivery");
    }

    void charges() {
        System.out.println("Standard delivery charges: " + (Amount + (0.05 * Amount)));
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(double Amount) {
        super(Amount);
    }

    void DeliveryMode() {
        System.out.println("You are using Express Delivery");
    }

    void charges() {
        System.out.println("Express delivery charges: " + (Amount + 0.1 * Amount));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the mode of delivery:");
        System.out.println("1. Standard Delivery");
        System.out.println("2. Express Delivery");
        int choice = sc.nextInt();

        System.out.println("Enter the amount:");
        double Amount = sc.nextDouble();

        Delivery delivery;
        switch (choice) {
            case 1:
                delivery = new StandardDelivery(Amount);
                break;
            case 2:
                delivery = new ExpressDelivery(Amount);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Standard Delivery.");
                delivery = new StandardDelivery(Amount);
        }

        delivery.CompanyInfo();
        delivery.DeliveryMode();
        delivery.charges();

        sc.close();
    }
}
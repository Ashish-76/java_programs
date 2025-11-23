import java.util.Scanner;
class GLAVaribles {
    public static void main(String[] args) {
    System.out.println("Greece God GYM! \nWELCOMES YOU!!!");
     System.out.println("Enter your name");
     Scanner scanner = new Scanner(System.in);
     String name = scanner.nextLine();
    System.out.println("Choose a membership: \n 1. Monthly: $10 \n 2. Yearly: $100");
     Scanner member = new Scanner(System.in);
     String customer = member.nextLine();
     System.out.println(name + " You have selected:" +  customer );

    }
}
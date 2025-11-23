import java.util.Scanner;
public class rockpaper{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (rock/paper/scissors):");
        String  choice = sc.next();
        switch(choice)
        {
            case "rock":
                System.out.println("paper");
                System.out.println("you lose...");
                break;
            case "paper":
                System.out.println("scissors");
                System.out.println("you lose...");
                break;
            case "scissors":
                System.out.println("rock");
                System.out.println("you lose...");
                break;
            default:
                System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
        }
    }
}
import java.util.Scanner;

public class Outdooractivity {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter score 1:");
        int a  = sc1.nextInt();
        System.out.print("Enter score 2:");
        int b = sc1.nextInt();
        System.out.print("Enter score 3:");
        int c = sc1.nextInt();
        if(a>b && b>c){
            System.out.println("Score 2 is second highest.");
        } else if (a>c && c>b) {
            System.out.println("Score 3 is second highest.");
        } else if (b>a && a>c) {
            System.out.println("Score 1 is second highest.");
        }

        }


      /*  if (temperature <= 0) {
            System.out.println("It is too cold to go outside.");
        } else if (temperature > 0 && temperature < 40) {
            System.out.println("It is a nice day to go outside.");
        } else {
            System.out.println("It is too hot to go outside.");
        } 
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        } */

    }

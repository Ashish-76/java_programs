import java.util.*;
public class program{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt(); 
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter B:");
        int b = sc1.nextInt();
        if( a > b){
            System.out.println("A is greater than B.");
        } else if (a < b) {
            System.out.println("A is less than B.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
  }

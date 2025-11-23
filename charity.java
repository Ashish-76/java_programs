import java.util.*;
public class charity{
    public static void main(String[]args){

       /*  Scanner sc = new Scanner(System.in);
        int i;
        int money = 0;
        int n = sc.nextInt();
        for(i = 1; i <=n; i++) {
            money += (i*i);
            
        }
    System.out.println(money);  

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        } */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }   
            System.out.println("*"); }
} }
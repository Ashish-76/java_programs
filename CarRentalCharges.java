import java.util.Scanner;
public class CarRentalCharges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt(); 
        int N = sc.nextInt(); 
        int R2 = sc.nextInt(); 
        int X = sc.nextInt(); 

        
        int totalHours = (int) Math.ceil(X /60.0);

        int cost;
        if (totalHours <= N) {
           
            cost = totalHours * R1;
        } else {
            cost = (N * R1) + ((totalHours - N) * R2);
        }

        System.out.println(cost);
        sc.close();
    }
}
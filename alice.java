import java.util.*;
public class alice{
    public static void main(String[] args) {
        System.out.println("Enter the number of houses:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int houses[] = new int[n];
        System.out.println("Enter the number of stairs in each house:");
        for(int i=0;i<n;i++){
            houses[i] = sc.nextInt();
        }
        int count =0;
        for(int j=0;j<n;j++){
            if(houses[j]%3==0){
                count++;
            } 
        }
            System.out.println("The number of roofs alice can reach: " + count);
    }

}
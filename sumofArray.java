import java.util.*;
public class sumofArray {
    public static void main(String[] args) {
        int arr[] =  new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.print("{" +arr[i] +"}, ");
            sum+=arr[i];
        } 
        System.out.println(":The sum of the elements of the array is: " + sum);
    }
}
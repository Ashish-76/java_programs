import java.util.*;
public class lost{
    public static void main(String[] args) {
         System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){   
            arr[i] = sc.nextInt();  
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
                System.out.println("The missing number is: " + (i+1));
                break;
            }
        }
        
    }
}
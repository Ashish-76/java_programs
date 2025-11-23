import java.util.*;
public class largestnum {
    public static void main(String[]args)
    {
        System.out.println("give the size of the array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        } 
        int larger=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larger){
                larger=arr[i];
            }
        } 
        System.out.println("The largest number in the array is: " + larger);
        

    }
}
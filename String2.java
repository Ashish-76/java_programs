import java.util.*;
 
 public class String2 {
     public static void main(String[] args) {
        String A="hello";
        String B="world";
        System.out.println(A+B);
        System.out.println(A.length()+ B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
      String str= capitalizeFirstLetters(A);
        
        System.out.println(A+" "+B);

     }
    }
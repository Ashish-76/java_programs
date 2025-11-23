import java.util.*;
public class newStrings1{
    public static void main(String[] args){
        String str = "I am gonna be the king of the pirates";
        System.out.println(str);

       
        str = str + " and I will find One Piece";
        System.out.println(str);

       
        str = str.replace("king", "Emperor");
        System.out.println(str);

       
        System.out.println(str.toUpperCase());

      
        System.out.println(str.toLowerCase());


        System.out.println(str.indexOf("gonna"));

        
        System.out.println(str.length());

        
        System.out.println(str.lastIndexOf("Queen"));

       
        System.out.println(str.charAt(5));
    }
}
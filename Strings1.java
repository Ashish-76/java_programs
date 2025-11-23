import java.util.*;
public class Strings1{
    public static void main(String[] args){
        String str="I am gonna be the king of the pirates";
        System.out.println(str);

        String str=str.append(" and I will find One Piece");
        System.out.println(str);

        str = str.replace("king","Queen");
        System.out.println(str);

        String str2=str.toUpperCase(str);
        System.out.println(str2);

        String str3=str.toLowerCase(str);
        System.out.println(str3);

        str.indexof("gonna");
        System.out.println(str);

        str.length("king of the pirates");
        System.out.println(str);

        str.lastIndexOf(str);
        System.out.println(str);

        str.charAt(5);
        System.out.println(str);

    }
}

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class UniqueSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> Numbers = new HashSet<>();

        System.out.println("Enter 5 numbers:");
        for(int i=0; i<5; i++) {
            int num = sc.nextInt();
            Numbers.add(num);

            List<Integer> sortedList = new ArrayList< >(Numbers);

            Collections.sort(sortedList);
            System.out.println("Unique sorted numbers so far: " + sortedList);


        }
        sc.close();
    }
}

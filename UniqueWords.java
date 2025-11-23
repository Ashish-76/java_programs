import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String line = sc.nextLine();
    String[] words = line.toLowerCase().split("\\W+");
    Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words in the sentence:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        sc.close();
    }
}

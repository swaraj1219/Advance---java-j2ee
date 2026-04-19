import java.util.*;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result.append(first).append(rest).append(" ");
            }
        }

        return result.toString().trim(); // remove last space
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized String: " + output);

        sc.close();
    }
}
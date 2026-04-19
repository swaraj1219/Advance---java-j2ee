import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1: " + s1.charAt(1));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace("Java", "Python"));

        // 7. Whitespace Handling
        String ws = "   Hello Java   ";
        System.out.println("Before trim: '" + ws + "'");
        System.out.println("After trim: '" + ws.trim() + "'");

        // 8. String Concatenation
        String concat = s1 + " " + s2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        int age = 20;
        System.out.println(String.format("My age is %d", age));

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
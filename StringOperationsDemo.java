import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        System.out.println("Length: " + s1.length());
        System.out.println("Character at index 1: " + s1.charAt(1));

        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        System.out.println("Substring: " + text.substring(0, 4));

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        String ws = "   Hello Java   ";
        System.out.println("Trim: '" + ws.trim() + "'");

        System.out.println("Concatenation: " + s1 + " " + s2);

        String[] words = "Java is easy".split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        System.out.println(String.format("Age: %d", 20));

        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
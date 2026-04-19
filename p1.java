import java.util.*;

public class p1 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");

        System.out.println("List elements: " + ls);

        if (ls.contains("red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}
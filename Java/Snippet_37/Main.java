package Java.Snippet_37;
public class Main {
    String original = "Hello";
    String reversed = "";
    for (int i = 0; i < original.length(); i++) {
        reversed = original.charAt(i) + reversed;
    }
    System.out.println("Reversed string: " + reversed);
}
package Java.Snippet_18;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
package Java.Snippet_19;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("List");
        list.add("Java");
        String firstString = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(firstString)) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
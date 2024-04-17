import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwapFirstLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        swapFirstLast(list);
        System.out.println(list);
    }

    public static void swapFirstLast(ArrayList<String> list) {
        if (list.size() > 1) {
            Collections.swap(list, 0, list.size() - 1);
        }
    }
}

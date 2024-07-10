package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayList {
    public static void main(String[] args) {
       List<String> list = new java.util.ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Vector<Integer> vector = new Vector<>();
        Iterator<String> iterator = list.iterator();
        list.remove("A");
        while (iterator.hasNext()) {
            if(iterator.next().equals("A"))
                iterator.remove();
        }

        System.out.println(list);
    }
}

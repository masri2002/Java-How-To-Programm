package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list =new ArrayList<>();
         list.add(new Time2(6, 24, 34));
         list.add(new Time2(18, 14, 58));
        list.add(new Time2(18, 14, 59));
         list.add(new Time2(6, 05, 34));
         list.add(new Time2(12, 14, 58));
        list.add(new Time2(12, 14, 57));
         list.add(new Time2(6, 24, 22));
        System.out.println("Unsorted List \n"   + list);
        Collections.sort(list , new TimeComparator());

        System.out.println();
        System.out.println();
        for(Time2 t :list){
            System.out.println(t);
        }
    }
}

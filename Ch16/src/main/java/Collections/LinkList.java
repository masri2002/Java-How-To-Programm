package Collections;

import java.util.*;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
    public static void printList(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        deleteFromList(list,2,4);
        System.out.println("-----------------------");
        System.out.println(list);
    }
    public static void deleteFromList(List<String> list, int start, int end) {
      list.subList(start, end).clear();
    }
}

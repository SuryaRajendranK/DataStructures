package LinkedList;

import java.util.LinkedList;

public class Linkedlist {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // creating linked list
        LinkedList<String> ss = new LinkedList<String>();
        // adding elements to the list
        ss.add("ramesh");
        ss.add("kumar");
        ss.add("rahul");
        ss.add("gandhi");
        System.out.println(ss);
        // creating another linked list
        LinkedList<String> ss1 = new LinkedList<String>();
        ss1.add("surya");
        ss1.add("kumar");
        ss1.add("ramesh");
        // adding all the elements to the 1st linked list
        ss.addAll(ss1);
        System.out.println(ss);
        // removing element at the specified index
        ss.remove(1);
        System.out.println(ss);
        // removing 1st duplicate value that appears in the list
        ss.removeFirstOccurrence("kumar");
        System.out.println(ss);
        // removing last duplicate value that appears in the list
        ss.removeLastOccurrence("ramesh");
        System.out.println(ss);
    }
}

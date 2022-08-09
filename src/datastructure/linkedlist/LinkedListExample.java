package datastructure.linkedlist;

import java.util.LinkedList;

/**
 * Link list for list that easy to organize and modify the value
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();
        myList.add("String A");
        myList.add("String B");

        // add at customize position
        myList.add(1, "String C");

        System.out.println(myList);

        // remove
        myList.remove("String A");

        System.out.println(myList);
    }
}

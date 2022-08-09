package datastructure.hashmap;

import java.util.HashMap;

public class StoringPairWithHashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Emergency", 999);
        phoneBook.put("Amir", 99838);
        phoneBook.put("Dollah", 884);
        System.out.println(phoneBook);
    }

}

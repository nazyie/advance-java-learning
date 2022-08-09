package datastructure.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap example
 *  note: i also not understand what is this use for XD
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {
        // 1st argument - initial capacity
        // 2nd argument - load factor
        // 3rd argument - access order
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, false);
        phoneBook.put("Emergency", 999);
        phoneBook.put("Amir", 99838);
        phoneBook.put("Dollah", 884);

        // system
        System.out.println(phoneBook);

        System.out.println();

        for(Map.Entry<String, Integer> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

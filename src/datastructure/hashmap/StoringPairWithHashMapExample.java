package datastructure.hashmap;

import java.util.HashMap;

/**
 * HashMap consist of the key and the value
 */
public class StoringPairWithHashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Emergency", 999);
        phoneBook.put("Amir", 99838);
        phoneBook.put("Dollah", 884);

        // not allow the duplicate key - this will overrie the Dollah
        phoneBook.put("Dollah", 99949494);
        System.out.println(phoneBook);

        if(phoneBook.containsKey("Brenda")) {
            phoneBook.remove("Brenda");
        }

//        // to clear the record inside the hashmap
//        phoneBook.clear();

        System.out.println(phoneBook);
    }

}

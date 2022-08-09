package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of generic in the ArrayList
 *      List - can apply with difference type
 *      List<String> - limited to string
 *
 */
public class ArrayListGenericExample {

    public static void main(String[] args) {

        List genericList = new ArrayList();
        genericList.add("String");
        genericList.add(5);

        System.out.printf(genericList.toString());

        List<String> stringLimitedList = new ArrayList<>();
        stringLimitedList.add("String");
//        stringLimitedList.add(5);

        System.out.println(stringLimitedList);
    }
}

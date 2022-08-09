package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of generic method with difference type
 */
public class GeneralMethodExample {
    static Character[] charArray = {'h', 'k', 'l'};
    static Integer[] intArray = {9, 8, 89, 89};
    static Boolean[] boolArray = {true, false, true};

    /**
     * First specifying <T> define that T limited to this particular method and not outside of the function
     * <p>T means the generic part of the functions which can reply with many type like String, Boolean and others</p>
     *
     * @param array
     * @param list
     * @return
     * @param <T>
     */
    public static <T> List<T> processArrayToList(T[] array, List<T> list) {

        // we cant use object cause it will causing the safety type
        for(T object: array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = processArrayToList(charArray, new ArrayList<Character>());
        List<Boolean> booleanList = processArrayToList(boolArray, new ArrayList<Boolean>());
        List<Integer>  integerList= processArrayToList(intArray, new ArrayList<Integer>());

        System.out.println(characterList);
    }

}

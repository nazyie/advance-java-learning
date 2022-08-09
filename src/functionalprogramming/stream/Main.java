package functionalprogramming.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream help to replace loop in certain condition
 * <p>want to filter and perform some calculation</p>
 */
public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("engku");
        stringList.add("nazyie");
        stringList.add("huhu");
        stringList.add("hehe");
        stringList.add("yey");
        stringList.add("kawkaw");

//        // loop implementation
//        for(String value: stringList) {
//            if(value.startsWith("e")) {
//                System.out.println(value);
//            }
//        }

        stringList.stream().filter(value -> {
            return value.startsWith("e");
        }).forEach(System.out::println);
    }
}

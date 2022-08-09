package generic;

/**
 * Example using the varArg
 * <p>VarArgs ... allot the string to be parse in the parameter</p>
 */
public class VarArgExample {

//    // to print the array of items
//    private static void printItemList(String[] items) {
//        for(int i = 0; i < items.length;  i++) {
//            System.out.println(i + 1 + ": " + items[i]);
//        }
//    }

//    // to print the two of items
//    private static void printItemList(String item1, String item2) {
//        System.out.println(1 + ": " + item1);
//        System.out.println(1 + ": " + item2);
//    }

    /**
     * This is better solution by using the varArg
     * <p>We can parse one string, two strings or array of string</p>
     * @param items
     */
    private static void printItemList(String... items) {
        for(int i = 0; i < items.length;  i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }

        System.out.println();
    }


    public static void main(String[] args) {
        String item = "Burger";
        String item2 = "Chicken";
        String [] arrayItem = {"Chicken", "Burger", "Nugget"};

        printItemList(item);
        printItemList(item, item2);
        printItemList(item, item2, item, item2);
        printItemList(arrayItem);
    }
}

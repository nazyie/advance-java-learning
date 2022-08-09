package functionalprogramming.methodreference;

public class Main {

    /**
     * Method referencing is the way of the you referencing the method to the interface method
     * Example:
     *  This one do not have the implementation
     *  <p>Interface class: Sayable | Method name: void say()</p>
     *
     *  This one has implementation
     *  <p>Existing class: Singing | Method name: void singSong()</p>
     *
     *  Method referencing can be done in another class
     *  Sayable sayable = Singing::singSong();
     *
     *  sayable.say()
     *
     * @param args
     */
    public static void main(String[] args) {

        Square s = new Square(4);

//        // lambda implementation
//        Shapes shapes = (Square square) -> {
//            return square.calculateArea();
//        };

        // method reference implementation
        Shapes shapes = Square::calculateArea;

        System.out.println("Area: " + shapes.getArea(s));

    }

}
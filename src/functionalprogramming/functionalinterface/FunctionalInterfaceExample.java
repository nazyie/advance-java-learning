package functionalprogramming.functionalinterface;

/**
 * Functional Interface example
 * @FunctionalInterface inside the interface class
 * <p>This only allow one abstract method implementation inside the class</p>
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Nazyie");
    }

}

package functionalprogramming.lambda;

/**
 * Lambda example
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // functional implementation
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Nazyie");

        // lambda implementation
        GreetingMessage gmLambda = (String name) -> {
            System.out.println("Hello but difference approach :" + name);
        };

        gmLambda.greet("Nazri");
    }

}

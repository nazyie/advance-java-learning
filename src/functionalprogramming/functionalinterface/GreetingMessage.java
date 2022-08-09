package functionalprogramming.functionalinterface;

/**
 * Functional interface only allow one abstraction method
 */
@FunctionalInterface
public interface GreetingMessage {

    public abstract void greet(String name);
}

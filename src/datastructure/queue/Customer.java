package datastructure.queue;

public class Customer {
    private boolean hasBeenServed;
    private String name;

    public Customer(String name) {
        this.hasBeenServed = false;
        this.name = name;
    }

    public void serve() {
        this.hasBeenServed = true;
        System.out.println(name + " has been served");
    }

    @Override
    public String toString() {
        return this.name;
    }

}

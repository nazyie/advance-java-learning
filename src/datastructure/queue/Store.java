package datastructure.queue;


import java.util.LinkedList;

/**
 * LinkedList is one of the example collection that using the queue
 */
public class Store {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Dobby"));
        queue.add(new Customer("Ahmad"));
        queue.add(new Customer("Ammar"));

        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        c.serve();

    }
}

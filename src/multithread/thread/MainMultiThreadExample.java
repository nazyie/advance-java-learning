package multithread.thread;

public class MainMultiThreadExample {

    /**
     * When the program start we are supposed to get one thread
     * @param args
     */
    public static void main(String[] args) {
        MultiThreadExample threadExample1 = new MultiThreadExample();
        threadExample1.setName("thread_one");
        threadExample1.start();

        MultiThreadExample threadExample2 = new MultiThreadExample();
        threadExample2.setName("thread_two");
        threadExample2.start();
    }
}

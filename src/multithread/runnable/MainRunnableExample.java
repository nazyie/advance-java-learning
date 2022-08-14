package multithread.runnable;

public class MainRunnableExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        thread2.start();

    }
}

package multithread.runnable;

/**
 * @author nazyie
 *
 * <p>Advantages of runnable is because it was an interface</p>
 * <p>You are allowed to extend any other class</p>
 */
public class RunnableExample implements Runnable {

    @Override
    public void run() {
        int i = 1;

        while (i < 100) {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}

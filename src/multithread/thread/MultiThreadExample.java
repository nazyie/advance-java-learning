package multithread.thread;

/**
 * @author nazyie
 */
public class MultiThreadExample extends Thread{

    @Override
    public void run() {
        int i = 1;

        while (i < 100) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}

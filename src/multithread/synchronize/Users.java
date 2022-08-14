package multithread.synchronize;

public class Users {

    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp(100);

        /**
         * First person withdrawn 100
         */
        Thread t1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        /**
         * Second person withdrawn 100
         */
        Thread t2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        /**
         * Simultaneously happen
         * <p>Sometime was able to withdrawn the money</p>
         * <p>Sometime was not able to withdrawn the money</p>
         */
        t1.start();
        t2.start();

    }

}

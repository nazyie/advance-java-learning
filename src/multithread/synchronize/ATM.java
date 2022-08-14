package multithread.synchronize;

public class ATM {

    /**
     * Allow to run the method at one instances only
     * @param account
     * @param amount
     */
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction Denied!");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }

}

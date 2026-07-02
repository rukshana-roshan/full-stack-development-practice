public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        DepositThread deposit1 = new DepositThread(account, 2000);
        deposit1.setName("Deposit Thread");

        WithdrawThread withdraw1 = new WithdrawThread(account, 3000);
        withdraw1.setName("Withdraw Thread 1");

        WithdrawThread withdraw2 = new WithdrawThread(account, 6000);
        withdraw2.setName("Withdraw Thread 2");

        deposit1.start();
        withdraw1.start();
        withdraw2.start();
    }
}
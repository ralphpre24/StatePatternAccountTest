public class ClosedState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("You're not able to deposit on a closed account!");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("You're not able to withdraw from a closed account!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You're not able to suspend a closed account!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("You're not able to activate a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Your account is already closed!");
    }
}
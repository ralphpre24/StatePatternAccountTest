
public class AccountTest {
    public static void main (String[] args){

        Account myAccount = new Account("1234", 10000.0); //set acct to active state
        myAccount.activate(); // displays "Your account is already activated!"

        //Suspend the account
        myAccount.suspend(); //displays "Your account is suspended!"

        //Activate the account
        myAccount.activate(); //displays "Your account is activated!"

        //Deposit to the account
        myAccount.deposit(1000.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().

        //Withdraw to the account
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in withdraw().

        //Close the account()
        myAccount.close();  //displays "Your account is closed!"

        //Activate the account
        myAccount.activate();// Displays "You're not able to activate a closed account!"

        //Suspend the account
        myAccount.activate(); // Displays " You're not able to suspend a closed account!"


        //Withdraw to the account
        myAccount.withdraw(500.0);// Show message "You're not able to withdraw on a closed                   account!". Call the toString() to show current balance and account number.

        //Deposit to the account
        myAccount.deposit(1000.0);// Show message "You're not able to deposit on closed                  //account!". Call the toString() to show current balance and account number.
    }
}

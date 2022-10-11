package Facade;

import java.util.ArrayList;

public class MyFacade {
    BankAccount bankAccountAtHand;
    BalanceHandler balanceHandler; // i dont want the client "who's on the Main class" to know that i have this
    boolean activeStatus = false; // or this
    ArrayList<BankAccount> accounts;

    MyFacade() {
        accounts = new ArrayList<BankAccount>();

        accounts.add(new BankAccount(123456, 1234));
        accounts.add(new BankAccount(123457, 0000));
        accounts.add(new BankAccount(987654321, 8888));
        // lets pretend that this will call A database class to retrieve the data and
        // store it in an ArrayList

    }
        // the client knows only the names of these methods and i do like it this way 
    public boolean LoginToBankAccount(int AccountNm, int PinC) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.AccountNumber == AccountNm && bankAccount.PinCode == PinC) {
                System.out.println("Welcome to your Account.");
                this.bankAccountAtHand = bankAccount;
                balanceHandler = new BalanceHandler(bankAccountAtHand);
                return true;
            }
        }
        System.out.println("Wrong Credentials");
        return false;
    }

    public void getBalance() {
        System.out.println(" your balance is : " + balanceHandler.GetBalance());

    }

    public void Withdraw(int amount) {
        if (balanceHandler.Withdraw(amount)) {
            System.out.println(" You've Widthdrawed the amount of :" + amount +
                    "\n your current balance is at : " + balanceHandler.GetBalance());
            return;
        }
        System.out.println("withdraw amount exceeds the balance");

    }

    public void AddToAccount(int amount) {
        System.out.println("you have successfully added the amount of :" + amount +
                "\n your current balance is : " + balanceHandler.AddAmount(amount));

    }
}

package Facade;


public class BalanceHandler {

    BankAccount AccountAtHand;

    BalanceHandler(BankAccount account) {
    
        this.AccountAtHand = account;
    
    }

    public int GetBalance() {

        return AccountAtHand.Balance;

    }
    public boolean Withdraw(int amount){
        if(amount < this.AccountAtHand.Balance){
            this.AccountAtHand.Balance  = this.AccountAtHand.Balance - amount;
            return true ; 
        } return false ;
           
          
    }
    public int AddAmount(int amount ){
        this.AccountAtHand.Balance  = this.AccountAtHand.Balance + amount;
        return this.AccountAtHand.Balance;
    }
}

package Facade;

public class BankAccount {
    
    public int AccountNumber;
    public int PinCode;
    public int Balance = 0;

    BankAccount(int AN ,  int PC  ){
        this.AccountNumber = AN;
        this.PinCode = PC;
    }
}

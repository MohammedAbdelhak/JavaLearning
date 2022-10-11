package Facade;

public class Main {
    public static void main(String[] args) {
        MyFacade facade = new MyFacade();
        facade.LoginToBankAccount(123456, 1234);
        facade.getBalance();
        facade.Withdraw(10);
        facade.AddToAccount(50);
        facade.Withdraw(48);
        
    }
}

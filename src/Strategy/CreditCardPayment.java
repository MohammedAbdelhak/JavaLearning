package Strategy;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void DoPayment() {
        // TODO Auto-generated method stub
        // do here Credit card verification with account balance handeling
        System.out.println("Payment via Credit Card");    
    }
    
}

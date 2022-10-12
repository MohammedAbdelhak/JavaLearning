package Strategy;

class PayPalPayment implements PaymentMethod{

    @Override
    public void DoPayment() {
        // TODO Auto-generated method stub
        // do here PayPal Credentials verification + account balance  
        System.out.println("Paying Via PayPal");    
    }
    
}
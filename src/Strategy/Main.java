package Strategy;

public class Main {
    public static void main(String[] args) {

        PaymentMethod mPaymentMethod = new PayPalPayment(); // here you can change to what ever your needs are for payment methods
        Context context = new Context(mPaymentMethod);
        context.DoPayment(); 

        mPaymentMethod = new CreditCardPayment();// here too.
        context = new Context(mPaymentMethod);
        context.DoPayment();

        // if you need to integrate a new payment method , make for it an object and change only the instance that is passed to mPaymentMethod
        // no modifications are to be done here in this file .

        /*
         * String paymentMethod;
         * paymentMethod = "CreditCard";
         * 
         * if (paymentMethod.equals("CreditCard")) {
         * //here handeling card verification + account balance
         * System.out.println("payment Using Credit Card");
         * } else {
         * if (paymentMethod.equals("PayPal")) {
         * //here handeling paypal account credentials verification + account balance
         * System.out.println("payment Using PayPal");
         * }
         * }
         * 
         */ // this way is open for modification and closed for intgeration which means :
        // if you want to add a new payment method you have to add another if/else
        // clause to this file
        // which means that you modified this file to add a new feature
    }

}

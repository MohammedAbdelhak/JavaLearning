package Strategy;

public class Context {
    private PaymentMethod paymentMethod;


    Context(PaymentMethod pm){
        this.paymentMethod = pm;
    }

    public void DoPayment(){
        paymentMethod.DoPayment();
    }
}

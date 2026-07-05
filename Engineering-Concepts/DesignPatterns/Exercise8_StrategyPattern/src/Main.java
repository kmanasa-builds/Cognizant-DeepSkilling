public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(2500);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(1800);

        context.setPaymentStrategy(new UpiPayment());
        context.makePayment(1200);

    }

}
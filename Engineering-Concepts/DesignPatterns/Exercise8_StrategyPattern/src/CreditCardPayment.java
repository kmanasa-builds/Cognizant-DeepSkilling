public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("Paid Rs." + amount + " using Credit Card.");

    }

}
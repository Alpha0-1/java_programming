/**
 * @file 4-strategy_pattern.java
 * @brief Strategy Pattern Implementation
 *
 * Enables selecting an algorithm at runtime by encapsulating each one and making them interchangeable.
 */

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal account " + email);
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

public class MainStrategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with credit card
        cart.setPaymentStrategy(new CreditCardStrategy("1234567890123456", "12/25", "123"));
        cart.checkout(100);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalStrategy("alice@example.com"));
        cart.checkout(50);
    }
}

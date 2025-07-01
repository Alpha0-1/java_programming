import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Demonstrates basic usage of Mockito for mocking dependencies.
 */
interface PaymentGateway {
    boolean processPayment(double amount);
}

class PaymentService {
    private final PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public String makePayment(double amount) {
        if (gateway.processPayment(amount)) {
            return "Payment successful";
        } else {
            return "Payment failed";
        }
    }
}

public class MockingTest {

    @Test
    void testSuccessfulPayment() {
        PaymentGateway mockGateway = Mockito.mock(PaymentGateway.class);
        when(mockGateway.processPayment(100.0)).thenReturn(true);

        PaymentService service = new PaymentService(mockGateway);
        String result = service.makePayment(100.0);

        assertEquals("Payment successful", result);
    }

    @Test
    void testFailedPayment() {
        PaymentGateway mockGateway = Mockito.mock(PaymentGateway.class);
        when(mockGateway.processPayment(50.0)).thenReturn(false);

        PaymentService service = new PaymentService(mockGateway);
        String result = service.makePayment(50.0);

        assertEquals("Payment failed", result);
    }
}

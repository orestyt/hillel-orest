package homework17;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void shouldSquareSum() {
        int expected = 20;
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        try {
            assertEquals(20, simpleCalculator.squareSum(2, 4));
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
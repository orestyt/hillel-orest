package homework15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static homework15.ArrayInitializer.init;

public class ArrayInitializerTest {

    @Test
    void shouldInit() {
        double[] shouldArray = new double[]{0.8966951136244035, 1.1147892422570507, 0.396040051283004, 0.8966951136244035, 1.1147892422570507};
        double[] testArray = new double[]{5, 5, 5, 5, 5};
        Assertions.assertArrayEquals(shouldArray, init(testArray));
    }

}

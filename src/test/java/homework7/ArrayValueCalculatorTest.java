package homework7;

import homework7.ArrayDataException;
import homework7.ArraySizeException;
import homework7.ArrayValueCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayValueCalculatorTest {
    @Test
    void shouldDoCalc() {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] testArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        Assertions.assertEquals(8, arrayValueCalculator.doCalc(testArray));
    }

    @Test
    void shouldDoCalcException1() {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] testArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] testArray1 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] testArray2 = {{"1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] testArray3 = {{"1", "1", "1", "1"}, {"1", "1", "1"}};
        Assertions.assertThrows(ArraySizeException.class, () -> arrayValueCalculator.doCalc(testArray1));
        Assertions.assertThrows(ArraySizeException.class, () -> arrayValueCalculator.doCalc(testArray2));
        Assertions.assertThrows(ArraySizeException.class, () -> arrayValueCalculator.doCalc(testArray3));
        //Assertions.assertThrows(ArraySizeException.class, () -> arrayValueCalculator.doCalc(testArray));
    }

    @Test
    void shouldDoCalcException2() {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] testArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] testArray1 = {{"d", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] testArray2 = {{"1", "1", "1", "f"}, {"f", "1", "1", "1"}};
        String[][] testArray3 = {{"1", "1", "d", "1"}, {"1", "1", "1", "f"}};
        Assertions.assertThrows(ArrayDataException.class, () -> arrayValueCalculator.doCalc(testArray1));
        Assertions.assertThrows(ArrayDataException.class, () -> arrayValueCalculator.doCalc(testArray2));
        Assertions.assertThrows(ArrayDataException.class, () -> arrayValueCalculator.doCalc(testArray3));
        //Assertions.assertThrows(ArraySizeException.class, () -> arrayValueCalculator.doCalc(testArray));

    }

}
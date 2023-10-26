package homework19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {


    @Test
    void shouldQuickSort() {
        double[] shouldArray = {1, 2, 3, 4, 5};
        double[] array = {5, 3, 4, 1, 2};
        Assertions.assertArrayEquals(shouldArray, QuickSort.quickSort(array, 0, array.length-1));
    }
}
public class ArrayValueCalculator {
    public int doCalc(String[][] array) {
        int lenghtOne = array.length;
        int lenghtTwo = array[0].length;
        if (lenghtOne != 4 && lenghtTwo != 4) throw new ArraySizeException("You have passed illegal array size");
        int sum = 0;
        for (int i = 0; i < lenghtOne; i++) {
            for (int j = 0; j < lenghtTwo; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("The data is corrupted in sector [" + i + "] [" + j + "]");
                }
            }
        }
        return sum;
    }
}

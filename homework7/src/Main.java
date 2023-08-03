public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] stringArray1 = {{"1", "2","3", "4"}, {"1","4","6","8"}};
        arrayValueCalculator.doCalc(stringArray1);
        String[][] stringArray2 = {{"1", "2","f", ":"}, {"1","4","6","8"}};
        arrayValueCalculator.doCalc(stringArray2);
    }
}

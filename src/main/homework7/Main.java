package main.homework7;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] stringArray1 = {{"1", "2","3", "4"}, {"1","4","6","8"}};
        arrayValueCalculator.doCalc(stringArray1);
        String[][] stringArray2 = {{"1", "2","2", "3"}, {"1","4","6","8"}};
        System.out.println(arrayValueCalculator.doCalc(stringArray2));
    }
}

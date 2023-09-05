package homework15;

import java.util.Arrays;

public class ArrayInitializer {
    public static double[] init(double[] array){
        int size = array.length;
        double[] firstHalf = new double[(size + 1)/2];
        double[] secondHalf = new double[size - firstHalf.length];
        for (int i = 0; i < size; i++)
        {
            if (i < firstHalf.length) {
                firstHalf[i] = array[i];
            }
            else {
                secondHalf[i - firstHalf.length] = array[i];
            }
        }
        Multithreading multithread1 = new Multithreading(firstHalf, 1);
        Multithreading multithread2 = new Multithreading(secondHalf, 2);
        multithread1.run();
        multithread2.run();
        double[] resultArray = new double[array.length];

        System.arraycopy(firstHalf, 0, resultArray, 0, firstHalf.length);
        System.arraycopy(secondHalf, 0, resultArray, firstHalf.length, secondHalf.length);
        System.out.println(Arrays.toString(resultArray));
        return resultArray;

    }

    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        Arrays.fill(array, n);
        init(array);
    }
}

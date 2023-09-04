package homework15;

import java.util.Arrays;

public class Multithreading implements Runnable {
    private int threadNum;
    private double[] array;

    public Multithreading(double[] array, int threadNum) {
        this.array = array;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] * Math.sin(0.2 + i / 5.0) * Math.cos(0.2 + i / 5.0) * Math.cos(0.4 + i / 2.0));
        }
        System.out.println("Thread num " +threadNum + ": " + Arrays.toString(array));
    }
}

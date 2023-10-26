package homework19;

import java.util.Arrays;

public class QuickSort {

    static void swap(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(double[] arr, int low, int high)
    {
        double pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static double[] quickSort(double[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    public static void init(double[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = array[i] * Math.sin(0.2 + i / 5.0) * Math.cos(0.2 + i / 5.0) * Math.cos(0.4 + i / 5.0);
        }
    }

    public static void main(String[] args) {
        double[] array = new double[100];
        Arrays.fill(array, 5);
        init(array);
        quickSort(array, 0, array.length-1);
    }
}

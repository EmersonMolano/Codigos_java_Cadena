package com.mycompany.fifteen_pint;

public class Activity_Eight {
    public static int[] maxMin(int[] arr) {
        int max, min, i;
        int n = arr.length;

        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        } else {
            max = min = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            int localMax, localMin;
            if (arr[i] > arr[i + 1]) {
                localMax = arr[i];
                localMin = arr[i + 1];
            } else {
                localMax = arr[i + 1];
                localMin = arr[i];
            }

            if (localMax > max) max = localMax;
            if (localMin < min) min = localMin;

            i += 2;
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 7, 2};
        int[] resultado = maxMin(arr);
        System.out.println("Máximo: " + resultado[0] + ", Mínimo: " + resultado[1]);
    }
}

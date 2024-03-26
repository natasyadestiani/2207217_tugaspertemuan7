/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan7.stopwatch;

/**
 *
 * @author ASUS
 */

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();

        // Start the stopwatch
        stopwatch.start();

        // Sorting
        selectionSort(arr);

        // Stop the stopwatch
        stopwatch.stop();

        System.out.println("Waktu yang Diperlukan untuk Mengurutkan 100.000 Angka Menggunakan Selection Sort: " + stopwatch.getElapsedTime() + " milidetik");
    }
}

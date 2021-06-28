package com.syncretis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int[] arr = new int[getNumber()];
        initArray(arr);
        printArr(arr);
        System.out.print("Enter number to find: ");
        int numberToFind = getNumber();
        selectSort(arr, numberToFind);
    }

    private static int getNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("Array: ");
        for (int it : arr) {
            System.out.print(it + ", ");
        }
        System.out.println();
    }

    private static void selectSort(int[] arr, int numberToFind) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select type of sort:\n\t1 - Bubble.\n\t2 - Selection.\n\t3 - Quick");
        int sortType = in.nextInt();
        switch (sortType) {
            case 1:
                System.out.println("Bubble sort.");
                Sort bubble = new SortBubble();
                bubble.sort(arr);
                printArr(arr);
                selectSearch(arr, numberToFind);
                break;
            case 2:
                System.out.println("Selection sort.");
                Sort selection = new SortSelection();
                selection.sort(arr);
                printArr(arr);
                selectSearch(arr, numberToFind);
                break;
            case 3:
                System.out.println("Quick sort.");
                Sort quick = new SortQuick();
                quick.sort(arr);
                printArr(arr);
                selectSearch(arr, numberToFind);
                break;
        }
    }

    private static void selectSearch(int[] arr, int numberToFind) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select type of search:\n\t1 - Linear.\n\t2 - Binary.");
        int searchType = in.nextInt();

        switch (searchType) {
            case 1:
                System.out.println("Linear search.");
                Search linear = new SearchLinear();
                System.out.println("Position of searching number is " + linear.search(arr, numberToFind));
                break;
            case 2:
                System.out.println("Binary.");
                Search binary = new SearchBinary();
                System.out.println("Position of searching number is " + binary.search(arr, numberToFind));
                break;
        }
    }
}

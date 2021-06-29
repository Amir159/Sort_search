package com.syncretis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int[] arr = new int[getNumber()];
        initArr(arr);
        printArr(arr);
        System.out.print("Enter number to find: ");
        int numberToFind = getNumber();
        selectSort(arr, numberToFind);
    }

    private static int getNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void initArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length * 10);
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; ++i) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }       
        System.out.println();
    }

    private static void selectSort(int[] arr, int numberToFind) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select type of sort:\n\t1 - Bubble.\n\t2 - Selection.\n\t3 - Quick");
        int sortType = in.nextInt();
        switch (sortType) {
            case 1:
                Sort bubble = new SortBubble();
                System.out.print("Bubble sorted ");
                bubble.sort(arr);
                printArr(arr);
                selectSearch(arr, numberToFind);
                break;
            case 2:
                Sort selection = new SortSelection();
                System.out.print("Selection sorted ");
                selection.sort(arr);
                printArr(arr);
                selectSearch(arr, numberToFind);
                break;
            case 3:
                Sort quick = new SortQuick();
                System.out.print("Quick sorted");
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
                Search linear = new SearchLinear();
                System.out.println("Position of searching number is " + linear.search(arr, numberToFind));
                break;
            case 2:
                Search binary = new SearchBinary();
                System.out.println("Position of searching number is " + binary.search(arr, numberToFind));
                break;
        }
    }
}

package com.syncretis;

public class SearchBinary implements Search {
    public int search(int[] arr, int numberToSearch) {
        int leftPos = 0, rightPos = arr.length, currentSize;
        do {
            currentSize = Math.abs((rightPos + leftPos) / 2);
            if (arr[currentSize] > numberToSearch) {
                rightPos = currentSize;
            } else if (arr[currentSize] < numberToSearch) {
                leftPos = currentSize;
            } else {
                return currentSize;
            }
        } while (currentSize != 0 && currentSize != arr.length - 1);
        return -1;
    }
}

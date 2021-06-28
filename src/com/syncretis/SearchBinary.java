package com.syncretis;

public class SearchBinary implements Search{
    public int search(int[] arr, int numberToSearch) {
        boolean flag = false;
        int leftPos = 0, rightPos = arr.length, countBinary = 0 , currentSize = arr.length;
        do {
            currentSize = Math.abs(rightPos + leftPos);
            if (arr[currentSize / 2] > numberToSearch) {
                rightPos = currentSize / 2;
            } else if (arr[currentSize / 2] < numberToSearch) {
                leftPos = currentSize / 2;
            } else {
                return currentSize / 2;
            }
        } while (currentSize / 2 != 0 && currentSize / 2 != arr.length - 1);
        return -1;
    }
}

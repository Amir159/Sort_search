package com.syncretis;

public class SearchLinear implements Search{
    @Override
    public int search(int[] arr, int numberToSearch) {
        int pos = 0;
        while (arr[pos] != numberToSearch) {
            if (arr[pos] > numberToSearch) { return -1; }
            ++pos;
        }
        return pos;
    }
}

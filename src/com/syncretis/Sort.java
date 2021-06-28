package com.syncretis;

public interface Sort {
    void sort(int[] arrSelection);

    default void swap(int[] arr, int left, int right) {
        int buff = arr[left];
        arr[left] = arr[right];
        arr[right] = buff;
    }
}

package com.syncretis;

public class SortSelection implements Sort {
    @Override
    public void sort(int[] arrSelection) {
        for (int i = 0; i < arrSelection.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int posMin = 0;
            for (int j = i; j < arrSelection.length; j++) {
                if (arrSelection[j] < min) {
                    min = arrSelection[j];
                    posMin = j;
                }
            }
            swap(arrSelection, i, posMin);
        }
    }
}

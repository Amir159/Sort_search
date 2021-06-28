package com.syncretis;

public class SortBubble implements Sort{
    @Override
    public void sort(int[] arrBubble) {
        for (int i = 0; i < arrBubble.length - 1; i++) {
            for (int j = 0; j < arrBubble.length - 1 - i; j++) {
                if (arrBubble[j] > arrBubble[j+1]) {
                    swap(arrBubble, j, j + 1);
                }
            }
        }
    }
}

package com.syncretis;

public class SortQuick implements Sort {
    @Override
    public void sort(int[] arrQuick) {
        sortQuick(arrQuick, 0 , arrQuick.length - 1);
    }
    private void sortQuick(int[] arrQuick, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = arrQuick[(leftMarker + rightMarker) / 2];
        do {
            while (arrQuick[leftMarker] < pivot) {
                leftMarker++;
            }
            while (arrQuick[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(arrQuick, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            sortQuick(arrQuick, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sortQuick(arrQuick, leftBorder, rightMarker);
        }
    }
}

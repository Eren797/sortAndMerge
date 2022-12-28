package org.example;

public class Main {
    public static void main(String[] args) {

        int sortingList[] = {1, 2, 66, 11, 77, 22, 88, 33};
        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        mergeSort.sort(sortingList);
        insertionSort.sort(sortingList);
        selectionSort.sort(sortingList);
        bubbleSort.sort(sortingList);


    }
}
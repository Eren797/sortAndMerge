// Bubble sort in Java
package org.example;
import java.util.Arrays;

class BubbleSort {

    // perform the bubble sort
    static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public  void sort(int array[]) {
        Print print = new Print();

       BubbleSort ss = new BubbleSort();



        print.yazdir("sorted by bubbleSort", array);


    }
}
// Shell sort in Java programming
package org.example;
import java.util.Arrays;

// Shell sort
public class ShellSort {

    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    // Driver code
    public  void sort(int array[]) {
        int size = array.length;
        ShellSort ss = new ShellSort();
        ss.shellSort(array, size);
        Print print = new Print();
        print.yazdir("Sorted by shellSort",array);
    }
}





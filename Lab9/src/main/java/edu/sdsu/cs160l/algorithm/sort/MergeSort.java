package edu.sdsu.cs160l.algorithm.sort;

import java.util.Comparator;

/**
 * TODO assignment (4 points)
 *  implement mergesort in a similar way as quick sort and bubble sort structurally
 */
public class MergeSort implements Sorter {
    @Override
    @SuppressWarnings("unchecked")
    public <T> void sort(T[] c) {
        Comparable[] comparable = (Comparable[]) c;
        sort(comparable, Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {
        mergeSort(c, c.length,comparisonStrategy);
    }

    private <T> void mergeSort(T[] c, int n, Comparator<? super T> comparisonStrategy) {
        if (n <= 1) {
            return;
        }
        int mid = n / 2;
        T[] left = (T[]) new Object[mid];
        T[] right = (T[]) new Object[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = c[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = c[i];
        }
        mergeSort(left, mid, comparisonStrategy);
        mergeSort(right, n - mid, comparisonStrategy);
        merge(c, left, right, left.length, right.length, comparisonStrategy);
    }

    private <T> void merge(T[] c, T[] l, T[] r, int left, int right, Comparator<? super T> comparisonStrategy) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparisonStrategy.compare(l[i], r[j]) <= 0) {
                c[k++] = l[i++];
            }
            else {
                c[k++] = r[j++];
            }
        }
        while (i < left) {
            c[k++] = l[i++];
        }
        while (j < right) {
            c[k++] = r[j++];
        }
    }
}
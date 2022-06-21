package com.bridgelabz.algorithms;

class MergeSort {
    void merge(int arrayToSort[], int length, int mid, int arrayLength) {
        int leftSizeArray = mid - length + 1;
        int rightSizeArray = arrayLength - mid;

        int leftSideArray[] = new int[leftSizeArray];
        int rightSideArray[] = new int[rightSizeArray];

        for (int i = 0; i < leftSizeArray; ++i)
            leftSideArray[i] = arrayToSort[length + i];
        for (int j = 0; j < rightSizeArray; ++j)
            rightSideArray[j] = arrayToSort[mid + 1 + j];


        int i = 0, j = 0;

        int k = length;
        while (i < leftSizeArray && j < rightSizeArray) {
            if (leftSideArray[i] <= rightSideArray[j]) {
                arrayToSort[k] = leftSideArray[i];
                i++;
            } else {
                arrayToSort[k] = rightSideArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSizeArray) {
            arrayToSort[k] = leftSideArray[i];
            i++;
            k++;
        }

        while (j < rightSizeArray) {
            arrayToSort[k] = rightSideArray[j];
            j++;
            k++;
        }
    }

    void sort(int arrayToSort[], int length, int arrayLength) {
        if (length < arrayLength) {
            int mid = length + (arrayLength - length) / 2;

            sort(arrayToSort, length, mid);
            sort(arrayToSort, mid + 1, arrayLength);

            merge(arrayToSort, length, mid, arrayLength);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arrayToSort[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arrayToSort);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("\nSorted array");
        printArray(arrayToSort);
    }
}

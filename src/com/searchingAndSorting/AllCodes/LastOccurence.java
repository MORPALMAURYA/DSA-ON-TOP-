package com.searchingAndSorting.AllCodes;

public class LastOccurence {

    public static void findLastOccurrence(int[] arr, int target, int[] ansIndex) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == target) {
                ansIndex[0] = mid;
                s = mid + 1; // right me jao
            } else if (target > arr[mid]) {
                s = mid + 1; // right me jao
            } else {
                e = mid - 1; // left me jao
            }
            mid = s + (e - s) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5};
        int target = 3;
        int[] ansIndex = {-1};  // default -1 (not found)

        findLastOccurrence(arr, target, ansIndex);
        System.out.println("Last Occurrence Index " + ansIndex[0]);
    }
}
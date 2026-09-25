package com.searchingAndSorting.AllCodes;

public class FirstOccurence {

    public static void findFirstOccurrence(int[] arr, int target, int[] ansIndex) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == target) {
                // ans found -> may or may not be first occurrence
                ansIndex[0] = mid;
                e = mid - 1; // left me jao
            } else if (target > arr[mid]) {
                s = mid + 1; // right me jao
            } else {
                e = mid - 1; // left me jao
            }
            mid = s + (e - s) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2, 3, 4, 5};
        int target = 2;
        int[] ansIndex = {-1};  // default -1 (not found)

        findFirstOccurrence(arr, target, ansIndex);
        System.out.println("First Occ index: " + ansIndex[0]);
    }
}

package com.recursionOnTop.RecursionQu.array;

public class SearchingArrayTarget {
    static int searchArray(int[] arr, int index,int target){
        if(index >=arr.length){
            return -1;
        }
        if(arr[index]==target){
            return target;
        }
      int ans =  searchArray(arr,index+1,target);

        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
      int ans =  searchArray(arr,0,target);

        System.out.println(ans);
    }
}

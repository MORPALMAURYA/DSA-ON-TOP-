package com.arraysOnTOp.LectureLove1;

public class ArrayFindMax {
  static void findMaz(int [] arr){
      int max = Integer.MIN_VALUE;
      for (int i = 0; i <arr.length; i++) {
          if (arr[i] > max) {
          max = arr[i];
          }
      }
      System.out.println("Max value is "+max);
  }

    static void main() {
        int [] arr = {2,3,4,44,11,23};
        findMaz(arr);
    }
}

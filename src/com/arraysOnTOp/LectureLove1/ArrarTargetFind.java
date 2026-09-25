package com.arraysOnTOp.LectureLove1;

public class ArrarTargetFind {

    static void checkTarget(int [] arr, int target) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == target){
                System.out.println(target);
            }
        }
    }

    static void main() {
        int [] arr = {12,34,32,98,22};
        int target = 22;
        checkTarget(arr, target);
    }
}

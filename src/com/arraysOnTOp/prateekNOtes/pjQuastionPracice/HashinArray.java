package com.arraysOnTOp.prateekNOtes.pjQuastionPracice;

public class HashinArray {

    private static Object i;

    static void main() {
        int []arr = {1,1,3,3,4,5,5};
        int []hash=new int[100];

        for ( int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
            }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+hash[arr[i]]);
        }



    }
}

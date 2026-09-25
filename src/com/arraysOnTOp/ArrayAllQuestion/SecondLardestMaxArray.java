package com.arraysOnTOp.ArrayAllQuestion;

public class SecondLardestMaxArray {
    static void main() {

        int [] arr = {2,5,10,4,3,11,15,35,3,56};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0 ; i<10 ; i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];

            }
            else if( arr[i] > max2)
                max2 = arr[i];
        }
        System.out.println("Second Largest numver is : "+max2);

    }
}

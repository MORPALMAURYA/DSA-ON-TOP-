package com.UseLoopImportantQue;

public class CountDigitNumber {
    static void main() {
        int n=23423;
        int count = 0;

       while(n != 0){
           n=n/10;
           count++;
       }
       System.out.println(count);
    }
}

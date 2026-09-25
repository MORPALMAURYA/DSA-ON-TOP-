package com.UseLoopImportantQue;

public class ReverseNumber {
    static void main() {
        int n = 102345;
        int remainder;
        int reverse=0;

      while(n != 0) {
        remainder = n % 10;
        reverse = reverse*10 + remainder;
        n = n/10;

      }
        System.out.println("Reverse of "+n+" is "+reverse);
    }
}

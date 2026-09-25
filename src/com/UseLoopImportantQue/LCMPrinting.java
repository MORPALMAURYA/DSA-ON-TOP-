package com.UseLoopImportantQue;

public class LCMPrinting {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        for (int i = 1; i <= x*y ; i++) {
            if((i%x == 0) && (i%y == 0)){
                System.out.println("LCM of "+x+" and "+y +" is "+i);
                break;
            }
        }
    }
}

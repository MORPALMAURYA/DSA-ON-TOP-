package com.placementcollege.basic;

abstract class Peyment{
    abstract  void pey(double amount);

    void success(){
        IO.println("Peyment successful ! ");
    }
}
class UPI extends Peyment{
    @Override
     void  pey(double amount){
         IO.println("Peyment amount is "+amount + " using upi ");
    }

}
class NetBanking extends Peyment{
    @Override
    void pey(double amount){
        IO.println("Peyment Net Banking"+amount+"Using net Banking");
    }
}

public class PaymentApp {

    static void main() {
        Peyment p1 = new UPI();
        p1.pey(32.2);
        p1.success();

        Peyment p2 = new NetBanking();
        p2.pey(32.2);
        p2.success();

        System.out.println(p1.getClass().getName());

    }
}

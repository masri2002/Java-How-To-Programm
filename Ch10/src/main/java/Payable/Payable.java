package Payable;

public interface Payable {
    double getPaymentAmount();
    default double get(){
        return 0.0;
    }
    static int getInt(){
        return 5;
    }
}

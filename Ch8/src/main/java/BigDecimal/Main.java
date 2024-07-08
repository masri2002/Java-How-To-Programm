package BigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {
    public static void main(String [] args){
        BigDecimal principal =new BigDecimal(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int i=1;i<=10;i++){
            BigDecimal Amount =principal.multiply(rate.add(BigDecimal.ONE).pow(i));
            System.out.printf("%4d%20s%n", i,
                    NumberFormat.getCurrencyInstance().format(Amount));
        }
    }
}

package util;

public class CurrencyConverter {
    public static double dolar;
    public static double amount;
    public static double IOF = 0.06;

    public static double DolarandReal(){
        return amount * dolar * (1.0 + IOF);
    }
}

package org.chapter3.itens10_11_12;

public class ConverterMain {

    public static void main(String[] args) {
        Money brlMoney = new Money(5.17, Currency.BRL);
        System.out.println(CurrencyConverter.convertBRLToUSD(brlMoney));

        Money usdMoney = new Money(100, Currency.USD);
        System.out.println(CurrencyConverter.convertUSDToBRL(usdMoney));
    }
}

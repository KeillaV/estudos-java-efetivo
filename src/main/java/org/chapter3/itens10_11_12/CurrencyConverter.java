package org.chapter3.itens10_11_12;

public class CurrencyConverter {

    public static Money convertBRLToUSD(final Money brlMoney) {
        validateCurrency(brlMoney.getCurrency(), Currency.BRL);
        validateAmount(brlMoney.getAmount());

        var convertedMoney = brlMoney.getAmount() / 5.20;

        return new Money(convertedMoney, Currency.USD);
    }

    public static Money convertUSDToBRL(final Money usdMoney) {
        validateCurrency(usdMoney.getCurrency(), Currency.USD);
        validateAmount(usdMoney.getAmount());

        var convertedMoney = usdMoney.getAmount() * 5.20;

        return new Money(convertedMoney, Currency.BRL);
    }

    private static void validateCurrency(final Currency actualCurrency, final Currency expectedCurrency) {
        if (!actualCurrency.equals(expectedCurrency)) {
            throw new CurrencyErrorException("Invalid currency for conversion");
        }
    }

    private static void validateAmount(final double amount) {
        if (amount < 0) {
            throw new CurrencyErrorException("Invalid amount for conversion");
        }
    }
}

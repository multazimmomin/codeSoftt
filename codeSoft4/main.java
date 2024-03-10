package codeSoft4;

public class main {
    public static void main(String[] args) {
        Currency USD = new Currency("USD", 1.0);
        Currency EUR = new Currency("EUR", 0.85);
        Currency JPY = new Currency("JPY", 110.0);

        CurrencyConverter converter = new CurrencyConverter(USD);

        System.out.println(converter.convertCurrency(EUR, 100)); // prints 117.6470588235294
        System.out.println(converter.convertCurrency(JPY, 1000)); // prints 9.090909090909091
    }
}

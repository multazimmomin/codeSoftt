package codeSoft4;
    
public class CurrencyConverter {
    private Currency baseCurrency;

    public CurrencyConverter(Currency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public double convertCurrency(Currency targetCurrency, double amount) {
        return amount * (baseCurrency.getConversionRate() / targetCurrency.getConversionRate());
    }
}





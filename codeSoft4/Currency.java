package codeSoft4;

public class Currency {
    private String code;
    private double conversionRate;

    public Currency(String code, double conversionRate) {
        this.code = code;
        this.conversionRate = conversionRate;
    }

    public String getCode() {
        return code;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
    


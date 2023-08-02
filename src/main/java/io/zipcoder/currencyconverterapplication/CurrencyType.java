package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.AustralianDollar;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70, "AUD"),
    CANADIAN_DOLLAR(2.64, "CAD"),
    CHINESE_YR(13.84, "CHR"),
    EURO(1.88,"EUR"),
    FRANC(2.02,"FRC"),
    POUND(1.64,"PND"),
    RINGGIT(8.94,"RNG"),
    RUPEE(136.64,"RUP"),
    SINGAPORE_DOLLAR(1.86,"SGD"),
    US_DOLLAR(2.0,"USD"),
    UNIVERSAL_CURRENCY(1.0,"UNV"),
    YEN(231.68,"YEN");

    public String getClassName() {
        return ClassName;
    }

    private final double rate;
    private String ClassName;

    CurrencyType(double rate, String className) {
        this.rate = rate;
        this.ClassName = className;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {

    for (CurrencyType types: CurrencyType.values())
    {
        if(types.ClassName.equals(currency.getCurrencyIdentifier()))
        {
            return types;
        }
    }
return null;
    }
}

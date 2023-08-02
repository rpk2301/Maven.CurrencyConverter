package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

public class USDollar implements ConvertableCurrency {

    @Override
    public String getCurrencyIdentifier() {
        return "USD";
    }


}

package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

public class Franc implements ConvertableCurrency {

    @Override
    public String getCurrencyIdentifier() {
        return "FRC";
    }


}

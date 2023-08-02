package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {

    @Override
    public String getCurrencyIdentifier() {
        return "RNG";
    }

    @Override
    public Double convert(CurrencyType currencyType)
    {

        return currencyType.getRate()/CurrencyType.RINGGIT.getRate();
    }




}

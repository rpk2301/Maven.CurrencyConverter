package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {


    @Override
    public String getCurrencyIdentifier() {
        return "YEN";
    }
//
    @Override
    public Double convert(CurrencyType currencyType)
    {

        return currencyType.getRate()/CurrencyType.YEN.getRate();
    }

}

package com.dmn.exchangerates;

import java.math.BigDecimal;
import java.text.Format;
import java.util.HashMap;

public class DataHolder {
    private String userValue = "1.00";
    private Double userValueADouble = Double.parseDouble(userValue);

    public static HashMap<String, String> hashMap;
    public static HashMap<String, Double> hashMapDouble;

    public static HashMap<String, Double> changeData(Double usrDblVle){
        for(String key: hashMapDouble.keySet()){
            hashMapDouble.replace(key, BigDecimal.valueOf(hashMapDouble.get(key) * usrDblVle).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        return hashMapDouble;
    }

    public static HashMap<String, String> convertData() {
        for(String key: hashMapDouble.keySet()){
            hashMap.replace(key, hashMapDouble.get(key).toString());
        }
        return hashMap;
    }



    public String getUserValue() {
        return userValue;
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }

    public Double getUserValueADouble() {
        return userValueADouble;
    }

    public void setUserValueADouble(Double userValueADouble) {
        this.userValueADouble = userValueADouble;
    }

    private static final DataHolder holder = new DataHolder();
    public static DataHolder getInstance() {return holder;}
}
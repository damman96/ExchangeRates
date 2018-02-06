package com.dmn.exchangerates;

import java.util.HashMap;

public class DataHolder {
    private String userValue = "1.00";
    private Double userValueADouble = Double.parseDouble(userValue);

    public static HashMap<String, String> hashMap;
    public static HashMap<String, Double> hashMapDouble;

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

    public static HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public static void setHashMap(HashMap<String, String> hashMap) {
        DataHolder.hashMap = hashMap;
    }

    public static HashMap<String, Double> getHashMapDouble() {
        return hashMapDouble;
    }

    public static void setHashMapDouble(HashMap<String, Double> hashMapDouble) {
        DataHolder.hashMapDouble = hashMapDouble;
    }

    private static final DataHolder holder = new DataHolder();
    public static DataHolder getInstance() {return holder;}
}
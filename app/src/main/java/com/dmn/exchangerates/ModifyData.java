package com.dmn.exchangerates;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class ModifyData {

public HashMap<String, Double> changeData(Double userDoubleValue, HashMap<String, Double> hashMapDouble) {

        HashMap<String, Double> hashMapResult = new HashMap<>();

        ArrayList<Double> value = new ArrayList<>(hashMapDouble.values());
        int i =0;
        for (String key : hashMapDouble.keySet()) {
                hashMapResult.put(key, BigDecimal.valueOf(value.get(i) * userDoubleValue).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue());
                i++;
        }
        return hashMapResult;
}

public HashMap<String, String> convertData(HashMap<String, String> hashMap, HashMap<String, Double> hashMapD) {
        for(String key: hashMapD.keySet()) {
                hashMap.replace(key, hashMapD.get(key).toString());
        }
        return hashMap;
}
}

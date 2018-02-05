package com.dmn.exchangerates;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;

public class JsonActivity extends AppCompatActivity{

    private static final String TAG = MainActivity.class.getSimpleName();

    private String urlData = "https://api.fixer.io/latest?base=PLN";

    public HashMap<String, String> hashMap = new HashMap<>();
    public HashMap<String, Double> hashMapDouble = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        new GetData().execute();
    }

    protected HashMap<String, String> getData(){

        String jsonString = new HttpHandler().makeServiceCall(urlData);

        if(jsonString != null){

            try{
                JSONObject jsonObject = new JSONObject(jsonString);

                String base = jsonObject.getString("base");
                String date = jsonObject.getString("date");

                JSONObject rates = jsonObject.getJSONObject("rates");
                String aud = rates.getString("AUD");
                String bgn = rates.getString("BGN");
                String brl = rates.getString("BRL");
                String cad = rates.getString("CAD");
                String chf = rates.getString("CHF");
                String cny = rates.getString("CNY");
                String czk = rates.getString("CZK");
                String dkk = rates.getString("DKK");
                String gbp = rates.getString("GBP");
                String hkd = rates.getString("HKD");
                String hrk = rates.getString("HRK");
                String huf = rates.getString("HUF");
                String idr = rates.getString("IDR");
                String jpy = rates.getString("JPY");
                String krw = rates.getString("KRW");
                String mxn = rates.getString("MXN");
                String myr = rates.getString("MYR");
                String nok = rates.getString("NOK");
                String nzd = rates.getString("NZD");
                String php = rates.getString("PHP");
                String ron = rates.getString("RON");
                String rub = rates.getString("RUB");
                String sek = rates.getString("SEK");
                String sgd = rates.getString("SGD");
                String thb = rates.getString("THB");
                String trk = rates.getString("TRY");
                String usd = rates.getString("USD");
                String zar = rates.getString("ZAR");
                String eur = rates.getString("EUR");

                hashMap.put("AUD", aud);
                hashMap.put("BGN", bgn);
                hashMap.put("BRL", brl);
                hashMap.put("CAD", cad);
                hashMap.put("CHF", chf);
                hashMap.put("CNY", cny);
                hashMap.put("CZK", czk);
                hashMap.put("DKK", dkk);
                hashMap.put("EUR", eur);
                hashMap.put("GBP", gbp);
                hashMap.put("HKD", hkd);
                hashMap.put("HRK", hrk);
                hashMap.put("HUF", huf);
                hashMap.put("IDR", idr);
                hashMap.put("JPY", jpy);
                hashMap.put("KRW", krw);
                hashMap.put("MXN", mxn);
                hashMap.put("MYR", myr);
                hashMap.put("NOK", nok);
                hashMap.put("NZD", nzd);
                hashMap.put("PHP", php);
                hashMap.put("RON", ron);
                hashMap.put("RUB", rub);
                hashMap.put("SEK", sek);
                hashMap.put("SGD", sgd);
                hashMap.put("THB", thb);
                hashMap.put("TRY", trk);
                hashMap.put("USD", usd);
                hashMap.put("ZAR", zar);


            } catch (JSONException e) {
                Log.e(TAG, "JSON parsing error: " + e.getMessage());
            }
        }
        else{
            Log.e(TAG, "Couldn't get json from server.");
        }
        return hashMap;
    }

    protected HashMap<String, Double> getDoubleData(){

        String jsonString = new HttpHandler().makeServiceCall(urlData);

        if(jsonString != null){

            try{
                JSONObject jsonObject = new JSONObject(jsonString);

                String base = jsonObject.getString("base");
                String date = jsonObject.getString("date");

                JSONObject rates = jsonObject.getJSONObject("rates");
                String aud = rates.getString("AUD");
                String bgn = rates.getString("BGN");
                String brl = rates.getString("BRL");
                String cad = rates.getString("CAD");
                String chf = rates.getString("CHF");
                String cny = rates.getString("CNY");
                String czk = rates.getString("CZK");
                String dkk = rates.getString("DKK");
                String gbp = rates.getString("GBP");
                String hkd = rates.getString("HKD");
                String hrk = rates.getString("HRK");
                String huf = rates.getString("HUF");
                String idr = rates.getString("IDR");
                String jpy = rates.getString("JPY");
                String krw = rates.getString("KRW");
                String mxn = rates.getString("MXN");
                String myr = rates.getString("MYR");
                String nok = rates.getString("NOK");
                String nzd = rates.getString("NZD");
                String php = rates.getString("PHP");
                String ron = rates.getString("RON");
                String rub = rates.getString("RUB");
                String sek = rates.getString("SEK");
                String sgd = rates.getString("SGD");
                String thb = rates.getString("THB");
                String trk = rates.getString("TRY");
                String usd = rates.getString("USD");
                String zar = rates.getString("ZAR");
                String eur = rates.getString("EUR");

                hashMapDouble.put("AUD", Double.parseDouble(aud));
                hashMapDouble.put("BGN", Double.parseDouble(bgn));
                hashMapDouble.put("BRL", Double.parseDouble(brl));
                hashMapDouble.put("CAD", Double.parseDouble(cad));
                hashMapDouble.put("CHF", Double.parseDouble(chf));
                hashMapDouble.put("CNY", Double.parseDouble(cny));
                hashMapDouble.put("CZK", Double.parseDouble(czk));
                hashMapDouble.put("DKK", Double.parseDouble(dkk));
                hashMapDouble.put("EUR", Double.parseDouble(eur));
                hashMapDouble.put("GBP", Double.parseDouble(gbp));
                hashMapDouble.put("HKD", Double.parseDouble(hkd));
                hashMapDouble.put("HRK", Double.parseDouble(hrk));
                hashMapDouble.put("HUF", Double.parseDouble(huf));
                hashMapDouble.put("IDR", Double.parseDouble(idr));
                hashMapDouble.put("JPY", Double.parseDouble(jpy));
                hashMapDouble.put("KRW", Double.parseDouble(krw));
                hashMapDouble.put("MXN", Double.parseDouble(mxn));
                hashMapDouble.put("MYR", Double.parseDouble(myr));
                hashMapDouble.put("NOK", Double.parseDouble(nok));
                hashMapDouble.put("NZD", Double.parseDouble(nzd));
                hashMapDouble.put("PHP", Double.parseDouble(php));
                hashMapDouble.put("RON", Double.parseDouble(ron));
                hashMapDouble.put("RUB", Double.parseDouble(rub));
                hashMapDouble.put("SEK", Double.parseDouble(sek));
                hashMapDouble.put("SGD", Double.parseDouble(sgd));
                hashMapDouble.put("THB", Double.parseDouble(thb));
                hashMapDouble.put("TRY", Double.parseDouble(trk));
                hashMapDouble.put("USD", Double.parseDouble(usd));
                hashMapDouble.put("ZAR", Double.parseDouble(zar));


            } catch (JSONException e) {
                Log.e(TAG, "JSON parsing error: " + e.getMessage());
            }
        }
        else{
            Log.e(TAG, "Couldn't get json from server.");
        }
        return hashMapDouble;
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    private class GetData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void ... arg0) {

            if(isNetworkAvailable()) {
                hashMap = new HashMap<>(getData());
                hashMapDouble = new HashMap<>(getDoubleData());

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            if(hashMap.size() == 0){
                Intent intent = new Intent(JsonActivity.this, NoInternetActivity.class);
                startActivity(intent);
            }
            else {
                Intent intent = new Intent(JsonActivity.this, MainActivity.class);
                intent.putExtra("data", hashMap);
                intent.putExtra("dataDouble", hashMapDouble);
                startActivity(intent);
            }

            super.onPostExecute(result);
        }
    }
}

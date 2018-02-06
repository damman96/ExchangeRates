package com.dmn.exchangerates;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_main);

        Intent intent = getIntent();
        int position = (int) intent.getLongExtra("CountryName",99);

        Integer[] imgId = {R.drawable.aud, R.drawable.bgn, R.drawable.brl, R.drawable.cad, R.drawable.chf, R.drawable.cny,
                R.drawable.czk, R.drawable.dkk, R.drawable.eur, R.drawable.gbp, R.drawable.hkd, R.drawable.hrk, R.drawable.huf,
                R.drawable.idr, R.drawable.jpy, R.drawable.krw, R.drawable.mxn, R.drawable.myr, R.drawable.nok, R.drawable.nzd,
                R.drawable.php, R.drawable.ron, R.drawable.rub, R.drawable.sek, R.drawable.sgd, R.drawable.thb, R.drawable.trk,
                R.drawable.usd, R.drawable.zar,};

        String[] countryNames = getResources().getStringArray(R.array.country_names);
        String[] countryAbout = getResources().getStringArray(R.array.country_about);

        ImageView ivCountry = (ImageView)findViewById(R.id.ivCountry);
        TextView tvCountryName = (TextView)findViewById(R.id.tvCountryName);
        TextView tvCountryAbout = (TextView)findViewById(R.id.tvAboutCountry);

        switch (position){
            case 0:
                ivCountry.setImageResource(imgId[0]);
                tvCountryName.setText(countryNames[0]);
                tvCountryAbout.setText(countryAbout[0]);
                break;
            case 1:
                ivCountry.setImageResource(imgId[1]);
                tvCountryName.setText(countryNames[1]);
                tvCountryAbout.setText(countryAbout[1]);
                break;
            case 2:
                ivCountry.setImageResource(imgId[2]);
                tvCountryName.setText(countryNames[2]);
                tvCountryAbout.setText(countryAbout[2]);
                break;
            case 3:
                ivCountry.setImageResource(imgId[3]);
                tvCountryName.setText(countryNames[3]);
                tvCountryAbout.setText(countryAbout[3]);
                break;
            case 4:
                ivCountry.setImageResource(imgId[4]);
                tvCountryName.setText(countryNames[4]);
                tvCountryAbout.setText(countryAbout[4]);
                break;
            case 5:
                ivCountry.setImageResource(imgId[5]);
                tvCountryName.setText(countryNames[5]);
                tvCountryAbout.setText(countryAbout[5]);
                break;
            case 6:
                ivCountry.setImageResource(imgId[6]);
                tvCountryName.setText(countryNames[6]);
                tvCountryAbout.setText(countryAbout[6]);
                break;
            case 7:
                ivCountry.setImageResource(imgId[7]);
                tvCountryName.setText(countryNames[7]);
                tvCountryAbout.setText(countryAbout[7]);
                break;
            case 8:
                ivCountry.setImageResource(imgId[8]);
                tvCountryName.setText(countryNames[8]);
                tvCountryAbout.setText(countryAbout[8]);
                break;
            case 9:
                ivCountry.setImageResource(imgId[9]);
                tvCountryName.setText(countryNames[9]);
                tvCountryAbout.setText(countryAbout[9]);
                break;
            case 10:
                ivCountry.setImageResource(imgId[10]);
                tvCountryName.setText(countryNames[10]);
                tvCountryAbout.setText(countryAbout[10]);
                break;
            case 11:
                ivCountry.setImageResource(imgId[11]);
                tvCountryName.setText(countryNames[11]);
                tvCountryAbout.setText(countryAbout[11]);
                break;
            case 12:
                ivCountry.setImageResource(imgId[12]);
                tvCountryName.setText(countryNames[12]);
                tvCountryAbout.setText(countryAbout[12]);
                break;
            case 13:
                ivCountry.setImageResource(imgId[13]);
                tvCountryName.setText(countryNames[13]);
                tvCountryAbout.setText(countryAbout[13]);
                break;
            case 14:
                ivCountry.setImageResource(imgId[14]);
                tvCountryName.setText(countryNames[14]);
                tvCountryAbout.setText(countryAbout[14]);
                break;
            case 15:
                ivCountry.setImageResource(imgId[15]);
                tvCountryName.setText(countryNames[15]);
                tvCountryAbout.setText(countryAbout[15]);
                break;
            case 16:
                ivCountry.setImageResource(imgId[16]);
                tvCountryName.setText(countryNames[16]);
                tvCountryAbout.setText(countryAbout[16]);
                break;
            case 17:
                ivCountry.setImageResource(imgId[17]);
                tvCountryName.setText(countryNames[17]);
                tvCountryAbout.setText(countryAbout[17]);
                break;
            case 18:
                ivCountry.setImageResource(imgId[18]);
                tvCountryName.setText(countryNames[18]);
                tvCountryAbout.setText(countryAbout[18]);
                break;
            case 19:
                ivCountry.setImageResource(imgId[19]);
                tvCountryName.setText(countryNames[19]);
                tvCountryAbout.setText(countryAbout[19]);
                break;
            case 20:
                ivCountry.setImageResource(imgId[20]);
                tvCountryName.setText(countryNames[20]);
                tvCountryAbout.setText(countryAbout[20]);
                break;
            case 21:
                ivCountry.setImageResource(imgId[21]);
                tvCountryName.setText(countryNames[21]);
                tvCountryAbout.setText(countryAbout[21]);
                break;
            case 22:
                ivCountry.setImageResource(imgId[22]);
                tvCountryName.setText(countryNames[22]);
                tvCountryAbout.setText(countryAbout[22]);
                break;
            case 23:
                ivCountry.setImageResource(imgId[23]);
                tvCountryName.setText(countryNames[23]);
                tvCountryAbout.setText(countryAbout[23]);
                break;
            case 24:
                ivCountry.setImageResource(imgId[24]);
                tvCountryName.setText(countryNames[24]);
                tvCountryAbout.setText(countryAbout[24]);
                break;
            case 25:
                ivCountry.setImageResource(imgId[25]);
                tvCountryName.setText(countryNames[25]);
                tvCountryAbout.setText(countryAbout[25]);
                break;
            case 26:
                ivCountry.setImageResource(imgId[26]);
                tvCountryName.setText(countryNames[26]);
                tvCountryAbout.setText(countryAbout[26]);
                break;
            case 27:
                ivCountry.setImageResource(imgId[27]);
                tvCountryName.setText(countryNames[27]);
                tvCountryAbout.setText(countryAbout[27]);
                break;
            case 28:
                ivCountry.setImageResource(imgId[28]);
                tvCountryName.setText(countryNames[28]);
                tvCountryAbout.setText(countryAbout[28]);
                break;
            default:
                ivCountry.setImageResource(R.drawable.black);
                tvCountryName.setText(R.string.data_error);
                tvCountryAbout.setText(R.string.data_error);
                break;

        }
    }
}

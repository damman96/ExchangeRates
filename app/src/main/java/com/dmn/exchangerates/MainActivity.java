package com.dmn.exchangerates;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ListView lv;
    private List<Currency> currencyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        HashMap<String, String> mapList = (HashMap<String, String>)intent.getSerializableExtra("data");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        lv = (ListView)findViewById(R.id.listView1);

        Integer[] imgId = {R.drawable.aud, R.drawable.bgn, R.drawable.brl, R.drawable.cad, R.drawable.chf, R.drawable.cny,
                R.drawable.czk, R.drawable.dkk, R.drawable.eur, R.drawable.gbp, R.drawable.hkd, R.drawable.hrk, R.drawable.huf,
                R.drawable.idr, R.drawable.jpy, R.drawable.krw, R.drawable.mxn, R.drawable.myr, R.drawable.nok, R.drawable.nzd,
                R.drawable.php, R.drawable.ron, R.drawable.rub, R.drawable.sek, R.drawable.sgd, R.drawable.thb, R.drawable.trk,
                R.drawable.usd, R.drawable.zar,};

        String[] names = getResources().getStringArray(R.array.currency_names);

        currencyList = new ArrayList<>();

        currencyList.add(new Currency("AUD", mapList.get("AUD")));
        currencyList.add(new Currency("BGN", mapList.get("BGN")));
        currencyList.add(new Currency("BRL", mapList.get("BRL")));
        currencyList.add(new Currency("CAD", mapList.get("CAD")));
        currencyList.add(new Currency("CHF", mapList.get("CHF")));
        currencyList.add(new Currency("CNY", mapList.get("CNY")));
        currencyList.add(new Currency("CZK", mapList.get("CZK")));
        currencyList.add(new Currency("DKK", mapList.get("DKK")));
        currencyList.add(new Currency("EUR", mapList.get("EUR")));
        currencyList.add(new Currency("GBP", mapList.get("GBP")));
        currencyList.add(new Currency("HKD", mapList.get("HKD")));
        currencyList.add(new Currency("HRK", mapList.get("HRK")));
        currencyList.add(new Currency("HUF", mapList.get("HUF")));
        currencyList.add(new Currency("IDR", mapList.get("IDR")));
        currencyList.add(new Currency("JPY", mapList.get("JPY")));
        currencyList.add(new Currency("KRW", mapList.get("KRW")));
        currencyList.add(new Currency("MXN", mapList.get("MXN")));
        currencyList.add(new Currency("MYR", mapList.get("MYR")));
        currencyList.add(new Currency("NOK", mapList.get("NOK")));
        currencyList.add(new Currency("NZD", mapList.get("NZD")));
        currencyList.add(new Currency("PHP", mapList.get("PHP")));
        currencyList.add(new Currency("RON", mapList.get("RON")));
        currencyList.add(new Currency("RUB", mapList.get("RUB")));
        currencyList.add(new Currency("SEK", mapList.get("SEK")));
        currencyList.add(new Currency("SGD", mapList.get("SGD")));
        currencyList.add(new Currency("THB", mapList.get("THB")));
        currencyList.add(new Currency("TRY", mapList.get("TRY")));
        currencyList.add(new Currency("USD", mapList.get("USD")));
        currencyList.add(new Currency("ZAR", mapList.get("ZAR")));

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(getApplicationContext(), currencyList, imgId, names);
        lv.setAdapter(currencyAdapter);
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.nav_calc){
            Intent calcOpt = new Intent(MainActivity.this, CalculatorActivity.class);
            startActivity(calcOpt);
        }
        else if(id == R.id.nav_info){
            Intent infoOpt = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(infoOpt);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

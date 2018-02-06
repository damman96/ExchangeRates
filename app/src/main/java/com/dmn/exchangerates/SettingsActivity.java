package com.dmn.exchangerates;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_main);

        final EditText etUserValue = (EditText)findViewById(R.id.etSetvalue);
        Button button = (Button)findViewById(R.id.button);

        etUserValue.setText(DataHolder.getInstance().getUserValue());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DataHolder.getInstance().setUserValue(etUserValue.getText().toString());
            DataHolder.getInstance().setUserValueADouble(Double.parseDouble(etUserValue.getText().toString()));
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

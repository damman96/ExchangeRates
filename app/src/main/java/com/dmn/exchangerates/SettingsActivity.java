package com.dmn.exchangerates;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Set;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_main);

        final EditText etUserValue = (EditText)findViewById(R.id.etSetvalue);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DataHolder.getInstance().setUserValue(etUserValue.getText().toString());
            DataHolder.getInstance().setUserValueADouble(Double.parseDouble(etUserValue.getText().toString()));
            DataHolder.changeData(Double.parseDouble(etUserValue.getText().toString()));
            DataHolder.convertData();
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            }
        });
    }
}

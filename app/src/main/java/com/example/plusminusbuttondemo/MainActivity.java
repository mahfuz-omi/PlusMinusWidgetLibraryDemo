package com.example.plusminusbuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        PlusMinusButton plusMinusButton = new PlusMinusButton(this);
        this.setContentView(plusMinusButton);

        PlusMinusButton plusMinusButton1 = new PlusMinusButton(this);
        plusMinusButton1.setOnValueChangeListener(new OnValueChangeListener() {
            @Override
            public void onValueChanged(PlusMinusButton plusMinusButton, int oldValue, int newValue) {
                plusMinusButton.setValue(newValue);
            }
        });

        plusMinusButton.addView(plusMinusButton1);

    }
}

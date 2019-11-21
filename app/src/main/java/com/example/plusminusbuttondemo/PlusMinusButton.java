package com.example.plusminusbuttondemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlusMinusButton extends LinearLayout {

    Button plusButton, minusButton;
    TextView valueTextView;

    LinearLayout.LayoutParams buttonsLayoutParams;
    LinearLayout.LayoutParams textViewLayoutParams;
    LinearLayout.LayoutParams mainLayoutParams;

    OnValueChangeListener onValueChangeListener;

    public void setOnValueChangeListener(OnValueChangeListener onValueChangeListener)
    {
        if(onValueChangeListener != null)
        this.onValueChangeListener = onValueChangeListener;
    }


    private void initializeData(Context context)
    {

        this.plusButton = new Button(context);
        this.plusButton.setText("+");
        this.minusButton = new Button(context);
        this.minusButton.setText("-");
        this.valueTextView = new TextView(context);
        this.valueTextView.setText("0");

        this.buttonsLayoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.textViewLayoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.mainLayoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        this.plusButton.setLayoutParams(buttonsLayoutParams);
        this.minusButton.setLayoutParams(buttonsLayoutParams);
        this.valueTextView.setLayoutParams(textViewLayoutParams);
        this.setLayoutParams(mainLayoutParams);


        this.addView(this.minusButton);
        this.addView(this.valueTextView);
        this.addView(this.plusButton);



        this.setOnValueChangeListener(new DefaultOnValueChangeListener());

        this.plusButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int oldValue = Integer.parseInt(valueTextView.getText().toString());
                int newValue = oldValue + 1;
                onValueChangeListener.onValueChanged(PlusMinusButton.this,oldValue,newValue);
            }
        });

        this.minusButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int oldValue = Integer.parseInt(valueTextView.getText().toString());
                int newValue = oldValue - 1;
                onValueChangeListener.onValueChanged(PlusMinusButton.this,oldValue,newValue);
            }
        });
    }

    public void setValue(int value)
    {
        if(this.valueTextView != null)
            this.valueTextView.setText(value+"");
    }

    public int getValue()
    {
        if(this.valueTextView != null)
            return Integer.parseInt(this.valueTextView.getText().toString());
        return 0;
    }




    public PlusMinusButton(Context context) {
        super(context);

        this.initializeData(context);

    }

    public PlusMinusButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PlusMinusButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PlusMinusButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}

package com.example.plusminusbuttondemo;

public class DefaultOnValueChangeListener implements OnValueChangeListener {
    @Override
    public void onValueChanged(PlusMinusButton plusMinusButton,int oldValue, int newValue) {

        plusMinusButton.setValue(newValue);
    }
}

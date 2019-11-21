# PlusMinusWidgetLibraryDemo

This is a very simple Plus-Minus Widget. Anyone can use it dynamically from an Activity/Fragment.

# add this widget to activity(Way 1):
PlusMinusButton plusMinusButton = new PlusMinusButton(this);
this.setContentView(plusMinusButton);

Here, DefaultOnValueChangeListener has been added automatically.

# add this widget to activity(Way 2):
PlusMinusButton plusMinusButton1 = new PlusMinusButton(this);
        plusMinusButton1.setOnValueChangeListener(new OnValueChangeListener() {
            @Override
            public void onValueChanged(PlusMinusButton plusMinusButton, int oldValue, int newValue) {
                plusMinusButton.setValue(newValue);
            }
        });

        plusMinusButton.addView(plusMinusButton1);
        
Example:

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

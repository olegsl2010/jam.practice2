package ua.olegsl.lesson2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView twQuantity;
    private TextView twPrise;
//    private int mPrise=0;
    private int mQuantity =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnOrder = (Button) findViewById(R.id.btnOrder);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnOrder.setOnClickListener(this);


        twQuantity = (TextView) findViewById(R.id.twQuantity);
        twPrise = (TextView) findViewById(R.id.twPrise);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPlus:
                increment();
                break;
            case R.id.btnMinus:
                decriment();
                break;
            case R.id.btnOrder:

                break;

        }
    }

    private void decriment() {
        mQuantity--;
        displayResults();

    }

    private void increment() {
        mQuantity++;
        displayResults();
    }

    private void displayResults() {
        twQuantity.setText(String.valueOf(mQuantity));
        twPrise.setText("$"+String.valueOf(mQuantity*5));

    }
}

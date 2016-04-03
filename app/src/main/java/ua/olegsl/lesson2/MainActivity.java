package ua.olegsl.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPlus;
    private Button btnMinus;
    private TextView twQuantity;
    private TextView twPrise;
    private int mPrise=0;
    private int mQuantity =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnPlus = (Button) findViewById(R.id.btnPlus);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);

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

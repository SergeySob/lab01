package com.sobolev.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tOne, tTwo, tResult;
    Button btplus, btminus, btmulti, btdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tOne = findViewById(R.id.numberOne);
        tTwo = findViewById(R.id.numberTwo);
        tResult = findViewById(R.id.result);

        btplus = findViewById(R.id.btPlus);
        btminus = findViewById(R.id.btMinus);
        btmulti = findViewById(R.id.btMulti);
        btdiv = findViewById(R.id.btDiv);
    }

    public void calculate(View v)
    {
        float a,b;
        String sa = tOne.getText().toString();
        String sb = tTwo.getText().toString();
        try
        {
            a = Float.parseFloat(sa);
            b = Float.parseFloat(sb);
        }
        catch (Exception e1)
        {
            tResult.setText("Одно/оба поля пустые");
            return;
        }

        if (v == btplus)
        {
            if (a > 999999999 || b > 999999999 || a < -999999999 || b < -999999999)
            {
                tResult.setText("Слишком большое значение");
                return;
            }
            tResult.setText(String.valueOf(a+b));
        }
        if (v == btminus)
        {
            if (a > 999999999 || b > 999999999 || a < -999999999 || b < -999999999)
            {
                tResult.setText("Слишком большое значение");
                return;
            }
            tResult.setText(String.valueOf(a-b));
        }
        if (v == btmulti)
        {
            if (a > 999999999 || b > 999999999 || a < -999999999 || b < -999999999)
            {
                tResult.setText("Слишком большое значение");
                return;
            }
            tResult.setText(String.valueOf(a*b));
        }
        if (v == btdiv)
        {
            if (b > -0.0000000001f && b < 0.0000000001f)
            {
                tResult.setText("Деление на ноль");
                return;
            }
            else {tResult.setText(String.valueOf(a / b));}
        }
    }
}
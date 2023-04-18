package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button calculate;
    EditText runsc, ovr, runcn,ovrbl;
    TextView out;
    float num1,num2,num3,num4,num5,num6,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=findViewById(R.id.but);
        runsc=findViewById(R.id.number1);
        ovr=findViewById(R.id.number2);
        runcn=findViewById(R.id.number3);
        ovrbl=findViewById(R.id.number4);
        out=findViewById(R.id.answer);

        calculate.setOnClickListener(this);

    }

    public int getInt(EditText editText)
    {
        if(editText.getText().toString().equals(""))
        {
            Toast.makeText(this, "Enter runs scored", Toast.LENGTH_SHORT).show();
            return 0;
        }
        else
           return Integer.parseInt(editText.getText().toString());


    }
    @Override
    public void onClick(View view) {
        num1=getInt(runsc);
        num2=getInt(ovr);
        num3=getInt(runcn);
        num4=getInt(ovrbl);
        num5 = num1/num2;
        num6 = num3/num4;
        total = num5-num6;
        switch (view.getId())
        {
            case R.id.but:
                out.setText("Answer = "+(float)total);
                break;
        }

    }
}
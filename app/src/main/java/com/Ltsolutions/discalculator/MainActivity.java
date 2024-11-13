package com.Ltsolutions.discalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btncal;
    Button btnreset;
    EditText discount;
    TextView price;
    EditText taka;
    EditText tk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.taka = (EditText) findViewById(R.id.taka);
        this.discount = (EditText) findViewById(R.id.discount);
        this.btncal = (Button) findViewById(R.id.btncal);
        this.btnreset = (Button) findViewById(R.id.btnreset);
        this.price = (TextView) findViewById(R.id.price);
        this.tk = (EditText) findViewById(R.id.tk);
        this.btnreset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.taka.setText(" ");
                MainActivity.this.discount.setText(" ");
                MainActivity.this.price.setText(" ");
                MainActivity.this.tk.setText(" ");
            }
        });
        this.btncal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                float parseFloat = (Float.parseFloat(MainActivity.this.discount.getText().toString()) / 100.0f) * Float.parseFloat(MainActivity.this.taka.getText().toString());
                MainActivity.this.price.setText(Float.toString((-parseFloat) + Float.parseFloat(MainActivity.this.taka.getText().toString())));
                MainActivity.this.tk.setText(Float.toString(parseFloat));
            }
        });

    }
}
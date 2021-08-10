package id.kotlin.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2;
    Button minus,plus,times,divide, clear;
    TextView resultNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        times = (Button) findViewById(R.id.times);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.clear);
        resultNumber = (TextView) findViewById(R.id.resultNumber);


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length()>0) &&(input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double hasil = num1 - num2;
                    resultNumber.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan Angka pertama & kedua!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length()>0) &&(input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double hasil = num1 + num2;
                    resultNumber.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan Angka pertama & kedua!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length()>0) &&(input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double hasil = num1 * num2;
                    resultNumber.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan Angka pertama & kedua!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((input1.getText().length()>0) &&(input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double hasil = num1 / num2;
                    resultNumber.setText(Double.toString(hasil));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukan Angka pertama & kedua!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                resultNumber.setText("0");
                input1.requestFocus();

            }
        });


    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,eql,clr;
    int i,var1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.t);
        b = findViewById(R.id.b);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        eql = findViewById(R.id.eql);
        clr = findViewById(R.id.clr);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = t.getText().toString() + "0";
                t.setText(s);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Integer.valueOf(t.getText().toString());
                t.setText("");
                i = 1;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Integer.valueOf(t.getText().toString());
                t.setText("");
                i = 2;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Integer.valueOf(t.getText().toString());
                t.setText("");
                i = 3;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = Integer.valueOf(t.getText().toString());
                t.setText("");
                i = 4;
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==1)
                {
                    int var2 = Integer.valueOf(t.getText().toString());
                    int var3 = var1 + var2;
                    t.setText(String.valueOf(var3));
                }
                else if (i==2)
                {
                    int var2 = Integer.valueOf(t.getText().toString());
                    int var3 = var1 - var2;
                    t.setText(String.valueOf(var3));
                }
                else if (i==3)
                {
                    int var2 = Integer.valueOf(t.getText().toString());
                    int var3 = var1 * var2;
                    t.setText(String.valueOf(var3));
                }
                else if (i==4)
                {
                    int var2 = Integer.valueOf(t.getText().toString());
                    double var3 = var1 / var2;
                    t.setText(String.valueOf(var3));
                }
                else if (i==0)
                {
                    Toast.makeText(getApplicationContext(),"Choose Operator",Toast.LENGTH_SHORT).show();
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1 = 0;
                i = 0;
                t.setText("");
            }
        });
    }
}

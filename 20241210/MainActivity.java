package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etS1,etS2;
    Button buttonTopla,buttonCikar,buttonCarp,buttonBol;
    TextView tvSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        etS1=findViewById(R.id.et_sayi1);
        etS2=findViewById(R.id.et_sayi2);
        buttonTopla=findViewById(R.id.button_topla);
        buttonCikar=findViewById(R.id.button_cikar);
        buttonCarp=findViewById(R.id.button_carp);
        buttonBol=findViewById(R.id.button_bol);
        tvSonuc=findViewById(R.id.tv_sonuc);

        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1= Integer.parseInt(etS1.getText().toString());
                int s2= Integer.parseInt(etS2.getText().toString());
                int sonuc= s1+s2;
                tvSonuc.setText("Sonuç: "+sonuc);

            }
        });

        buttonCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1= Integer.parseInt(etS1.getText().toString());
                int s2= Integer.parseInt(etS2.getText().toString());
                int sonuc= s1-s2;
                tvSonuc.setText("Sonuç: "+sonuc);
            }
        });

        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1= Integer.parseInt(etS1.getText().toString());
                int s2= Integer.parseInt(etS2.getText().toString());
                int sonuc= s1*s2;
                tvSonuc.setText("Sonuç: "+sonuc);
            }
        });

        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                double s1= Double.parseDouble(etS1.getText().toString());
//                double s2= Double.parseDouble(etS2.getText().toString());
//                double sonuc= s1/s2;
//                tvSonuc.setText("Sonuç: "+sonuc);

                Float s1=Float.parseFloat(etS1.getText().toString());
                Float s2= Float.parseFloat(etS2.getText().toString());
                if(s2!=0) {
                    Float sonuc = s1 / s2;
                    tvSonuc.setText("Sonuç: " + sonuc);
                }
                else {
                    String sonuc="0 ile bölünmez";
                    tvSonuc.setText("Sonuç: " + sonuc);
                }
            }
        });

    }
}
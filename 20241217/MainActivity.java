package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editTextSayi1,editTextSayi2;
    RadioButton RadioButtonTopla,RadioButtonCikar,RadioButtonCarp,RadioButtonBol;
    Button buttonHesapla;
    TextView textViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       editTextSayi1=findViewById(R.id.editTextNumber_sayi1);
       editTextSayi2=findViewById(R.id.editTextNumber_sayi2);
       RadioButtonTopla=findViewById(R.id.radioButton_topla);
       RadioButtonCikar=findViewById(R.id.radioButton_cikar);
       RadioButtonCarp=findViewById(R.id.radioButton_carp);
       RadioButtonBol=findViewById(R.id.radioButton_bol);
       buttonHesapla=findViewById(R.id.button_hesapla);
       textViewSonuc=findViewById(R.id.textView_sonuc);


       buttonHesapla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double sayi1=Double.parseDouble(editTextSayi1.getText().toString());
               double sayi2=Double.parseDouble(editTextSayi2.getText().toString());
               double sonuc=0;

               if (RadioButtonTopla.isChecked()){
                   sonuc=sayi1+sayi2;
               }
               else if (RadioButtonCikar.isChecked()){
                   sonuc=sayi1-sayi2;
               }
               else if (RadioButtonCarp.isChecked()){
                   sonuc=sayi1*sayi2;
               }
               else{
                   sonuc=sayi1/sayi2;
               }

               textViewSonuc.setText("Sonuç :"+sonuc);

           }
       });

    }
}
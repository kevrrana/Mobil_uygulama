package com.example.uygulama1;

import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCorba,checkBoxKofte,checkBoxLahmacun,checkBoxPilav,checkBoxSobiyet;

    Button buttonSiparis;

    TextView textViewOzet;

    EditText numberCorba, numberKofte, numberLahmacun, numberPilav, numberSobiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        checkBoxCorba=findViewById(R.id.checkBox_corba);
        checkBoxKofte=findViewById(R.id.checkBox_kofte);
        checkBoxLahmacun=findViewById(R.id.checkBox_lahmacun);
        checkBoxPilav=findViewById(R.id.checkBox_pilav);
        checkBoxSobiyet=findViewById(R.id.checkBox_sobiyet);
        numberCorba=findViewById(R.id.editTextNumber_corba);
        numberKofte=findViewById(R.id.editTextNumber_kofte);
        numberLahmacun=findViewById(R.id.editTextNumber_lahmacun);
        numberPilav=findViewById(R.id.editTextNumber_pilav);
        numberSobiyet=findViewById(R.id.editTextNumber_sobiyet);
        buttonSiparis=findViewById(R.id.button_siparis);
        textViewOzet=findViewById(R.id.textView_sibarisozet);

        buttonSiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFiyat=50, kofteFiyat=75, lahmacunFiyat=75, pilavFiyat=100,sobiyetFiyat=89;
                float toplamTutar=0,adet=0;
                String s="Sipariş Özeti:\n----------------------------------------\n";

                if (checkBoxCorba.isChecked()){
                    adet=Float.parseFloat(numberCorba.getText().toString());
                    toplamTutar+=(corbaFiyat*adet);
                    s+="Çorba \n";
                }

                if (checkBoxKofte.isChecked()){
                    adet=Float.parseFloat(numberKofte.getText().toString());
                    toplamTutar+=(kofteFiyat*adet);
                    s+="Köfte \n";
                }

                if (checkBoxLahmacun.isChecked()){
                    adet=Float.parseFloat(numberLahmacun.getText().toString());
                    toplamTutar+=(lahmacunFiyat*adet);
                    s+="Lahmacun \n";
                }

                if (checkBoxPilav.isChecked()){
                    adet=Float.parseFloat(numberPilav.getText().toString());
                    toplamTutar+=(pilavFiyat*adet);
                    s+="Pilav \n";
                }

                if (checkBoxSobiyet.isChecked()){
                    adet=Float.parseFloat(numberSobiyet.getText().toString());
                    toplamTutar+=(sobiyetFiyat*adet);
                    s+="Şöbiyet \n";
                }
                textViewOzet.setText(s+"----------------------------------------\nToplam Tutar: " +toplamTutar);
            }
        });

    }
}
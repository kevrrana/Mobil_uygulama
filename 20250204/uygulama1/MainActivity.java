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

    EditText editTextCihazAdi,editTextCihazGucu,editTextSaat;
    Button buttonHesapla;
    TextView textViewTuketim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       editTextCihazAdi=findViewById(R.id.editText_cihaz_adi);
       editTextCihazGucu=findViewById(R.id.editText_cihaz_gucu);
       editTextSaat=findViewById(R.id.editText_kulanim_saati);
       buttonHesapla=findViewById(R.id.button_hesapla);
       textViewTuketim=findViewById(R.id.textView_aylik_tuketim);

       buttonHesapla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String CihazAdi=editTextCihazAdi.getText().toString();
               double guc=Double.parseDouble(editTextCihazGucu.getText().toString());
               double saat=Double.parseDouble(editTextSaat.getText().toString());

               ElektirikliCihaz cihaz=new ElektirikliCihaz();

               cihaz.CihazAdi=CihazAdi;
               cihaz.CihazGucu=guc;
               cihaz.GunlukKullanimSaati=saat;
              double sonuc=cihaz.aylikTuketim();
              textViewTuketim.setText("Aylik Tüketim: "+sonuc);
           }
       });
    }

}
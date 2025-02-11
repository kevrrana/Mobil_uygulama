package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editTextDersAdi, editTextYazili1, editTextYazili2;
    Button buttonHesapla;
    ListView listViewDers;

    ArrayList<String> dersListesi;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextDersAdi = findViewById(R.id.editText_dersad);
        editTextYazili1 = findViewById(R.id.editText_1yazilinotu);
        editTextYazili2 = findViewById(R.id.editText_2yazilinotu);
        buttonHesapla = findViewById(R.id.button_hesapla);
        listViewDers = findViewById(R.id.lv_liste);
        dersListesi=new ArrayList<>();
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dersListesi);
        listViewDers.setAdapter(adapter);

        buttonHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dersAdi = editTextDersAdi.getText().toString();
                double yazili1 =Double.parseDouble(editTextYazili1.getText().toString());
                double yazili2 =Double.parseDouble( editTextYazili2.getText().toString());

                Ders dersler = new Ders(dersAdi, yazili1, yazili2);

                double ortalama= dersler.getOrtalama();

                String bilgi= dersler.dersBilgisi();
                dersListesi.add(bilgi);
                adapter.notifyDataSetChanged();

                temizle();
            }
        });
    }

    private void temizle() {
        editTextDersAdi.setText(" ");
        editTextYazili1.setText(" ");
        editTextYazili2.setText(" ");
    }
}
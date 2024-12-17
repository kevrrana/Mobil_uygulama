package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   ImageView imageViewTakim;

   RadioButton radioButtonFenerbahce,radioButtonGalatasaray,radioButtonRealmadrid,radioButtonBeşiktaş;
   Button buttonSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageViewTakim=findViewById(R.id.imageView_takim);
        radioButtonFenerbahce=findViewById(R.id.radioButton_fb);
        radioButtonGalatasaray=findViewById(R.id.radioButton_gs);
        radioButtonBeşiktaş=findViewById(R.id.radioButton_bjk);
        radioButtonRealmadrid=findViewById(R.id.radioButton_ts);
        buttonSec=findViewById(R.id.button_sec);

        buttonSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonFenerbahce.isChecked()){

                    imageViewTakim.setImageResource(R.drawable.fenerbah_e);
                }

                else if ( radioButtonGalatasaray.isChecked()) {

                    imageViewTakim.setImageResource(R.drawable.galatasaray);
                }

                else if ( radioButtonBeşiktaş.isChecked()) {

                    imageViewTakim.setImageResource(R.drawable.bjk);
                }

                else {

                    imageViewTakim.setImageResource(R.drawable.ts);
                }

            }
        });

    }
}
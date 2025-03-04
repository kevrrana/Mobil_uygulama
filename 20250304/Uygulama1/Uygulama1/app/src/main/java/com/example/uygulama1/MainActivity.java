package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        Gorsel cilek=new Gorsel("Çilek",1,R.drawable.cilek);
        Gorsel hindistanCevizi=new Gorsel("Hindistan Cevizi",2,R.drawable.coconut);
        Gorsel muz=new Gorsel("Muz",2,R.drawable.muz);
        Gorsel kivi=new Gorsel("Kivi",3,R.drawable.kivi);
        Gorsel elma=new Gorsel("Elma",4,R.drawable.elma);
        Gorsel karpuz=new Gorsel("Karpruz",4,R.drawable.karpuz);
        Gorsel kiraz=new Gorsel("Kiraz",4,R.drawable.kiraz);

        gorselArrayList=new ArrayList<>();

        gorselArrayList.add(cilek);
        gorselArrayList.add(hindistanCevizi);
        gorselArrayList.add(muz);
        gorselArrayList.add(kivi);
        gorselArrayList.add(elma);
        gorselArrayList.add(karpuz);
        gorselArrayList.add(kiraz);

        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;
    }

    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : "  + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
    public void ileriGitme(View view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }
}
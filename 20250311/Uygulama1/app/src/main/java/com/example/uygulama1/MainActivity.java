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

    ArrayList<Ulke> ulkeArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Ulke turkiye = new Ulke("Türkiye","Ankara","Türkçe",85000000,"Türk Lirası",1,R.drawable.turkey);
        Ulke afganistan = new Ulke("Afganistan","Kabil","Peştuca",41128771,"Afgani",2,R.drawable.afghanistan);
        Ulke arnavutluk = new Ulke("Arnavutluk","Tiran","Arnavutca",2845955,"Lek",3,R.drawable.albania);
        Ulke kanada = new Ulke("Kanada","Ottawa","İngilizce, Fransızca",38008005,"Kanada Doları",5,R.drawable.canada);
        Ulke almanya = new Ulke("Almanya","Berlin","Almanca",83286950,"Euro",6,R.drawable.germany);
        Ulke brezilya = new Ulke("Brezilya","Brasilia","Portekizce",213317639,"Real",7,R.drawable.brazil);

        ulkeArrayList=new ArrayList<>();

        ulkeArrayList.add(turkiye);
        ulkeArrayList.add(afganistan);
        ulkeArrayList.add(arnavutluk);
        ulkeArrayList.add(kanada);
        ulkeArrayList.add(almanya);
        ulkeArrayList.add(brezilya);

        binding.imageView.setImageResource(ulkeArrayList.get(0).fotograf);
        binding.tvAd.setText("Ad: "+ulkeArrayList.get(0).ad);
        binding.tvBaskant.setText("Başkent: "+ulkeArrayList.get(0).baskent);
        binding.tvDil.setText("Dil: "+ulkeArrayList.get(0).dil);
        binding.tvNufus.setText("Nüfus: "+ulkeArrayList.get(0).nufus);
        binding.tvParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(0).paraBirimi);
        seciliSiraNo=0;

    }
    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageView.setImageResource(ulkeArrayList.get(seciliSiraNo).fotograf);
            binding.tvAd.setText("Ad: "+ulkeArrayList.get(seciliSiraNo).ad);
            binding.tvBaskant.setText("Başkent: "+ulkeArrayList.get(seciliSiraNo).baskent);
            binding.tvDil.setText("Dil: "+ulkeArrayList.get(seciliSiraNo).dil);
            binding.tvNufus.setText("Nüfus: "+ulkeArrayList.get(seciliSiraNo).nufus);
            binding.tvParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(seciliSiraNo).paraBirimi);
        }
    }
    public void ileriGitme(View view){
        if(seciliSiraNo<ulkeArrayList.size()-1){
            seciliSiraNo++;
            binding.imageView.setImageResource(ulkeArrayList.get(seciliSiraNo).fotograf);
            binding.tvAd.setText("Ad: "+ulkeArrayList.get(seciliSiraNo).ad);
            binding.tvBaskant.setText("Başkent: "+ulkeArrayList.get(seciliSiraNo).baskent);
            binding.tvDil.setText("Dil: "+ulkeArrayList.get(seciliSiraNo).dil);
            binding.tvNufus.setText("Nüfus: "+ulkeArrayList.get(seciliSiraNo).nufus);
            binding.tvParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(seciliSiraNo).paraBirimi);
        }
    }
}
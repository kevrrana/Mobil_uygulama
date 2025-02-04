package com.example.uygulama1;

public class ElektirikliCihaz {
    public String CihazAdi;
    public double CihazGucu;
    public  double GunlukKullanimSaati;

    public double aylikTuketim() {
        double aylikKullanim;
        aylikKullanim=CihazGucu*GunlukKullanimSaati*30*2.07;
        return aylikKullanim;
    }
}


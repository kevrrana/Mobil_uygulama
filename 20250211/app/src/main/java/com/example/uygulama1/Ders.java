package com.example.uygulama1;

public class Ders {
    String dersAdi;
    double yazili1;
    double yazili2;
    double ortalama;
    String durum;

    public Ders(String dersAdi, double yazili1, double yazili2) {
        this.dersAdi = dersAdi;
        this.yazili1 = yazili1;
        this.yazili2 = yazili2;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public double getYazili1() {
        return yazili1;
    }

    public void setYazili1(double yazili1) {
        this.yazili1 = yazili1;
    }

    public double getYazili2() {
        return yazili2;
    }

    public void setYazili2(double yazili2) {
        this.yazili2 = yazili2;
    }

    public double getOrtalama() {
        return ortalamaHesapla();
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public String getDurum() {
        return durumHesapla();
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public double ortalamaHesapla(){
        ortalama=(yazili1+yazili2)/2.0;
        return ortalama;
    }

    public  String durumHesapla(){
        if(ortalama>=50){
            return "Geçti";
        }
        else{
            return "Kaldı";
        }
    }
    public String dersBilgisi(){
        return dersAdi+" Ortalama "+getOrtalama()+"("+getDurum()+")";
    }
}

package com.example.uygulama1;

public class Bilgisayar {
    String islemci;
    String renk;
    String ram;
    String ekranKarti;
    int ekranBoyutu;
    int stokAdet;

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getEkranKarti() {
        return ekranKarti;
    }

    public void setEkranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(int ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getStokAdet() {
        return stokAdet;
    }

    public void setStokAdet(int stokAdet) {
        this.stokAdet = stokAdet;
    }

    public Bilgisayar(String islemci, String renk, String ram, String ekranKarti, int ekranBoyutu, int stokAdet) {
        this.islemci = islemci;
        this.renk = renk;
        this.ram = ram;
        this.ekranKarti = ekranKarti;
        this.ekranBoyutu = ekranBoyutu;
        this.stokAdet = stokAdet;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "islemci='" + islemci + '\'' +
                ", renk='" + renk + '\'' +
                ", ram='" + ram + '\'' +
                ", ekranKarti='" + ekranKarti + '\'' +
                ", ekranBoyutu=" + ekranBoyutu +
                ", stokAdet=" + stokAdet +
                '}';
    }
}

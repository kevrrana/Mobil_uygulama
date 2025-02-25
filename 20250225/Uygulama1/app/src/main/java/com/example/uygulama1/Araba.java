package com.example.uygulama1;

public class Araba {
    private String marka;
    private String model;
    private int sonHiz;
    private int anlikHiz;
    private boolean calisiyorMu;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonHiz() {
        return sonHiz;
    }

    public void setSonHiz(int sonHiz) {
        this.sonHiz = sonHiz;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        if (anlikHiz<=0){
            this.anlikHiz=8;
        }
        else if (anlikHiz>sonHiz) {
            this.anlikHiz = sonHiz;
        }
        else {
            this.anlikHiz=anlikHiz;
        }
        this.anlikHiz=anlikHiz;
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }

    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
        this.anlikHiz= 0;//varsayılan hız
        this.calisiyorMu=false;
    }

    //fonksiyonları oluşturalım.

    public String calistir(){
        if (calisiyorMu){
            return " Araba zaten çalışıyor.";
        }
        calisiyorMu=true;
            return " Araba çalışıyor.";
    }
    public String durdur(){
        if (anlikHiz>0){
            return "Arabanın Hızı: "+anlikHiz+"km/h olduğu için durdurulamadı. ";
        }
        if (calisiyorMu){
            calisiyorMu=false;
            return " Araba durduruldu. ";
        }
        else {
            return " Araba zaten durdurulmuş. ";
        }
    }
    public void hizlan(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz+hiz);
        }
    }
    public void yavasla(int hiz){
        if (calisiyorMu){
            setAnlikHiz(anlikHiz-hiz);
        }
    }
}

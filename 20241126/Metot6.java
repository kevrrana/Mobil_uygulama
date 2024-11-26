package com.example.uygulama1;

public class Metot6 {
    public static void main(String[] args) {
        System.out.println("Sayıların Farkı:"+ farkHesapla(6,0));
        System.out.println("Sayılareın Farkı:"+farkHesapla(6,8));
    }
    public static int farkHesapla(int s1, int s2){

        if (s1>s2){
            return s1-s2;
        }
        else {
            return s2-s1;
        }
    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class örnek2 {
    public static void main(String[] args) {
        int yazili1,yazili2,ortalama;
        Scanner oku=new Scanner(System.in);

        System.out.print("1. Notunuzu Girin: ");
        yazili1=oku.nextInt();

        System.out.print("2. Yazılınızı Girin: ");
        yazili2=oku.nextInt();

        ortalama=(yazili1+yazili2)/2;
        System.out.print("Ortalamanız: "+ortalama);


    }
}

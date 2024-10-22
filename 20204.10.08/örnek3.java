package com.example.uygulama1;

import java.util.Scanner;

public class örnek3 {
    public static void main(String[] args) {
        float kisaKenar,uzunKenar,cevre,alan;
        Scanner oku=new Scanner(System.in);

        System.out.print("Kısa kenarı giriniz: ");
        kisaKenar=oku.nextFloat();

        System.out.print("Uzun kenarı giriniz: ");
        uzunKenar=oku.nextFloat();

        cevre=2*(kisaKenar+uzunKenar);
        System.out.println("Çevresi: "+cevre);

        alan=kisaKenar*uzunKenar;
        System.out.println("Alan: "+alan);


    }
}

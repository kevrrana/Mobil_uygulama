package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double yazili1,yazili2;

        System.out.println("1. Yazılıyı Giriniz: ");
        yazili1= oku.nextDouble();

        System.out.println("2. Yazılıyı Giriniz: ");
        yazili2= oku.nextDouble();

        double ortalama=ortalama(yazili1,yazili2);
        System.out.println("Ortalama: "+ortalama);

    }

    private static double ortalama(double yazili1, double yazili2) {
        return (yazili1+yazili2)/2;
    }
}

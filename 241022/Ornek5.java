package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi1,sayi2,toplam=0;

        System.out.print("1. sayıyı Giriniz:");
        sayi1= oku.nextInt();

        System.out.print("2. sayıyı Giriniz:");
        sayi2= oku.nextInt();
        for(int i=sayi1;i<=sayi2;i++){
            toplam+=i;
        }
        System.out.print("Toplam: "+toplam);
    }
}

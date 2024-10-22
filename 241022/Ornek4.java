package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi=oku.nextInt();
        int toplam = 0;

        for (int i=1;i<=sayi;i++) {
            toplam+=i;
        }

        System.out.println("1'den " + sayi + "'ya kadar olan sayıların toplamı: " + toplam);
    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int toplam=0;

        for(int i=1;i<10;i++){
            System.out.println(i+"Sayınızı girin: ");
            int sayi=oku.nextInt();
            toplam+= oku.nextInt();
        }
        System.out.println();
    }
}

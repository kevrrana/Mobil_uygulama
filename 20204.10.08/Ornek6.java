package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        double maas,yeniMaas,zamOranı;
        Scanner oku=new Scanner(System.in);
        System.out.print("Maaşı Giriniz: ");
        maas= oku.nextDouble();
        System.out.print("Zam Oranı(%): ");
        zamOranı= oku.nextDouble()/100;

    }
}

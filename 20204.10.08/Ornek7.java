package com.example.uygulama1;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        double a,b,c;

        System.out.print("A'yı Giriniz: ");
        a=oku.nextDouble();

        System.out.print("B'yı Giriniz: ");
        b=oku.nextDouble();

        b=oku.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.println("Hipotenüs: "+c);





    }
}

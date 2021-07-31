package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double fizik, kimya, turkce, tarih, muzik;
        System.out.println("Fizik notunu giriniz: ");
        fizik = scn.nextDouble();
        System.out.println("Kimya notunu giriniz: ");
        kimya = scn.nextDouble();
        System.out.println("Türkçe notunu giriniz: ");
	    turkce = scn.nextDouble();
        System.out.println("Tarih notunu giriniz: ");
        tarih = scn.nextDouble();
        System.out.println("Müzik notunu giriniz: ");
        muzik = scn.nextDouble();

        if((fizik+kimya+turkce+tarih+muzik)/5 >= 60){
            System.out.print("Sınıfı Geçti");
        }else{
            System.out.print("Sınıfta Kaldı");
        }
    }
}

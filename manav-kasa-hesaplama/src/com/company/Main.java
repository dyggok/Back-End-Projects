package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut, elma,domates,muz,patlican,toplam;
        System.out.print("Armut Kaç Kilo: ");
        armut = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        elma = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        domates = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        muz = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        patlican = scanner.nextDouble();
        toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        System.out.print("Toplam Tutar: "+toplam);
    }
}

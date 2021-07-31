package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy,kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();
        System.out.println("Vücut Kitle İndeksiniz: "+kilo/(boy*boy));
    }
}

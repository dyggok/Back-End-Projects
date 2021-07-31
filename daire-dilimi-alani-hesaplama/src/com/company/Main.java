package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r,alfa,alan;
        System.out.println("Dairenin yarıçapını ve daire dilimi açısını giriniz: ");
        r = scanner.nextDouble();
        alfa = scanner.nextDouble();
        alan = (Math.PI*(r*r)*alfa)/360;
        System.out.println("Daire dilimi alanı: "+alan);

    }
}

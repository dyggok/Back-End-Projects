package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    double birincikenar, ikincikenar, ucuncukenar, u;
	    System.out.println("Birinci kenarın değerini giriniz: ");
	    birincikenar = scanner.nextDouble();
        System.out.println("İkinci kenarın değerini giriniz: ");
        ikincikenar = scanner.nextDouble();
        System.out.println("Üçüncü kenarın değerini giriniz: ");
        ucuncukenar = scanner.nextDouble();

        u = (birincikenar+ikincikenar+ucuncukenar)/2;
        System.out.println("Üçgenin alanı: "+Math.pow(u*(u-birincikenar)*(u-ikincikenar)*(u-ucuncukenar),0.5));
    }
}

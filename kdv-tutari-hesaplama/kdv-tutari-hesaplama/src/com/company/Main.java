package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fiyat, kdv;
	    System.out.println("Fiyatı giriniz: ");
	    fiyat = scanner.nextDouble();
	    if(fiyat>0 && fiyat<=1000){
	        kdv = fiyat*18/100;
	        System.out.println("KDV tutarı: "+kdv);
        }else{
            kdv = fiyat*8/100;
            System.out.print("KDV tutarı: "+kdv);
        }
    }
}

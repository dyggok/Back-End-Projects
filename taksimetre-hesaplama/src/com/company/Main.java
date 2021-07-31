package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yol;
        System.out.println("Gidilen km: ");
        yol = scanner.nextDouble();
        if(10+(yol*2.2) <= 20){
            System.out.println("Tutar: 20 TL");
        }else{
            System.out.println("Tutar: "+(10+(yol*2.2))+" TL");
        }
    }
}

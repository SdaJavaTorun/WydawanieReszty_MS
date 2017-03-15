package com.java.homewydawaniereszty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj resztę: ");
        int r = input.nextInt();
        Reszta rest = new Reszta();
        rest.rekurencja(r);
    }
}

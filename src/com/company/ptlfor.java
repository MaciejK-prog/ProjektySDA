package com.company;

import java.util.Scanner;

public class ptlfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Prosze podać liczbę");

        int b = sc.nextInt();

        for(int i = 0; i <= b; i++) {
            System.out.println("aktualna wartość wynosi: " + i);
        }

        System.out.println("koniec pętli");
    }
}

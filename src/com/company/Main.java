package com.company;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double c;
        double f;
        System.out.println("prosze podac wartosc stopni celsiusa");
        Scanner input = new Scanner (System.in);
        c = input.nextDouble();
        f=32+1.8*c;
        System.out.println("Dana wartosc w celsiusach:" + c);
        System.out.println("Dana wartosc w farenheitach" + f);
    }
}
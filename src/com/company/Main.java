package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Skaitymas();
        System.out.println("Vidurkis: " + Skaiciavimas(atstumas, kuras));
    }

    static float kuras;
    static float atstumas;

    public static void Skaitymas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite nuvažiuotus km: ");
        atstumas = sc.nextFloat();
        System.out.println("Iveskite sunaudota kura L: ");
        kuras = sc.nextFloat();
    }

    public static float Skaiciavimas(float atstumas, float kuras){
        return (kuras*100)/atstumas;
    }
}

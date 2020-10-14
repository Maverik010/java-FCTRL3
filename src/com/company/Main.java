package com.company;

import java.util.*;

public class Main {
    public static long liczenie_silni(long a) {
        if (a == 0) return 1;
        else return a * liczenie_silni(a - 1);
    }


    public static void main(String[] args) {
        /*
        DEKLARACJE
         */
        long silnia, wynik[];
        silnia = 0;
        Scanner wejscie = new Scanner(System.in);
        byte ilosc_prob;
        /*
        ZEROWANIE WARTOSCI
         */
        ilosc_prob = 0;
        ilosc_prob = wejscie.nextByte();
        wynik = new long[ilosc_prob];
        for (byte i = 0; i < wynik.length; i++) {
            wynik[i] = 0;
        }
        /*
        LICZBA PRZYPADKÓW
         */
        if (ilosc_prob > 30 || ilosc_prob < 1) System.exit(1);
        for (byte i = 0; i < ilosc_prob; i++) {
            silnia = wejscie.nextLong();
            if (silnia >= 0 && silnia <= 1000000000){
                wynik[i] += liczenie_silni(silnia);
                System.out.println(((wynik[i] / 10) % 10) + " " + (wynik[i] % 10));
            }
            else System.exit(1);
        }
        /*
        for (byte i = 0; i < ilosc_prob; i++) {

            Dla kazdzego wyniku przedstawiane sa wymagane wartosci tj. ostatnie 2 cyfry
            pierwsza liczbe ustalamy jako liczbe dziesiatek dlatego trzeba pierw podzielic przez
            10 a nastepnie mod 10 natomiast liczbe jednosci ustalamy dzielac liczbe mod 10

            System.out.println(((wynik[i] / 10) % 10) + " " + (wynik[i] % 10));
        }
        */
    }
}

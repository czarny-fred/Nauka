package com.example.nauka;
import java.util.ArrayList;
import java.util.List;

public class ZadanieNaInformatyke {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>(List.of(7, 7));

        ArrayList<Integer> lista2;
        lista2 = new ArrayList<>(List.of(6,8));

        System.out.println(lista1 + " " + lista2);

        ArrayList<Integer> wynik = new ArrayList<>();
        ArrayList<Integer> dodawanie = new ArrayList<>();

        int II= lista1.getFirst();
        int I = lista1.get(1);
        int VV = lista2.getFirst();
        int V = lista2.get(1);

        int Dzialanie1 = I + V;
        int Dzialanie2 = II + VV;

        if (Dzialanie1 > 9) {
            dodawanie.add(Dzialanie1 / 10);
            dodawanie.add(Dzialanie1 % 10);
            Dzialanie2 += dodawanie.get(0);
            Dzialanie1 = Dzialanie1 % 10;
        }


        wynik.add(Dzialanie2);
        wynik.add(Dzialanie1);

        System.out.println(dodawanie);
        System.out.println(wynik);

        
    }
}
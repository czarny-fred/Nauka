package com.example.nauka;
import java.util.Scanner;


public class zadaniaOdChata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] imie = {"marek", "antek", "wladek"};

        for (int i = 0; i < imie.length; i++) {
            System.out.print(imie[i]);
            String addimie = sc.nextLine();
            System.out.println(imie[i] + addimie);

        }

        }
    }


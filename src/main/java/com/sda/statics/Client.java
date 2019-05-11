package com.sda.statics;

public class Client {

    //apartine tipului de data Client, nu obiectului
    //valoare default: 0
    public static int numarOrdine = 0;
    String nume;

    public Client(String nume) {
        this.nume = nume;
        numarOrdine++;
    }

    public static void cresteNrOrdine() {
        numarOrdine++;
    }
}

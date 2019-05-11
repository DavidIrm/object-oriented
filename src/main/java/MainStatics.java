import com.sda.statics.Client;

import static com.sda.statics.Client.cresteNrOrdine;

public class MainStatics {

    public static void main(String[] args) {
        //accesez de pe tip de data
        System.out.println("Numar de ordine " +
                "inainte de creare obiecte: " +
                Client.numarOrdine);

        //creez primul obiect
        Client client1 = new Client("Ana");
        System.out.println("Numar de ordine " +
                "dupa creare obiect: " +
                Client.numarOrdine);

        //creez al doilea obiect
        Client client2 = new Client("Radua");
        System.out.println("Numar de ordine " +
                "dupa creare obiect (2): " +
                Client.numarOrdine);

        cresteNrOrdine();
        cresteNrOrdine();
        cresteNrOrdine();

        System.out.println("Nr ord: " + Client.numarOrdine);

        Calculator.add(1,1);
        Calculator.add(1,1,1);
        Calculator.add(1.0,1);
        Calculator.add(1.0,1.0);
    }
}

/**
 * Mecanismul de overload
 */
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(double a, int b) {
        return (int) a + b;
    }
}

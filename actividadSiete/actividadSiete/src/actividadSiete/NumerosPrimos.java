package actividadSiete;

import java.util.*;


public class NumerosPrimos {
    List <Integer> numerosPrimos=new ArrayList<>();
    public void primos(int rango) {
        for (int x = 2; x <= rango; x++) {
            if (Primo(x)) {
                numerosPrimos.add(x);

            }
        }

        System.out.print("Numeros Primos"+numerosPrimos);
    }

    private boolean Primo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}

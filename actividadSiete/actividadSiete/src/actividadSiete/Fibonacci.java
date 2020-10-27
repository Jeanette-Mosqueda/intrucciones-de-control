package actividadSiete;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void sucesion(int rango) {
        List<Integer> sucesionFibonacci=new ArrayList<>();
        int fUno=1, fDos,f=0;
        for(int n=1; n<= rango; n++){
            fDos=f;
            f=fUno+f;
            fUno=fDos;

            sucesionFibonacci.add(fUno);

        }
        System.out.println(sucesionFibonacci);
    }
}

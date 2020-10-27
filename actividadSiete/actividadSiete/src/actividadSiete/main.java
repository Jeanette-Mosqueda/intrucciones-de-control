package actividadSiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
    public static BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        int opcion, rango;
        boolean salir = false;

        NumerosPrimos numerosPrimos=new NumerosPrimos();
        do {


            System.out.println("Que calculo quieres realizar hoy? ");
            System.out.println("1° Imprimir Numeros Primos ");
            System.out.println("2° Imprimir Seria de Fibonacci ");
            System.out.println("3° Salir");
            System.out.println("Elige una de las opciones ");
            opcion = Integer.parseInt(entrada.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad de numeros primos que quieres imprimir");
                    rango = Integer.parseInt(entrada.readLine());
                    numerosPrimos.primos(rango);

                    break;
                case 2:
                    System.out.println("Ingresa la cantidad de numeros Para la Sucesion de Fibonacci a imprimir");
                    rango = Integer.parseInt(entrada.readLine());
                    Fibonacci.sucesion(rango);
                    break;

                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Opción  no valida, Solo hay opciones de calculos 1 y 2");
                    break;

            }
        }while (salir!=true);
    }
}

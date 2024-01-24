/*
EJERCICIO 2:
Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo.
A continuación, muestra los primeros 20 números sucesivos a dicho número.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.println("INGRESE UN NÚMERO POSITIVO");
            numero = sc.nextInt();
        } while (numero < 0);

        sc.close();

        for (int i = numero; i < numero + 20; i++){
            System.out.println(i+1);
        }

    }
}
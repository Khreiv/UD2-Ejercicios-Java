/*
EJERCICIO 3:
Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
Utiliza las estructuras de control que creas convenientes.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int multiplosDe2 = 0;
        int multiplosDe3 = 0;

        for(int i = 1; i <= 100; i++){
           if(i % 2 == 0){multiplosDe2++;}
           if(i % 3 == 0){multiplosDe3++;}
        }

        System.out.println("Múltiplos de 2 : " + multiplosDe2);
        System.out.println("Múltiplos de 3 : " + multiplosDe3);

    }
}
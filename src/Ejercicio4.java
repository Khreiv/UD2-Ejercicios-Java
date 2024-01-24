/*
EJERCICIO 4:
Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento,
que puede ser ascendente o descendente, a continuación, según el orden indicado se mostrarán en pantalla dichos números.
Ej.: si los números introducidos son 4,7,2 y se escoge orden ascendente (de menor a mayor)
aparecen en pantalla en este orden 2,4,7, si el ordenamiento es descendente (de mayor a menor)
se mostrarán en el siguiente 7, 4, 2. Utiliza estructuras de control adecuadas
*/

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese número " + (i + 1));
            numbers.add(sc.nextInt());
        }

        System.out.println("Desea orden ascendente (Pulsa 'A') o descendente (Pulsa 'D')");
        String choice = sc.next().toLowerCase();

        if (choice.equals("a") || choice.equals("d")) {
            Collections.sort(numbers, choice.equals("d") ? Collections.reverseOrder() : null);
            System.out.println("Lista ordenada: " + numbers);
        } else {
            System.out.println("OPCIÓN INCORRECTA");
        }

        sc.close();

    }
}
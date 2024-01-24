/*
EJERCICIO 1:
Escribe un programa en Java que muestre los números del 10 al 1, en ese orden.
Debes utilizar una estructura de tipo while ó do-while.
*/

public class Ejercicio1 {
    public static void main(String[] args) {

        int number = 10;

        while (number > 0){
            System.out.println(number);
            number --;
        }
    }
}
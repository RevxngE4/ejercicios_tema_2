package Tipos_de_datos;

import java.util.Scanner;

public class Ejercicios_Tema2 {
    public static void main(String[] args) {
        System.out.println("Hola!, ingresa un numero por favor = ");
        Scanner scanner = new Scanner(System.in);
        double precio = scanner.nextDouble();
        System.out.println(aumentoDeIva(precio));
    }
    public static double aumentoDeIva(double precio){
        double porcentaje = (19  * precio) / 100;
        return precio + porcentaje;
    }
}

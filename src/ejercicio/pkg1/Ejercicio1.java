/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int NumA = 4, NumB = 2, Resultado;

        System.out.println("El primer numero es: " + NumA);
        System.out.println("El segundo numero es: " + NumB);

        Resultado = NumA + NumB;
        System.out.println("El resultado de la suma es " + Resultado);

        Resultado = NumA - NumB;
        System.out.println("El resultado de la resta es " + Resultado);

        Resultado = NumA * NumB;
        System.out.println("El resultado de la Multiplicación es " + Resultado);

        Resultado = NumA / NumB;
        System.out.println("El resultado de la División es " + Resultado);

        Resultado = NumA % NumB;
        System.out.println("El residuo de la División es " + Resultado);

    }

}

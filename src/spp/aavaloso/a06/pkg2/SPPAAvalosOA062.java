/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a06.pkg2;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de factoriales");
        calculadora();
    }
    static void calculadora(){
        int numero;
        int factorial=1;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce un número");
        numero= kb.nextInt();
        if (numero>0 && numero<11){
        for (int i=1; i<=numero ; i++){ 
        factorial = factorial * i;
        }
        System.out.println("El factorial del valor introducido es: " + factorial);
        } else System.out.println("Favor de introducir un valor del 1-10");
}
}
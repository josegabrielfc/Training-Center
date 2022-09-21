/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        while (sc.hasNext()) {
            String numbers = sc.nextLine();
            String[] separador = numbers.split(" ");

            int a = Integer.parseInt(separador[0]);
            int b = Integer.parseInt(separador[1]);
            char signo = separador[2].charAt(0);
            int c = Integer.parseInt(separador[3]);
            int d = Integer.parseInt(separador[4]);

            switch (signo) {
                case '+':
                    suma(a, b, c, d);
                    break;
                case '-':
                    resta(a, b, c, d);
                    break;
                case '*':
                    multiplicacion(a, b, c, d);
                    break;
                case '/':
                    division(a, b, c, d);
                    break;
                default:
                    break;
            }

        }
    }

    private static void suma(int a, int b, int c, int d) { // a/b + c/d      =    (a*d +- b*c) / b*d
        simplify((a * d) + (b * c), b * d);
    }

    private static void resta(int a, int b, int c, int d) {
        simplify((a * d) - (b * c), b * d);
    }

    private static void multiplicacion(int a, int b, int c, int d) {
        simplify(a * c, b * d);
    }

    private static void division(int a, int b, int c, int d) {
        simplify(a * d, b * c);
    }

    private static void simplify(int numerador, int denominador) { // Simplificar fracciones
        int mcd = mcd(numerador, denominador);
        System.out.println((numerador / mcd) + " " + (denominador / mcd));
    }

    private static int mcd(int a, int b) { // Maximo como un divisor, con restas
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}

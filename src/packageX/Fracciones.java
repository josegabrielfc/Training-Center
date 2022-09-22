/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.*;

/**
 *
 * @author GAMER
 */
public class Fracciones {

    static long numerator;
    static long denominator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String numbers = sc.nextLine();
            String[] separador = numbers.split(" ");

            long a = Integer.parseInt(separador[0]);
            long b = Integer.parseInt(separador[1]);
            char signo = separador[2].charAt(0);
            long c = Integer.parseInt(separador[3]);
            long d = Integer.parseInt(separador[4]);

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
            System.out.println(numerator + " " + denominator);
        }
    }

    private static void suma(long a, long b, long c, long d) { // a/b + c/d      =    (a*d +- b*c) / b*d
        simplify((a * d) + (b * c), b * d);
    }

    private static void resta(long a, long b, long c, long d) {
        simplify((a * d) - (b * c), b * d);
    }

    private static void multiplicacion(long a, long b, long c, long d) {
        simplify(a * c, b * d);
    }

    private static void division(long a, long b, long c, long d) {
        simplify(a * d, b * c);
    }

    private static void simplify(long numerador, long denominador) { // Simplificar fracciones
        long gcd = gcd(numerador, denominador);
        numerator = numerador / gcd;
        denominator = denominador / gcd;
    }

    private static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static long mcd(long a, long b) {
        while (true) {
            long aux = a;
            a = b % a;
            b = aux;
            if (a == 0) {
                break;
            }
        }
        return b;
    }
}

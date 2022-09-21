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
public class NotaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte out[] = new byte[n];
        byte a, b, c;

        for (byte i = 0; i < n; i++) {
            a = sc.nextByte();
            b = sc.nextByte();
            c = sc.nextByte();
            out[i] = numMedio(a, b, c);
        }
        for (byte i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

    public static byte numMedio(byte a, byte b, byte c) {
        if ((a < b && a > c) || (a > b && a < c)) {
            return a;
        }
        if ((b < a && b > c) || (b > a && b < c)) {
            return b;
        }
        return c;
    }
}

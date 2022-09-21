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
public class ElMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte posicion = 0;
        int mayor = 0;
        int[] numMayor = new int[101];
        for (byte i = 1; i < numMayor.length; i++) {
            numMayor[i] = sc.nextInt();
            if (numMayor[i] > mayor) {
                mayor = numMayor[i];
                posicion = i;
            }
        }
        System.out.println(mayor);
        System.out.println(posicion);
    }
}

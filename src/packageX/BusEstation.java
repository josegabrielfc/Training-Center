/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.Scanner;

/**
 *
 * @author GAMER
 */
public class BusEstation { //Wrong Answer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte cases = sc.nextByte();
        byte aux = cases;
        while (aux > 0) {
            byte cant = sc.nextByte();
            byte registro;
            byte[] placas = new byte[cant / 2];
            byte temp = 0;
            for (byte i = 0; i < cant * 2; i++) {
                registro = sc.nextByte();
                if (registro > 2) {
                    placas[temp] = registro;
                    temp++;
                }
            }
            for (byte i = 0; i < placas.length; i++) {
                System.out.println(placas[i]);
            }
            aux--;
        }

    }

}

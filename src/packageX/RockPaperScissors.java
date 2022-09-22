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
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte cases = sc.nextByte();
        byte aux = cases;
        while (aux > 0) {
            byte cant = sc.nextByte();
            String[] libreta = new String[cant + 1];
            byte contA = 0; // Contador Alice
            byte contB = 0; //Contador Bob
            for (byte i = 0; i < libreta.length; i++) {
                libreta[i] = sc.nextLine();
                if (libreta[i].equals("ALICE")) {
                    contA += 2;
                } else if (libreta[i].equals("BOB")) {
                    contB += 2;
                } else {
                    contA++;
                    contB++;
                }
            }
            if (contA > contB) {
                System.out.println("ALICE");
            } else if (contA < contB) {
                System.out.println("BOB");
            } else {
                System.out.println("EMPATE");
            }

            aux--;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageX;

import java.util.Scanner;

/**
 *
 * @author GAMER
 */
public class OompaLoompas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while (cases > 0) {
            float number = sc.nextFloat();
            float aux = number;
            boolean valid = false; // valida que el numero es menor o igual a 1
            int cont = 0;

            while (!valid) {
                if (aux > 1) {
                    aux /= 2.0f;
                    cont++;
                } else {
                    valid = true;
                }
            }
            System.out.println(cont + " dias");
            cases--;
        }
    }
}

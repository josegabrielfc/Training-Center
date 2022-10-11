/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageX;

import java.util.Scanner;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class n81 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int num = sc.nextInt();
            int result;
            boolean valid = false;
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    result = i * j;
                    if (num == result) {
                        valid = true;
                        j = 10;
                        i = 10;
                    }
                }
            }
            if (!valid) {
                System.out.println("No");
            } else {
                System.out.println("Si");
            }
        }

    }

}
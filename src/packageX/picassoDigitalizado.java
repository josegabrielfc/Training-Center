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
public class picassoDigitalizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            float mitad = (a * b) / 2.0f;
            int cont = 0;
            for (int i = 0; i < b; i++) {
                String s = sc.next();
                char[] c = s.toCharArray();
                for (int j = 0; j < a; j++) {
                    if (c[j] > 64 && c[j] < 91) { // 65 = A 66 = B ..... Z = 90
                        cont++;
                    }
                }
            }
            if (cont >= mitad) {
                System.out.println("ES UN CUADRO DE PICASSO");
            } else {
                System.out.println("NO ES UN CUADRO DE PICASSO");
            }
            cases--;
        }

    }
}

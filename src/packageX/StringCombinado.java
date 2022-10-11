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
public class StringCombinado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String word1 = sc.next();
            String word2 = sc.next();

            char[] c1 = word1.toCharArray();
            char[] c2 = word2.toCharArray();

            int len1 = c1.length;
            int len2 = c2.length;
            int mayor = Math.max(len1, len2);

            String result = "";
            for (int j = 0; j < mayor; j++) {
                if (len1 > 0) {
                    result += c1[j];
                }
                if (len2 > 0) {
                    result += c2[j];
                }
                len1--;
                len2--;
            }
            System.out.println(result);
        }

    }
}

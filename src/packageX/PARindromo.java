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
public class PARindromo {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine().replaceAll(" ", "");
            solve(line);
        }
    }

    public static void solve(String line) {
        int N = line.length();

        boolean first = false, second = false;

        for (int center = 0; center < N * 2 - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (0 <= left && right < line.length() && line.charAt(left) == line.charAt(right)) {
                int currentSize = right - left + 1;

                if (currentSize % 2 == 0) {
                    first = true;
                }

                if (currentSize % 2 == 1 && currentSize > 1) {
                    second = true;
                }

                left--;
                right++;
            }
        }

        if (first && second) {
            System.out.println("Ambos");
        } else if (first) {
            System.out.println("Par");
        } else if (second) {
            System.out.println("Impar");
        } else {
            System.out.println("Ninguno");
        }
    }
}
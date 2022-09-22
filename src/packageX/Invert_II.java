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
public class Invert_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt(); // numero de casos
        while (cases > 0) {
            int nRows = sc.nextInt(); // filas
            int nCols = sc.nextInt(); // Columnas
            int matriz[][] = new int[nRows][nCols]; // Matriz[filas][columnas]
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            printMatriz(invertMatriz(matriz, nRows, nCols));
            cases--;
        }
    }

    public static void printMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0]);
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] invertMatriz(int matriz[][], int row, int col) {
        int matrizInvert[][] = new int[row][col];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizInvert[i][j] = matriz[(matriz.length) - (i + 1)][(matriz[i].length) - (j + 1)];
            }
        }
        return matrizInvert;
    }

}

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
public class MatrizLoca {

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
                    if ((i % 2) == 0) {
                        matriz[i][j]++;
                    }
                    if ((j % 2) == 0) {
                        matriz[i][j] += 2;
                    }
                    if (((i % 2) != 0) && ((j % 2) != 0)) {
                        matriz[i][j] -= 3;
                    }
                }
            }
            printMatriz(matriz);
            cases--;
        }
    }

    public static void printMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");	// Imprime elemento 
            }
            System.out.println();	// Imprime salto de línea 
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class PresidentialElection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // numero de casos
        while (t > 0) {
            int nCols = sc.nextInt(); // Columnas   (1 <= M <= 10)
            int nRows = sc.nextInt(); // filas      (1 <= N <= 30)

            String[] candidates = new String[nCols];
            for (int i = 0; i < candidates.length; i++) {
                candidates[i] = sc.next();
            }
            int matriz[][] = new int[nRows][nCols]; // Matriz[filas][columnas]
            if (!(nRows < 1 || nRows > 30 || nCols < 1 || nCols > 10)) {
                for (int j = 0; j < matriz.length; j++) {
                    for (int k = 0; k < matriz[j].length; k++) {
                        matriz[j][k] = sc.nextInt();
                    }
                }
            }
            System.out.println(president(candidates, matriz, nCols));
            t--;
        }
    }

    public static String president(String[] st, int matriz[][], int nCols) {
        int sum = 0;
        int mayor = sumColumns(matriz, 0); 
        int indice = 0; // Indice de la columna que da la suma mas grande
        for (int i = 1; i < nCols; i++) {
            int sumCol = sumColumns(matriz,i);
            if (mayor < sumCol) {
                mayor = sumCol;
                indice = i;
            }
        }
        return st[indice];
    }

    public static int sumColumns(int matriz[][], int column) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            sum += matriz[i][column];
        }
        return sum;
    }

}

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
public class divirtamonosMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 1;
        int cases = sc.nextInt();
        while (cases > 0) {
            int x = sc.nextInt();
            int[][] m = new int[x][x];
            for (int i = 0; i < x; i++) {
                String s = sc.next();
                char[] c = s.toCharArray();
                for (int j = 0; j < m.length; j++) {
                    m[i][j] = c[j] - '0';
                }
            }
            int n = sc.nextInt();
            while (n > 0) {
                String op = sc.next();//operation

                switch (op) {
                    case "fila":
                        int a1 = sc.nextInt();
                        int b1 = sc.nextInt();
                        m = filaAB(m, a1 - 1, b1 - 1);
                        break;
                    case "columna":
                        int a2 = sc.nextInt();
                        int b2 = sc.nextInt();
                        m = columnaAB(m, a2 - 1, b2 - 1);
                        break;
                    case "inc":
                        m = inc(m);
                        break;
                    case "dec":
                        m = dec(m);
                        break;
                    case "transponer":
                        m = transponer(m);
                        break;
                    default:
                        break;
                }
                n--;
            }
            System.out.println("Case #" + aux);
            printMatriz(m);
            System.out.println("");
            aux++;
            cases--;
        }
    }

    public static void printMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0]);
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);	// Imprime elemento 
            }
            System.out.println();	// Imprime salto de linea 
        }
    }

    private static int[][] filaAB(int[][] matriz, int filaA, int filaB) {
        int[] fila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            fila[i] = matriz[filaB][i];
            matriz[filaB][i] = matriz[filaA][i];
            matriz[filaA][i] = fila[i];
        }

        return matriz;
    }

    private static int[][] columnaAB(int[][] matriz, int colA, int colB) {
        int[] columna = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            columna[i] = matriz[i][colB];
            matriz[i][colB] = matriz[i][colA];
            matriz[i][colA] = columna[i];
        }

        return matriz;
    }

    private static int[][] inc(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 9) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j]++;
                }
            }
        }
        return matriz;
    }

    private static int[][] dec(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    matriz[i][j] = 9;
                } else {
                    matriz[i][j]--;
                }
            }
        }
        return matriz;
    }

    private static int[][] transponer(int[][] matriz) {
        int[][] matriz2 = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }

        return matriz2;
    }
}
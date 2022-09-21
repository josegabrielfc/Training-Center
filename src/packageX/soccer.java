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
public class soccer {

    public static final int COUNT = 5;

    public static int[] values;
    public static int[] perm;
    public static boolean[] used;

    private static void check_and_print() { // verifica si la permutacion es correcta
        /*  Suponiendo que nos dan los numeros en orden ya, se hacen las comparaciones
	        perm[1] = MP
		perm[2] = W
		perm[3] = D
		perm[4] = L
		perm[5] = Pts
         */

        if (perm[1] != (perm[2] + perm[3] + perm[4])) { //Si el numero de partidos jugados es diferente a la suma de wins, defeat and draw; se sale del metodo ha realizar lo otro
            return;                                  // En cambio si es igual, no entra al if, y pasa a la siguiente condicion
        }
        if (perm[5] != ((3 * perm[2]) + perm[3])) { // Si la cantidad de puntos es igual a (3 * numero de wins) + numero de draws, entonces no entra al if, y pasa a imprimir
            return;
        }

        System.out.println(perm[1] + " " + perm[2] + " " + perm[3] + " " + perm[4] + " " + perm[5]); // Ya que el input, va a ser el mismo output

        System.exit(0);

    }

    
    
    
    private static void gen_perm(int position) { // genera las permutaciones
        if (position > COUNT) {
            check_and_print();
            return;
        }

        for (int j = 1; j <= COUNT; ++j) {
            if (!used[j]) {
                used[j] = true;
                perm[position] = values[j];
                gen_perm(position + 1);
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        values = new int[COUNT + 1]; // [0] no se usa
        perm = new int[COUNT + 1]; // [0] no se usa
        used = new boolean[COUNT + 1]; // [0] no se usa

        for (int n = 1; n <= COUNT; ++n) {
            values[n] = input.nextInt();
        }

        Arrays.fill(used, false); // Llena todo el array "used" con valores "false" used[0] = false, used[1] = false ..... used[5] = false;
        gen_perm(1);

    }

}

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
public class numberDividersSolution {

    static Stack<Short> st = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        sc.close();
        if (!(n < 0 || n > 100)) {
            calcPotency(n);
            while (!st.isEmpty()) {
                System.out.println(st.pop());
            }
        }
    }

    public static int calcPotency(int num) {
        short x = 1;
        if (num == 0) {
            st.push(x);
            return 1;
        }
        num++;
        while (num > 0) {
            x = (short) Math.pow(num, 2);
            st.push(x);
            num--;
        }
        return num; //Retorna 0
    }

}

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
public class InvertOptimizado {

    static Stack<Byte> st = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Byte n = sc.nextByte();
        if (!(n < 1 || n > 100)) {
            while (n > 0) {
                st.push(sc.nextByte());
                n--;
            }
        }
        while (!(st.isEmpty())) {
            System.out.println(st.pop());
        }
    }
}

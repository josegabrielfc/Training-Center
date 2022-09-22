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
public class Brackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "";
        if (!(n < 1 || n > 100)) {
            while (n > 0) {
                s = sc.next();
                System.out.println(balancedBrackets(s));
                n--;
            }
        }
    }

    public static String balancedBrackets(String word) {
        char open = '(';
        //char close = ')';
        int balance = 0;
        int aux = 0;
        for (char c1 : word.toCharArray()) {
            if (c1 == open) {
                aux = 1;
            } else {
                aux = -1;
            }
            balance += aux; // si es '(' balance += (1)  /  si es ')' balance += (-1)
            if (balance < 0) { //  los parentesis cerrado daran < 0
                break;
            }
        }
        if (balance == 0) {
            return "CORRECTO";
        }
        return "INCORRECTO";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.*;
import java.math.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class numberDividers {

    static Stack<Integer> st = new Stack();
    static Stack<Long> st2 = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (!(n < 0 || n > 11)) { //Numero maximo para trabajar con Integer es 11, ya que 12 es mas grande que 2147483647
            calcPotency(n);
            while (!st.isEmpty()) {
                System.out.println(calcDividers(st.pop()));
            }
        } else {
            calcBigPotency(n);
            while (!st2.isEmpty()) {
                System.out.println(calcDividersLong(st2.pop()));
            }
        }
    }

    public static int calcDividers(int num) {
        int dividers = 1;
        if (num == 1) {
            return dividers;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                dividers++;
            }
        }
        return dividers;
    }

    public static void calcPotency(int num) {
        int x = 0;
        while (num >= 0) {
            x = (int) Math.pow(6, num);
            st.push(x);
            num--;
        }
    }

    public static void calcBigPotency(int num) {
        long x = 0;
        while (num >= 0) {
            x = (long) Math.pow(6, num);
            st2.push(x);
            num--;
        }
    }

    public static int calcDividersLong(long num) {
        int dividers = 1;
        if (num == 1) {
            return dividers;
        }
        for (long i = 1; i < num; i++) {
            if (num % i == 0) {
                dividers++;
            }
        }
        return dividers;
    }

    int potency(int a, int n) { //Si n es par:    a^n = ( a^(n/2) )^2    , Si n es impar:    a^n = ( a^((n-1)/2) )^2 
        if (n == 0) {
            return 1;
        }
        int x = potency(a, n / 2);
        if (n % 2 == 0) {
            return x * x;
        }
        return x * x * a;
    }
}

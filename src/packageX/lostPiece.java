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
public class lostPiece {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = 1 ;
        boolean valid = n!= 0;
        while (valid) {
            n = sc.nextInt();
            if (n != 0) {
                int[] numbers = new int[n-1];

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = sc.nextInt();
                }
                System.out.println(missingNumber(n, numbers));
            }
            else valid = false;
        }
    }

    public static int missingNumber(int numMax, int[] nums) {

        int total = (numMax * (numMax + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < numMax - 1; i++) {
            sum += nums[i];
        }

        return (total - sum);
    }

}

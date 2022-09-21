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
public class CommonWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte cases = sc.nextByte();
        byte aux = cases;
        String[] ans = new String[cases];
        while (aux + 1 > 0) {
            String word = sc.nextLine();
            String[] separador = word.split(" ");
            for (int i = 0; i < cases; i++) {
                ans[i] = biggestWord(separador);
            }
            aux--;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    private static String biggestWord(String[] txt) {
        int sizeWord = 0, count = 0, contador = 0;
        String[] parrafo = new String[txt.length - 1]; // Integer.parseInt(txt[0])
        for (int i = 1; i < txt.length; i++) {
            count = countLetters(txt[i]);
            if (sizeWord < count) {
                sizeWord = count;
                contador = i;
            }
            /*if(sizeWord == count){
                
            }*/
        }

        return txt[contador];
    }

    private static int countLetters(String letter) {
        char[] arr = letter.toCharArray();
        return arr.length;
    }
    private static void print (String word){
        
    }
}

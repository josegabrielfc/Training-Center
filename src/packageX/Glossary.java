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
public class Glossary {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            solve();
            System.out.println("-");
            t--;
        }
    }

    public static void solve() {
        int num = sc.nextInt();
        String word = "";
        Set<String> s = new TreeSet();

        while (num > 0) {
            word = sc.next();
            if (!Character.isAlphabetic(word.charAt(word.length() - 1))) {
                word = word.substring(0, word.length() - 1);
            }
            s.add(word);
            num--;
        }
        word = sc.next();

        s.forEach(System.out::println);
    }

}

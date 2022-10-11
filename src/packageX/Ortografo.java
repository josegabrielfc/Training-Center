package packageX;

import java.util.*;

/**
 *
 * @author GAMER
 */
public class Ortografo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String word1 = sc.next();
            String word2 = sc.next();
            byte count = 0;
            char[] c1 = word1.toCharArray();
            char[] c2 = word2.toCharArray();

            for (int i = 0; i < c1.length; i++) {
                String aux1 = String.valueOf(c1[i]);
                String aux2 = String.valueOf(c2[i]);
                if (!aux1.equals(aux2)) {
                    count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
}

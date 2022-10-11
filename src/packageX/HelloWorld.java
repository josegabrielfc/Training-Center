package packageX;

import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class HelloWorld {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String personas[] = new String[num];

        for (int i = 0; i < num; i++) {
            personas[i] = sc.next();
        }
        int cont = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (personas[i].equals(personas[j])) {
                    cont++;
                }
            }
            if (cont != 0) {
                cont = 0;
            } else {
                System.out.println("Hola " + personas[i]);
            }
        }
    }
}

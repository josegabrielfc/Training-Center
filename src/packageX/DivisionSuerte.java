import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cases = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int aux = cases.length;
            String ans = "NO";
            for (int i = 0; i < aux; i++) {
                if (divide(n, cases[i])) {
                    ans = "SI";
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    private static boolean divide(int n, int d) {
        return n % d == 0;
    }
}
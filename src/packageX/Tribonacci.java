
import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static long solve(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }

        long a = 0;
        long b = 0;
        long c = 1;
        long d = 0;
        for (int i = 4; i <= n; i++) {
            d = (a + b + c) % 1000000007;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

}

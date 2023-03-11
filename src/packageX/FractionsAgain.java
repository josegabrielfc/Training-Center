
import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            ArrayList<Pair> pairs = new ArrayList<>();

            // Encontramos todos los pares (x, y)
            for (int x = k + 1; x <= 2 * k; x++) {
                if ((k * x) % (x - k) == 0) {
                    int y = (k * x) / (x - k);
                    pairs.add(new Pair(x, y));
                }
            }

            System.out.println(pairs.size());
            for (Pair pair : pairs) {
                System.out.println("1/" + k + " = 1/" + pair.y + " + 1/" + pair.x);
            }
        }
    }
}

class Pair {

    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

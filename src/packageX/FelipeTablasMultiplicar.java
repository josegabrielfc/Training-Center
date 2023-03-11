import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose Gabriel Fuentes
 */
public class Main{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //tablas();     1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 24, 25, 27, 28, 30, 32, 35, 36, 40, 42, 45, 48, 49, 54, 56, 63, 64, 72, 81
        int arr[] = {10, 12, 14, 15, 16, 18, 20, 21, 24, 25, 27, 28, 30, 32, 35, 36, 40, 42, 45, 48, 49, 54, 56, 63, 64, 72, 81}; //omito los digitos porque los evaluare en 1 condicion
        String str = "";
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num > 81) {
                str = "No";
            } else if (num < 10) {
                str = "Si";
            } else {
                boolean valid = binarySearch(arr, 0, arr.length - 1, num);
                if (valid) {
                    str = "Si";
                } else {
                    str = "No";
                }
            }
            System.out.println(str);
        }
    }

    private static boolean binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return false;
    }

    private static void tablas() { //Metodo para encontrar todos los posibles resultados que hay para el problema
        int mul = 0;
        int[] arr = new int[81];
        int temp = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                mul = i * j;
                arr[temp] = mul;
                temp++;
                //System.out.println(mul);
            }
        }
        Arrays.sort(arr);
        int sorted[] = removeDuplicates(arr);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ",");
        }
    }

    private static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}

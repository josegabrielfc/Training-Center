/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

/**
 *
 * @author GAMER
 */
/**
 * Fourty Five Problems AyDA Tarea terminada de preparar mientras nuestros 4
 * equipos compiten en la XXXVI Maratón Nacional ACIS/Redis
 *
 * 45 problemas sencillos para analizar la complejidad
 *
 * @author Milton Jesus Vera Contreras miltonjesusvc@ufps.edu.co
 * @version 2022-09-16
 */
public class FourtyFiveProblems {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int num = 1000000000; //Cantidad de datos
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        int x = (int) (Math.random() * 100);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Duración de " + num + " datos: " + endTime + 
                            "\nResultado del metodo: " + a8(a, x));
    }

    int a1(int m) {
        int r = -1;
        int p = m;
        do {
            if (p % 3 != 0) {
                p--;
            } else {
                p /= 3;
            }
            r++;
        } while (p != 0);
        return r;
    }

    int a2(int k) {
        int r = -1;
        int q = k;
        while (q != 0) {
            if (q % 3 != 0) {
                q--;
            } else {
                q /= 3;
            }
            r++;
        }
        return r;
    }

    int a3(int w) {
        int r = -1;
        for (int s = w; s != 0; r++) {
            if (s % 3 != 0) {
                s--;
            } else {
                s /= 3;
            }
        }
        return r;
    }

    int a4(int[] a, int x) {
        int r = -1;
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                r = i;
            }
        }
        return r;
    }

    int a5(int[] a, int x) {
        int r = 0, s = -1;
        while (r != s && r < a.length) {
            s = r;
            if (x != a[r]) {
                r++;
            }
        }
        return r;
    }

    int a6(int[] a, int x) {
        int r = -1;
        for (int i = 0; r == -1 && i < a.length; i++) {
            if (x == a[i]) {
                r = i;
            }
        }
        return r;
    }

    int a7(int[] a, int x) {
        int r = -1, i = 0;
        while (i < a.length) {
            if (x == a[i++]) {
                r = i;
            }
        }
        return r;
    }

    static int a8(int[] a, int x) { // O(1) 1 1 = 2
        int r = -1, i = 0; // O(1) 1 1    1 1 = 4                       creacion y asignacion
        do {    // 
            if (x == a[i++]) { // O(1) + O(n)    1 1 1 = 3                                  comparacion, llamado de a, incremento 
                r = i; // O(1)+ O(n)
            }
        } while (i < a.length);// O(n), (n = a.length)                     se suma 1, por la instruccion del do que se hara minimo 1 vez
        return r;
    }

    void a9(int a[]) {
        int tmp = 0;
        for (int r = 0; r < a.length - 1; r++) {
            for (int s = r + 1; s < a.length; s++) {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
            }
        }
    }

    void a10(int a[]) {
        int tmp = 0, r = 0, s = 0;
        while (r < a.length - 1) {
            s = r + 1;
            while (s < a.length) {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            }
            r = r + 1;
        }
    }

    void a11(int a[]) {
        int tmp = 0, r = 0, s = 0;
        do {
            s = r + 1;
            do {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            } while (s < a.length);
            r = r + 1;
        } while (r < a.length - 1);
    }

    void a12(int a[]) {
        int tmp = 0, r = 0, s = 0;
        do {
            s = r + 1;
            while (s < a.length) {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            }
            r = r + 1;
        } while (r < a.length - 1);
    }

    void a13(int a[]) {
        int tmp = 0, r = 0, s = 0;
        while (r < a.length - 1) {
            s = r + 1;
            do {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            } while (s < a.length);
            r = r + 1;
        }
    }

    void a14(int a[]) {
        int tmp = 0, s = 0;
        for (int r = 0; r < a.length - 1; r++) {
            s = r + 1;
            while (s < a.length) {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            }
        }
    }

    void a15(int a[]) {
        int tmp = 0, s = 0;
        for (int r = 0; r < a.length - 1; r++) {
            s = r + 1;
            do {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
                s++;
            } while (s < a.length);
        }
    }

    void a16(int a[]) {
        int tmp = 0, r = 0;
        do {
            for (int s = r + 1; s < a.length; s++) {
                if (a[s] < a[r]) {
                    tmp = a[s];
                    a[s] = a[r];
                    a[r] = tmp;
                }
            }
            r = r + 1;
        } while (r < a.length - 1);

    }

    void a17(int a[]) {
        int j = 0, k = 0;
        for (int i = 1; i < a.length; i++) {
            k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
        }
    }

    void a18(int a[]) {
        int j = 0, k = 0;
        for (int i = 1; i < a.length; i++) {
            k = a[i];
            j = i - 1;
            for (j = i - 1; j >= 0 && a[j] > k; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = k;
        }
    }

    void a19(int a[]) {
        int i = 1, j = 0, k = 0;
        while (i < a.length) {
            k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
            i++;
        }
    }

    void a20(int a[]) {
        int i = 1, j = 0, k = 0;
        do {
            k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
            i++;
        } while (i < a.length);
    }

    void a21(int l[]) {
        int tmp = 0;
        for (int r = l.length - 1; r > 0; r--) {
            for (int s = r - 1; s >= 0; s--) {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
            }
        }
    }

    void a22(int l[]) {
        int tmp = 0;
        int r = l.length - 1, s = 0;
        while (r > 0) {
            s = r - 1;
            while (s >= 0) {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
                s--;
            }
            r--;
        }
    }

    void a23(int l[]) {
        int tmp = 0;
        int r = l.length - 1, s = 0;
        do {
            s = r - 1;
            while (s >= 0) {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
                s--;
            }
            r--;
        } while (r > 0);
    }

    void a24(int l[]) {
        int tmp = 0;
        int r = l.length - 1, s = 0;
        while (r > 0) {
            s = r - 1;
            do {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
                s--;
            } while (s >= 0);
            r--;
        }
    }

    void a25(int l[]) {
        int tmp = 0;
        int r = l.length - 1, s = 0;
        do {
            s = r - 1;
            do {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
                s--;
            } while (s >= 0);
            r--;
        } while (r > 0);
    }

    void a26(int l[]) {
        int tmp = 0;
        int r = l.length - 1;
        do {
            for (int s = r - 1; s >= 0; s--) {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
            }
            r--;
        } while (r > 0);
    }

    void a27(int l[]) {
        int tmp = 0;
        int r = l.length - 1;
        while (r > 0) {
            for (int s = r - 1; s >= 0; s--) {
                if (l[s] < l[r]) {
                    tmp = l[s];
                    l[s] = l[r];
                    l[r] = tmp;
                }
            }
            r--;
        }
    }

    boolean a28(char a[]) {
        boolean r = true;
        for (int i = 0; r && i < a.length / 2; i++) {
            r = a[i] == a[a.length - 1 - i];
        }
        return r;
    }

    boolean a29(char a[]) {
        boolean r = true;
        int i = 0;
        while (r && i < a.length / 2) {
            r = a[i] == a[a.length - 1 - i];
            i++;
        }
        return r;
    }

    boolean a30(char a[]) {
        boolean r = true;
        int i = 0;
        do {
            r = a[i] == a[a.length - 1 - i];
            i++;
        } while (r && i < a.length / 2);
        return r;
    }

    boolean a31(char a[]) {
        boolean r = true;
        for (int i = a.length / 2 - 1; r && i >= 0; i--) {
            r = a[i] == a[a.length - 1 - i];
        }
        return r;
    }

    int a32(int[] a, int x) {
        int l = 0, r = a.length - 1;
        int p = -1;

        while (p == -1 && l <= r) {
            int m = (int) Math.floor((l + r) / 2);
            int e = a[m];

            if (x == m) {
                p = m;
            }

            if (x < e) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return p;
    }

    int a33(int[] a, int x) {
        int l = 0, r = a.length - 1;
        int p = -1;

        do {
            int m = (int) Math.floor((l + r) / 2);
            int e = a[m];

            if (x == m) {
                p = m;
            }

            if (x < e) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        } while (p == -1 && l <= r);
        return p;
    }

    int a34(int[] a, int x) {
        int l = 0, r = a.length - 1;
        int p = -1;

        while (p == -1 && l <= r) {
            int m = (int) Math.floor((r + l) / 2);
            int e = a[m];

            if (m == x) {
                p = m;
            }

            if (x > e) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return p;
    }

    int a35(int[][] m, int x) {
        int a = -1;
        int t = -1, r = 0, c = 0;
        if (m.length == m[0].length) {
            t = m.length * m[0].length;
        }
        for (int p = 0; a == -1 && p < t; p++) {
            r = p / m.length;
            c = p % m.length;
            if (m[r][c] == x) {
                a = p;
            }
        }
        return a;
    }

    int a36(int[][] m, int x) {
        int a = -1;
        int t = -1, r = 0, c = 0, p = 0;
        if (m.length == m[0].length) {
            t = m.length * m[0].length;
        }
        while (a == -1 && p < t) {
            r = p / m.length;
            c = p % m.length;
            if (m[r][c] == x) {
                a = p;
            }
            p++;
        }
        return a;
    }

    int a37(int[][] m, int x) {
        int a = -1;
        int t = -1, r = 0, c = 0, p = 0;
        if (m.length == m[0].length) {
            t = m.length * m[0].length;
        }
        do {
            r = p / m.length;
            c = p % m.length;
            if (m[r][c] == x) {
                a = p;
            }
            p++;
        } while (a == -1 && p < t);
        return a;
    }

    int a38(int x) {
        int y = -1;
        for (int z = x; z != 0; y++) {
            if (z % 3 != 0) {
                z--;
            } else {
                z /= 3;
            }
        }
        return y;
    }

    int a39(int e, int[] l) {
        int a = -1;
        for (int u = l.length - 1; a == -1 && u >= 0; u--) {
            if (e == l[u]) {
                a = u;
            }
        }
        return a;
    }

    boolean a40(char l[]) {
        boolean a = true;
        for (int i = l.length / 2 - 1; a && i >= 0; i--) {
            a = l[i] == l[l.length - 1 - i];
        }
        return a;
    }

    boolean a41(char l[]) {
        boolean a = true;
        int i = l.length / 2 - 1;
        while (a && i >= 0) {
            a = l[i] == l[l.length - 1 - i];
            i--;
        }
        return a;
    }

    boolean a42(char l[]) {
        boolean a = true;
        int i = l.length / 2 - 1;
        do {
            a = l[i] == l[l.length - 1 - i];
            i--;
        } while (a && i >= 0);
        return a;
    }

    int a43(int[][] mx, int x) {
        int t = mx.length * mx[0].length;
        int l = 0, r = t - 1;
        int p = -1, ir = 0, ic = 0, e = 0, m = 0;

        while (p == -1 && l <= r) {
            m = (int) Math.floor((l + r) / 2);

            ir = m / mx.length;
            ic = m % mx.length;

            e = mx[ir][ic];

            if (x == e) {
                p = m;
            }

            if (x < e) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return p;
    }

    int a44(int[][] mx, int x) {
        int t = mx.length * mx[0].length;
        int l = 0, r = t - 1;
        int p = -1, ir = 0, ic = 0, e = 0, m = 0;

        do {
            m = (int) Math.floor((l + r) / 2);

            ir = m / mx.length;
            ic = m % mx.length;

            e = mx[ir][ic];

            if (x == e) {
                p = m;
            }

            if (x < e) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        } while (p == -1 && l <= r);
        return p;
    }
}

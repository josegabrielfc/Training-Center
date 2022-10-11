/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageX;

import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class carritoCompras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte cases = sc.nextByte();

        while (cases > 0) {
            int cant = sc.nextInt();
            HashMap<String, Integer> carrito = new HashMap<String, Integer>();
            int result = 0;
            for (int i = 0; i < cant; i++) {
                carrito.put(sc.next(), sc.nextInt());
            }

            int compra = sc.nextInt();

            for (int i = 0; i < compra; i++) {
                String producto = sc.next();
                int cantidad = sc.nextInt();

                result += carrito.get(producto) * cantidad;
            }
            System.out.println(result);
            cases--;
        }

    }
}
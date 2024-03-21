/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttltm;

import java.util.Scanner;

/**
 *
 * @author Peggy
 */
public class bai9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n = ");
        int n = scanner.nextInt();
        System.out.print("Số Fibonacci thứ n là: ");
        System.out.println(fibonacci(n));
        System.out.print("Các số fibonacci nhỏ hơn n và là số nguyên tố: ");
        for(int i = 0; fibonacci(i) < n; i++)
        {
            int fi = fibonacci(i);
            if (soNguyenTo(fi)) {
                System.out.print(fi + " ");
            }
        }
    }

    public static int fibonacci(int n) {
        if (n < 1) {
            return -1;
        } else if (n == 1 || n == 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // 6
        }
    }

    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

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
public class Bai7 {

    public static boolean soHH(int a) {
        int tong = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                tong += i;
            }
        }
        return tong == a;
    }

    public static boolean soNGto(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void HienThisHH(int[] a, int n) {
        System.out.println("\nCAC SO HOAN HAO");
        for (int i = 1; i <= n; i++) {
            if (soHH(a[i - 1])) {
                System.out.print(a[i - 1] + " ");
            }
        }
    }

    public static void HienThisoNGto(int[] a, int n) {
        System.out.println("\nCAC SO NGUYEN TO");
        for (int i = 1; i <= n; i++) {
            if (soNGto(a[i - 1])) {
                System.out.print(a[i - 1] + " ");
            }
        }
    }

    public static void hienthisoChan(int[] a, int n) {
        System.out.println("\nCAC SO CHAN LA ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        HienThisoNGto(a, n);
        HienThisHH(a, n);
        hienthisoChan(a, n);
    }
}

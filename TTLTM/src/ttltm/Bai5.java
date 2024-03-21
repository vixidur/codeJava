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
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập vị trí cần xóa: ");
        int k = sc.nextInt();
        for (int i = k - 1; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        System.out.println("Mảng sau khi xóa là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

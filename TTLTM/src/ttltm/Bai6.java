/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttltm;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Peggy
 */
public class Bai6 {

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
        Arrays.sort(a);
        System.out.print("Mảng sau khi được sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Phần tử có giá trị nhỏ nhất là:" + min);
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }
        double avg = (double) tong / dem;
        System.out.println("Trung bình cộng các phần tử chia hết cho ba là:" + avg);
    }
}

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
public class Bai8 {

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
        System.out.println();
        insertionSort(a, n);
        System.out.println("\nMảng sau khi sắp  xếp tăng dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            /*
                vi du n = 5
                i chay tu 1 den n - 1
            */
            int temp = a[i];
            int j = i - 1;
            /* Di chuyển các phần tử của mảng a, 
            lớn hơn temp, về một vị trí trước vị trí hiện tại  */
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}

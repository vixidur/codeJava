/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_tranvanchien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các số nguyên (nhập 'q' để kết thúc):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("Các số đã nhập:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

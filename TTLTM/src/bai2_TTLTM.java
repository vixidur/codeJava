/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class bai2_TTLTM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem la:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.print("Phuong trinh co nghiem kep: ");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
}

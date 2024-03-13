/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class bai4_TTLTM {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int UCLN (int a, int b){
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public int BCNN (int a, int b) {
        return a*b/UCLN(a, b);
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
    }

    public static void main(String[] args) {
        bai4_TTLTM t = new bai4_TTLTM();
        t.nhap();
        System.out.println("UCLN: " +t.UCLN(t.getA(), t.getB()));
        System.out.println("BCNN: " +t.BCNN(t.getA(), t.getB()));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ttltm;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TTLTM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b, max, min;
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        max = (a > b) ? a:b;
        min = (a < b) ? a:b;
        System.out.println("Max cua 2 so "+a+" va "+b+" la so: " + max);
        System.out.print("Min cua 2 so "+a+" va "+b+" la so: " + min);
        System.out.println();
    }
}

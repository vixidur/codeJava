/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tranvanchien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai2_TRANVANCHIEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhap phep tinh [+, -, *, /]: ");
        char t = scanner.next().charAt(0);
        double KQ = 0.0;
        switch (t) {
            case '+':
                KQ = a + b;
                break;
            case '-':
                KQ = a - b;
                break;
            case '*':
                KQ = a * b;
                break;
            case '/':
                if (b != 0) {
                    KQ = a / b;
                } else {
                    System.out.println("Không thể chia cho 0.");
                    return;
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ.");
                return;
        }
        System.out.println("Ket qua la: " + KQ);
    }
}

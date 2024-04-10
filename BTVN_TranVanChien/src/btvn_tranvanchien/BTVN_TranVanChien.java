/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_tranvanchien;

import java.util.ArrayList;
import java.util.Scanner;
//import java.lang.Integer;
/**
 *
 * @author Admin
 */
public class BTVN_TranVanChien {
    public class a {
        public static int doiChuoi(String s) throws NumberFormatException {
            return Integer.parseInt(s);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (;;) { // for(;;) = while(true)
            System.out.print("Nhap so nguyen (Tiep Tuc ? [Yes/No]): ");
            String nhap = sc.nextLine();
            if (nhap.equals("no")) { // nhap == "no" -> break
                break;
            }else {
                if(nhap.equals("yes")) { // nhap == "yes" -> continue
                    continue;                  
                }
                int number;
                number = a.doiChuoi(nhap); // chuyen doi string thanh int vao ArrayList
                A.add(number);  
            }
        }
        System.out.println("MANG BAN DAU: " + A);
        //[16, 16, 16, yes, 2, 3, no] -> [16, 16, 16, 2, 3]
        // sap xep tang dan
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - i - 1; j++) {
                if (A.get(j) > A.get(j + 1)) {
                    int temp = A.get(j);
                    A.set(j, A.get(j + 1));
                    A.set(j + 1, temp);
                }
            }
        }
        System.out.println("MANG SAU KHI SAP XEP: " + A);
        System.out.print("NHAP SO CAN TIM: ");
        int timSo = sc.nextInt();
        int cnt = 0;
        for (int number : A) {
            if (number == timSo) {
                cnt++;
            }
        }
        System.out.println("SO " + timSo + " XUAT HIEN " + cnt + " LAN TRONG ArrayList");
    }
}

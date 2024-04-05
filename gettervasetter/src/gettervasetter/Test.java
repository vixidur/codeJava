package gettervasetter;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package gettervasetter;
/**
 *
 * @author Peggy
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hocSinh_TranVanChien hs1 = new hocSinh_TranVanChien();
        System.out.println("Thong tin hoc sinh 1");
        System.out.print(" Ma HS: ");
        String mahs = sc.next();
        System.out.print("Ten HS: ");
        String tenhs = sc.next();
        hs1.setMaHS(mahs);
        hs1.setTenHS(tenhs);
        System.out.println();
        System.out.println("IN RA THONG TIN HOC SINH 1");
        System.out.println(" Ma hoc sinh la: " + hs1.getMaHS());
        System.out.println("Ten hoc sinh la: " + hs1.getTenHS());
        System.out.println("THONG TIN HOC SINH 2");
        hocSinh_TranVanChien hs2 = new hocSinh_TranVanChien("A002", "Vo Quoc Viet");
        System.out.println("Ma hoc sinh 2 la: " + hs2.getMaHS());
        System.out.println("Ten hoc sinh 2 la: " + hs2.getTenHS());
    }
}

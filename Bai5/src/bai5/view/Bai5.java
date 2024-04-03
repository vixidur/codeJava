/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5.view;

import bai5.controller.QuanLySach;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int choose;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        do {
            menu();
            System.out.print("\t\t[?] Lua chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Nhap so luong tai lieu: ");
                    n1 = sc.nextInt();
                    sc.nextLine();
                    quanLySach.nhapTaiLieuSach(n1, sc);
                    break;
                case 2:
                    System.out.print("Nhap so luong tai lieu: ");
                    n2 = sc.nextInt();
                    sc.nextLine();
                    quanLySach.nhapTaiLieuBao(n2, sc);
                    break;
                case 3:
                    System.out.print("Nhap so luong tai lieu: ");
                    n3 = sc.nextInt();
                    sc.nextLine();
                    quanLySach.nhapTaiLieuTapChi(n3, sc);
                    break;
                case 4:
                    System.out.println("-------------------------------------------");
                    System.out.println("\t\t|> THONG TIN TAI LIEU SACH <|");
                    quanLySach.hienThiTaiLieuSach(n1);
                    System.out.println("-------------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    System.out.println("\t\t|> THONG TIN TAI LIEU BAO <|");
                    quanLySach.hienThiTaiLieuBao(n2);
                    System.out.println("-------------------------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------------------------");
                    System.out.println("\t\t|> THONG TIN TAI LIEU TAP CHI <|");
                    quanLySach.hienThiTaiLieuTapChi(n3);
                    System.out.println("-------------------------------------------");
                    break;
                case 7:
                    // Tìm kiếm theo loại tài liệu
                    System.out.print("Nhap loai tai lieu muon hien thi (sach, bao, tapchi): ");
                    String loai = sc.next().toLowerCase();
                    quanLySach.timKiemTheoLoai(loai);
                    break;
                case 8:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String tenTacGia = sc.nextLine();
                    quanLySach.timKiemTheoTacGia(tenTacGia);
                    break;
                case 9:
                    System.out.print("Nhap ten tac gia can tim gan dung: ");
                    String tenTacGiaCanTim = sc.nextLine();
                    quanLySach.timKiemGanDungTacGia(tenTacGiaCanTim);
                    break;
                case 10:
                    System.out.print("Nhap loai tai lieu muon hien thi (sach, bao, tapchi): ");
                    String loaiTaiLieu = sc.next().toLowerCase();
                    quanLySach.hienThiTheoLoai(loaiTaiLieu);
                    break;

                case 11:
                    System.out.println("Thoat...");
                    break;
                default:
                    System.out.println("\tKhong hop le. Vui long nhap tu 1 - 11");
            }
        } while (choose != 11);

        sc.close();
    }

    private static void menu() {
        // a. nhap thong tin
        System.out.println("1.  Nhập Thông Tin Tài Liệu Sách Mới");
        System.out.println("2.  Nhập Thông Tin Tài Liệu Báo Mới");
        System.out.println("3.  Nhập Thông Tin Tài Liệu Tạp Chí Mới");
        // b. hien thi thong tin
        System.out.println("4.  Hiển Thị Thông Tin Tài Liệu Sách Mới");
        System.out.println("5.  Hiển Thị Thông Tin Tài Liệu Báo Mới");
        System.out.println("6.  Hiển Thị Thông Tin Tài Liệu Tạp Chí Mới");

        // c. Tim kiem theo loai giả sử có 3 loại và muốn tìm loại bất kỳ trong 3 loại ` Sách, Báo, Tạp Chí `
        System.out.println("7.  Tìm kiếm tài liệu theo loại");
        System.out.println("8.  Tìm kiếm tài liệu theo tên tác giả"); // loai sach
        System.out.println("9.  Tìm kiếm tài liệu theo tên tác giả gần đúng");
        System.out.println("10. Hiển thị danh sách về các loại tài liệu theo chỉ định người dùng");
        System.out.println("11. Thoát");
    }
}

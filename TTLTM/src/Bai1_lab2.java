/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Bai1_lab2 {

    public static void ProductMenu() {
        System.out.println("1. Nhap thong tin n san pham");
        System.out.println("2. Hien thi thong tin vua nhap");
        System.out.println("3. Sap xep thong tin giam dan theo gia");
        System.out.println("4. Thoat");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int choose;
        int n = 0;
        Product[] prd = null;

        do {
            ProductMenu();
            System.out.print("\t[?] Lua chon: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1 -> {
                    System.out.print("Nhap n san pham: ");
                    n = sc.nextInt();
                    prd = new Product[n];
                    product.nhapThongTin(prd, n, sc);
                }
                case 2 -> {
                    if (n != 0 && prd != null) {
                        product.xuatThongTin(prd, n);
                    } else {
                        System.out.println("Chua nhap thong tin san pham.");
                    }
                }
                case 3 -> {
                    if (n != 0 && prd != null) {
                        product.sapXepTheoGiaGiamDan(prd, n);
                        product.xuatThongTin(prd, n);
                    } else {
                        System.out.println("Chua nhap thong tin san pham.");
                    }
                }
                case 4 -> System.out.println("Ket thuc chuong trinh.");
                default -> System.out.println("Lua chon khong hop le. Vui long nhap lai.");
            }

        } while (choose != 4);

        sc.close();
    }

    public static class Product {

        private String tenHangHoa;
        private String nhaSanXuat;
        private float giaBan;

        public void setTenHangHoa(String tenHangHoa) {
            this.tenHangHoa = tenHangHoa;
        }

        public void setNhaSanXuat(String nhaSanXuat) {
            this.nhaSanXuat = nhaSanXuat;
        }

        public void setGiaBan(float giaBan) {
            this.giaBan = giaBan;
        }

        public String getTenHangHoa() {
            return tenHangHoa;
        }

        public String getNhaSanXuat() {
            return nhaSanXuat;
        }

        public float getGiaBan() {
            return giaBan;
        }

        public void nhapThongTin(Product[] b, int n, Scanner sc) {
            for (int i = 0; i < n; i++) {
                b[i] = new Product(); // Initialize each element
                System.out.println("San pham thu " + (i + 1) + " la");
                System.out.print("Ten Hang Hoa: ");
                b[i].tenHangHoa = sc.next(); 
                System.out.print("Nha San Xuat: ");
                b[i].nhaSanXuat = sc.next(); 
                System.out.print("Gia ban: ");
                b[i].giaBan = sc.nextFloat();
            }
        }

        public void xuatThongTin(Product[] b, int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("-> San pham thu " + (i + 1) + "");
                System.out.println("\t+ Hang Hoa: " + b[i].tenHangHoa);
                System.out.println("\t+ Nha San Xuat: " + b[i].nhaSanXuat);
                System.out.println("\t+ Gia ban: " + b[i].giaBan);
            }
        }

        public void sapXepTheoGiaGiamDan(Product[] b, int n) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (b[i].giaBan < b[j].giaBan) {
                        Product temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
        }
    }
}

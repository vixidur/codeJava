/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
// TranVanChien
import java.util.Scanner;

public class bai3_TTLTM {
    public static boolean soHH(int a) {
        int tong = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                tong += i;
            }
        }
        return tong == a;
    }

    public static boolean soNGto(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    public static void HienThisHH(int a) {
        System.out.println("CAC SO HOAN HAO");
        for (int i = 1; i <= a; i++) {
            if (soHH(i)) {
                System.out.print(i + " "); 
            }
        }
    }

    public static void HienThisoNGto(int a) {
        System.out.println("CAC SO NGUYEN TO");
        for (int i = 1; i <= a; i++) {
            if (soNGto(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void tichThuaso(int a) {
        System.out.println("TICH ra THUA SO:");

        for (int i = 2; i <= a; i++) {
            int dem = 0;
            while (a % i == 0) {
                a /= i;
                dem++;
            }
            if (dem > 0 && dem == 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + "^" + dem + " * ");
            }
        }
    }

    public static void menu() {
        // Menu
        System.out.println("1. Nhap vao so nguyen duong n");
        System.out.println("2. Tinh tong cac so tu 1 den n");
        System.out.println("3. Hien thi cac so nguyen to tu 1 den n");
        System.out.println("4. Hien thi cac so hoan hao tu 1 den n");
        System.out.println("5. Hien thi so n thanh tich cac thua so nguyen to");
        System.out.println("6. Thoat");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean showMenu = true; 

        do {
            if (showMenu) {
                menu();
            }
            System.out.print("\t{?} Chon so: ");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Nhap vao so nguyen duong n: ");
                    n = sc.nextInt();
                    showMenu = false;
                    break;
                case 2:
                    int sum = 0; 
                    for(int i = 1; i <= n; i++) {
                        sum += i;
                    }
                    System.out.println("Tong cac so tu 1 den "+n+" la: "+sum);
                    break;
                case 3: {
                    HienThisoNGto(n);
                    System.out.println();
                    break;
                }
                case 4: {
                    HienThisHH(n);
                    System.out.println();
                    break;
                }
                case 5: {
                    tichThuaso(n);
                    System.out.println();
                    break;
                }
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (true); // Vòng lặp sẽ tiếp tục cho đến khi gặp lệnh break hoặc System.exit()
    }
}
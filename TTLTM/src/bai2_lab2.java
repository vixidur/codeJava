/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product{

    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;
    
    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }
    
    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã hàng hoá: ");
        this.maHH = sc.nextLine();
        System.out.print("Tên hàng hoá: ");
        this.tenHH = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextFloat();
        System.out.print("Giá bán: ");
        this.gia1SP = sc.nextFloat();
    }

    public void display() {
        System.out.println("\t+) Mã hàng hoá: " + this.maHH);
        System.out.println("\t+) Tên hàng hoá: " + this.tenHH);
        System.out.println("\t+) Số lượng là: " + this.soLuong);
        System.out.println("\t+) Giá bán là: " + this.gia1SP);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<Product> productList = new ArrayList<>();

        // Nhập thông tin cho từng sản phẩm
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            System.out.println("THÔNG TIN SẢN PHẨM THỨ " + (i + 1) + "");
            product.input();
            productList.add(product); // thêm sản phẩm 
        }
        System.out.println("\t--->IN THONG TIN VUA NHAP<---");
        // Tìm sản phẩm có giá bán cao nhất
        Product giaBanCaoNhat;
        giaBanCaoNhat = Collections.max(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Float.compare(p1.getGia1SP(), p2.getGia1SP());
            }
        });
        System.out.println("\t--->SẢN PHẨM CÓ GIÁ BÁN CAO NHẤT<---");
        giaBanCaoNhat.display();

        // Sắp xếp theo thứ tự giảm dần của giá
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Float.compare(p2.getGia1SP(), p1.getGia1SP());
            }
        });

        System.out.println("\t--->SẮP XẾP GIẢM DẦN THEO GIÁ BÁN<---");
        for (Product product : productList) {
            product.display();
        }

        // Kiểm tra xem có mặt hàng "Sữa" nào không
        boolean hasSua = false;
        for (Product product : productList) {
            if (product.getTenHH().equalsIgnoreCase("Sua")) {
                hasSua = true;
                break;
            }
        }

        if (hasSua) {
            System.out.println("\t-> DANH SÁCH HÀNG HOÁ CÓ MẶT HÀNG LÀ \"Sữa\".");
        } else {
            System.out.println("\t-> DANH SÁCH HÀNG HOÁ KHÔNG CÓ MẶT HÀNG LÀ \"Sữa\".");
        }
    }
}

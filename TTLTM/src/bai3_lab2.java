

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bai3_lab2 {

    static class Sach {

        private String tenSach;
        private String tacGia;
        private String nhaXuatBan;
        private int namXuatBan;
        private float giaBan;

        public Sach() {
        }

        public Sach(String tenSach, String tacGia, String nhaXuatBan, int namXuatBan, float giaBan) {
            this.tenSach = tenSach;
            this.tacGia = tacGia;
            this.nhaXuatBan = nhaXuatBan;
            this.namXuatBan = namXuatBan;
            this.giaBan = giaBan;
        }

        public String getTenSach() {
            return tenSach;
        }

        public void setTenSach(String tenSach) {
            this.tenSach = tenSach;
        }

        public String getTacGia() {
            return tacGia;
        }

        public void setTacGia(String tacGia) {
            this.tacGia = tacGia;
        }

        public String getNhaXuatBan() {
            return nhaXuatBan;
        }

        public void setNhaXuatBan(String nhaXuatBan) {
            this.nhaXuatBan = nhaXuatBan;
        }

        public int getNamXuatBan() {
            return namXuatBan;
        }

        public void setNamXuatBan(int namXuatBan) {
            this.namXuatBan = namXuatBan;
        }

        public float getGiaBan() {
            return giaBan;
        }

        public void setGiaBan(float giaBan) {
            this.giaBan = giaBan;
        }

        public void nhapThongTin() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên sách: ");
            this.tenSach = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            this.tacGia = sc.nextLine();
            System.out.print("Nhập nhà xuất bản: ");
            this.nhaXuatBan = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            this.namXuatBan = sc.nextInt();
            System.out.print("Nhập giá bán: ");
            this.giaBan = sc.nextFloat();
        }

        public void hienThi() {
            System.out.println("Tên Sách: " + tenSach);
            System.out.println("Tác Giả: " + tacGia);
            System.out.println("Nhà Xuất Bản: " + nhaXuatBan);
            System.out.println("Năm Xuất Bản: " + namXuatBan);
            System.out.println("Giá Bán: " + giaBan);
        }
    }

    static class SachUneti extends Sach {

        private String ngonNgu;
        private int hocKy;

        public void sort(SachUneti[] b) {
            Arrays.sort(b, Comparator.comparingInt(SachUneti::getNamXuatBan).reversed());
        }

        public void searchNameBook(SachUneti[] b, String tenSachCanTim) {
            boolean timThay = false;
            for (SachUneti sach : b) {
                if (sach.getTenSach().equalsIgnoreCase(tenSachCanTim)) {
                    System.out.println("SÁCH ĐƯỢC TÌM THẤY");
                    sach.hienThi();
                    timThay = true;
                    break;
                }
            }
            if (!timThay) {
                System.out.println("Không tìm thấy sách.");
            }
        }

        public void searchNameAuthor(SachUneti[] b, String tenTacGiaCanTim) {
            boolean timThay = false;
            for (SachUneti sach : b) {
                if (sach.getTacGia().equalsIgnoreCase(tenTacGiaCanTim)) {
                    System.out.println("CÁC CUỐN SÁCH CỦA TÁC GIẢ " + tenTacGiaCanTim + ":");
                    sach.hienThi();
                    timThay = true;
                }
            }
            if (!timThay) {
                System.out.println("Không tìm thấy sách của tác giả này.");
            }
        }

        public SachUneti() {
            super();
        }

        public SachUneti(String tenSach, String tacGia, String nhaXuatBan, int namXuatBan, float giaBan, String ngonNgu, int hocKy) {
            super(tenSach, tacGia, nhaXuatBan, namXuatBan, giaBan);
            this.ngonNgu = ngonNgu;
            this.hocKy = hocKy;
        }

        public String getNgonNgu() {
            return ngonNgu;
        }

        public void setNgonNgu(String ngonNgu) {
            this.ngonNgu = ngonNgu;
        }

        public int getHocKy() {
            return hocKy;
        }

        public void setHocKy(int hocKy) {
            this.hocKy = hocKy;
        }

        @Override
        public void nhapThongTin() {
            super.nhapThongTin();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập ngôn ngữ: ");
            this.ngonNgu = sc.nextLine();
            System.out.print("Nhập học kỳ: ");
            this.hocKy = sc.nextInt();
        }

        @Override
        public void hienThi() {
            super.hienThi();
            System.out.println("Ngôn Ngữ: " + ngonNgu);
            System.out.println("Học Kỳ: " + hocKy);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SachUneti[] sachUneti = null;
        int luaChon;
        boolean thoat = false;

        while (!thoat) {
            System.out.println("------------->MENU<-------------");
            System.out.println("1. Nhập thông tin cho n cuốn sách Uneti");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị");
            System.out.println("4. Tìm kiếm theo tên sách");
            System.out.println("5. Tìm kiếm theo tên tác giả");
            System.out.println("6. Thoát");
            System.out.print("\t[?]Lựa chọn: ");

            luaChon = sc.nextInt();
            sc.nextLine(); // Loại bỏ ký tự '\n'

            switch (luaChon) {
                case 1 -> {
                    System.out.print("Nhập số lượng sách: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine(); // Loại bỏ ký tự '\n'
                    sachUneti = new SachUneti[soLuong];
                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("THÔNG TIN CUỐN SÁCH THỨ " + (i + 1) + " ");
                        sachUneti[i] = new SachUneti();
                        sachUneti[i].nhapThongTin();
                    }
                }
                case 2 -> {
                    if (sachUneti != null) {
                        System.out.println("THÔNG TIN CÁC CUỐN SÁCH VỪA NHẬP");
                        for (SachUneti sach : sachUneti) {
                            sach.hienThi();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Chưa có sách nào được nhập.");
                    }
                }
                case 3 -> {
                    if (sachUneti != null) {
                        SachUneti[] sachUnetiCopy = Arrays.copyOf(sachUneti, sachUneti.length);
                        Arrays.sort(sachUnetiCopy, Comparator.comparingInt(SachUneti::getNamXuatBan).reversed());
                        System.out.println("SẮP XẾP GIẢM DẦN THEO NĂM XUẤT BẢN");
                        for (SachUneti sach : sachUnetiCopy) {
                            sach.hienThi();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Chưa có sách nào được nhập.");
                    }
                    break;
                }

                case 4 -> {
                    if (sachUneti != null) {
                        System.out.print("Nhập tên sách cần tìm: ");
                        String tenSachCanTim = sc.nextLine();
                        boolean timThay = false;
                        for (SachUneti sach : sachUneti) {
                            if (sach.getTenSach().equalsIgnoreCase(tenSachCanTim)) {
                                System.out.println("SÁCH ĐƯỢC TÌM THẤY");
                                sach.hienThi();
                                timThay = true;
                                break;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Không tìm thấy sách.");
                        }
                    } else {
                        System.out.println("Chưa có sách nào được nhập.");
                    }
                }
                case 5 -> {
                    if (sachUneti != null) {
                        System.out.print("Nhập tên tác giả cần tìm: ");
                        String tenTacGiaCanTim = sc.nextLine();
                        boolean timThay = false;
                        for (SachUneti sach : sachUneti) {
                            if (sach.getTacGia().equalsIgnoreCase(tenTacGiaCanTim)) {
                                System.out.println("CÁC CUỐN SÁCH CỦA TÁC GIẢ " + tenTacGiaCanTim + ":");
                                sach.hienThi();
                                timThay = true;
                            }
                        }
                        if (!timThay) {
                            System.out.println("Không tìm thấy sách của tác giả này.");
                        }
                    } else {
                        System.out.println("Chưa có sách nào được nhập.");
                    }
                }
                case 6 -> {
                    thoat = true;
                    System.out.println("Thoát chương trình.");
                }
                default ->
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        sc.close();
    }
}

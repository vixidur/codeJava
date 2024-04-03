/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5.controller;

import bai5.models.Bao;
import bai5.models.Sach;
import bai5.models.TaiLieu;
import bai5.models.TapChi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class QuanLySach {

    private TaiLieu[] danhSachTaiLieu;
    private Sach[] sach;
    private Bao[] bao;
    private TapChi[] tapChi;

    public QuanLySach() {
    }

    // Nhập tài liệu sách
    public void nhapTaiLieuSach(int n, Scanner sc) {
        danhSachTaiLieu = new TaiLieu[n];
        sach = new Sach[n];
        for (int i = 0; i < n; i++) {
            sach[i] = new Sach();
            danhSachTaiLieu[i] = sach[i];
            System.out.println("Nhap thong tin cho Tai Lieu thu " + (i + 1) + ":");
            System.out.print("Nhap ma tai lieu: ");
            danhSachTaiLieu[i].setMaTaiLieu(sc.next());
            System.out.print("Nhap ten nha xuat ban: ");
            danhSachTaiLieu[i].setTenNhaXuatBan(sc.next());
            System.out.print("Nhap so ban phat hanh: ");
            danhSachTaiLieu[i].setSoBanPhatHanh(sc.nextInt());

            System.out.println("Nhap thong tin cho Sach thu " + (i + 1) + ":");
            System.out.print("Nhap ten tac gia: ");
            sach[i].setTenTacGia(sc.next());
            System.out.print("Nhap ten sach: ");
            sach[i].setTenSach(sc.next());
            System.out.print("Nhap so trang: ");
            sach[i].setSoTrang(sc.nextInt());
        }
    }

    // Nhập tài liệu báo
    public void nhapTaiLieuBao(int n, Scanner sc) {
        danhSachTaiLieu = new TaiLieu[n];
        bao = new Bao[n]; // Sử dụng kích thước n cho mảng bao
        for (int i = 0; i < n; i++) {
            bao[i] = new Bao();
            danhSachTaiLieu[i] = bao[i];
            System.out.println("Nhap thong tin cho Tai Lieu thu " + (i + 1) + ":");
            System.out.print("Nhap ma tai lieu: ");
            danhSachTaiLieu[i].setMaTaiLieu(sc.next());
            System.out.print("Nhap ten nha xuat ban: ");
            danhSachTaiLieu[i].setTenNhaXuatBan(sc.next());
            System.out.print("Nhap so ban phat hanh: ");
            danhSachTaiLieu[i].setSoBanPhatHanh(sc.nextInt());

            System.out.println("Nhap thong tin cho Bao thu " + (i + 1) + ":");
            System.out.print("Ngay phat hanh (dd/MM/yyyy): ");
            String dateString = sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dateString, formatter);
            Instant instant = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
            Date date = Date.from(instant);
            bao[i].setNgayPhatHanh(date);
        }
    }

    // Nhập tài liệu tạp chí
    public void nhapTaiLieuTapChi(int n, Scanner sc) {
        danhSachTaiLieu = new TaiLieu[n];
        tapChi = new TapChi[n];
        for (int i = 0; i < n; i++) {
            tapChi[i] = new TapChi();
            danhSachTaiLieu[i] = tapChi[i];
            System.out.println("Nhap thong tin cho Tai Lieu thu " + (i + 1) + ":");
            System.out.print("Nhap ma tai lieu: ");
            danhSachTaiLieu[i].setMaTaiLieu(sc.next());
            System.out.print("Nhap ten nha xuat ban: ");
            danhSachTaiLieu[i].setTenNhaXuatBan(sc.next());
            System.out.print("Nhap so ban phat hanh: ");
            danhSachTaiLieu[i].setSoBanPhatHanh(sc.nextInt());

            System.out.println("Nhap thong tin Tap Chi thu " + (i + 1) + ":");
            System.out.print("Nhap so phat hanh: ");
            tapChi[i].setSoPhatHanh(sc.nextInt());
            System.out.print("Nhap thang phat hanh: ");
            tapChi[i].setThangPhatHanh(sc.nextInt());
        }
    }

    // Hiển thị thông tin tài liệu sách
    public void hienThiTaiLieuSach(int n) {
        for (int i = 0; i < sach.length; i++) {
            System.out.println("\t\tThong Tin Tai Lieu thu " + (i + 1) + ":");
            System.out.println("\t\tMa Tai Lieu: " + danhSachTaiLieu[i].getMaTaiLieu());
            System.out.println("\t\tTen Nha Xuat Ban: " + danhSachTaiLieu[i].getTenNhaXuatBan());
            System.out.println("\t\tSo Ban Phat Hanh: " + danhSachTaiLieu[i].getSoBanPhatHanh());

            System.out.println("\t\tThong tin Sach thu " + (i + 1) + ":");
            System.out.println("\t\tTen tac gia: " + sach[i].getTenTacGia());
            System.out.println("\t\tTen Sach: " + sach[i].getTenSach());
            System.out.println("\t\tSo trang: " + sach[i].getSoTrang());
        }
    }

    // Hiển thị thông tin tài liệu báo
    public void hienThiTaiLieuBao(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\t\tThong Tin Tai Lieu thu " + (i + 1) + ":");
            System.out.println("\t\tMa Tai Lieu: " + danhSachTaiLieu[i].getMaTaiLieu());
            System.out.println("\t\tTen Nha Xuat Ban: " + danhSachTaiLieu[i].getTenNhaXuatBan());
            System.out.println("\t\tSo Ban Phat Hanh: " + danhSachTaiLieu[i].getSoBanPhatHanh());

            System.out.println("\t\tThong tin Bao thu " + (i + 1) + ":");
            System.out.println("\t\tNgay phat hanh: " + formatDate(bao[i].getNgayPhatHanh()));
        }
    }

    // Hiển thị thông tin tài liệu tạp chí
    public void hienThiTaiLieuTapChi(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\t\tThong Tin Tai Lieu thu " + (i + 1) + ":");
            System.out.println("\t\tMa Tai Lieu: " + danhSachTaiLieu[i].getMaTaiLieu());
            System.out.println("\t\tTen Nha Xuat Ban: " + danhSachTaiLieu[i].getTenNhaXuatBan());
            System.out.println("\t\tSo Ban Phat Hanh: " + danhSachTaiLieu[i].getSoBanPhatHanh());

            System.out.println("\t\tThong tin Tap Chi thu " + (i + 1) + ":");
            System.out.println("\t\tSo phat hanh: " + tapChi[i].getSoPhatHanh());
            System.out.println("\t\tThang phat hanh: " + tapChi[i].getThangPhatHanh());
        }
    }

    // Format ngày
    private String formatDate(Date ngayPhatHanh) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(ngayPhatHanh);
    }

    // Tìm kiếm tài liệu theo loại
    public void timKiemTheoLoai(String loai) {
        boolean found = false;
        for (int i = 0; i < danhSachTaiLieu.length; i++) {
            if (danhSachTaiLieu[i] instanceof Sach && loai.equalsIgnoreCase("sach")) {
                System.out.println("\t--->Tài liệu Sách:");
                hienThiTaiLieuSach(i);
                found = true;
            } else if (danhSachTaiLieu[i] instanceof Bao && loai.equalsIgnoreCase("bao")) {
                System.out.println("\t--->Tài liệu Báo:");
                boolean foundBao = false;
                for (int j = 0; j < bao.length; j++) {
                    if (bao[j] == danhSachTaiLieu[i]) {
                        System.out.println("\t\tThong Tin Tai Lieu thu " + (i + 1) + ":");
                        System.out.println("\t\tMa Tai Lieu: " + danhSachTaiLieu[i].getMaTaiLieu());
                        System.out.println("\t\tTen Nha Xuat Ban: " + danhSachTaiLieu[i].getTenNhaXuatBan());
                        System.out.println("\t\tSo Ban Phat Hanh: " + danhSachTaiLieu[i].getSoBanPhatHanh());

                        System.out.println("\t\tThong tin Bao thu " + (j + 1) + ":");
                        System.out.println("\t\tNgay phat hanh: " + formatDate(bao[j].getNgayPhatHanh()));
                        foundBao = true;
                        break;
                    }
                }
                if (!foundBao) {
                    System.out.println("Không tìm thấy tài liệu báo tương ứng.");
                }
                found = true;
            } else if (danhSachTaiLieu[i] instanceof TapChi && loai.equalsIgnoreCase("tapchi")) {
                System.out.println("\t--->Tài liệu Tạp Chí:");
                hienThiTaiLieuTapChi(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay loai tai lieu nao la " + loai);
        }
    }

    // Tìm kiếm tài liệu theo tên tác giả
    public void timKiemTheoTacGia(String tenTacGia) {
        boolean found = false;
        for (int i = 0; i < danhSachTaiLieu.length; i++) {
            if (danhSachTaiLieu[i] instanceof Sach && ((Sach) danhSachTaiLieu[i]).getTenTacGia().equalsIgnoreCase(tenTacGia)) {
                System.out.println("\t\tThông Tin Tài Liệu Sách:");
                System.out.println("\t\tTên Tác Giả: " + tenTacGia);
                System.out.println("\t\tMã Tài Liệu: " + danhSachTaiLieu[i].getMaTaiLieu());
                System.out.println("\t\tTên Nhà Xuất Bản: " + danhSachTaiLieu[i].getTenNhaXuatBan());
                System.out.println("\t\tSố Bản Phát Hành: " + danhSachTaiLieu[i].getSoBanPhatHanh());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy tài liệu của tác giả " + tenTacGia);
        }
    }

    // Tìm kiếm tài liệu theo tên tác giả gần đúng
    public void timKiemGanDungTacGia(String tenTacGiaCanTim) {
        boolean found = false;
        for (int i = 0; i < danhSachTaiLieu.length; i++) {
            if (danhSachTaiLieu[i] instanceof Sach) {
                Sach sach = (Sach) danhSachTaiLieu[i];
                if (sach.getTenTacGia().toLowerCase().contains(tenTacGiaCanTim.toLowerCase())) {
                    System.out.println("Tài liệu tác giả gần đúng: ");
                    System.out.println("\tTên tác giả: " + sach.getTenTacGia());
                    System.out.println("\tTên sách: " + sach.getTenSach());
                    System.out.println("\tSố trang: " + sach.getSoTrang());
                    found = true;
                }
            } else if (danhSachTaiLieu[i] instanceof Bao) {
                Bao bao = (Bao) danhSachTaiLieu[i];
                if (bao.getTenTacGia().toLowerCase().contains(tenTacGiaCanTim.toLowerCase())) {
                    System.out.println("Tài liệu tác giả gần đúng: ");
                    System.out.println("\tTên tác giả: " + bao.getTenTacGia());
                    System.out.println("\tNgày phát hành: " + bao.getNgayPhatHanh());
                    found = true;
                }
            } else if (danhSachTaiLieu[i] instanceof TapChi) {
                TapChi tapChi = (TapChi) danhSachTaiLieu[i];
                if (tapChi.getTenTacGia().toLowerCase().contains(tenTacGiaCanTim.toLowerCase())) {
                    System.out.println("Tài liệu tác giả gần đúng: ");
                    System.out.println("\tTên tác giả: " + tapChi.getTenTacGia());
                    System.out.println("\tSố phát hành: " + tapChi.getSoPhatHanh());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy tài liệu nào của tác giả gần đúng '" + tenTacGiaCanTim + "'");
        }
    }

    // Hiển thị theo loại tài liệu được chỉ định bởi người dùng
    public void hienThiTheoLoai(String loai) {
        switch (loai.toLowerCase()) {
            case "sach":
                System.out.println("Danh sach tai lieu loai Sach:");
                for (TaiLieu tl : danhSachTaiLieu) {
                    if (tl instanceof Sach) {
                        Sach sach = (Sach) tl;
                        System.out.println("Ma tai lieu: " + sach.getMaTaiLieu());
                        System.out.println("Ten tac gia: " + sach.getTenTacGia());
                        System.out.println("Ten sach: " + sach.getTenSach());
                        System.out.println("So trang: " + sach.getSoTrang());
                        System.out.println();
                    }
                }
                break;
            case "bao":
                System.out.println("Danh sach tai lieu loai Bao:");
                for (TaiLieu tl : danhSachTaiLieu) {
                    if (tl instanceof Bao) {
                        Bao bao = (Bao) tl;
                        System.out.println("Ma tai lieu: " + bao.getMaTaiLieu());
                        System.out.println("Ngay phat hanh: " + formatDate(bao.getNgayPhatHanh()));
                        System.out.println();
                    }
                }
                break;
            case "tap chi":
                System.out.println("Danh sach tai lieu loai Tap Chi:");
                for (TaiLieu tl : danhSachTaiLieu) {
                    if (tl instanceof TapChi) {
                        TapChi tapChi = (TapChi) tl;
                        System.out.println("Ma tai lieu: " + tapChi.getMaTaiLieu());
                        System.out.println("So phat hanh: " + tapChi.getSoPhatHanh());
                        System.out.println("Thang phat hanh: " + tapChi.getThangPhatHanh());
                        System.out.println();
                    }
                }
                break;
            default:
                System.out.println("Loai tai lieu khong hop le.");
        }
    }
}

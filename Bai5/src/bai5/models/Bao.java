/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5.models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu {

    Date ngayPhatHanh = new Date();

    public Bao() {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(Date ngayPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    // Các thuộc tính khác của class Bao

    private String tenTacGia;

    // Constructor và các phương thức khác của class Bao
    public String getTenTacGia() {
        return this.tenTacGia;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }
}

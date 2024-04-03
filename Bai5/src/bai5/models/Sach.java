/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5.models;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu {

    String tenTacGia;
    String tenSach;
    int soTrang;
    public Sach(){
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach; 
        this.soTrang = soTrang;
    }
    
    public Sach(String tenTacGia, String tenSach, int soTrang, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh){
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    
    public String getTenTacGia() {
        return this.tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}

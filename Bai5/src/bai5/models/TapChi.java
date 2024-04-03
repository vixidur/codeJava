/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5.models;

/**
 *
 * @author Admin
 */
public class TapChi extends TaiLieu{
    int soPhatHanh;
    int thangPhatHanh;
    public TapChi(){
        this.soPhatHanh = soPhatHanh; 
        this.thangPhatHanh = thangPhatHanh;
    }
    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh; 
        this.thangPhatHanh = thangPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }
    
    // Các thuộc tính khác của class Bao

    private String tenTacGia;

    // Constructor và các phương thức khác của class Bao
    public String getTenTacGia() {
        return this.tenTacGia;
    }
}

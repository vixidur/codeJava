/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocsinh;

/**
 *
 * @author Peggy
 */
public class HocSinh_TranVanChien {

    private String maHS;
    private String tenHS;

    public HocSinh_TranVanChien() {
    }

    public HocSinh_TranVanChien(String maHS, String tenHS) {
        this.maHS = maHS;
        this.tenHS = tenHS;

    }

    public String getMaHS() {
        return maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }
}

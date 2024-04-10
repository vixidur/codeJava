package gettervasetter;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Peggy
 */
public class hocSinh_TranVanChien {

    private String maHS;
    private String tenHS;

    public hocSinh_TranVanChien() {
    }

    public hocSinh_TranVanChien(String maHS, String tenHS) {
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

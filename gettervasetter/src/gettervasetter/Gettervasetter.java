/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettervasetter;

import java.util.Scanner;

/**
 *
 * @author Peggy
 */
public class Gettervasetter {
    public class Test {
        
    }
    public static class hocSinh_TranVanChien {
        private String maHS;
        private String tenHS;
        //setter để thiết lập các thuộc tính 
        // getter lấy giá trị của thuộc tính đó
        public hocSinh_TranVanChien(){}
        pubic hocSinh_TranVanChien(String maHS, String tenHS) {
            this.maHS = maHS; 
            this.tenHS = tenHS;
            return null;
        }
        public void setMaHS(String maHS) {
            this.maHS = maHS;
        }

        public void setTenHS(String tenHS) {
            this.tenHS = tenHS;
        }

        public String getMaHS() {
            return maHS;
        }

        public String getTenHS() {
            return tenHS;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        hocSinh_TranVanChien hs1 = new hocSinh_TranVanChien();
        // hs1 nhap vao tu ban phim 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hoc sinh 1");
        
    }
    
}

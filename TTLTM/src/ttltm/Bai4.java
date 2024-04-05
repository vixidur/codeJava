/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttltm;
import java.util.Scanner;
/**
 *
 * @author Peggy
 */
public class Bai4 {
    Scanner sc=new Scanner(System.in);
     int a; 
    int b; 
    public int getA() { 
        return a; 
    } 
    public int getB() { 
        return b; 
    } 
    void nhap() { 
        System.out.print("Nhập a=");
        a=sc.nextInt();
        System.out.print("Nhập b=");
        b=sc.nextInt();
    } 
    int USCLN(int a, int b) { 
        while (a != b) { 
            if (a > b) { a = a - b; 
            } else { 
                b = b - a; 
            } 
        } 
        return a; 
    } 
    int BSCNN(int a,int b){ 
        return a*b/USCLN(a, b); 
    } 
    public static void main(String[] args) { 
        Bai4 bai=new Bai4(); 
        bai.nhap(); 
      System.out.println("UCLN:" + bai.USCLN(bai.getA(), bai.getB())); 
      System.out.println("BCNN :" + bai.BSCNN(bai.getA(), bai.getB())); 
    } 
} 


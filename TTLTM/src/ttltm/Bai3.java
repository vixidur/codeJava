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
public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		boolean cont = true;
                int a;
                Scanner sc=new Scanner(System.in);
                System.out.print("Nhập số nguyên dương:");
                a=sc.nextInt();
		do {
			System.out.println("\nChọn chức năng : [1- 4]");
			int chon = input.nextInt();
			switch (chon) {
			case 1:
				System.out.print("Tổng các số từ 1 đến a là:");
                                System.out.print(tong(a));
				break;
			case 2:
                               System.out.print("Các số hoàn hảo là:");
				 hienThisHH(a);
				break;
			case 3:
                                System.out.print("Các số nguyên tố là:");
				hienThisNT(a);
				break;
                        case 4:
				tichthuaso(a);
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
    }
    public static int tong(int a)
    {
        int tong=0;
        for(int i=0;i<=a;i++)
        {
            tong+=i;
        }
        return tong;
    }
    public static boolean sohh(int a){ 
        int tong=0; 
        for (int i = 1; i < a; i++) { 
            if(a%i==0) 
            tong+=i; 
        } 
        if(tong==a) 
            return true; 
        else 
            return false;             
    } 
    public static void hienThisHH(int a){ 
        for (int i = 0; i < a; i++) {     
           if(sohh(i)==true) 
           System.out.print(i+" "); 
       } 
   } 
    public static boolean songt(int a){ 
         if (a < 2)     
        return false; 
    for (int i = 2; i <= Math.sqrt(a); i ++) 
    { 
        if (a%i==0) 
        { 
            return false; 
        }
    } 
    return true; 
    } 
    public static void hienThisNT(int a){ 
        for (int i = 1; i < a; i++) { 
            if(songt(i)==true){ 
                System.out.print(i +" "); 
} 
        } 
    } 
    public static void tichthuaso(int a){  
        System.out.println("Tich thua so"); 
        for(int i=2; i<=a;i++)
    {
       while(a%i==0)
       {
          a=a/i;
          if(a==1)
              System.out.print(i);
          else
              System.out.print(i+" x ");
       }
       if (a==1)
          break;
    }   
    } 
}

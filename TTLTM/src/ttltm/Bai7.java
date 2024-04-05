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
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        int n;
        System.out.print("Nhập số phần tử của mảng:");
        n=sc.nextInt();
        System.out.println("Nhập mảng:");
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        hienthisoNT(a,n);
        System.out.println("\nVị trí các số hoàn hảo trong mảng là:");
        hienThisHH(a,n);
        System.out.println("Vị trí các số chẵn trong mảng là:");
        hienthisoChan(a,n);
                
    }
    public static boolean ktsnt(int x) 
        {
	int i,d=0;
	for(i=1;i<=x;i++)
	{
		if(x%i==0)
			d++;
	}
		if(d==2)
			return true;
                else
			return false;
        }   
        public static void hienthisoNT(int []a, int n)
        {
	boolean f=false;
	for(int i=0; i<n; i++){
		if(ktsnt(a[i])==true)
		{
			if(f==false)
				System.out.print("\nCac phan tu la So Nguyen To nam o vi tri:");
			f=true;
			System.out.print(i+"\t");
		}
        }
	if(f==false)
		System.out.print("\nKhong co phan tu thoa yeu cau bai toan");
         }
        public static boolean KiemTraSHT(int x)
        {
	int i, tong=0;
	for(i=1; i<x; i++)
		if(x%i==0)
			tong = tong + i;
	if(tong==x)
		return true;
        else
	    return false;
        }
        public static void hienThisHH(int []a,int n){ 
        for(int i=0;i<n;i++)
        {
           for (int j = 0; j < a[i]; j++) {     
           if(KiemTraSHT(a[i])==true) 
           System.out.print(i+" "); 
        } 
        }
        } 
        public static void hienthisoChan(int []a,int n){
            for(int i=0;i<n;i++)
            {                if(a[i]%2==0)
                {
                    System.out.print(i+"\t");
                }
            }
        }
}


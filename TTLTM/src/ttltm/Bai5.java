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
public class Bai5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]a=new int[10];
    int n;
    System.out.print("Nhập số phần tử của mảng:");  
    n=sc.nextInt();
    System.out.println("Nhập phần tử cho mảng:");    
    for(int i=0;i<n;i++)
    {
        System.out.print("a["+i+"]=");
        a[i]=sc.nextInt();
    }
    System.out.print("Mảng vừa nhập là:");
    for(int i=0;i<n;i++)
    {
        System.out.print("\t"+a[i]);
    }
        System.out.println();
    int k;
    System.out.print("Nhập vị trí cần xóa:");
    k=sc.nextInt();
    for(int i=k;i<=n;i++)
    {
        a[i]=a[i+1];       
    }
    n--;
    System.out.println("Mảng sau khi xóa là:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }
}

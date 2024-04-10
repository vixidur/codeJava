/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttltm;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Peggy
 */
public class Bai6 {
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
    for (int i = 0; i < n; i++)
{
    for (int j = i + 1; j < n; j++)
    {
        if (a[i] > a[j])
        {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
}
    System.out.print("Mảng sau khi được sắp xếp là:");
    for(int i=0;i<n;i++)
    {
        System.out.print("\t"+a[i]);
    }
        System.out.println();
    System.out.println("Phầnn tử có giá trị nhỏ nhất là:"+a[0]);
    int tong=0;
    int dem=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]%3==0)
        {
            tong+=a[i];
            dem++;
        }
    }
    System.out.println("Trung bình cộng các phần tử chia hết cho ba là:"+(tong/dem));
    }
}

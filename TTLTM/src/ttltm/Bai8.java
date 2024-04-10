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
public class Bai8 {
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
        Insertion_sort(a,n);
        System.out.println("\nMảng sau khi sắp  xếp tăng dần là:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }   
     public static void Insertion_sort(int a[], int n) {
	int index, new_number;
	for (int i = 1; i < n; i++){
		index = i;
		new_number = a[i];
		while (index > 0 && a[index - 1] > new_number){
			a[index] = a[index - 1];
			index--;
		}
		a[index] = new_number;
	}
}
}

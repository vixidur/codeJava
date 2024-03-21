/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttltm;

/**
 *
 * @author Peggy
 */
public class Bai10 {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int a[][] = {
            {60, 55, 70}, 
            {80, 60, 41}
        };
        System.out.print("Điểm trung bình của học sinh thứ nhất là: ");
        System.out.println((double)(a[0][0] + a[0][1] + a[0][2]) / 3);
        System.out.print("Điểm trung bình của học sinh thứ hai là: ");
        System.out.println((double)(a[1][0] + a[1][1] + a[1][2]) / 3);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_tranvanchien;
import java.util.ArrayList;
//import java.util.Scanner;
import java.util.Collections;
//import java.util.Comparator;
/**
 *
 * @author Peggy
 */
public class ArrayList_TranVanChien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        cars.add("Mercedes"); // index = 0;
        cars.add("BMW"); // index = 1;
        cars.add("Toyota"); // index = 2;
        cars.add("Huyndai"); // index = 3;
        cars.add("G63"); // index = 4;
        cars.remove(2); // xoa Toyota
        System.out.println("MANG BAN DAU");
        System.out.print(cars);
        System.out.println();
        cars.set(3, "Opel"); // thay vi tri thu 3 thanh Opel
        System.out.println("MANG SAU KHI THAY THE");
        System.out.print(cars);
        System.out.println();
        System.out.print(cars.get(2));
        System.out.println();
        for(int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
        Collections.sort(cars);
        for(String mathang : cars) {
            System.out.print(mathang + " ");
        }
        System.out.println();
        Collections.reverse(cars);
//        Collections.sort(cars, Comparator.reverseOrder());
//        Collections.sort(cars, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        System.out.print(cars.contains("Opel"));
        System.out.println();
        for(String mathang : cars) {
            System.out.print(mathang + " ");
        }
        System.out.println();
    }
}

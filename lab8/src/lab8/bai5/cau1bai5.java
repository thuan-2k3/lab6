/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class cau1bai5 {
    ArrayList<Double> list; 

    public cau1bai5() {
        list = new ArrayList<>();
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap mot so: ");
            double x = sc.nextDouble();
            list.add(x);

            System.out.println("Nhap them (Y/N)? ");
            sc.nextLine(); // đọc ký tự xuống dòng còn lại
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }
    
    public void xuat(){
        for (double i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        cau1bai5 a = new cau1bai5();
        a.nhap();
        a.xuat(); 
    }
}

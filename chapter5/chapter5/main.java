/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        Chuyenxenoithanh cnt = new Chuyenxenoithanh(10, 101, 27, "t01", "thuan", 123);
        Chuyenxengoaithanh cngt = new Chuyenxengoaithanh("sai gon", 3, 50, "t02", "minh",234 );
        
        Quanly ql = new Quanly();
        ql.themcx(cnt);
        ql.themcx(cngt);
        ql.inDSCX();
        
    }
            
}

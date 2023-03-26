/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;


/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
   Giaodichtiente gdtt= new Giaodichtiente(0.3,"USD", "T01", 1200, 50,  "1/5/1999");
   Giaodich gd= new Giaodich("a", 20, 10, "5/1/1999");
   Giaodichvang gdv= new Giaodichvang("b", "t02", 1500, 100, "2/5/2009");
   gdv.thanhtienv();
   gdtt.thanhTientt();
   
    }
    
}

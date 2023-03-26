/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;



/**
 *
 * @author ADMIN
 */
public class Giaodichvang extends Giaodich {
   private String loaivang ;

    public Giaodichvang(String magd, double dongia, double soluong, String ngaygd) {
        super(magd, dongia, soluong, ngaygd);
    }

    public Giaodichvang(String loaivang, String magd, double dongia, double soluong, String ngaygd) {
        super(magd, dongia, soluong, ngaygd);
        this.loaivang = loaivang;
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

  public double thanhtienv(){
      return this.getDongia()*this.getSoluong();
      
      
  } 
    
    
    
}

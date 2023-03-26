/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Giaodichtiente extends Giaodich{
    private double tigia;
    private String loaiTienTe;

    public Giaodichtiente(String magd, double dongia, double soluong, String ngaygd) {
        super(magd, dongia, soluong, ngaygd);
    }

    public Giaodichtiente(double tigia, String loaiTienTe, String magd, double dongia, double soluong, String ngaygd) {
        super(magd, dongia, soluong, ngaygd);
        this.tigia = tigia;
        this.loaiTienTe = loaiTienTe;
    }

    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    public void thanhTientt(){
        if(loaiTienTe == "USD" || loaiTienTe == "Euro"){
            System.out.println(this.getDongia()*this.getSoluong()*this.getTigia());
        } else if(loaiTienTe == "VIETNAM"){
            System.out.println(this.getSoluong()*this.getDongia());
        } else {
            System.out.println("loai tien khong hop le !!!");
        }
    }


} 
  

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;



/**
 *
 * @author ADMIN
 */
public class Giaodich {
    private String magd ;
    private double dongia ;
    private double soluong ;
    private String ngaygd ;

    public Giaodich(String magd, double dongia, double soluong, String ngaygd) {
        this.magd = magd;
        this.dongia = dongia;
        this.soluong = soluong;
        this.ngaygd = ngaygd;
    }

    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }



}

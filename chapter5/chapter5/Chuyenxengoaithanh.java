/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author ADMIN
 */
public class Chuyenxengoaithanh extends Chuyenxe {
    protected String Noiden ;
    protected double Songaydiduoc ;
    protected double Doanhthu ;

    public Chuyenxengoaithanh(String Noiden, double Songaydiduoc, double Doanhthu, String masochuyenxe, String Tentaixe, int Soxe) {
        super(masochuyenxe, Tentaixe, Soxe);
        this.Noiden = Noiden;
        this.Songaydiduoc = Songaydiduoc;
        this.Doanhthu = Doanhthu;
    }

    public String getMasochuyenxe() {
        return masochuyenxe;
    }

    public void setMasochuyenxe(String masochuyenxe) {
        this.masochuyenxe = masochuyenxe;
    }

    public String getTentaixe() {
        return Tentaixe;
    }

    public void setTentaixe(String Tentaixe) {
        this.Tentaixe = Tentaixe;
    }

    public int getSoxe() {
        return Soxe;
    }

    public void setSoxe(int Soxe) {
        this.Soxe = Soxe;
    }

    public String getNoiden() {
        return Noiden;
    }

    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }

    public double getSongaydiduoc() {
        return Songaydiduoc;
    }

    public void setSongaydiduoc(double Songaydiduoc) {
        this.Songaydiduoc = Songaydiduoc;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }
    
    public double Tinhdoanhthungt(){
        return this.Doanhthu;
        
    }

    @Override
    public String toString() {
        return "Chuyenxengoaithanh{" + "Noiden=" + Noiden + ", Songaydiduoc=" + Songaydiduoc + ", Doanhthu=" + Doanhthu + '}';
    }
    
}

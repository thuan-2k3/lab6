/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author ADMIN
 */
public class Chuyenxenoithanh extends Chuyenxe {
    protected double Sokmdiduoc ;
    protected double Doanhthu ;
    protected int Sotuyen ;

    public Chuyenxenoithanh(double Sokmdiduoc, double Doanhthu, int Sotuyen, String masochuyenxe, String Tentaixe, int Soxe) {
        super(masochuyenxe, Tentaixe, Soxe);
        this.Sokmdiduoc = Sokmdiduoc;
        this.Doanhthu = Doanhthu;
        this.Sotuyen = Sotuyen;

    
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

    public double getSokmdiduoc() {
        return Sokmdiduoc;
    }

    public void setSokmdiduoc(double Sokmdiduoc) {
        this.Sokmdiduoc = Sokmdiduoc;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }

    public int getSotuyen() {
        return Sotuyen;
    }

    public void setSotuyen(int Sotuyen) {
        this.Sotuyen = Sotuyen;
    }
    public double Tinhdoanhthunt(){
        return this.Doanhthu;
    }

    @Override
    public String toString() {
        return "Chuyenxenoithanh{" + "Sokmdiduoc=" + Sokmdiduoc + ", Doanhthu=" + Doanhthu + ", Sotuyen=" + Sotuyen + '}';
    }

    
    
    
}

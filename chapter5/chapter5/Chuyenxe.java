/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author ADMIN
 */
public class Chuyenxe {
    protected String masochuyenxe ;
    protected String Tentaixe ;
    protected int Soxe ;

    public Chuyenxe(String masochuyenxe, String Tentaixe, int Soxe) {
        this.masochuyenxe = masochuyenxe;
        this.Tentaixe = Tentaixe;
        this.Soxe = Soxe;
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

    @Override
    public String toString() {
        return "Chuyenxe{" + "masochuyenxe=" + masochuyenxe + ", Tentaixe=" + Tentaixe + ", Soxe=" + Soxe + '}';
    }
     
}

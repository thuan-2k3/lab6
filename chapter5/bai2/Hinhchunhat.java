/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author ADMIN
 */
public class Hinhchunhat extends Hinh {
    private float chieudai ;
    private float chieurong ;

    public Hinhchunhat(float chieudai, float chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    @Override
    public String toString() {
        return "Hinhchunhat{" + "chieudai=" + chieudai + ", chieurong=" + chieurong + '}';
    }
    
    public double Dientich(){
    return (this.chieudai + this.chieurong)*2 ;
    
    }
}

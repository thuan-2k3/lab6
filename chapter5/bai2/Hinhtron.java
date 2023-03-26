/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author ADMIN
 */
public class Hinhtron extends Hinh {
    private float bankinh ;

    public Hinhtron(float bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "Hinhtron{" + "bankinh=" + bankinh + '}';
    }
    
    public double Dientich(){
        return this.bankinh*this.bankinh*3.14 ;
        
    }
    
}

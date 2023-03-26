/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Quanlyhinh {
     ArrayList<Hinh> dsh ;
     
     public  Quanlyhinh(){
       this.dsh = new ArrayList<Hinh>();
     }
     public Quanlyhinh(ArrayList<Hinh>dsh) {
        this.dsh = dsh ;
        
     }
     public void themDS(Hinh h){
         dsh.add(h);
         
     }
     public void inDSCX (){
       for(Hinh dsh :dsh){
           System.out.println(String.valueOf(dsh)+ "\n");
       }
     }
}

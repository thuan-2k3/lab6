/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Quanly {
    ArrayList<Chuyenxe> dscx ;

   public Quanly(){
       this.dscx = new ArrayList<Chuyenxe>();
   }
   public Quanly(ArrayList<Chuyenxe>dscx) {
       this.dscx = dscx ;
   }
   public void themcx ( Chuyenxe cx){
       dscx.add(cx);
   }
   public void inDSCX (){
       for(Chuyenxe dscx :dscx){
           System.out.println(String.valueOf(dscx)+ "\n");
       }
   }
}

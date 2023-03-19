/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;


/**
 *
 * @author ADMIN
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hcsinh hocsinh = new hcsinh() ;
        System.out.println(hocsinh.diemtrungbinh());
        hocsinh = new hschuyentoan();
        System.out.println(hocsinh.diemtrungbinh());
        
    }
    
}

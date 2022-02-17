/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class kelasbaru {
    public String nama = "persegi panjang";
    public int panjang;
    public int lebar;
    protected String rumus = "PanjangxLebar";
    protected int luas;
    private int hasil;
     Scanner input = new Scanner (System.in);
    
     
     public void diketahui (){
        System.out.println("Nama bangunan : "+ nama);
        
    }    
    protected void boleh (){
        System.out.println("rumus yang di gunakan : "+ rumus);
        System.out.print("masukkan panjangnya : " + panjang);
        panjang = input.nextInt();
        System.out.print("masukkan lebarnya : " + lebar);
        lebar = input.nextInt();
         luas = panjang*lebar;
         hasil = luas;
        
    }  
    private void rahasia (){
        System.out.println("hasilnya adalah : "+ hasil);
    }
}


       
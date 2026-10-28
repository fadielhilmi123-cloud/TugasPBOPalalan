/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOS1P4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StrukturKontrol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Perhitungan p = new Perhitungan();
        
        System.out.println("Masukkan Nilai");
        p.nilai = s.next().charAt(0);
        
        System.out.println("Masukkan Nilai : ");
        p.angka = s.nextInt();
        s.nextLine();
        
        System.out.println("Masukkan Keterangan : ");
        p.keterangan = s.nextLine().toLowerCase();
        
        System.out.println("Masukkan Status True or False : ");
        p.status = s.nextBoolean();
 
//======================= Penggunaan Perkondisian IF dengan ignore case ====================================//
        if(p.keterangan.equalsIgnoreCase("Yes")){
            System.out.println("Kamu Lulus");
        }else if(p.keterangan.equalsIgnoreCase("No")){
            System.out.println("Kamu Gagal");
        }else{
            System.out.println("Tidak Valid");
        }
        
//======================= Penggunaan Perkondisian IF, Nested IF, IF ELSE Dan ELSE ====================================//
        if (p.angka > 70 && p.angka <= 100 ) {
            if(p.status == true){
                System.out.println("Kamu Lulus");
        }else if(p.angka >= 0 && p.angka <= 70){
            System.out.println("Kelulusan Dengan Pertimbangan ! ");
        }else{
            System.out.println("Data Invalid !!");  
        }      
   }

        
        
//======================= Penggunaan Perkondisian Switch ====================================//
 switch (p.nilai){
     case 'a' : {
         System.out.println("ANJAYY NTAPSS");
         break;
    }
     case 'b' : {
         System.out.println("GAPAPA SANS AJA");
         break;
    }
     case 'c' : {
         System.out.println("SEKOLAH YANG BENER HEY!");
         break;
    }
     
   }
 
  }

}
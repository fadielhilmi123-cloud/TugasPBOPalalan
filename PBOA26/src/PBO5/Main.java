/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
       Mahasiswa mhs1 = 
       new Mahasiswa(123,"Fadiel","IF");
       mhs1.infomahasiswa();
       new Mahasiswa(234,"Nailah","IF").infomahasiswa();
       new Mahasiswa(345,"Hilmi","IF").infomahasiswa();
       new Mahasiswa(456,"Syahadah","IF").infomahasiswa();

       
//       mhs1.npm = 123;
//       mhs1.nama = "Nailah";
//       mhs1.prodi = "INFORMATIKA";
//       mhs1.infomahasiswa();
//       mhs1.setData(234, "Syahadah", "INFORMATIKA");
//       mhs1.infomahasiswa();
    }
    
 }

//instance variable = properti attribute
//variable local
//parameter variable


 class Mahasiswa{
     //Instance Variable
     int npm;
     String nama;
     String prodi;
     
     public Mahasiswa(int npm, String nama, String prodi){
         this.npm = npm;
         this.nama = nama;
         this.prodi = prodi;
     }
     
     public void setData(int npm, String nama, String prodi){
         this.npm = npm;
         this.nama = nama;
         this.prodi = prodi;
                 
     }
  public void infomahasiswa(){ 
      int nilai;
      System.out.println("NPM : " + npm);
      System.out.println("Nama : " + nama);
      System.out.println("Prodi : " + prodi); 
  }  
}


    
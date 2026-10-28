
package PBO6;

public class Staff extends Employee{
    String bagian;
         public Staff(int nip, String nama, long gaji){
             super(nip, nama, gaji);
         }
           public void info(){
        System.out.println("Info Staff");
        System.out.println("NIP : " + super.nip);
        System.out.println("Nama : " + super.nama);
        System.out.println("Gaji : " + super.gaji);  
           }
           
           public void infoBagian(){
               System.out.println("Bagian " + this.bagian);
           }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(123, "Agus", 20000000);
        e.info();
        
        Staff s = new Staff();
        s.nip = 321;
        s.nama = "budi";
        s.gaji = 10000000;
        s.bagian = "Keuangan";
        s.info();
        s.infoBagian();
        
        
    }
}

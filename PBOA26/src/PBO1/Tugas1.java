/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

// tugas latihan1
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tahun (1909 - 2024) : ");
        int tahun = input.nextInt();

        if (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        input.close();
    }
}
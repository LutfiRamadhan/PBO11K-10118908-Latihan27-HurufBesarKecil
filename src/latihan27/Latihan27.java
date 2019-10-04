/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan27;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
    
}

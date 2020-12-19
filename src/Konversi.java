/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author asuz
 */
public class Konversi {
    public static void main (String[] args){
        System.out.println("Pilihan Konversi :\n"
                + " 1. Jam -> Menit\n"
                + " 2. Detik -> Hari, jam, menit, dan detik");
        System.out.println("\n Masukkan pilihan");
        try (Scanner options = new Scanner (System.in)){
            if (!options.hasNextInt()){
                System.out.println("Itu alfabet, anda salah!");
            } else {
                if (options.nextInt() == 1){
                    System.out.println("Masukkan jam :");
                    Scanner hours = new Scanner (System.in);
                    jamKeMenit(hours.nextInt());
                } else {
                    System.out.println("Masukkan detik :");
                    try (Scanner seconds = new Scanner(System.in)){
                        detikKeHari(seconds.nextLong());
                    }
                }
            }
        }
    }

    private static void jamKeMenit(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void detikKeHari(long nextLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

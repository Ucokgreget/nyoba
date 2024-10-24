/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1_interface_Luqman;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phone s24Ultra = new Samsung ();
        
        PhoneUser candra = new PhoneUser(s24Ultra);
        
        candra.turnOnThePhone();
        
        Scanner input = new Scanner (System.in);
        String aksi;
        
        while (true){
            System.out.println("***APLIKASI INTERFACE***");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] keluar");
            System.out.println("----------------------------------");
            System.out.println("Pilih Aksi> ");
            aksi = input.nextLine();
            
            
            if (aksi.equalsIgnoreCase("1")){
                candra.turnOnThePhone();
            }
            else if (aksi.equalsIgnoreCase("2")){
                candra.turnOffThePhone();
            }
            else if (aksi.equalsIgnoreCase("3")){
                candra.makePhoneLouder();
            }
            else if (aksi.equalsIgnoreCase("4")){
                candra.makePhoneSilent();
            }
            else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }
            else {
                System.out.println("Kamu memilih aksi yang salah");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FadleMhsa
 */
public class Menu {
    private String nama_menu;
    private double harga;
    private String kategori;

    public String getNama_menu() {
        
        return nama_menu; 
    
    }

    public void setNama_menu(String nama_menu) {

        this.nama_menu = nama_menu;

    }

    public double getHarga() { 
        
        return harga; 
    
    }

    public void setHarga (double harga) {

        this.harga = harga;

    }

    public String getKategori() {
        
        return kategori; 
    
    }

    public void setKategori (String kategori) {

        this.kategori = kategori;

    }

    public Menu pilihMenu() {
        try{
            Scanner input = new Scanner(System.in);
            
            System.out.print("Nomor Menu yang Dipesan : ");
            int no_menu = input.nextInt();
            
            //get menu berdasarkan no_menu, di -1 karena arraylist dimulai dari 0
            Menu m = daftarMenu.get(no_menu-1);
        }catch(IndexOutOfBoundsException err){
            
        }catch(InputMismatchException err){
            
        }
    }
}

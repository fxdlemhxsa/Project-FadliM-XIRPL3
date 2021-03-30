/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author FadleMhsa
 */

 import classes.DaftarMenu;
 import classes.Kuah;
 import classes.Minuman;
 import classes.Ramen;
 import classes.Toping;
 import java.util.Scanner;
public class MainAplikasiKasir {

    public DaftarMenu daftarMenu;
    
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    
    public static void main(String[] args){
        //Inisialisasi kelas Scanner untuk mengam bil
        //input dari keyboard
        Scanner input = new Scanner(System.in);

        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String Transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;

        MainAplikasiKasir app = new MainAplikasiKasir();
        //Tampilkan daftar menu
        app.generateDaftarMenu();
     }

    public void generateDaftarMenu() { 
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu (new Ramen ("Ramen Seafood", 25000));
        daftarMenu.tambahMenu (new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu (new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu (new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu (new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu (new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu (new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu (new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu (new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu (new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu (new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu (new Toping("Bakso Goren", 7000));
        daftarMenu.tambahMenu (new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu (new Minuman("Es Teh Anget Manis", 5000));
        daftarMenu.tambahMenu (new Minuman("Jus Alpukat", 10000));
        daftarMenu.tambahMenu (new Minuman("Jus Mangga", 9000));
        daftarMenu.tambahMenu (new Minuman("Cappucino Coffe", 15000));
        daftarMenu.tambahMenu (new Minuman("Vietnam Dripp", 14000));

        daftarMenu.tampilDaftarMenu();
    }

}

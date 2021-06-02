/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author FadleMhsa
 */

import java.util.ArrayList;

public class Transaksi {
    private String noTransaksi;
    private String namaPemesanan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double pajak;
    private double uangBayar;
    private double totalBayar;
    private double biayaService=0;

    public Transaksi (String no_transaksi, String nm_pemesan, String tanggal, String no_meja) { 
        this.noTransaksi = no_transaksi;
        this.namaPemesanan = nm_pemesan;
        this.tanggal =  tanggal;
        this.noMeja = no_meja;

        pesanan = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan) { 
        this.pesanan.add(pesanan);
    }

    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan; 
    }

    public double hitungTotalBayar() {return 0; }

    public double hitungKembalian() {return 0; }

    public void cetakStruk() { }
}

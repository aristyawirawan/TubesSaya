/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespboinventaris;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aris
 */
public class Aplikasi {

    private ArrayList<Orang> daftarPetugas = new ArrayList<>();
    private ArrayList<Orang> daftarPenyedia = new ArrayList<>();
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    public void addPetugas(Petugas petugas) {
        daftarPetugas.add(petugas);
    }

    public int searchPetugas(String nama) {
        int x = 0;
        for (int i = 0; i < daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getNama().equals(nama)) {
                x = i;
            }
        }
        return x;
    }

    public Orang getPetugas(int nip) {
        return daftarPetugas.get(nip);
    }

    public void addPenyedia(Penyedia penyedia) {
        daftarPenyedia.add(penyedia);
    }

    public void delPenyedia(int nip) {
        daftarPenyedia.remove(nip);
    }

    public int searchPenyedia(String nama) {
        int x = 0;
        for (int i = 0; i < daftarPenyedia.size(); i++) {
            if (daftarPenyedia.get(i).getNama().equals(nama)) {
                x = i;
            }
        }
        return x;
    }

    public Orang getPenyedia(int nip) {
        return daftarPenyedia.get(nip);
    }

    public void addBarang(Barang brg) {
        daftarBarang.add(brg);
    }

    public void delBarang(int idBrg) {
        daftarBarang.remove(idBrg);
    }

    public int searchBarang(String namaBrg) {
        int x = 0;
        for (int i = 0; i < daftarBarang.size(); i++) {
            if (daftarBarang.get(i).getNamaBrg().equals(namaBrg)) {
                x = i;
            }
        }
        return x;
    }

    public Barang getBarang(int idBrg) {
        return daftarBarang.get(idBrg);
    }

    public void viewPetugas() {
        if (!daftarPetugas.isEmpty()) {
            for (int i = 0; i < daftarPetugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPetugas.get(i).getNama() + "  " + daftarPetugas.get(i).getNip());
            }
        } else {
            System.out.println("Daftar Petugas Kosong");
        }
    }

    public void viewPenyedia() {
        if (!daftarPenyedia.isEmpty()) {
            for (int i = 0; i < daftarPenyedia.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPenyedia.get(i).getNama() + "  " + daftarPenyedia.get(i).getNip() + "  " + daftarPenyedia.get(i).getJenisBarang());
            }
        } else {
            System.out.println("Daftar Penyedia Kosong");
        }
    }

    public void viewBarang() {
        if (!daftarBarang.isEmpty()) {
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBarang.get(i).getIdBrg() + "  " + daftarBarang.get(i).getNamaBrg() + "  " + daftarBarang.get(i).getJenisBrg() + "  " + daftarBarang.get(i).getJml() + "  " + daftarBarang.get(i).getHarga());
            }
        } else {
            System.out.println("Daftar Barang Kosong");
        }
    }

    public void menuPetugas() {
        int pil;
        System.out.println("1. Add Petugas");
        System.out.println("2. Remove Petugas");
        System.out.println("3. View Petugas");
        System.out.println("0. Back");
        System.out.println("Pilihan : ");
        pil = scan.nextInt();
        switch (pil) {
            case 0:
                mainMenu();
                break;
            case 1:
                System.out.println("Masukkan nama Petugas : ");
                String nama = s.nextLine();
                System.out.println("Masukkan NIP (angka): ");
                int nip = scan.nextInt();
                for (int i = 0; i < daftarPetugas.size(); i++) {
                    if (daftarPetugas.get(i).getNip() == nip) {
                        System.out.println("NIP sudah terdaftar");
                        menuPetugas();
                    } else {
                        Petugas petugas = new Petugas(nama, nip);
                        addPetugas(petugas);
                        System.out.println("Petugas berhasil ditambahkan");
                    }
                }
                break;
            case 2:
                viewPetugas();
                System.out.println("Masukkan NIP (angka) : ");
                nip = scan.nextInt();
                System.out.println("");
                for (int i = 0; i < daftarPetugas.size(); i++) {
                    if (daftarPetugas.get(i).getNip() == nip) {
                        daftarPetugas.remove(i);
                        System.out.println("Berhasil menghapus");
                    } else {
                        System.out.println("NIP salah");
                        menuPetugas();
                    }
                }
                break;
            case 3:
                viewPetugas();
                break;
        }
    }

    public void menuPenyedia() {
        int pil;
        System.out.println("1. Add Penyedia");
        System.out.println("2. Remove Penyedia");
        System.out.println("3. View Penyedia");
        System.out.println("0. Back");
        System.out.println("Pilihan : ");
        pil = scan.nextInt();
        switch (pil) {
            case 0:
                mainMenu();
            case 1:
                System.out.println("Masukkan nama Penyedia : ");
                String nama = s.nextLine();
                System.out.println("Masukkan NIP (angka): ");
                int nip = scan.nextInt();
                System.out.println("Masukkan Jenis Barang yang disediakan : ");
                String jenisBarang = s.nextLine();
                for (int i = 0; i < daftarPenyedia.size(); i++) {
                    if (daftarPetugas.get(i).getNip() == nip) {
                        System.out.println("NIP sudah terdaftar");
                        menuPenyedia();
                    } else {
                        Penyedia penyedia = new Penyedia(nama, jenisBarang, nip);
                        addPenyedia(penyedia);
                        System.out.println("Penyedia berhasil ditambahkan");
                    }
                }
            case 2:
                viewPenyedia();
                System.out.println("Masukkan NIP (angka) : ");
                nip = scan.nextInt();
                System.out.println("");
                for (int i = 0; i < daftarPenyedia.size(); i++) {
                    if (daftarPenyedia.get(i).getNip() == nip) {
                        daftarPenyedia.remove(i);
                        System.out.println("Berhasil menghapus");
                    } else {
                        System.out.println("NIP salah");
                        menuPenyedia();
                    }
                }
            case 3:
                viewPenyedia();
        }
    }

    public void menuBarang() {
        int pil;
        System.out.println("1. Add Barang");
        System.out.println("2. Remove Barang");
        System.out.println("3. View Barang");
        System.out.println("0. Back");
        System.out.println("Pilihan : ");
        pil = scan.nextInt();
        switch (pil) {
            case 0:
                mainMenu();
            case 1:
                System.out.println("Masukkan ID Barang : ");
                int idBrg = scan.nextInt();
                System.out.println("Masukkan Nama Barang : ");
                String namaBrg = s.nextLine();
                System.out.println("Masukkan Jenis Barang : ");
                String jenisBrg = s.nextLine();
                System.out.println("Masukkan Jumlah Barang : ");
                int jml = scan.nextInt();
                System.out.println("Masukkan Harga Barang : ");
                int harga = scan.nextInt();
                for (int i = 0; i < daftarBarang.size(); i++) {
                    if (daftarBarang.get(i).getIdBrg() == idBrg) {
                        System.out.println("Id Barang sudah terdaftar");
                        menuBarang();
                    } else if ((daftarBarang.get(i).getNamaBrg() == namaBrg)) {
                        System.out.println("Nama Barang sudah terdaftar");
                        menuBarang();
                    } else {
                        Barang brg = new Barang(idBrg, namaBrg, jenisBrg, jml, harga);
                        addBarang(brg);
                        System.out.println("Barang berhasil ditambahkan");
                    }
                }
            case 2:
                viewBarang();
                System.out.println("Masukkan Nama Barang : ");
                namaBrg = s.nextLine();
                System.out.println("");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    if (daftarBarang.get(i).getNamaBrg() == namaBrg) {
                        daftarBarang.remove(i);
                        System.out.println("Berhasil menghapus");
                    } else {
                        System.out.println("Barang tidak ditemukan");
                        menuBarang();
                    }
                }
            case 3:
                viewBarang();
        }
    }

    public void mainMenu() {
        int pil = 1;
        while (pil != 0) {
            System.out.println("1. Penyedia");
            System.out.println("2. Petugas");
            System.out.println("3. Barang");
            System.out.println("0. Exit");
            System.out.print("Pilihan : ");
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    menuPenyedia();
                    break;
                case 2:
                    menuPetugas();
                    break;
                case 3:
                    menuBarang();
                    break;
            }
        }
    }
}

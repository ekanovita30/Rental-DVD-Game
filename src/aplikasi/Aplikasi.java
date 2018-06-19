/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Aplikasi {

    static String[][] film = {
        {"1", "The Battleship Island", "Action"}, {"2", "Twilight Bracking Down", "Fantasy"},
        {"3", "Spider-man Homecoming", "Laga"}, {"4", "Train to Busan", "Fantasy"},
        {"5", "Pitch Perfect", "Music"}, {"6", "Beauty and the Beast", "Romance"},
        {"7", "Star Wars", "Action"}, {"8", "Black Panther", "Action"},
        {"9", "Maddah Danur 2", "Horror"}, {"10", "Incidius 3", "Horror"}, {"11", "Avengers Invinity War", "Action"}
    };
    static String[][] drama = {
        {"1", "Two Cops", "Fantasy"}, {"2", "Descendant of the Sun", "Romance"}, {"3", "Let's Fight Ghosh", "Mistery"},
        {"4", "Itakiss 2 in Okinawa", "Romance"}, {"5", "Goblin", "Fantasy"}
    };
    static String[][] game = {
        {"1", "God of War"}, {"2", "Resident Evil 5"},
        {"3", "FIFA Soccer"}, {"4", "DiRT"},
        {"5", "Assassin’s"}, {"6", "Need for Speed"},
        {"7", "Call of Duty"}, {"8", "Grand Theft Auto"},
        {"9", "Burnout"}, {"10", "Resistance"},
        {"11", "Red Faction"}, {"12", "BlazBlue"},
        {"13", "Super Street Fighter"}, {"14", "Battlefield"}, {"15", "Guitar Hero 5"}};
    static String [] daftar_pinjam = new String[30];
    static int jumlah_total;
    static int jumlah1,jumlah2,jumlah3;
    public static void main(String[] args) {
        int pilih, trans, denda, telat_hari,h = 0,
                kembalian_denda, bayar_denda, uang;
        int[] harga = {12000,15000,16000};
        int[] k = new int [10];
//        int [] harga1 = new int[30];
//        int [] harga2 = new int [30];
        
        String nama = "";  
        String daftar;
        char opsi, opsi1, telat;
        Scanner input = new Scanner(System.in); //untuk input data integer(bilangan)
        Scanner str = new Scanner(System.in);   //untuk input data string

        System.out.println("\t  ----------------EAGLE ZONE RENTAL-------------------");
        System.out.println("PENYEWAAN DVD FILM , SERIAL DRAMA ASIA (KOREA, JEPANG DAN THAILAND) DAN GAME");
        System.out.println("============================================================================");
        do {
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("Pilih layanan : ");
            System.out.println("1. Peminjaman");
            System.out.println("2. Pengembalian");
            System.out.print("Masukkan jenis layanan : ");
            trans = input.nextInt();
            switch (trans) {
                case 1:
                    do {
                        System.out.println("===========================================");
                        System.out.println("Pilihan jenis DVD Peminjaman :");
                        System.out.println("\t1. Daftar DVD Game");
                        System.out.println("\t2. Daftar DVD Film");
                        System.out.println("\t3. Daftar DVD Drama");

                        System.out.print("Masukkan Pilihan Anda : ");
                        pilih = input.nextInt();
                        switch (pilih) {
                            case 1:
                                daftarGame();
                                System.out.println("penyewaan maksimal 3 hari");
                                System.out.println("Harga untuk semua DVD Game adalah Rp 16.000,00");
                                System.out.print("Masukkan jumlah pinjam : ");
                                jumlah1 = input.nextInt();
                                for (int a = 0; a < jumlah1 ; a++) {
                                    System.out.print("Masukkan nomor pilihan : ");
                                    daftar = str.next();
                                    for (int i = 0; i < game.length; i++) {
                                        if (daftar.equalsIgnoreCase(game[i][0])) {
                                            System.out.println("nama Game : " + game[i][1]);
                                            for(int j = 0; j < daftar_pinjam.length; j ++){
                                                daftar_pinjam[j] = game[i][1];
                                            }
                                        }
                                    }
                                }
////                                System.out.print("Masukkan Nama : ");
//                                nama = str.next();

                                for (int i = 0; i < k.length; i++) {
                                    k[i] = harga[2] * jumlah1;
                                }
                                System.out.println(k);
                                break;
                            case 2:
                                daftarFilm();
                                System.out.println("penyewaan maksimal 3 hari");
                                System.out.println("Harga untuk semua DVD Film adalah Rp 12.000,00");
                                System.out.print("Masukkan jumlah pinjam : ");
                                jumlah2 = input.nextInt();
                                for (int a = 0; a < jumlah2 ; a++) {
                                    System.out.print("Masukkan nomor pilihan : ");
                                    daftar = str.next();
                                    for (int i = 0; i < film.length; i++) {
                                        if (daftar.equalsIgnoreCase(film[i][0])) {
                                            System.out.println("nama Film : " + film[i][1]);
                                            for(int j = 0; j < daftar_pinjam.length; j ++){
                                                daftar_pinjam[j] = film[i][1];
                                            }
                                        }
                                    }
                                }
                                for (int i = 0; i < k.length; i++) {
                                    k[i] = harga[0] * jumlah2;
                                }
                                System.out.println(k);
                                break;
                            case 3:
                                daftarDrama();
                                System.out.println("penyewaan maksimal 3 hari");
                                System.out.println("Harga untuk semua DVD Drama adalah Rp 15.000,00");
                                System.out.print("Masukkan jumlah pinjam : ");
                                jumlah3 = input.nextInt();
////                                System.out.print("Masukkan Nama : ");
//                                nama = str.next();
                                for (int a = 0; a < jumlah3 ; a++) {
                                    System.out.print("Masukkan nomor pilihan : ");
                                    daftar = str.next();
                                    for (int i = 0; i < drama.length; i++) {
                                        if (daftar.equalsIgnoreCase(drama[i][0])) {
                                            System.out.println("nama drama : " + drama[i][1]);
                                            for(int j = 0; j < daftar_pinjam.length; j ++){
                                                daftar_pinjam[j] = drama[i][1];
                                            }
                                        }
                                    }
                                }
                                for (int i = 0; i < k.length; i++) {
                                    k [i] = harga[1] * jumlah3;
                                }
                                System.out.println(k);
                                break;

                        }
                        System.out.print("Apakah anda ingin memilih jenis DVD lagi ? ");
                        opsi1 = str.next().charAt(0);
                    } while (opsi1 == 'y' || opsi1 == 'Y');
                    //laporan transaksi
                    System.out.println("===============================");
                    System.out.println("List Judul DVD/Game yang disewa\t: ");
                    System.out.println("-------------------------------");
                    jumlah_total = jumlah1 + jumlah2 + jumlah3;
                    System.out.println(jumlah_total);
                    for (int i = 0; i < jumlah_total ; i++) {
                        System.out.println(daftar_pinjam[i]);
                    }
                    System.out.print("total harga\t:");
                    for (int i = 0; i < k.length; i++) {
                        h = h + k[i];
                    }
                    System.out.println(h);
                    System.out.print("Uang Pembayaran\t: ");
                    uang = input.nextInt();
                    System.out.println("Uang Kembalian\t: " + (uang - h));
                    break;
                case 2:
                    for (int i = 0; i < jumlah_total; i++) {
                        System.out.println(daftar_pinjam[i]);
                    }
                    System.out.println("Apakah pengembalian terlamat ?");
                    telat = input.next().charAt(0);
                    if (telat == 'y' || telat == 'Y') {
                        System.out.println("Berapa hari : ");
                        telat_hari = input.nextInt();
                        denda = telat_hari * 2000;
                        System.out.print("Denda : " + denda);
                        System.out.println("");
                        System.out.print("Bayar : ");
                        bayar_denda = input.nextInt();
                        kembalian_denda = bayar_denda - denda;
                        System.out.println("Kembalian : " + kembalian_denda);
                        System.out.println("Terimakasih");
                    } else {
                        System.out.println("Terimakasih");
                    }
                    break;
            }
            System.out.print("Apakah anda ingin melakukan layanan kembali (y/n) ? ");
            opsi = str.next().charAt(0);
        } while (opsi == 'y' || opsi == 'Y');
    }

    public static void daftarGame() {
        System.out.println("Daftar DVD Game : ");
        System.out.println("\t+---------------------------------------+");
        System.out.println("\tNo.\t|\tJudul Game\t|");
        System.out.println("\t+---------------------------------------+");
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                System.out.print("\t" + game[i][j] + "\t|");
            }
            System.out.println(" ");

        }
        System.out.println("\t+---------------------------------------+");
    }

    public static void daftarFilm() {
        System.out.println("Daftar DVD Film :");
        System.out.println("\t+-----------------------------------------------+");
        System.out.println("\tNo.\t|\tJudul Film\t|\tGenre\t|");
        System.out.println("\t+-----------------------------------------------+");
        for (int i = 0; i < film.length; i++) {
            for (int j = 0; j < film[0].length; j++) {
                System.out.print("\t" + film[i][j] + "\t|");
            }
            System.out.println(" ");
        }
        System.out.println("\t+-----------------------------------------------+");
    }

    public static void daftarDrama() {
        System.out.println("Daftar DVD Serial Drama Asia :");
        System.out.println("\t+-----------------------------------------------+");
        System.out.println("\tNo.\t|\tJudul Drama\t|\tGenre\t\t|");

        for (int i = 0; i < drama.length; i++) {
            for (int j = 0; j < drama[0].length; j++) {
                System.out.print("\t|" + drama[i][j] + "\t|");
            }
            System.out.println(" ");
        }
        System.out.println("\t+-----------------------------------------------+");
    }
}

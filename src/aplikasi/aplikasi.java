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
//class untuk tanggal
import java.text.SimpleDateFormat;
import java.util.Calendar;
//try catch
import java.text.ParseException;
import java.io.IOException;
import java.io.*;
import java.nio.file.*;

public class aplikasi {

    static String[][] film = {
        {"1", "karate kids", "Action"}, {"2", "Twilight ", "Fantasy"},
        {"3", "Spider-man ", "Laga"}, {"4", "Train to Busan", "Fantasy"},
        {"5", "Pitch Perfect", "Music"}, {"6", "anaconda", "Romance"},
        {"7", "Star Wars", "Action"}, {"8", "Black Panther", "Action"},
        {"9", "Maddah Danur 2", "Horror"}, {"10", "Insidius 3", "Horror"}, {"11", "Avengers ", "Action"}
    };
    static String[][] drama = {
        {"1", "Lady With Class", "Romance"}, {"2", "Descendant of the Sun", "Romance"}, {"3", "Let's Fight Ghosh", "Mistery"},
        {"4", "Itakiss 2 in Okinawa", "Romance"}, {"5", "Tomorrow With You", "Fantasy"}
    };
    static String[][] game = {
        {"1", "God of War"}, {"2", "Resident Evil 5"},
        {"3", "FIFA Soccer"}, {"4", "Mortal Combat"},
        {"5", "Assassin’s"}, {"6", "Need for Speed"},
        {"7", "Call of Duty"}, {"8", "PES 2018"},
        {"9", "NBA 2018"}, {"10", "Resistance"},
        {"11", "Red Faction"}, {"12", "BlazBlue"},
        {"13", "Street Fighter"}, {"14", "Battlefield"}, {"15", "Guitar Hero 5"}};
    static String daftar_pinjam[] = new String[99];
    static int[][] kasir = new int[99][99]; // Untuk menampung jumlah pinjam dan harga setiap barang
    static int jumlah1, jumlah2, jumlah3;
    //input tanggal tanggal pada bentuk string
    static String oldDate = "";

    public static void main(String[] args) throws Exception {
        int pilih, trans, denda, telat_hari, h = 0, count = 0, kembalian_denda, bayar_denda, uang; // Count digunakan untuk peletakan index array.
        int[] k = new int[10];
        String daftar, nama;
        char opsi, opsi1, telat;
        Scanner input = new Scanner(System.in); //untuk input data integer(bilangan)
        Scanner str = new Scanner(System.in);   //untuk input data string
        Scanner strline = new Scanner(System.in); //untuk string yang mengandung spasi

        System.out.println("\t  ----------------EAGLE ZONE RENTAL-------------------");
        System.out.println("PENYEWAAN DVD FILM , SERIAL DRAMA ASIA (KOREA, JEPANG DAN THAILAND) DAN GAME");
        System.out.println("============================================================================");
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
                    pilih = str.nextInt();
                    switch (pilih) {
                        case 1:
                            daftarGame();
                            System.out.println("penyewaan maksimal 3 hari");
                            System.out.println("Harga untuk semua DVD Game adalah Rp 16.000,00");
                            System.out.print("Masukkan nomor pilihan : ");
                            daftar = str.next();
                            for (int i = 0; i < game.length; i++) {
                                if (daftar.equalsIgnoreCase(game[i][0])) {
                                    System.out.println("nama Game : " + game[i][1]);
                                    for (int j = 0; j < daftar_pinjam.length; j++) {
                                        daftar_pinjam[count] = game[i][1];
                                        kasir[count][0] = 1; // menampung jumlah
                                        kasir[count][1] = 16000; // menampung harga
                                    }
                                }
                            }
                            System.out.println("Harga : " + kasir[count][1]);
                            break;
                        case 2:
                            daftarFilm();
                            System.out.println("penyewaan maksimal 3 hari");
                            System.out.println("Harga untuk semua DVD Film adalah Rp 12.000,00");
                            System.out.print("Masukkan nomor pilihan : ");
                            daftar = str.next();
                            for (int i = 0; i < film.length; i++) {
                                if (daftar.equalsIgnoreCase(film[i][0])) {
                                    System.out.println("nama Film : " + film[i][1]);
                                    for (int j = 0; j < daftar_pinjam.length; j++) {
                                        daftar_pinjam[count] = film[i][1];
                                        kasir[count][0] = 2;
                                        kasir[count][1] = 12000;
                                    }
                                }
                            }
                            System.out.println("Harga : " + kasir[count][1]);
                            break;
                        case 3:
                            daftarDrama();
                            System.out.println("penyewaan maksimal 3 hari");
                            System.out.println("Harga untuk semua DVD Drama adalah Rp 15.000,00");
                            System.out.print("Masukkan nomor pilihan : ");
                            daftar = str.next();
                            for (int i = 0; i < drama.length; i++) {
                                if (daftar.equalsIgnoreCase(drama[i][0])) {
                                    System.out.println("nama drama : " + drama[i][1]);
                                    for (int j = 0; j < daftar_pinjam.length; j++) {
                                        daftar_pinjam[count] = drama[i][1];
                                        kasir[count][0] = 3;
                                        kasir[count][1] = 15000;
                                    }
                                }
                            }
                            System.out.println("Harga : " + kasir[count][1]);
                            break;
                        default:
                            System.out.println("Pilihan hanya sampai 3");
                            break;
                    }
                    System.out.print("Apakah anda ingin memilih DVD lagi (Y/T) ? ");
                    opsi1 = str.next().charAt(0);
                    count++; // Untuk peletakan index array kasir
                } while (opsi1 == 'y' || opsi1 == 'Y');
                //laporan transaksi
                System.out.println("================================================");
                System.out.println("\t\t\tTransaksi");
                System.out.print("Masukkan Nama Peminjam : ");
                nama = strline.nextLine();
                System.out.print("Masukkan Tanggal Pinjam (format dd-MM-yyyy): ");
                oldDate = str.next();
                System.out.println("total harga\t:" + hitungTotal());
                System.out.print("Uang Pembayaran\t: ");
                uang = input.nextInt();
                System.out.println("Uang Kembalian\t: " + (uang - hitungTotal()));
                System.out.println("-------------------------------------------------------");
                //laporan
                SaveLaporan(nama, uang);
                TampilLaporan(nama);
                break;
            case 2:
                System.out.println("Masukkan Nama Peminjam : ");
                nama = strline.nextLine();
                TampilLaporan(nama);
                System.out.println("");
//              System.out.println("Masukkan ulang tanggal pengembalian : ");
                System.out.println("Apakah pengembalian terlamat (Y/T)?");
                telat = input.next().charAt(0);
                String name = nama;
                if (telat == 'y' || telat == 'Y') {
                    System.out.println("Berapa hari\t: ");
                    telat_hari = input.nextInt();
                    denda = telat_hari * 2000;
                    System.out.print("Denda\t: " + denda);
                    System.out.println("");
                    System.out.print("Uang Pembayaran : ");
                    bayar_denda = input.nextInt();
                    kembalian_denda = bayar_denda - denda;
                    System.out.println("Uang Kembalian : " + kembalian_denda);
                    System.out.println("Terimakasih");
                    HapusLaporan(name);
                } else {
                    System.out.println("Terimakasih");
                    HapusLaporan(name);
                }
                break;
            default:
                System.out.println("pilihan hanya sampai 2");
                break;
        }
    }

    //=========================================FUNCTION===================================================
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
        System.out.println("\tNo.\t|\tJudul Drama\t\t|\tGenre\t\t|");

        for (int i = 0; i < drama.length; i++) {
            for (int j = 0; j < drama[0].length; j++) {
                System.out.print("\t|" + drama[i][j] + "\t|");
            }
            System.out.println(" ");
        }
        System.out.println("\t+-----------------------------------------------+");
    }

    // Untuk menghitung total belanja
    public static int hitungTotal() {
        int value = 0;
        for (int i = 0; i < kasir.length; i++) {
            if (kasir[i][0] != 0 && kasir[i][1] != 0) {
                value += kasir[i][1];
            } else {
                value += kasir[i][1];
            }
        }
        return value;
    }

    //untuk format tanggal peminjaman dan pengembalian
    public static String DateOut(String oldDate) {
        //Menentukan format tanggal yang sesuai dengan tanggal yang ditentukan
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try {
            //pengaturan tanggal sesuai tanggal yang diberikan
            c.setTime(sdf.parse(oldDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DAY_OF_MONTH, 3);
        //tanggal setelah ditambahkan
        String newDate = sdf.format(c.getTime());
        return newDate;
    }

    //menyimpan struk
    public static void SaveLaporan(String nama, int uang) {
        try {
            File file = new File(nama + ".txt");
            boolean s = file.createNewFile();
            if (s) {
                System.out.println("Struk Berhasil Disimpan");
            } else {
                System.out.println("file sudah ada");
            }
            PrintWriter y = new PrintWriter(file);
            y.println("\t|-------------------------------------------------------|");
            y.println("\t|Nama Peminjam : " + nama);
            y.println("\t|Tanggal Peminjaman : " + oldDate);
            y.println("\t|-------------------------------------------------------|");
            y.println("\t|judul DVD/Game\t\tjenis DVD Pinjam\tHarga");
            for (int i = 0; i < daftar_pinjam.length; i++) {
                if (daftar_pinjam[i] != null) {
                    y.println("\t|" + daftar_pinjam[i] + "\t\t" + kasir[i][0] + "\t\t\t" + kasir[i][1]);
                } else {
                    break;
                }
            }
            y.println("\t|-------------------------------------------------------|");
            y.println("\t|total harga\t\t: Rp " + hitungTotal() + ",00\t\t\t|");
            y.println("\t|Uang Pembayaran\t: Rp " + uang + ",00\t\t\t|");
            y.println("\t|Uang Kembalian\t\t: Rp " + (uang - hitungTotal()) + ",00\t\t\t|");
            y.println("\t|Tanggal Pengembalian\t: " + DateOut(oldDate) + "\t\t\t|");
            y.println("\t|-------------------------------------------------------|");
            y.close();
        } catch (IOException e) {
            System.out.println("kesalahan terjadi:");
            e.printStackTrace();
        }
    }

    //tampilkan laporan
    public static void TampilLaporan(String name) throws FileNotFoundException {
        File file
                = new File(name + ".txt");
        Scanner tampil = new Scanner(file);

        while (tampil.hasNextLine()) {
            System.out.println(tampil.nextLine());
        }
    }

    //menghapus struk
    public static void HapusLaporan(String nama) {
        File file = new File(nama + ".txt");
        file.delete();
        if (!file.delete()) {
            System.out.println("Could not delete file");
        }

    }
}

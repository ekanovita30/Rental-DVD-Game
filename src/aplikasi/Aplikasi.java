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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih,daftar;
        System.out.println("\t  ----------------EAGLE ZONE RENTAL-------------------");
        System.out.println("PENYEWAAN DVD FILM , SERIAL DRAMA ASIA (KOREA, JEPANG DAN THAILAND) DAN GAME");
        //System.out.println("============================================================================");
        System.out.println("Pilihan Peminjaman DVD");
        System.out.println("\t1. Daftar DVD Game");
        System.out.println("\t2. Daftar DVD Film");
        System.out.println("\t3. Daftar DVD Drama");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                daftarGame();
                System.out.println("penyewaan maksimal 3 hari");
                System.out.println("Harga untuk semua DVD Game adalah Rp 15.000,00");
                System.out.println("Masukkan nomor pilihan : ");
                daftar = input.nextInt();
                
                break;
            case 2:
                daftarFilm();

                break;
            case 3:
                daftarDrama();
                break;
        }

    }

    public static void daftarFilm() {
        System.out.println("Daftar DVD Film :");
        System.out.println("\t+-----------------------------------------------+");
        String[][] film = {{"\t|No.\t|", "\tJudul Film\t|", "Genre\t\t|"}, {"\t|1.\t|", "Avengers Invinity War\t|", "Action\t|"},
        {"\t|2.\t|", "The Battleship Island\t|", "Action\t|"}, {"\t|3.\t|", "Twilight Bracking Down|", "Fantasy\t|"},
        {"\t|4.\t|", "Spider-man Homecoming\t|", "Laga\t\t|"}, {"\t|5.\t|", "Train to Busan\t|", "Fantasy\t|"},
        {"\t|6.\t|", "Pitch Perfect 3\t|", "Music\t\t|"}, {"\t|7.\t|", "Beauty and the Beast\t|", "Romance\t|"},
        {"\t|8.\t|", "Star Wars\t\t|", "Action\t|"}, {"\t|9.\t|", "Black Panther\t\t|", "Action\t|"},
        {"\t|10.\t|", "Maddah Danur 2\t|", "Horror\t|"}, {"\t|11.\t|", "Incidius 3\t\t|", "Horror\t|"}

        };
        for (int i = 0; i < film.length; i++) {
            for (int j = 0; j < film[0].length; j++) {
                if (i == 0 && j == 2) {
                    System.out.println(film[i][j] + " ");
                    System.out.println("\t+-----------------------------------------------+");
                } else {
                    System.out.print(film[i][j] + " ");
                }

            }
            System.out.println(" ");
        }
        System.out.println("\t+-----------------------------------------------+");
    }

    public static void daftarGame() {
        System.out.println("Daftar DVD Game : ");
        System.out.print("\t+-----------------------------------------------+");
        String[][] game = {{"\t|No.\t|", "\tJudul Game\t|"}, {"\t|1.\t|", "Guitar Hero 5\t|"},
        {"\t|2.\t|", "\tGod of War\t|"}, {"\t|3.\t|", "Resident Evil 5\t|"},
        {"\t|4.\t|", "\tFIFA Soccer\t|"}, {"\t|5.\t|", "DiRT \t|"},
        {"\t|6.\t|", "\tAssassin’s\t|"}, {"\t|7.\t|", "Need for Speed\t|"},
        {"\t|8.\t|", "\tCall of Duty\t|"}, {"\t|9.\t|", "Grand Theft Auto\t|"},
        {"\t|10.\t|", "\tBurnout\t|"}, {"\t|11.\t|", "Resistance\t|"},
        {"\t|12.\t|", "\tRed Faction\t|"}, {"\t|13.\t|", "BlazBlue\t|"},
        {"\t|14.\t|", "\tSuper Street Fighter \t|"}, {"\t|15.\t|", " Battlefield\t|"},};
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 1; j++) {
                if (i == 0 && j == 1) {
                    System.out.println(game[i][j] + " ");
                    System.out.print("\t+-----------------------------------------------+");
                } else {
                    System.out.print(game[i][j] + " ");
                }

            }
            System.out.println(" ");

        }
        System.out.println("\t+-----------------------------------------------+");
    }

    public static void daftarDrama() {
        System.out.println("Daftar DVD Serial Drama Asia :");
        System.out.println("\t+-----------------------------------------------+");
        String[][] drama = {{"\t|No.\t|", "\tJudul Drama\t|", "Genre\t\t|"}, {"\t|1.\t|", "Two Cops\t\t|", "Fantasy\t|"},
        {"\t|2.\t|", "Descendant of the Sun\t|", "Romance\t|"}, {"\t|3.\t|", "Let's Fight Ghosh\t|", "Mistery\t|"},
        {"\t|4.\t|", "Itakiss 2 in Okinawa\t|", "Romance\t|"}, {"\t|5.\t|", "Goblin\t\t|", "Fantasy\t|"}

        };
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i == 0 && j == 2) {
                    System.out.println(drama[i][j] + " ");
                    System.out.print("\t+-----------------------------------------------+");
                } else {
                    System.out.print(drama[i][j] + " ");
                }

            }
            System.out.println(" ");
        }
        System.out.println("\t+-----------------------------------------------+");
    }

}

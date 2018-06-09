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
        int pilih, daftar;

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

    public static void daftarGame() {
        String[][] game = {
            {"1", "God of War"}, {"2", "Resident Evil 5"},
            {"3", "FIFA Soccer"}, {"4", "DiRT"},
            {"5", "Assassin’s"}, {"6", "Need for Speed"},
            {"7", "Call of Duty"}, {"8", "Grand Theft Auto"},
            {"9", "Burnout"}, {"10", "Resistance"},
            {"11", "Red Faction"}, {"12", "BlazBlue"},
            {"13", "Super Street Fighter"}, {"14", " Battlefield"}};
        System.out.println("Daftar DVD Game : ");
        System.out.print("\t+-----------------------------------------------+");
        System.out.println("\t|No.\t|\tJudul Game\t|\t|1.\t|Guitar Hero 5\t|");
        System.out.print("\t+-----------------------------------------------+");
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                System.out.print(game[i][j] + "\t|");
            }
            System.out.println(" ");

        }
        System.out.println("\t+---------------------------------------------+");
    }

    public static void daftarFilm() {
        String[][] film = {{},
        {"1", "The Battleship Island", "Action"}, {"2", "Twilight Bracking Down", "Fantasy"},
        {"3", "Spider-man Homecoming", "Laga"}, {"4", "Train to Busan", "Fantasy"},
        {"5", "Pitch Perfect", "Music"}, {"6", "Beauty and the Beast", "Romance"},
        {"7", "Star Wars", "Action"}, {"8", "Black Panther", "Action"},
        {"9", "Maddah Danur 2", "Horror"}, {"10", "Incidius 3", "Horror"}
        };
        
        System.out.println("Daftar DVD Film :");
                System.out.println("\t+-----------------------------------------------+");
                System.out.println("\tNo.\t|\tJudul Film\t|\tGenre\t\t|\t|1.\t|Avengers Invinity War\t|Action\t|");
                System.out.println("\t+-----------------------------------------------+");
                for (int i = 0; i < film.length; i++) {
                    for (int j = 0; j < film[0].length; j++) {
                        System.out.println(film[i][j] + "\t|");
                    }
                    System.out.println(" ");
                }
                System.out.println("\t+-----------------------------------------------+");
    }

    public static void daftarDrama() {
        String[][] drama = {{"1", "Two Cops", "Fantasy"},
        {"2", "Descendant of the Sun", "Romance"}, {"3", "Let's Fight Ghosh", "Mistery"},
        {"4", "Itakiss 2 in Okinawa", "Romance"}, {"5", "Goblin", "Fantasy"}

        };
        System.out.println("Daftar DVD Serial Drama Asia :");
                System.out.println("\t+-----------------------------------------------+");
                System.out.println("\t|No.\t|\tJudul Drama\t|\tGenre\t\t|");

                for (int i = 0; i < drama.length; i++) {
                    for (int j = 0; j < drama[0].length; j++) {
                        System.out.println(drama[i][j] + "\t|");

                    }
                    System.out.println(" ");
                }
                System.out.println("\t+-----------------------------------------------+");
    }

}

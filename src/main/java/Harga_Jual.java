/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THINKPAD
 */
import java.util.Scanner;
public class Harga_Jual {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga beli: ");
        double hargaBeli = input.nextDouble();

        System.out.print("Masukkan persentase keuntungan: " + "%");
        double persentaseKeuntungan = input.nextDouble();

        double hargaJual = hitungHargaJual(hargaBeli, persentaseKeuntungan);

        System.out.println("Harga jual: " + hargaJual);
    }

    public static double hitungHargaJual(double hargaBeli, double persentaseKeuntungan) {
        double keuntungan = hargaBeli * (persentaseKeuntungan / 100);
        double hargaJual = hargaBeli + keuntungan;
        return hargaJual;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Persentase_Keuntungan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga beli: ");
        double hargaBeli = input.nextDouble();

        System.out.print("Masukkan harga jual: ");
        double hargaJual = input.nextDouble();

        double persentaseKeuntungan = hitungPersentaseKeuntungan(hargaBeli, hargaJual);

        System.out.println("Persentase Keuntungan: " + persentaseKeuntungan + "%");
    }

    public static double hitungPersentaseKeuntungan(double hargaBeli, double hargaJual) {
        double keuntungan = hargaJual - hargaBeli;
        double persentaseKeuntungan = (hargaBeli * 100) / keuntungan;
        return persentaseKeuntungan;
    }
}



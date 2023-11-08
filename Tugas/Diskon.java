package Tugas;
import java.util.Scanner;
public class Diskon {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Total Pembelian Rp. =");
        int harga = masukan.nextInt();
        double diskon, totalBelanja;
        if (harga < 50000) {
            diskon = harga * 0.05;
            totalBelanja = harga-diskon;
        }else{
            diskon = harga *0.2;
            totalBelanja = harga-diskon;
                }
        System.out.println("Total pembelian "+harga);
                System.out.println("besarnya potongan Rp. " + diskon);
                System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBelanja);
            }
        }
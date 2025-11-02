// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ArrayOfRecord;

import java.util.Scanner;

public class product {
   int Kode;
   String Jenis;
   String Nama;
   double Harga;

   public product() {
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Input kode barang: ");
      this.Kode = sc.nextInt();
      sc.nextLine();
      System.out.print(" Input Jenis barang: ");
      this.Jenis = sc.nextLine();
      System.out.print(" Input Nama barang: ");
      this.Nama = sc.nextLine();
      System.out.print(" Input Harga barang: ");
      this.Harga = sc.nextDouble();
   }

   void Tulis() {
      System.out.println("Kode: " + this.Kode);
      System.out.println("Jenis: " + this.Jenis);
      System.out.println("Nama: " + this.Nama);
      System.out.println("Harga: " + this.Harga);
   }

   public static void main(String[] args) {
      product HargaJual = new product();
      HargaJual.Baca();
      HargaJual.Tulis();
   }
}

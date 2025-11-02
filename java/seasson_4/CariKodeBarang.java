// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_4;

import java.util.Scanner;

public class CariKodeBarang {
   int Kode;
   String Nama;
   String Jenis;
   double Harga;

   public CariKodeBarang() {
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input kode barang: ");
      this.Kode = sc.nextInt();
      sc.nextLine();
      System.out.print("Input nama barang: ");
      this.Nama = sc.nextLine();
      System.out.print("Input jenis barang: ");
      this.Jenis = sc.nextLine();
      System.out.print("Input harga barang: ");
      this.Harga = sc.nextDouble();
   }

   void Tulis() {
      System.out.println("Kode barang: " + this.Kode);
      System.out.println("Nama barang: " + this.Nama);
      System.out.println("Jenis barang: " + this.Jenis);
      System.out.println("Harga barang: " + this.Harga);
   }

   static void cariBarang(CariKodeBarang[] daftar, int kodeDicari) {
      boolean ditemukan = false;
      CariKodeBarang[] var6 = daftar;
      int var5 = daftar.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         CariKodeBarang p = var6[var4];
         if (p.Kode == kodeDicari) {
            System.out.println("\nBarang ditemukan:");
            p.Tulis();
            ditemukan = true;
            break;
         }
      }

      if (!ditemukan) {
         System.out.println("\nBarang dengan kode " + kodeDicari + " tidak ditemukan.");
      }

   }

   static void tampilkanSemua(CariKodeBarang[] daftar) {
      System.out.println("\n=== Seluruh Data Barang ===");

      for(int i = 0; i < daftar.length; ++i) {
         System.out.println("\nData barang ke-" + (i + 1));
         daftar[i].Tulis();
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan jumlah barang: ");
      int jumlah = sc.nextInt();
      CariKodeBarang[] daftarBarang = new CariKodeBarang[jumlah];

      int kodeDicari;
      for(kodeDicari = 0; kodeDicari < jumlah; ++kodeDicari) {
         System.out.println("\nData barang ke-" + (kodeDicari + 1));
         daftarBarang[kodeDicari] = new CariKodeBarang();
         daftarBarang[kodeDicari].Baca();
      }

      System.out.print("\nMasukkan kode barang yang ingin dicari: ");
      kodeDicari = sc.nextInt();
      cariBarang(daftarBarang, kodeDicari);
      tampilkanSemua(daftarBarang);
   }
}

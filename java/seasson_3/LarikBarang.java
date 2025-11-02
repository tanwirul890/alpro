// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_3;

import java.util.Scanner;

public class LarikBarang {
   int Nmaks = 3;
   Barang[] a;

   public LarikBarang() {
      this.a = new Barang[this.Nmaks];
   }

   void Baca() {
      new Scanner(System.in);

      for(int i = 0; i < this.Nmaks; ++i) {
         Barang x = new Barang();
         System.out.println("" + i + " Barang: ");
         x.Baca();
         this.a[i] = x;
      }

   }

   void Tulis() {
      for(int i = 0; i < this.Nmaks; ++i) {
         System.out.println("" + i + " ");
         this.a[i].Tulis();
      }

   }

   void CariBarang1() {
      int kodecari = 102;
      boolean ditemukan = false;

      for(int i = 0; i < this.Nmaks; ++i) {
         if (this.a[i].KodeBrg == kodecari) {
            System.out.println("Barang yang dicari ditemukan di " + i);
            this.a[i].Tulis();
            ditemukan = true;
            break;
         }
      }

      if (!ditemukan) {
         System.out.print("Barang yang dicari tidak ditemukan");
      }

   }

   void CariBarang2(int kodecari) {
      boolean ditemukan = false;

      for(int i = 0; i < this.Nmaks; ++i) {
         if (this.a[i].KodeBrg == kodecari) {
            System.out.println("Barang yang dicari ditemukan di " + i);
            this.a[i].Tulis();
            ditemukan = true;
            break;
         }
      }

      if (!ditemukan) {
         System.out.print("Barang yang dicari tidak ditemukan");
      }

   }

   void TurunkanHarga(double p, int N) {
      for(int i = 0; i < N; ++i) {
         double diskonHarga = p / 100.0 * this.a[i].HargaBrg;
         this.a[i].HargaBrg -= diskonHarga;
      }

   }

   static void BacaBarang(Barang[] a) {
      for(int i = 0; i < a.length; ++i) {
         System.out.println("Kode barang: " + a[i].KodeBrg);
         System.out.println("Harga barang: " + a[i].HargaBrg);
      }

   }

   public static void main(String[] args) {
      new Scanner(System.in);
      new LarikBarang();
      Barang[] a = new Barang[]{new Barang(1, 29999.0), new Barang(35, 20.0), new Barang(102, 235435.0)};
      BacaBarang(a);
   }
}

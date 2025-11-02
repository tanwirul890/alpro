// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ArrayOfRecord;

import java.util.Scanner;

public class LarikBarang {
   int Nmaks = 3;
   Barang[] a;

   public LarikBarang() {
      this.a = new Barang[this.Nmaks];
   }

   void Baca() {
      new Scanner(System.in);
      Barang x = new Barang();

      for(int i = 0; i < this.Nmaks; ++i) {
         System.out.println("" + i + "Barang:");
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

   public static void main(String[] args) {
      LarikBarang HargaJual = new LarikBarang();
      HargaJual.Baca();
      HargaJual.Tulis();
   }
}

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_3;

import java.util.Scanner;

public class ArrayProduct {
   int Nmaks = 3;
   Product[] a;

   public ArrayProduct() {
      this.a = new Product[this.Nmaks];
   }

   void Baca() {
      new Scanner(System.in);

      for(int i = 0; i < this.Nmaks; ++i) {
         System.out.println("\nData ke-" + (i + 1));
         this.a[i] = new Product();
         this.a[i].Baca();
      }

   }

   void Tulis() {
      System.out.println("\n--- Daftar Produk ---");

      for(int i = 0; i < this.Nmaks; ++i) {
         System.out.println("\nData ke-" + (i + 1));
         this.a[i].Tulis();
      }

   }

   public static void main(String[] args) {
      ArrayProduct HargaJual = new ArrayProduct();
      HargaJual.Baca();
      HargaJual.Tulis();
   }
}

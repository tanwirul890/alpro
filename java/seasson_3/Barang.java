// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_3;

import java.util.Scanner;

public class Barang {
   int KodeBrg;
   double HargaBrg;

   public Barang() {
   }

   public Barang(int kode, double harga) {
      this.KodeBrg = kode;
      this.HargaBrg = harga;
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);
      System.out.print("input Kode barang: ");
      this.KodeBrg = sc.nextInt();
      System.out.print("input Harga barang: ");
      this.HargaBrg = sc.nextDouble();
   }

   void Tulis() {
      System.out.println("Kode barang: " + this.KodeBrg);
      System.out.println("Harga barang: " + this.HargaBrg);
   }
}

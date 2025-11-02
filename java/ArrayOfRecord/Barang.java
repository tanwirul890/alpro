// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ArrayOfRecord;

import java.util.Scanner;

public class Barang {
   int KodeBrg;
   double HargaBrg;

   public Barang() {
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);
      System.out.print(" input Kode Barang: ");
      this.KodeBrg = sc.nextInt();
      System.out.print(" input Harga Barang: ");
      this.HargaBrg = (double)sc.nextInt();
   }

   void Tulis() {
      System.out.println(" Kode Barang: " + this.KodeBrg);
      System.out.println(" Harga Barang: " + this.HargaBrg);
   }

   public static void main(String[] args) {
      Barang A = new Barang();
      A.Baca();
      System.out.println(" Data Barang: " + A.KodeBrg);
      A.Tulis();
   }
}

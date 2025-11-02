// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_3;

import java.util.Scanner;

public class Product {
   int KodeBrg;
   String NamaBrg;
   double HargaBrg;
   int Jenis;

   public Product() {
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);
      System.out.print("input kode barang: ");
      this.KodeBrg = sc.nextInt();
      System.out.print("input Nama Barang: ");
      this.NamaBrg = sc.next();
      System.out.print("input Harga Barang: ");
      this.HargaBrg = sc.nextDouble();
      System.out.print("input Jenis Barang: ");
      this.Jenis = sc.nextInt();
   }

   void Tulis() {
      System.out.println("kode barang: " + this.KodeBrg);
      System.out.println("harga barang: " + this.NamaBrg);
      System.out.println("harga barang: " + this.HargaBrg);
      System.out.println("harga barang: " + this.Jenis);
   }

   public static void main(String[] args) {
      Product A = new Product();
      A.Baca();
      System.out.print("Data barang: ");
      A.Tulis();
   }
}

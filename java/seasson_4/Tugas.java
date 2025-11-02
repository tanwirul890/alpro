// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_4;

import java.util.Scanner;

public class Tugas {
   public Tugas() {
   }

   public static int karKeInt(char x) {
      return x - 48;
   }

   public static int konversiString(String s) {
      int hasil = 0;
      int pangkat = 1;

      for(int i = s.length() - 1; i >= 0; --i) {
         hasil += karKeInt(s.charAt(i)) * pangkat;
         pangkat *= 10;
      }

      return hasil;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan string angka: ");
      String str = input.nextLine();
      int nilai = konversiString(str);
      System.out.println("Hasil konversi ke integer: " + nilai);
      input.close();
   }
}

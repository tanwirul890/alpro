// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_4;

import java.util.Scanner;

public class KonversiStingInteger {
   public KonversiStingInteger() {
   }

   static int karakterToInteger(char x) {
      return x - 48;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan string angka: ");
      String s = input.nextLine();
      int n = 0;
      int pengali = 1;

      for(int i = s.length() - 1; i >= 0; --i) {
         n += karakterToInteger(s.charAt(i)) * pengali;
         pengali *= 10;
      }

      System.out.println("Hasil konversi ke integer: " + n);
   }
}

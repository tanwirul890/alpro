// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_3;

import java.util.Scanner;

public class ArrayMChar {
   public ArrayMChar() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = 5;
      int[] a = new int[N];
      int[] b = new int[N];
      System.out.println("Array A");

      int Sum;
      for(Sum = 0; Sum < N; ++Sum) {
         System.out.print("" + Sum + " input bil: ");
         a[Sum] = sc.nextInt();
      }

      for(Sum = 0; Sum < N; ++Sum) {
         System.out.println("" + Sum + " " + a[Sum]);
      }

      Sum = 0;

      int i;
      for(i = 0; i < N; ++i) {
         Sum += a[i];
      }

      System.out.println("Total isi array A= " + Sum);
      System.out.println("Nilai rata A= " + (double)Sum / (double)N);
      System.out.println("array B");

      for(i = 0; i < N; ++i) {
         System.out.print("" + i + " input bil: ");
         b[i] = sc.nextInt();
      }

      for(i = 0; i < N; ++i) {
         System.out.println("" + i + " " + b[i]);
      }

   }
}

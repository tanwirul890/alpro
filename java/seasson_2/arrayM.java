// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_2;

import java.util.Scanner;

public class arrayM {
   int N = 5;
   int[] a;

   public arrayM() {
      this.a = new int[this.N];
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      arrayM A = new arrayM();
      System.out.println("Array A");

      int Sum;
      for(Sum = 0; Sum < A.N; ++Sum) {
         System.out.print("" + Sum + " input bil: ");
         A.a[Sum] = sc.nextInt();
      }

      for(Sum = 0; Sum < A.N; ++Sum) {
         System.out.println("" + Sum + " " + A.a[Sum]);
      }

      Sum = 0;

      for(int i = 0; i < A.N; ++i) {
         Sum += A.a[i];
      }

      System.out.println("Total isi array A= " + Sum);
      System.out.println("Nilai rata array A= " + (double)Sum / (double)A.N);
   }
}



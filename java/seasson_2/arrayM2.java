// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_2;

import java.util.Scanner;

public class arrayM2 {
   int N = 5;
   int[] a;

   public arrayM2() {
      this.a = new int[this.N];
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);

      for(int i = 0; i < this.N; ++i) {
         System.out.print("" + i + " input bil: ");
         this.a[i] = sc.nextInt();
      }

   }

   void Tulis() {
      for(int i = 0; i < this.N; ++i) {
         System.out.println("" + i + " " + this.a[i]);
      }

   }

   double Total() {
      int Sum = 0;

      for(int i = 0; i < this.N; ++i) {
         Sum += this.a[i];
      }

      return (double)Sum;
   }

   int min() {
      int min = this.a[0];

      for(int i = 1; i < this.N; ++i) {
         if (this.a[i] < min) {
            min = this.a[i];
         }
      }

      return min;
   }

   static boolean ApakahSama(arrayM2 A1, arrayM2 A2) {
      if (A1.N != A2.N) {
         return false;
      } else {
         for(int i = 0; i < A1.N; ++i) {
            if (A1.a[i] != A2.a[i]) {
               return false;
            }
         }

         return true;
      }
   }

   void BubbleSortMenurun() {
      for(int i = 0; i < this.N - 1; ++i) {
         for(int j = 0; j < this.N - 1 - i; ++j) {
            if (this.a[j] < this.a[j + 1]) {
               int temp = this.a[j];
               this.a[j] = this.a[j + 1];
               this.a[j + 1] = temp;
            }
         }
      }

   }

   double Rata() {
      return this.Total() / (double)this.N;
   }

   public static void main(String[] args) {
      new Scanner(System.in);
      arrayM2 A = new arrayM2();
      arrayM2 B = new arrayM2();
      System.out.println("Array A:");
      A.Baca();
      A.Tulis();
      double S1 = A.Total();
      double R1 = A.Rata();
      System.out.println("Total Isi Array A = " + S1);
      System.out.println("Nilai Rata-rata Array A = " + R1);
      System.out.println("Nilai Terkecil Array A = " + A.min());
      System.out.println("\nArray B:");
      B.Baca();
      B.Tulis();
      double S2 = B.Total();
      double R2 = B.Rata();
      System.out.println("Total Isi Array B = " + S2);
      System.out.println("Nilai Rata-rata Array B = " + R2);
      System.out.println("Nilai Terkecil Array B = " + B.min());
      if (ApakahSama(A, B)) {
         System.out.println("\nKedua array sama.");
      } else {
         System.out.println("\nKedua array berbeda.");
      }

      System.out.println("\nArray A setelah diurutkan menurun:");
      A.BubbleSortMenurun();
      A.Tulis();
   }
}

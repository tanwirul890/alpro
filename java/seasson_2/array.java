
package seasson_2;

import java.util.Scanner;

public class array {
   public array() {
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
      System.out.println("Nilai rata array A= " + (double)Sum / (double)N);
      System.out.println("Array B");

      for(i = 0; i < N; ++i) {
         System.out.print("" + i + " input bil: ");
         b[i] = sc.nextInt();
      }

      for(i = 0; i < N; ++i) {
         System.out.println("" + i + " " + b[i]);
      }

   }
}

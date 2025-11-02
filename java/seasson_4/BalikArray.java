// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package seasson_4;

   import java.util.Scanner;

public class BalikArray {
   public BalikArray() {
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan kata: ");
      String kata = input.nextLine();
      char[] arr = kata.toCharArray();
      int n = arr.length;
      int i = 0;

      for(int j = n - 1; i < j; --j) {
         char temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         ++i;
      }

      String hasil = new String(arr);
      System.out.println("Hasil dibalik: " + hasil);
      input.close();
   }
}

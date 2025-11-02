package seasson_3;

import java.util.Scanner;

public class ArrayMChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] a = new int[N];
        int[] b = new int[N];

        // Input dan cetak Array A
        System.out.println("Array A:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " input bil: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Isi Array A:");
        for (int i = 0; i < N; i++) {
            System.out.println(i + " " + a[i]);
        }

        // Hitung total dan rata-rata Array A
        int sumA = 0;
        for (int i = 0; i < N; i++) {
            sumA += a[i];
        }

        double rataA = (double) sumA / N;
        System.out.println("Total isi array A = " + sumA);
        System.out.println("Nilai rata-rata A = " + rataA);

        // Input dan cetak Array B
        System.out.println("\nArray B:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " input bil: ");
            b[i] = sc.nextInt();
        }

        System.out.println("Isi Array B:");
        for (int i = 0; i < N; i++) {
            System.out.println(i + " " + b[i]);
        }

        sc.close();
    }
}
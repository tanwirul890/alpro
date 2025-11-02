package ARRAY;

public class ArrayChar {
    int N;
    char[] a;

   
    public ArrayChar() {
        N = 0;
        a = new char[100]; // 
    }

    
    void baca(String S) {
        N = S.length();
        for (int i = 0; i < N; i++) {
            a[i] = S.charAt(i);
        }
    }


    void tulis() {
        for (int i = 0; i < N; i++) {
            System.out.println(i + " karakter: " + a[i]);
        }
    }

  
    boolean palindrom() {
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (a[i] != a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    
    boolean ApakahSama(ArrayChar Lain) {
        if (N != Lain.N) return false;
        for (int i = 0; i < N; i++) {
            if (a[i] != Lain.a[i]) return false;
        }
        return true;
    }

    
    static boolean ApakahSama(ArrayChar A, ArrayChar B) {
        return A.ApakahSama(B);
    }

 
    public static void main(String[] args) {
        String S = "sinta sari";

        System.out.println("Panjang String \"" + S + "\" adalah " + S.length());

            {
                ArrayChar A = new ArrayChar();
                ArrayChar B = new ArrayChar();
    
                A.baca(S);
                System.out.println("Array A:");
                A.tulis();
    
                boolean P = A.palindrom();
                System.out.println("Apakah kata \"" + S + "\" adalah palindrome? " + P);
    
                B.baca(S);
                System.out.println("Array B:");
                B.tulis();
    
                System.out.println("Apakah Array A = Array B? " + A.ApakahSama(B));
                System.out.println("Apakah A (Static) = B (Static)? " + ArrayChar.ApakahSama(A, B));
            }
        }
    }
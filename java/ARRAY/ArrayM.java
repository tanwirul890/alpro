package ARRAY;

import java.util.Scanner;

public class ArrayM {
	int N=5;
	int[] a=new int[N];
	
	void Baca() {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<N;i++) {
			System.out.print(i+" input bil: "); a[i]=sc.nextInt();
			sc.close();	
		}

	}
	
	void Tulis() {
		for (int i=0;i<N;i++) {
			System.out.println(i+" "+ a[i]);
		}
	}
	
	int HitungTotal() {
		int T=0;
		for (int i=0;i<N;i++) {
			T= T+a[i];
		}
		return T;
	}
	
	void Rata(int T) {
		System.out.println("nilai rata-rata array A= "+(double) T/N);
	}
	
	int GetM() {
		int M=a[0];
		for (int i=0;i<N;i++) {
			if (a[i]<M)
				M=a[i];
		}
		return M;
	}
	
	boolean ApakahSama(ArrayM B) {
		boolean S=true;
		for (int i=0;i<N;i++) {
			if (a[i]!= B.a[i])
				S=false;
		}
		return S;
	}
	
	static boolean IsSama(ArrayM A, ArrayM B) {
		boolean S=true;
		for (int i=0;i<A.N;i++) {
			if (A.a[i]!= B.a[i])
				S=false;
		}
		return S;
	}
	
	public static void main (String[] args) {	
		ArrayM A=new ArrayM();
		ArrayM B=new ArrayM();
		
		System.out.println("Array A");
		A.Baca();
		A.Tulis();
		int Total=A.HitungTotal();
		System.out.println("Total nilai array A= "+ Total);
		A.Rata(Total);
		int Min=A.GetM();
		System.out.println("nilai terkecil array A= "+ Min);
		System.out.println("Array B");
		B.Baca();
		B.Tulis();
		System.out.println(" array A == array B adalah "+ A.ApakahSama(B));
		System.out.println(" array A == array B adalah "+ IsSama(A,B));

	}	
}
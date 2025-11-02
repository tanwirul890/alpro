package ARRAY;

import java.util.Scanner;

public class ArrayString {
	int N=5;
	String[] a=new String[N];
	
	void Baca() {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<N;i++) {
			System.out.print(i+" input bil: "); a[i]=sc.next();
			sc.close();
		}

	}
	
	void Tulis() {
		for (int i=0;i<N;i++) {
			System.out.println(i+" "+ a[i]);
		}
	}
	
	boolean ApakahSama(ArrayString B) {
		boolean S=true;
		for (int i=0;i<N;i++) {
			if (!a[i].equals(B.a[i])) {
				S=false;
				System.out.println(i+" false");
			}
		}
		return S;
	}
	
	static boolean IsSama(ArrayString A, ArrayString B) {
		boolean S=true;
		for (int i=0;i<A.N;i++) {
			if (!A.a[i].equals(B.a[i]))
				S=false;
		}
		return S;
	}
	
	public static void main (String[] args) {	
		ArrayString A=new ArrayString();
		ArrayString B=new ArrayString();
		
		System.out.println("Array A");
		A.Baca();
		A.Tulis();
		
		System.out.println("Array B");
		B.Baca();
		B.Tulis();
		System.out.println(" array A == array B adalah "+ A.ApakahSama(B));
		System.out.println(" array A == array B adalah "+ IsSama(A,B));

	}	
}
package ARRAYOFRECORD;

import java.util.Scanner;

public class LarikBarang {
	int N=5;
	Barang[] a=new Barang[N];
	
	void Init() {
		Barang x;
		
		for (int i=0;i<N;i++) {
			x=new Barang(i,100000);
			a[i]=x;
		}
	}
	
	void Baca() {
		Scanner sc= new Scanner(System.in);
		Barang x;
		
		for(int i=0;i<N;i++) {
			x=new Barang();
			System.out.print(i+" input Barang: "); x.Baca();
			a[i]=x;
			sc.close();
		}

	}
	
	void Tulis() {
		for (int i=0;i<N;i++) {
			System.out.println(i+" "); a[i].Tulis();
		}
	}
	
	void TurunHarga() {
		int p=25;
		double diskonHarga;
		for (int i =0; i<N; i++) {
			diskonHarga = ((double)p/100)*a[i].hargabrg; //titik salah
			a[i].hargabrg= a[i].hargabrg - diskonHarga;
		}
	}
	
	public static void main (String[] args) {	
		LarikBarang A=new LarikBarang();
		LarikBarang B=new LarikBarang();
		
		System.out.println("Array A");
		// A.Baca();
		A.Init();
		System.out.println("Array B ");
		B=A;
		B.Tulis();
		B.TurunHarga();
		B.Tulis();
		
		System.out.println("Array A");
		A.Tulis();
	}	
}
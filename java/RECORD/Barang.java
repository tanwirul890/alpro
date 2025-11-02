package RECORD;

import java.util.Scanner;

public class Barang {
	int kodebrg;
	double hargabrg;
	
	Barang() {
		
	}
	
	Barang(int x, double y) {
		kodebrg=x;
		hargabrg=y;
	}
	
	Barang(double y) {
		hargabrg=y;
	}
	
	void Baca() {
		Scanner sc= new Scanner(System.in);
		System.out.print(" input kode barang: "); kodebrg=sc.nextInt();
		System.out.print(" input harga barang: "); hargabrg=sc.nextDouble();
		sc.close();
	}
	
	void Tulis() {
		System.out.println("barang: "+"<"+kodebrg+","+hargabrg+">");
	}
	
	public static void main (String[] args) {
		Barang A=new Barang();
		Barang B=new Barang(3,100000.34);
		Barang C=new Barang(100000.34);
		
		A.Baca();
		A.Tulis();
		
		B.Tulis();
		
		C.Tulis();
	}
}
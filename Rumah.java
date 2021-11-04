import java.util.Scanner;


public class Rumah {
	public static void main(String args[]){
		
	Scanner input = new Scanner(System.in);
		
	char blok;
	String nama, alamat;
	int bayar;
	byte tipe_rumah;
		
	
	System.out.println("Aplikasi Polimorphisme dan inheritance untuk Aplikasi pembayaran PLN");
	System.out.println();
	
	
	//Proses Input Data Untuk Pembayaran Pln 
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat Anda  : ");
		alamat = input.nextLine();
		
		System.out.println("Masukkan Tipe Rumah Anda");
		System.out.println("Tipe Yang Tersedia : \n36\n37");
		System.out.print("Tipe Rumah Anda : ");
		tipe_rumah = input.nextByte();
		
		if (tipe_rumah == 36) {
			
			tipe36 A = new tipe36();
			A.setTipe(tipe_rumah);
			
		System.out.println("Masukkan Blok Rumah Anda");
		System.out.println("Blok Yang Tersedia : \nA\nB");
		System.out.print("Blok Rumah Anda : ");
		blok = input.next().charAt(0);
			A.setBlok(blok);
			A.setHarga();
			
		System.out.println("Total Harga Listrik Rumah Anda : "+A.getHarga());
		System.out.print("Masukkan Jumlah Uang anda : ");
		bayar = input.nextInt();
		A.setKembalian(bayar);
		System.out.println();
		System.out.println("Nama Anda : "+nama);
		System.out.println("Alamat Anda : " + alamat);
		System.out.println("Total Harga Listrik Rumah Anda : "+A.getHarga());
		System.out.println("Jumlah Uang anda : " + bayar);
		System.out.println("Kembalian Uang anda : "+A.getKembalian());
		
		} else
		
		if (tipe_rumah == 37) {
			
			tipe37 B = new tipe37();
			B.setTipe(tipe_rumah);
			
			System.out.println("Masukkan Blok Rumah Anda");
		System.out.println("Blok Yang Tersedia : \nA\nB");
		System.out.print("Blok Rumah Anda : ");
		blok = input.next().charAt(0);
			B.setBlok(blok);
			B.setHarga();
			
		System.out.println("Total Harga Listrik Rumah Anda : "+B.getHarga());
		System.out.print("Masukkan Jumlah Uang anda : ");
		bayar = input.nextInt();
		B.setKembalian(bayar);
		System.out.println();
		System.out.println("Nama Anda : "+nama);
		System.out.println("Alamat Anda : " + alamat);
		System.out.println("Total Harga Listrik Rumah Anda : "+B.getHarga());
		System.out.println("Jumlah Uang anda : " + bayar);
		System.out.println("Kembalian Uang anda : "+B.getKembalian());
		}
		
	}
}
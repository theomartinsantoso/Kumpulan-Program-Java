import java.util.Scanner;

public class KetuaBEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklarasi variabel sekaligus array calon menggunakan tipe data string dimana variabel ini digunakan untuk inputan nama-nama calon ketua BEM
		String []calon=new String[100];
		//deklarasi variabel suara menggunakan tipe data string dimana variabel ini digunakan untuk inputan suara
		String suara;
		//deklarasi variabel jumlahcalon,n,tot1,tot2,tot3,tot4,i dan i2 menggunakan tipe data integer dimana variabel
		//jumlah calon digunakan untuk inputan jumlah calon ketua BEM
		//n digunakan untuk inputan jumlah mahasiswa
		//tot1 digunakan untuk perhitungan jumlah suara pada calon ketua BEM yang pertama
		//tot2 digunakan untuk perhitungan jumlah suara pada calon ketua BEM yang kedua
		//tot3 digunakan untuk perhitungan jumlah suara pada calon ketua BEM yang ketiga
		//tot4 digunakan untuk perhitungan jumlah suara yang golput
		//i dan i2 digunakan sebagai increment dalam perulangan
		int n,tot1=0,tot2=0,tot3=0,tot4=0,i=1,i2=1;
		//bagian atau elemen untuk inputan
		Scanner input=new Scanner(System.in);
		//menampilkan teks
		System.out.print("======================================================"+ "\n");
		System.out.println("              Program Pemilihan Ketua BEM             ");	
		System.out.print("======================================================"+ "\n");
		//contoh dalam program ini jumlah calon ketua BEM ada 3 orang
		System.out.println("Masukkan Nama Calon Ketua BEM :"); 
		//perulangan dengan kondisi i kurang dari sama dengan jumlah calon ketua BEM
		for(i=1;i<=3;i++) {
		System.out.print(i+".");
		//perintah untuk menginputkan nama-nama calon ketua BEM dan masuk ke array calon sebanyak jumlah calon
		calon[i]=input.next();
		}
		//untuk memberi baris baru
		System.out.print("\n");
		System.out.println("Daftar Nama Calon Ketua BEM :");
		for(i=1;i<=3;i++) {
		//menampilkan variabel dan beserta array calon ketua BEM dari variabel i
		System.out.println(i+"."+calon[i]);
		}
		System.out.print("\n");
		System.out.print("Masukkan Jumlah Mahasiswa = ");
		//perintah untuk menginputkan jumlah mahasiswa
		n=input.nextInt();
		System.out.println("Masukkan Nomor Suara : ");
		//perulangan dengan kondisi
		do {
		System.out.print("Ke-"+i2+" = ");
		//perintah untuk menginputkan suara
		suara=input.next();
		//jika suara sama dengan 1
		if(suara.equals("1")) {
			//maka total suara calon pertama akan bertambah 1
			tot1=tot1+1;
			//selain itu jika suara sama dengan 2
		}else if(suara.equals("2")) {
			//maka total suara calon kedua akan bertambah 1
			tot2=tot2+1;
			//selain itu jika suara sama dengan 3
		}else if(suara.equals("3")) {
			//maka total suara calon ketiga akan bertambah 1
			tot3=tot3+1;
			//selain itu total suara golput akan bertambah 1
		}else {
			tot4=tot4+1;
		}
		//i2 akan bertambah 1
		i2++;
		}
		//ketika i2 kurang dari sama dengan jumlah mahasiswa maka akan melakukan perulangan
		while(i2<=n);
		System.out.print("\n");
		System.out.print("======================================================"+ "\n");
		//jika total suara calon pertama > total calon suara kedua dan total suara calon pertama > total calon suara ketiga dan total suara calon pertama > total golput
		if((tot1>tot2)&&(tot1>tot3)&&(tot1>tot4)){
			//maka teks yang akan ditampilkan yaitu calon pertama terpilih menjadi ketua BEM
			System.out.print(calon[1]+" terpilih menjadi ketua BEM!");
		}else if
			((tot2>tot1)&&(tot2>tot3)&&(tot2>tot4)){
				System.out.print(calon[2]+" terpilih menjadi ketua BEM!");
		}else if
			((tot3>tot1)&&(tot3>tot2)&&(tot3>tot4)){
			System.out.print(calon[3]+" terpilih menjadi ketua BEM!");
			//selain itu jika total golput lebih besar dari total suara calon pertama dan total suara calon pertama lebih besar dari total suara calon kedua dan total
			//suara calon pertama lebih besar dari total suara calon ketiga
		}else if
			((tot4>tot1)&&(tot1>tot2)&&(tot1>tot3)){
			//maka teks yang akan ditampilkan yaitu calon pertama terpilih menjadi ketua BEM
			System.out.print(calon[1]+" terpilih menjadi ketua BEM!");
		}else if
			((tot4>tot2)&&(tot2>tot1)&&(tot2>tot3)){
			System.out.print(calon[2]+" terpilih menjadi ketua BEM!");
		}else if
			((tot4>tot3)&&(tot3>tot1)&&(tot3>tot2)){
			System.out.print(calon[3]+" terpilih menjadi ketua BEM!");
			//selain itu jika total golput lebih besar dari total suara calon pertama dan total suara pertama sama besar dengan total suara calon kedua dan total suara
			//calon pertama lebih besar dari total suara calon ketiga
		}else if
			((tot4>tot1)&&(tot1==tot2)&&(tot1>tot3)){
			//maka teks yang akan ditampilkan yaitu perintah untuk melakukan voting kembali karena total suara calon pertama sama dengan total suara calon kedua
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[2]);
		}else if
			((tot4>tot2)&&(tot2==tot3)&&(tot2>tot1)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[2]+" sama dengan total suara "+calon[3]);
		}else if
			((tot4>tot3)&&(tot3==tot1)&&(tot3>tot2)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[3]);
			//selain itu jika total golput lebih besar dari total suara calon pertama dan total suara calon pertama sama besar dengan total suara calon kedua dan total
			//suara calon pertama sama besar dengan total suara calon ketiga
		}else if
			((tot4>tot1)&&(tot1==tot2)&&(tot1==tot3)){
			//maka teks yang akan ditampilkan yaitu perintah untuk melakukan voting kembali karena total suara calon pertama sama dengan total suara calon kedua dan total
			//suara calon ketiga
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[2]+" dan "+calon[3]);
		}else if
			((tot1==tot2)&&(tot1>tot3)&&(tot1>tot4)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[2]);
		}else if
			((tot2==tot3)&&(tot2>tot1)&&(tot2>tot4)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[2]+" sama dengan total suara "+calon[3]);
		}else if
			((tot1==tot3)&&(tot1>tot2)&&(tot1>tot4)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[3]);
			//selain itu jika total suara calon pertama sama besar dengan total suara calon kedua dan total suara calon pertama sama besar dengan total suara calon ketiga
			//dan total suara calon pertama lebih besar dari total golput
		}else if
			((tot1==tot2)&&(tot1==tot3)&&(tot1>tot4)){
			//maka teks yang akan ditampilkan yaitu perintah untuk melakukan voting kembali karena total suara calon pertama sama dengan total suara calon kedua dan total
			//suara calon ketiga
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[2]+" dan "+calon[3]);
		}else if
			((tot2==tot3)&&(tot2==tot1)&&(tot2>tot4)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[2]+" sama dengan total suara "+calon[3]+" dan "+calon[1]);
		}else if
			((tot1==tot3)&&(tot1==tot2)&&(tot1>tot4)){
			System.out.print("Lakukan voting kembali!\nKarena total suara "+calon[1]+" sama dengan total suara "+calon[3]+" dan "+calon[2]);
		}
		//menampilkan teks dan hasil
		System.out.println("\n======================================================");
		System.out.println("\nDetail : ");
		System.out.println("1."+calon[1]+"\t\t dengan total suara = "+tot1);
		System.out.println("2."+calon[2]+"\t\t dengan total suara = "+tot2);
		System.out.println("3."+calon[3]+"\t\t dengan total suara = "+tot3);
		System.out.println("4.Golput\t dengan total suara = "+tot4);
		System.out.println("\n------------------------------------------------------"+ "\n");
		//bagian atau elemen untuk menutup inputan
		input.close();
	}
}

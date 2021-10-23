Identitas Diri

Nim : [2131710138]

Nama: [Farhan Asyam Alfitra]

### Soal UTS 2021-2022
Waktu: 90 menit

Silakan mengerjakan soal di bawah ini, NIM ganjil untuk mengerjakan nomor.1 sedangkan nomor.2 untuk NIM genap. Tuliskan
kode program pada cell yang telah disediakan dan jangan lupa untuk menjalankan hasil kode program yang telah dibuat.

1. Buatlah sebuah program untuk menghitung biaya yang harus dikeluarkan oleh pembeli dalam sebuah toko dengan spesifikasi sebagai berikut
    + Jumlah barang yang akan diinputkan belum diketahui jumlahnya
    + Terdapat 3 buah inputan, jenis barang(minuman,makanan), nama, dan harga
    + Ketika jumlah minuman adalah 3 buah, maka akan mendapatkan potongan harga sebesar 5% dari harga minuman.
    + Ketika diakhir belanja seorang pembeli ditanya oleh kasir, apakah mau beli kantong plastic atau tidak. Jika mau, maka harus membayar Rp.200.
    + Ketika total pembelian lebih besar sama dengan 1 juta, maka harus dikenai PPN 7%.


```Java
// tulis jawaban di sini
```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java
// tulis jawaban di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);

String kategori;
int penghasilan, pemilihan,  penghasilansetahun, keluarga, totalharta, totalV = 0;
double pajak = 0;
short namaKekayaan, namaHarta, vharta;
short pendidikan;
int Sma, kuliah;

System.out.print("Pengusaha atau Tidak: ");
kategori = input.nextLine();

if(kategori.equalsIgnoreCase ("Pengusaha")){
    System.out.print("Berapa Penghasilan Anda Dalam Setahun: ");
    penghasilan = input.nextInt();
    } else {
        pengusahasetahun = input.nextInt();
        pajakhasil = penghasilansetahun * 0,15
        }

    do{
	System.out.print("Masukkan harta yang dimiliki:");
	namaHarta = input.nextShort();
	System.out.print("Masukkan nilai jual " + Harta + " saat ini ");
	vHarta = input.nextInt();
	totalV  = totalV + vHarta;
	System.out.print("Apakah masih ada yang ingin ditambahkan (1 untuk ya)");
	pemilihan=input.nextInt;
	} while (pemilihan = 1 );{
		System.out.print("Terima kasih");
	}
	System.out.print("Apakah anda berkeluarga? (1 untuk ya, 0 untuk tidak");
	keluarga = input.nextInt();
	if(keluarga=1){
		short pendidikan;
		System.out.print("Apa pendidikan terakhir anda?");
		pendidikan=input.nextShort();
		int sma;
		System.out.print("Berapa anak anda yang SMA?");
		sma=input.nextInt();
		int kuliah;
		System.out.print("Berapa anak anda yang kuliah?");
		kuliah=input.nextInt();
		if(kuliah >= 1 && sma >= 1 && totalV >50000000){
			int pajak;
			pajak=(totalV * 0,10)+pajakPenghasilan;
			System.print.out("pajak anda: "+pajak);
		} else{
			int pajak;
			pajak =(totalV * 0,5)+pajakPenghasilan;
			System.print.out("pajak anda: "+pajak);
		}
		
	} else {
		int pajak;
		pajak =(totalV * 0,5)+pajakPenghasilan;
		System.print.out("pajak anda: "+pajak);
	}
		
} else if (usaha = 0){
	do{
	System.out.print("Masukkan harta yang anda miliki:");
	namaHarta = input.nextShort();
	System.out.print("Masukkan nilai jual " + harta + " saat ini!");
	vHarta = input.nextInt();
	totalV  = totalV + vHarta;
	System.out.print("Apakah masih ada harta yang harus diinput? (1 untuk ya)");
	pemilihan=input.nextInt;
	} while (pemilihan = 1);{
		System.out.print("Terima kasih");
	}
	System.out.print("Apakah anda sudah berkeluarga? (1 untuk ya, 0 untuk tidak");
	keluarga=input.nextInt();
	if(keluarga=1){
		System.out.print("Apa pendidikan terakhir anda?");
		pendidikan=input.nextShort();
		System.out.print("Berapa anak anda yang SMA?");
		sma=input.nextInt();
		System.out.print("Berapa anak anda yang kuliah?");
		kuliah=input.nextInt();
		if(kuliah >= 1 && sma >= 1 && totalV >50000000){
			pajak =totalV * 0,10;
			System.print.out("pajak anda: "+ pajak);
		} else{
			pajak = totalV * 0,5;
			System.print.out("pajak anda: "+ pajak);
		}
		
	} else {
		pajak = totalV * 0,5;
		System.print.out("pajak anda: "+ pajak);
	}
} else {
	System.out.print("Anda Salah Memasukkan Angka");
}
```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


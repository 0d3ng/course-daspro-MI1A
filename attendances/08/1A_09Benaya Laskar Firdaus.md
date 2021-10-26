Identitas Diri

Nim : 2131710083

Nama: BENAYA LASKAR FIRDAUS

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
import java.util.Scanner;
Scanner masuk = new Scanner(System.in);
int harga, jumlah, diskon, total;
String menu, nama;
char plastic;

System.out.print("Masukkan jenis menu pilihan Anda (makanan/minuman) : ");
menu = masuk.nextLine();
System.out.print("Masukkan nama MENU pilihan anda  (makanan/minuman) : ");
nama = masuk.nextLine();
System.out.print("Masukkan jumlah MENU yang anda pilih : ");
jumlah = masuk.nextInt();
System.out.print("Masukkan harga MENU yang anda pilih : ");
harga = masuk.nextInt();

if(jumlah == 3){
    diskon = harga * 5 / 100;
    System.out.println("SELAMAT ANDA MENDAPATKAN DISKON 5%");
} else {
    diskon = 0;
     System.out.println("MAAF ANDA BELUM MENDAPATKAN DISKON");
}

System.out.println("Apakah Anda berkenan untuk membeli kantong plastik? (0=tidak, 1=ya)");
plastic = masuk.next().charAt(0);
if(plastic == '1'){
    total = harga * jumlah - diskon + 200;
} else {
    total = harga * jumlah - diskon;
}

System.out.print("Total hasil belanja yang perlu Anda bayar adalah " +total);

```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java
// tulis jawaban di sini

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


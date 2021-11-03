Identitas Diri

Nim : [2131710082]

Nama: [ArieliaZahwa]

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
Scanner sc = new Scanner(System.in);
String jenis,namaMinuman,namaMakanan,kresek;
double hargaMinuman,jumlahMinuman,totalMinuman,diskonMinuman;
double hargaMakanan,jumlahMakanan,totalMakanan,diskonMakanan;
double diskon = 0;
System.out.print("Mau Pesan Makanan / Minuman ? ");
jenis = sc.nextLine();

if(jenis.equalsIgnoreCase("minuman")){
    System.out.print("Masukkan Nama Minuman :");
    namaMinuman = sc.nextLine();
    System.out.print("Masukkan Harga Minuman :");
    hargaMinuman = sc.nextDouble();
    System.out.print("Masukkan Jumlah Minuman :");
    jumlahMinuman = sc.nextDouble();
    diskonMinuman = hargaMinuman * 0.05; 
    totalMinuman = hargaMinuman * jumlahMinuman;
    System.out.println("Total Bayar : Rp." +totalMinuman);
    if(jumlahMinuman > 3){
        diskon = totalMinuman - diskonMinuman;
        System.out.println("Anda dapat diskon sebesar 5% Rp."+diskonMinuman);
        System.out.println("Total Bayar : Rp."+diskon);
    } else{
        diskon = totalMinuman;
    }
    System.out.println("Apakah mau pakai kantong plastik? y/n");
    sc.nextLine();
    kresek = sc.nextLine();
    if(kresek.equalsIgnoreCase("y")){
       diskon += 200;
        System.out.println("Total Bayar :"+diskon);
    }
   System.out.println("Silahkan bayar dengan harga : "+diskon);
    System.out.print("Terimakasih");
}
     
else if(jenis.equalsIgnoreCase("makanan")){
    System.out.print("Masukkan Nama Makanan :");
    namaMakanan = sc.nextLine();
    System.out.print("Masukkan Harga Makanan :");
    hargaMakanan = sc.nextDouble();
    System.out.print("Masukkan Jumlah Makanan :");
    jumlahMakanan = sc.nextDouble();
    totalMakanan = hargaMakanan * jumlahMakanan;
    System.out.println("Total Bayar : Rp." +totalMakanan);
    System.out.println("Apakah mau pakai kantong plastik? y/n");
    sc.nextLine();
    kresek = sc.nextLine();
    if(kresek.equalsIgnoreCase("y")){
       totalMakanan += 200;
        System.out.println("Total Bayar :"+totalMakanan);
    }
    System.out.println("Silahkan bayar dengan harga : Rp."+totalMakanan);
    System.out.print("Terimakasih");
} 
```
1. import java.util.Scanner; > digunakan untuk mengimport scanner ke program
2. 

    Mau Pesan Makanan / Minuman ? Minuman
    Masukkan Nama Minuman :Es Cendol
    Masukkan Harga Minuman :10000
    Masukkan Jumlah Minuman :5
    Total Bayar : Rp.50000.0
    Anda dapat diskon sebesar 5% Rp.500.0
    Total Bayar : Rp.49500.0
    Apakah mau pakai kantong plastik? y/n
    y
    Total Bayar :49700.0
    Silahkan bayar dengan harga : 49700.0
    Terimakasih

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


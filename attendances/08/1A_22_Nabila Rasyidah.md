Identitas Diri

Nim : 2131710047

Nama: Nabila Rasyidah

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
//tulis jawaban di sini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int harga, total, jumlah, diskon;
String nama, jenis;
char kantong;

System.out.println("Masukkan jenis barang (makanan/minuman) : ");
jenis = sc.nextLine();
System.out.println("Masukkan nama barang : ");
nama = sc.nextLine();
System.out.println("Masukkan jumlah barang : ");
jumlah = sc.nextInt();
System.out.println("Masukkan harga barang : ");
harga = sc.nextInt();

if(jumlah == 3){
    diskon = harga * 5 / 100;
} else {
    diskon = 0;
}

total = harga*jumlah;
if(total > 1000000){
diskon = harga * 7/100;
} else{
    diskon = 0;
}
System.out.println("beli kantong plastik? (0=tidak, 1=ya)");
kantong = sc.next().charAt(0);
if(kantong == '1'){
    total = harga * jumlah - diskon + 200;
} else {
    total = harga * jumlah - diskon;
}

System.out.print("Total belanja anda Rp" +total);
```

    Masukkan jenis barang (makanan/minuman) : 
    minuman
    Masukkan nama barang : 
    jus buah
    Masukkan jumlah barang : 
    4
    Masukkan harga barang : 
    300000
    beli kantong plastik? (0=tidak, 1=ya)
    1
    Total belanja anda Rp1179200

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


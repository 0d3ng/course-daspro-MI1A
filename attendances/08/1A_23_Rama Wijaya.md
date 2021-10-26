Identitas Diri

Nim : [Isikan NIM Anda]

Nama: [Isikan Nama Anda]


```Java

```

####
Identitas Diri
Nim : 2131710107
Nama : Rama Wijaya

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
Scanner input = new Scanner(System.in);
String jenisBarang, namaBarang, plastik;
int hargaBarang, gajiBersih, jumlahMinuman;
double pajak, potongan = 0;

System.out.print("Masukkan kategori (makanan/minuman): ");
jenisBarang = input.nextLine();
System.out.print("Nama barang : ");
namaBarang = input.nextLine();
System.out.print("Masukkan Jumlah minuman Jika Anda membeli Minuman: ");
jumlahMinuman = input.nextInt();
System.out.print("Masukkan total harga barang saat ini: ");
hargaBarang = input.nextInt();
System.out.print("plastik (y/t) : ");
plastik = input.nextLine();
if(jenisBarang.equalsIgnoreCase ("makanan")){
    if (hargaBarang >= 1000000){
        pajak = 0.07;
    } else {
        pajak = 0.0;
    }
    gajiBersih = (int) (hargaBarang + (hargaBarang * pajak));
    System.out.println("Total Harga yang perlu anda bayar: " +gajiBersih);
    



    
} else if (jenisBarang.equalsIgnoreCase ("minuman")){
    if (hargaBarang >= 1000000){
        pajak = 0.07;
    } else {
        pajak = 0.0;
    }
    gajiBersih = (int) (hargaBarang + (hargaBarang * pajak));
    System.out.println("Harga yang perlu anda bayar: " +gajiBersih);
    
} else if (jenisBarang.equalsIgnoreCase ("minuman")){
    if (jumlahMinuman >= 3){
        potongan = 0.05;
    } else {
        potongan = 0.0;
    }
    gajiBersih = (int) (hargaBarang + (hargaBarang * pajak) - (hargaBarang * potongan) );
    System.out.println("Total Harga yang perlu anda bayar: " +gajiBersih);
    
    
}

```

    Masukkan kategori (makanan/minuman): minuman
    Nama barang : coffe
    Masukkan Jumlah minuman Jika Anda membeli Minuman: 2
    Masukkan total harga barang saat ini: 2000000
    plastik (y/t) : Harga yang perlu anda bayar: 2140000


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


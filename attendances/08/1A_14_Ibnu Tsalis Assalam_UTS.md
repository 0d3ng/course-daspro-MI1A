Identitas Diri

Nim : 2131710073

Nama: Ibnu Tsalis Assalam

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

Scanner in = new Scanner(System.in);
String jBrg, nBrg;
double hBrg, total;
int jumlah, ty;

System.out.print("Masukkan jenis barang: ");
jBrg = in.nextLine();
System.out.print("Masukkan nama barang: ");
nBrg = in.nextLine();
System.out.print("Masukkan harga barang: Rp.");
hBrg = in.nextDouble();
System.out.print("Masukkan jumlah barang: ");
jumlah = in.nextInt();

total = hBrg * jumlah;

if(jBrg.equalsIgnoreCase("minuman") && jumlah >= 3)
{
    System.out.println("Jumlah minuman Anda lebih besar sama dengan 3 buah, Anda mendapat diskon 5%");
    total = total * 95 / 100;
}

System.out.print("Apakah mau beli kantong plastic atau tidak? (0 untuk tidak, 1 untuk iya): ");
ty = in.nextInt();

if(ty == 1)
{
    System.out.println("Anda membeli kantong plastic seharga Rp.200");
    total += 200;
}

if(total >= 1000000)
{
    System.out.println("Total pembelian lebih besar sama dengan 1 juta, Anda mendapat PPN 7%");
    total = total * 107 / 100;
}
System.out.printf("Total biaya yang harus dikeluarkan adalah: Rp." + total);
```

    Masukkan jenis barang: Minuman
    Masukkan nama barang: Teh Anget
    Masukkan harga barang: Rp.25500
    Masukkan jumlah barang: 5
    Jumlah minuman Anda lebih besar sama dengan 3 buah, Anda mendapat diskon 5%
    Apakah mau beli kantong plastic atau tidak? (0 untuk tidak, 1 untuk iya): 1
    Anda membeli kantong plastic seharga Rp.200
    Total biaya yang harus dikeluarkan adalah: Rp.121325.0




    java.io.PrintStream@71367818



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


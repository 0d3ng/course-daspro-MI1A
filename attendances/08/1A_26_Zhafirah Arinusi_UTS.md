Identitas Diri

Nim : [2131710023]

Nama: [Zhafirah Arinusi]

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
Scanner s = new Scanner(System.in);

int pajak, sd, smp, sma, kuliah;
char usaha, keluarga, pendidikan;
int penghasilan = 50000000;
int hasil, nilaiJual, totalPajak;
String harta;


System.out.print("Apakah memiliki usaha? (0 = tidak, 1 = iya) ");
usaha = s.next().charAt(0);
if (usaha == '1'){
    hasil = penghasilan * 15 / 100;
} else {
    hasil = 0;
}
hasil = penghasilan * 15 / 100;
System.out.println("Hasilnya adalah : " + hasil);

System.out.print("Nama harta : ");
s.nextLine();
harta = s.nextLine();
System.out.print("Nilai jual : ");
nilaiJual = s.nextInt();

System.out.print("Apakah memiliki keluarga? (0 = tidak, 1 = iya) ");
keluarga = s.next().charAt(0);
if(keluarga == '1'){
    System.out.print("Apa pendidikannya? (0 = sd, 1 = smp, 2 = sma, 3 = kuliah)");
    pendidikan = s.next().charAt(0);
} else {
    System.out.print("Yasudah");
}

if(sma == 1 && kuliah == 1 && hasil >= 50000000){
    totalPajak = hasil * 5 / 100;
} else{
    totalPajak = hasil * 10 / 100;
}
System.out.print("Pajak yang harus dibayar sejumlah " + totalPajak);
```

    Apakah memiliki usaha? (0 = tidak, 1 = iya) 1
    Hasilnya adalah : 7500000
    Nama harta : Kendaraan
    Nilai jual : 80000000
    Apakah memiliki keluarga? (0 = tidak, 1 = iya) 1
    Apa pendidikannya? (0 = sd, 1 = smp, 2 = sma, 3 = kuliah)2
    Pajak yang harus dibayar sejumlah 750000

# > **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)



```Java

```

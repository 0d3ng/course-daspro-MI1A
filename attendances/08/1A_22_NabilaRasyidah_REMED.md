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
Scanner sc = new Scanner(System.in);
String usaha, keluarga, harta, hartaKekayaan, pendidikan;
double penghasilan, pajak, pjAwal, pjAkhir, total;
double bergerak, tidakBergerak, perhiasan, nilaiJual, penghasilan;

System.out.println("Pembayaran Pajak");
System.out.print("Apakah memiliki usaha? (y/n): ");
usaha = sc.nextLine();
if(usaha == "y"){
    System.out.print("Penghasilan 1 Tahun: " + penghasilan);
    penghasilan = sc.nextInt();
    pjAwal = penghasilan * 15 / 100;
    pjAkhir = penghasilan - pjAwal;
}
System.out.print("Harta kekayaan (bergerak/tidak) : ");
harta = sc.nextLine();
System.out.print("Nilai jual harta anda saat ini : ");
nilaiJual = sc.nextDouble();

if(hartaKekayaan.equals ("bergerak"))
    {
        System.out.println("Masukkan nama harta bergerak anda (motor): ");
        harta = sc.nextLine();
        System.out.println("Masukkan nilai jual harta anda: ");
        nilaiJual = sc.nextDouble();
    } else (hartaKekayaan.equals ("tidak bergerak")){
        System.out.println("Masukkan nama harta tidak bergerak anda (perhiasan): ");
        harta = sc.nextLine();
        System.out.println("Masukkan nilai jual harta anda: ");
        nilaiJual = sc.nextDouble();
    }
System.out.print("Tingkat pendidikan anak (SD,SMP,SMA,KULIAH): " + pendidikan);
pendidikan = sc.nextLine();
```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


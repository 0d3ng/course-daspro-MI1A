Identitas Diri

Nim : [2131710129]

Nama: [Gadhis Pramestya A]

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

String hartaKekayaan, namaHarta, status, tingkatPendidikan=new String2;
int usaha, kekayaan, nilaiJual, jumlahAnak=new int2;

System.out.println("Apakah anda mempunyai usaha atau tidak (Y/T)");
usaha= sc.nextInt();
if(usaha == "Y")
    System.out.println("Masukkan penghasilan dalam satu tahun:");
    penghasilan = sc.nextInt();
    pajakAwal = 0.15;
}

System.out.println("Apakah anda sudah berkeluarga? (sudah/belum)");
status = sc.nextLine();
System.out.println("Masukkan jenis harta kekayaan anda (bergerak/tidak bergerak)");
hartaKekayaan = sc.nextLine();

if(hartaKekayaan.equals ("bergerak")) {
     System.out.println("Masukkan nama harta bergerak anda (pesawat): ");
     namaHarta = sc.nextLine();
     System.out.println("Masukkan nilai jual harta anda: ");
        nilaiJual = sc.nextInt();
    
} else if (hartaKekayaan.equals ("tidak bergerak")){
     System.out.println("Masukkan nama harta tidak bergerak anda (sawah): ");
     namaHarta = sc.nextLine();
     System.out.println("Masukkan nilai jual harta anda: ");
     nilaiJual = sc.nextInt();
}else{
        System.out.print("Inputan yang anda masukkan KOSONG!!");
}

Scanner sc = new Scanner(System.in);
    if(status.equals("sudah")){
    System.out.println("Masukkan pendidikan anak anda (KULIAH/SMA/SD/TK)");
    tingkatPendidikan = sc.nextLine();

```


    |   String hartaKekayaan, namaHarta, status, tingkatPendidikan=new String2;

    '(' or '[' expected

    


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


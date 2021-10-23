Identitas Diri

Nim : 2131710071
Nama: Diva Gracia Salmanta Candra

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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int harga, jumlah, diskon, total, ppn;
String barang, nama;
char plastik;

System.out.print("Masukkan jenis barang (makanan/minuman) : ");
barang = input.nextLine();
System.out.print("Masukkan nama makanan/minuman : ");
nama = input.nextLine();
System.out.print("Masukkan jumlah barang : ");
jumlah = input.nextInt();
System.out.print("Masukkan harga barang : ");
harga = input.nextInt();

if(jumlah == 3){
    diskon = harga * 5 / 100;
} else {
    diskon = 0;
}

System.out.println("Apakah Anda mau beli kantong plastik? (0=tidak, 1=ya)");
plastik = input.next().charAt(0);
if(plastik == '1'){
    total = harga * jumlah - diskon + 200;
} else {
    total = harga * jumlah - diskon;
}

ppn = total*7/100;
if(total >= 1000000){
    total += ppn;
}

System.out.print("Total belanja yang perlu Anda bayar adalah " +total);
```

    Masukkan jenis barang (makanan/minuman) : minuman
    Masukkan nama makanan/minuman : Milkshake
    Masukkan jumlah barang : 3
    Masukkan harga barang : 20000
    Apakah Anda mau beli kantong plastik? (0=tidak, 1=ya)
    1
    Total belanja yang perlu Anda bayar adalah 59200

## Penjelasan kode
- Karena inputan jumlah barang sama dengan 3 maka pembeli mendapat diskon senilai 5% dari harga minuman (5% dari 20000 adalah 1000 maka pembeli mendapat diskon 1000)
- Ketika ditanya mengenai kantong plastik, pembeli menginput 1 yg artinya mau membeli. Jadi total yang harus dibayarnya yaitu harga minuman dikali jumlah minuman kemudian dikurangi diskon dan ditambah dengan 200 karena mau membeli kantong plastik (sesuai inputan, harganya 20000 dengan jumlah 3 dan ia mendapat diskon 1000 kemudia ditambah harga plastik 200 : 20000 * 3 - 1000 + 200 = 592000) 
- Jumlah pembayaran tidak sama dengan satu juta maka pembeli tidak perlu membayar PPN.

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


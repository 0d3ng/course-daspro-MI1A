Identitas Diri

Nim : 2131710099

Nama: Muhammad Rayhan Gibran

### Soal UTS 2021-2022

Waktu: 90 menit

Silakan mengerjakan soal di bawah ini, NIM ganjil untuk mengerjakan nomor.1 sedangkan nomor.2 untuk NIM genap. Tuliskan
kode program pada cell yang telah disediakan dan jangan lupa untuk menjalankan hasil kode program yang telah dibuat.

1. Buatlah sebuah program untuk menghitung biaya yang harus dikeluarkan oleh pembeli dalam sebuah toko dengan spesifikasi sebagai berikut
   - Jumlah barang yang akan diinputkan belum diketahui jumlahnya
   - Terdapat 3 buah inputan, jenis barang(minuman,makanan), nama, dan harga
   - Ketika jumlah minuman adalah 3 buah, maka akan mendapatkan potongan harga sebesar 5% dari harga minuman.
   - Ketika diakhir belanja seorang pembeli ditanya oleh kasir, apakah mau beli kantong plastic atau tidak. Jika mau, maka harus membayar Rp.200.
   - Ketika total pembelian lebih besar sama dengan 1 juta, maka harus dikenai PPN 7%.

```Java
import java.util.Scanner;
public class MyClass {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
String jenismakanan, jenisminuman, nama;
int i, jwb, jwbb;
double harga, pajak, total=0;
boolean stop = false;

for(i=0 ; !stop; i++){
    System.out.print("Masukkan jenis barang (Minuman) : ");
    jenismakanan = input.nextLine();
    System.out.print("\nMasukkan nama : ");
    nama = input.nextLine();
    System.out.print("harga : Rp.");
    harga = input.nextDouble();
    System.out.println("Ada lagi ? (0 = tidak /1 = ya)");
    jwb = input.nextInt();
     total += harga;
    if (jwb == 0)
    stop = true;
    }
    if(i>=3){
        total = total-(total * 5 / 100);
         System.out.println("Pakai Kantong Kresek ? (0 = tidak /1 = ya)");
         jwbb = input.nextInt();
        if (jwbb == 1) {
            total = total + 200;
        if  (total >= 1000000){
             total = total+(total * 7 / 100);
        }
    }
     System.out.println("Jumlah Barang : " + i);
     System.out.println("totalnya adalah " + total);
    }

}
}

```

    Masukkan jenis barang (Minuman) :  Minuman

    Masukkan nama : a
    harga : Rp.1000
    Ada lagi ? (0 = tidak /1 = ya)
    1
    Masukkan jenis barang (Minuman) : Minuman
    Masukkan nama : as
    harga : Rp.1000
    Ada lagi ? (0 = tidak /1 = ya)
    1
    Masukkan jenis barang (Minuman) : Minuman
    Masukkan nama : asd
    harga : Rp.1000
    Ada lagi ? (0 = tidak /1 = ya)
    0
    Pakai Kantong Kresek ? (0 = tidak /1 = ya)
    1
    Jumlah Barang : 3
    totalnya adalah 3050.0

2. Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
   - Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
   - Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
   - Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
   - Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.

```Java
// tulis jawaban di sini

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

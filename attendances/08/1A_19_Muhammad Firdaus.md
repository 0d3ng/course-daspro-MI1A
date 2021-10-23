Identitas Diri

Nim : [Isikan NIM Anda]

Nama: [Isikan Nama Anda]

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


```python
// tulis jawaban di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String namaMinuman,namaMakanan,jenis;
int jumlahMinuman,jumlahMakanan;
double jumlahB,hargaMinuman,hargaMakanan;
System.out.println("Makanan / Minuman ? ");
jenis = input.nextLine();
if(jenis.equalsIgnoreCase("Minuman")){
    System.out.println("Masukkan Nama Minuman :");
    namaMinuman = input.nextLine();
    System.out.println("Masukkan Jumlah : ");
    jumlahMinuman = input.nextInt();
    System.out.println("Masukkan Harga : ");
    hargaMinuman = input.nextDouble();
    System.out.println("--------------------------------------- ");
    System.out.println("              Struk Minuman     : ");
    System.out.println("---------------------------------------");
    System.out.println("Nama Barang    |     Harga     |    Jumlah    |    Total ");
    System.out.println(String.format("%s\t%s\t\t%s\t\t%s",namaMinuman,hargaMinuman,jumlahMinuman,jumlahMinuman + hargaMinuman ));
    double diskon=0;
    if(jumlah >= 3){
        diskon=(total*(5/100 * hargaMinuman))
    } else 
    
} else if(jenis.equalsIgnoreCase("Makanan")){
    System.out.println("Masukkan Nama Makanan :");
    namaMakanan = input.nextLine();
    System.out.println("Masukkan Jumlah : ");
    jumlahMakanan = input.nextInt();
    System.out.println("Masukkan Harga : ");
    hargaMakanan = input.nextDouble(); 
    System.out.println("--------------------------------------- ");
    System.out.println("              Struk Makanan     : ");
    System.out.println("---------------------------------------");
    System.out.println("Nama Barang    |     Harga     |    Jumlah    |    Total ");
    System.out.println(String.format("%s\t%s\t\t%s\t\t%s",namaMakanan,hargaMakanan,jumlahMakanan,jumlahMinumanhargaMinuman ));
}

```


      File "/tmp/ipykernel_44/1267277669.py", line 1
        // tulis jawaban di sini
        ^
    SyntaxError: invalid syntax



2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```python
// tulis jawaban di sini

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


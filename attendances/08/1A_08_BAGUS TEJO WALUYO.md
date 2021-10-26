Identitas Diri

Nim : 2131710076

Nama : BAGUS TEJO WALUYO

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
String jenisBarang, namaBarang;
int hargaBarang, jumlah, total, bayar, diskon, pajak;
char plastik;

    System.out.print("Masukkan jenis barang : ");
    jenisBarang = in.nextLine();
        if(jenisBarang.equalsIgnoreCase ("makanan")){
            System.out.print("Masukkan nama makanan : ");
            namaBarang = in.nextLine();
            System.out.print("Masukkan harga makanan : ");
            hargaBarang = in.nextInt();
            System.out.print("Masukkan jumlah makanan : ");
            jumlah = in.nextInt();
            total = hargaBarang*jumlah;
            System.out.println("Total Harga Minuman : "+total);
        } else if(jenisBarang.equalsIgnoreCase ("minuman")){
            System.out.print("Masukkan nama minuman : ");
            namaBarang = in.nextLine();
            System.out.print("Masukkan harga minuman : ");
            hargaBarang = in.nextInt();
            System.out.print("Masukkan jumlah minuman : ");
            jumlah = in.nextInt();
            
            if(jumlah>=3){
                total = hargaBarang*jumlah;
                System.out.println("Total Harga Minuman : "+total);
                diskon = (hargaBarang*jumlah)*5/100;
                total = total-diskon;
                System.out.println("Diskon : 5%");
                System.out.println("Total Pembelian : "+total);
            } else {
                total = hargaBarang*jumlah;
                System.out.println("total : "+total);
                System.out.println("Diskon : 0");
                System.out.println("Total Pembelian : "+total);
            }
        } else {
            System.out.println("INPUTAN ANDA SALAH !!!");
        }
    if(total>=1000000){
        System.out.println("\n\nApakah Anda mau beli kantong plastik? (0=tidak, 1=ya)");
        plastik = in.next().charAt(0);
            if(plastik == '1'){
                pajak = total*7/100;
                System.out.println("Pajak : "+pajak);
                System.out.println("Biaya Plastik : 200");
                bayar = total+pajak+200;
                System.out.println("Bayar : "+bayar);
            } else {
                System.out.println("Pajak : "+pajak);
                System.out.println("Biaya Plastik : 0");
                bayar = total+pajak;
                System.out.println("Bayar : "+bayar);
            }       
    } else {
        System.out.println("\n\nApakah Anda mau beli kantong plastik? (0=tidak, 1=ya)");
        plastik = in.next().charAt(0);
            if(plastik == '1'){
                pajak = 0;
                System.out.println("Pajak : "+pajak);
                System.out.println("Biaya Plastik : 200");
                bayar = total+pajak+200;
                System.out.println("Bayar : "+bayar);
            } else {
                pajak = 0;
                System.out.println("Pajak : "+pajak);
                System.out.println("Biaya Plastik : 0");
                bayar = total+pajak;
                System.out.println("Bayar : "+bayar);
            }       
    }
    
```

    Masukkan jenis barang : minuman
    Masukkan nama minuman : Minuman keras ES BATU
    Masukkan harga minuman : 500000
    Masukkan jumlah minuman : 5
    Total Harga Minuman : 2500000
    Diskon : 5%
    Total Pembelian : 2375000
    
    
    Apakah Anda mau beli kantong plastik? (0=tidak, 1=ya)
    1
    Pajak : 166250
    Biaya Plastik : 200
    Bayar : 2541450


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


Identitas Diri

Nim : [Indira Irawati Putri]

Nama: [2131710022]

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
     Scanner scan = new Scanner(System.in);
//        menampilkan menu makanan
        System.out.println("Menu Minuman : ");
        System.out.println("_________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Cocacola          Rp 6000,00");
        System.out.println("2. Teh pucuk         Rp 5000,00");
        System.out.println("3. Aqua              Rp 4000,00");
        System.out.println("");
//        declarasi harga awal
        int harga = 0;
//        decralasi harga menu
        int h1 = 10000, h2 = 5000, h3 = 4000;
        String menu;
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.println("___________________________________________________________________");
        if (inNomor == 1)
        {
//            jika nomor satu, maka minuman yang dipilih adalah cocacola
            menu = " Cocacola";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1;
        }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka minuman yang dipilih adalah Teh pucuk
                menu = " Teh pucuk";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
//            jika nomor tiga, maka minuman yang dipilih adalah Aqua
                    menu = " Aqua";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3;
                }
                     else
//            jika yang dimasukan nomornya tidak ada dalam pilihan maka "Nomor yang dipilih tidak ada di menu."
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }
//            User diperintahkan untuk memilih lagi atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();
        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");




```

    Menu Minuman : 
    _________________________________
    No Nama             Harga
    1. Cocacola          Rp 6000,00
    2. Teh pucuk         Rp 5000,00
    3. Aqua              Rp 4000,00
    
    _________________________________
    Masukkan Nomor Pesanan : 1
    ___________________________________________________________________
    Pilihan anda nomor 1 Cocacola
    Apakah anda mau melanjutkan? Y/T
    Y
    _________________________________
    Masukkan Nomor Pesanan : 1
    ___________________________________________________________________
    Pilihan anda nomor 1 Cocacola
    Apakah anda mau melanjutkan? Y/T
    T
    ___________________________________________________________________
    Total pembayaran sebesar 20000.
    Terimakasih atas kunjungannya.


2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


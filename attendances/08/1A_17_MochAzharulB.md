Identitas Diri

Nim : [2131710097]

Nama: [Moch Azharul B]

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
// Ketik kode program di atas di bawah sini
import java.util.Scanner;


        int nasiGoreng, mieGoreng, ayamGoreng, capjay, airPutih ,esTeh, esJeruk, sodaGembira, hargaMakanan, hargaMinuman, makanan, minuman, jumlahMakanan, jumlahMinuman, diskon, total;
        char plastik;

        nasiGoreng= 10000;
        mieGoreng= 11000;
        capjay= 15000;
        ayamGoreng= 20000;
        airPutih= 1000;
        esTeh= 3000;
        esJeruk= 4000;
        sodaGembira= 10000;
        makanan= 0;
        minuman= 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("Silahkan Pilih Menu Di Toko Kami");
        System.out.println("=============Makanan============");
        System.out.println("1. Nasi Goreng: Rp 10.000");
        System.out.println("2. Mie Goreng: Rp 11.000");
        System.out.println("3. Capjay: Rp 15.000");
        System.out.println("4. Ayam Goreng: Rp 20.000");
        System.out.println("=============Minuman============");
        System.out.println("5. Air Putih: Rp 1.000");
        System.out.println("6. Es Teh: Rp 3.000");
        System.out.println("7. Es Jeruk: Rp 4.000");
        System.out.println("8. Soda Gembira: Rp 10.000");
        System.out.print("Pilih Makanan:");
        makanan = input.nextInt();
        System.out.print("Isikan Jumlah Makanan :");
        jumlahMakanan = input.nextInt();
        System.out.print("Pilih Minuman:");
        minuman = input.nextInt();
        System.out.print("Isikan Jumlah Minuman: ");
        jumlahMinuman = input.nextInt();
        
        
        if (makanan == 1 && makanan == 2 || makanan == 3 && makanan == 4) 
            System.out.println("Anda membeli makanan");
        } else {
            System.out.println("Anda membeli minuman");
        }
        
        if (makanan == 1){
            hargaMakanan = nasiGoreng * jumlahMakanan;
        } else if (makanan == 2){
            hargaMakanan = mieGoreng * jumlahMakanan;
        } else if (makanan == 3){
            hargaMakanan = capjay * jumlahMakanan;
        } else if (makanan == 4){
            hargaMakanan == ayamGoreng * jumlahMakanan;
        } else {
            System.out.println("Inputan salah");
        }
        
         if (minuman == 5){
            hargaMinuman = airPutih * jumlahMakanan;
        } else if (makanan == 6){
            hargaMinuman = esTeh * jumlahMakanan;
        } else if (makanan == 7){
            hargaMinuman = esJeruk * jumlahMakanan;
        } else if (makanan == 8){
            hargaMinuman == sodaGembira * jumlahMakanan;
        } else {
             System.out.println("Inputan salah");
         }

        if(jumlahpMinuman == 3){
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
    
        System.out.print("Total belanja yang perlu Anda bayar adalah " +total);

```

    ================================
    Silahkan Pilih Menu Di Toko Kami
    =============Makanan============
    1. Nasi Goreng: Rp 10.000
    2. Mie Goreng: Rp 11.000
    3. Capjay: Rp 15.000
    4. Ayam Goreng: Rp 20.000
    =============Minuman============
    5. Air Putih: Rp 1.000
    6. Es Teh: Rp 3.000
    7. Es Jeruk: Rp 4.000
    8. Soda Gembira: Rp 10.000
    Pilih Makanan:

# 2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


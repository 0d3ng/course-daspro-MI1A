Identitas Diri

Nim : [2131710038]

Nama: [Yusufa Haidar]

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
Scanner in = new Scanner(System.in);
int hasil1Tahun, jmlhAnak, totalHarta, nilaiJual, pajak, setelahPajak, pajakAwal, stlhPajakAwal;   
String usaha, tingkatPendidikan, hartaKekayaan;  
System.out.println("Program Perhitungan Pajak");
System.out.print("Apakah sudah memiliki usaha (Ya / Tidak)? ");
usaha = in.nextLine();
if(usaha.equalsIgnoreCase("Ya")){
    System.out.print("Masukkan Penghasilan 1 Tahun: ");
    hasil1Tahun = in.nextInt();
    pajakAwal = hasil1Tahun * 15 % 100;
    stlhPajakAwal = hasil1Tahun - pajakAwal;
    System.out.print("Masukkan Harta Kekayaan (Mobil / Perhiasan): ");
    hartaKekayaan = in.nextLine();
    System.out.print("Masukkan Nilai Jual Harta Kekayaan: ");
    nilaiJual = in.nextInt();
    System.out.print("Masukkan Tingkat Pendidikan Anak (SD,SMP,SMA,KULIAH(Boleh lebih dari satu dengan menggunakan &)): ");
    tingkatPendidikan = in.nextLine();
    System.out.print("Masukkan Jumlah Anak pada pendidikan tersebut: ");
    jmlhAnak = in.nextInt();
    totalHarta = stlhPajakAwal + hartaKekayaan;
        if(tingkatPendidikan.equalsIgnoreCase("SMA & KULIAH")){
            if(totalHarta >= 50000000){
                pajak = totalHarta * 10 % 100;
                setelahPajak = pajakAwal + pajak;
                System.out.println("Wajib Pajak yang anda bayarkan adalah: " + setelahPajak);
            }else{
                System.out.println("Anda tidak wajib Pajak");
        }
        }else(tingkatPendidikanequalsIgnoreCase("SD & SMP")){
            if(totalHarta <= 50000000){
                pajak = totalHarta * 5 % 100;
                setelahPajak = pajakAwal + pajak;
                System.out.println("Wajib Pajak yang anda bayarkan adalah: " + setelahPajak);
            }else{
                System.out.println("Anda tidak wajib Pajak");    
            }
        }
}else{
    System.out.print("Masukkan Harta Kekayaan (Mobil / Perhiasan): ");
    hartaKekayaan = in.nextLine();
    System.out.print("Masukkan Nilai Jual Harta Kekayaan: ");
    nilaiJual = in.nextInt();
    System.out.print("Masukkan Tingkat Pendidikan Anak (SD,SMP,SMA,KULIAH(Boleh lebih dari satu dengan menggunakan &)): ");
    tingkatPendidikan = in.nextLine();
    System.out.print("Masukkan Jumlah Anak pada pendidikan tersebut: ");
    jmlhAnak = in.nextInt();
    totalHarta = hartaKekayaan;
        if(tingkatPendidikan.equalsIgnoreCase("SMA & KULIAH")){
            if(totalHarta >= 50000000){
                pajak = totalHarta * 10 % 100;
                setelahPajak = pajak;
                System.out.println("Wajib Pajak yang anda bayarkan adalah: " + setelahPajak);
            }else{
                System.out.println("Anda tidak wajib Pajak");
        }
        }else(tingkatPendidikan.equalsIgnoreCase("SD & SMP")){
            if(totalHarta <= 50000000){
                pajak = totalHarta * 5 % 100;
                setelahPajak = pajak;
                System.out.println("Wajib Pajak yang anda bayarkan adalah: " + setelahPajak);
            }else{
                System.out.println("Anda tidak wajib Pajak");    
            }
        }
}    
            
    

```
    Program Perhitungan Pajak
    Apakah sudah memiliki usaha (Ya / Tidak)? Ya
    Masukkan Penghasilan 1 Tahun: 60000000
    Masukkan Harta Kekayaan (Mobil / Perhiasan): Perhiasan
    Masukkan Nilai Jual Harta Kekayaan: 2000000
    Masukkan Tingkat Pendidikan Anak (SD,SMP,SMA,KULIAH(Boleh lebih dari satu dengan menggunakan &)): SMA & KULIAH
    Masukkan Jumlah Anak pada pendidikan tersebut: 2
    Wajib Pajak yang anda bayarkan adalah: 14300000 

    


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


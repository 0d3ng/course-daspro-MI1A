Identitas Diri

Nim : 2131710083

Nama: Benaya Laskar Firdaus

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
Scanner input = new Scanner(System.in);

int harga, jumlah, penghasilan, total = 0;
int pajak;
String namaUsaha, kekayaan, pendidikan, status; 

System.out.print ("Apakah Anda memiliki usaha? 1/0 :  ");
namaUsaha = input.nextLine();

if(namaUsaha == 1){
System.out.println("Berapa Penghasilan Dalam satu tahun? : ");
    jumlah = input.nextInt();
}
System.out.print("penghasilan anda dikenakan pajak sebesar 15% sehingga menjadi:" + (jumlah*15%);
                 
System.out.print("apa saja harta kekayaan anda? :  ");
kekayaan = input.nextLine();
System.out.print("berapanilai jual harta anda? :  ");
harga = input.nextInt();
System.out.print("apakah anda sudah berkeluarga? :  ");
status = input.nextLine();
System.out.print("jika sudah berkeluarga apa tingkat pendidikan anda? :  ");
pendidikan = input.nextLine();
                 
if(kekayaan >= 50000000){
System.out.println("potongan pajak anda 15% ");
}else if(kekayaan <= 50000000 ){
System.out.println("potongan pajak anda 5%");
}
                 
// mohon maaf pak Noprianto, saya mengerjakan sebisa saya.
```

    Apakah Anda memiliki usaha? 1/0 :  1



    |   if(namaUsaha == 1){

    bad operand types for binary operator '=='

      first type:  java.lang.String

      second type: int

    


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


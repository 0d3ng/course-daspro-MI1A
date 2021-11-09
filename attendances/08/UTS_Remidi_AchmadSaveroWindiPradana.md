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
Scanner input = new Scanner(System.in);
import java.math.BigDecimal;  
    Scanner in = new Scanner(System.in);
    Boolean usaha = false;
    double penghasilan, nilaiJualBendaGerak, pajak = 0;
    String bendaBergerak;
    String tingkatPendidikan;
    String jmlhAnak;
    String perhiasan;
    double nilaiJualPerhiasan;
    System.out.println("Program Perhitungan Pajak"); 
    System.out.printf("Apakah anda sudah memiliki usaha?(Iya / Tidak)? : ");

    while(true) {
        String temp = in.nextLine();
        if(temp.equalsIgnoreCase("Iya")) {
            usaha = true;
            System.out.println("Berapakah penghasilan anda dalam 1 tahun?: ");
            penghasilan = in.nextDouble();
            in.nextLine();
            break;
        } else if(temp.equalsIgnoreCase("Tidak")) {
            break;
        } else System.out.println("Maaf, input anda salah");
    }
    
    System.out.printf("Berapa jumlah Harta Kekayaan berupa (Mobil)? : ");
    bendaBergerak = in.nextLine();
    System.out.print("Masukkan nilai jual Harta Kekayaan: ");

    nilaiJualBendaGerak = in.nextDouble();
    penghasilan += nilaiJualBendaGerak;
    System.out.print("Berapa jumlah harta kekayaan berupa (perhiasan)? : ");
    perhiasan = in.nextLine();
    in.nextLine();
    System.out.print("Masukkan nilai jual Harta Kekayaan: ");
    nilaiJualPerhiasan = in.nextDouble();
    penghasilan+= nilaiJualPerhiasan;
    
    System.out.print("Masukkan Tingkat Pendidikan Anak (SD,SMP,SMA,KULIAH) ");
    tingkatPendidikan = in.nextLine();
    in.nextLine();
    System.out.print("Masukkan Jumlah Anak pada pendidikan tersebut: ");
    jmlhAnak = in.nextLine();
    
    System.out.println("======================================================="); 
    System.out.println("         Penghasilan Anda     :"); 
    System.out.println("======================================================="); 
    System.out.println("Penghasilan anda: Rp." + penghasilan);    
    System.out.println("Pajak yang harus anda bayar: Rp." + penghasilan * 0.15);

```

    Program Perhitungan Pajak
    Apakah anda sudah memiliki usaha?(Iya / Tidak)? : Iya
    Berapakah penghasilan anda dalam 1 tahun?: 
    20000000
    Berapa jumlah Harta Kekayaan berupa (Mobil)? : 3
    Masukkan nilai jual Harta Kekayaan: 500000000
    Berapa jumlah harta kekayaan berupa (perhiasan)? : 20
    Masukkan nilai jual Harta Kekayaan: 10000000
    Masukkan Tingkat Pendidikan Anak (SD,SMP,SMA,KULIAH) SMP
    Masukkan Jumlah Anak pada pendidikan tersebut: 2
    =======================================================
             Penghasilan Anda     :
    =======================================================
    Penghasilan anda: Rp.5.3E8
    Pajak yang harus anda bayar: Rp.7.95E7


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


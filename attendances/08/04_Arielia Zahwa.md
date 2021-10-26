Identitas Diri

Nim : [2131710082]

Nama: [Arielia Zahwa]

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
import java.math.BigDecimal;  

    Scanner in = new Scanner(System.in);
    Boolean usaha = false;
    double penghasilan, pajak = 0;
    String bendaBergerak;
    double nilaiJualBendaBergerak;
    String perhiasan;
    double nilaiJualPerhiasan;
    System.out.print("Apakah anda memiliki usaha? (ya/tidak): ");

    while(true) {
        String temp = in.nextLine();
        if(temp.equalsIgnoreCase("Ya")) {
            usaha = true;
            System.out.print("\nBerapakah penghasilan anda dalam 1 tahun?: ");
            penghasilan = in.nextDouble();
            in.nextLine(); // handlebug
            break;
        } else if(temp.equalsIgnoreCase("Tidak")) {
            break;
        } else System.out.println("Maaf, input anda salah");
    }
    
    System.out.print("Masukkan harta kekayaan berupa benda bergerak (Mobil, sepeda motor): ");
    bendaBergerak = in.nextLine();
    System.out.print("Masukkan nilai jual saat ini: ");

    nilaiJualBendaBergerak = in.nextDouble();
    penghasilan += nilaiJualBendaBergerak;
    
    System.out.print("Masukkan harta kekayaan berupa perhiasan: ");
    perhiasan = in.nextLine();
    in.nextLine(); // handlebug
    System.out.print("Masukkan nilai jual saat ini: ");
    nilaiJualPerhiasan = in.nextDouble();
    penghasilan+= nilaiJualPerhiasan;
    
//     System.out.println("Apakah anda sudah berkeluarga? (ya/tidak): ");

//     int jumlahAnak;
//     String[] pendidikanAnak;
//     while(true) {
//         if(in.nextLine().equalsIgnoreCase("Ya")) {
//             System.out.println("Jumlah anak?");
//             jumlahAnak = in.nextInt();
//             for(int i = 0; i < jumlahAnak; i++) {
//                 System.out.println("Tingkat pendidikan anak ke" + (i+=1) + "(SD,SMP,SMA,Kuliah)");
//                 if(in.nextLine.equalsIgnoreCase("SMA") ) {
//                     pendidikanAnak[i] = "SMA";
//                 }
//             }
//             break;
//         } else if(in.nextLine().equalsIgnoreCase("Tidak")) break;
//         else System.out.println("Maaf, input anda salah");
//     }
    System.out.println("-------------------------------------------------------");    
    System.out.println("Penghasilan anda: Rp." + penghasilan);    
    System.out.println("Pajak yang harus anda bayar: Rp." + penghasilan * 0.15);
```

    Apakah anda memiliki usaha? (ya/tidak): ya
    
    Berapakah penghasilan anda dalam 1 tahun?: 10000000
    Masukkan harta kekayaan berupa benda bergerak (Mobil, sepeda motor): mobil
    Masukkan nilai jual saat ini: 1000
    Masukkan harta kekayaan berupa perhiasan: kalung
    Masukkan nilai jual saat ini: 5000
    -------------------------------------------------------
    Penghasilan anda: 1.0006E7
    Pajak yang harus anda bayar: 1500900.0


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


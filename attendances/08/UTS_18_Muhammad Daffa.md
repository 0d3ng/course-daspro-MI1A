Identitas Diri

Nim : [2131710098]

Nama: [Muhammad Daffa F.A
]

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
import java.util.Scanner;
Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda memiliki usaha ?(ketik Y jika memiliki/N jika tidak");
        String usaha = in.nextLine();
        double assetHarga = 0,totalAssetHarga = 0,pajak = 0.15;
        if(usaha.equalsIgnoreCase("y")){
            System.out.println("Berapa penghasilan anda selama satu tahun ?");
            in.nextLine();
            System.out.println("Sebutkan berapa ada berapa harta kekayaan berupa benda bergerak maupun tidak bergerak anda");
            int moveAssets = in.nextInt();
            in.nextLine();
            if(moveAssets != 0 ){
                System.out.println("Anda dipersilahkan untuk memasukkan nama harta anda serta harga jualnya saat ini satu per satu");
                for (int i = 0; i < moveAssets ; i++){
                    System.out.println("Silahkan masukkan nama harta kekayaan anda");
                    String assetName = in.nextLine();
                    System.out.println("Silahkan masukkan harga jualnya saat ini");
                    assetHarga = in.nextDouble();
                    in.nextLine();
                }
                totalAssetHarga += assetHarga;
                System.out.println("total harga kekayaan anda : " +totalAssetHarga);
            }

        }
        System.out.println("Apakah anda sudah berkeluarga ?(Y jika sudah/N jika belum)");
        String sdhBerkeluarga = in.nextLine();
        if (sdhBerkeluarga.equalsIgnoreCase("y")){
            System.out.println("Sebutkan jumlah anak pada setiap jenjang pendidikan" +
                    "(ketik 0 jika tidak ada anak pada tingkat pendidikan tersebut)");
            System.out.println("anak pada jenjang Kuliah");
            int anakKuliah = in.nextInt();
            System.out.println("anak pada jenjang SMA");
            int anakSMA = in.nextInt();
            System.out.println("anak pada jenjang SMP");
            int anakSMP = in.nextInt();
            System.out.println("anak pada jenjang SD");
            int anakSD = in.nextInt();
            in.nextLine();
            if(anakSMA == 1 && anakKuliah == 1 && totalAssetHarga == 50000000){
                pajak -= 0.1;
            }else if(anakSMA == 0 || anakKuliah == 0 && totalAssetHarga <50000000){
                pajak -= 0.05;
            }
            double pajakDibayar = totalAssetHarga*pajak;
            System.out.println("Berikut adalah pajak yang harus anda bayar");
            System.out.println(pajakDibayar);
            System.out.println("Berikut adalah total kekayaan anda setelah terkena pajak");
            System.out.println(totalAssetHarga-totalAssetHarga*pajak);
        }
```

    Apakah anda memiliki usaha ?(ketik Y jika memiliki/N jika tidak
    y
    Berapa penghasilan anda selama satu tahun ?
    4000000
    Sebutkan berapa ada berapa harta kekayaan berupa benda bergerak maupun tidak bergerak anda
    1
    Anda dipersilahkan untuk memasukkan nama harta anda serta harga jualnya saat ini satu per satu
    Silahkan masukkan nama harta kekayaan anda
    motor
    Silahkan masukkan harga jualnya saat ini
    4000000
    total harga kekayaan anda : 4000000.0
    Apakah anda sudah berkeluarga ?(Y jika sudah/N jika belum)
    y
    Sebutkan jumlah anak pada setiap jenjang pendidikan(ketik 0 jika tidak ada anak pada tingkat pendidikan tersebut)
    anak pada jenjang Kuliah
    1
    anak pada jenjang SMA
    1
    anak pada jenjang SMP
    0
    anak pada jenjang SD
    0
    Berikut adalah pajak yang harus anda bayar
    600000.0
    Berikut adalah total kekayaan anda setelah terkena pajak
    3400000.0


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


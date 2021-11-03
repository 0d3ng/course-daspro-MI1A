Identitas Diri

Nim : 2131710090

Nama: ASHRAF NAWAF

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
Scanner input = new Scanner(System.in);
        Double hasilAwal,pajak,pajakUsaha,harga,pajakBersih;
        String usaha,nama,keluarga,pendidikan;
        int jumlah,anak,total=0;
        System.out.println("=========================================================");
        System.out.print("Apakah Anda Memiliki Usaha atau Tidak (y/n) : ");
        usaha = input.nextLine();
        if (usaha.equalsIgnoreCase ("y")){
            System.out.print("Penghasilan dalam 1 tahun : ");
            hasilAwal = input.nextDouble();
            pajakUsaha =  hasilAwal * 0.15;
            System.out.println("Pajak Usaha Anda dalam 1 tahun: " +pajakUsaha);
            }else{
                System.out.println("");
            }
                System.out.println("=================================================");
                System.out.println("Contoh data yang ingin diinputkan : ");
                System.out.println("1. Perhiasan");
                System.out.println("2. Tanah");
                System.out.println("3. Surat Berharga");
                System.out.println("4. Kendaraan");
                System.out.println("5. Dll");
                System.out.println("================================================="); 
                System.out.print("Jumlah data harta kekayaan yang ingin diinputkan : ");
                jumlah = input.nextInt();
                System.out.println("================================================="); 
                for(int i=1;i<=jumlah;i++){
                    System.out.print("Harga / Nilai Pasar : ");
                    harga = input.nextDouble();
                    total+=harga;
                }
                System.out.println("Total Harta kekayaan : "+total);
                System.out.println("================================================="); 
                System.out.print("Apakah Sudah berkeluarga (y/n) : ");
                keluarga = input.nextLine();
                if (keluarga.equalsIgnoreCase ("y")){
                    System.out.print("Jumlah Anak : ");
                    anak = input.nextInt();
                    for(int i=1;i<=anak;i++){
                        System.out.print("Tingkat Pendidikan anak : ");
                        pendidikan = input.nextLine();  
                    }
                    if(total<= 50000000){
                       pajak = 0.1;
                       pajakBersih = (double) total * pajak;
                       System.out.print("Pajak yang harus Anda Bayar : "+pajakBersih);

                    }else{
                        pajak = 0.05;
                        pajakBersih = (double) total * pajak;
                       System.out.print("Pajak yang harus Anda Bayar : "+pajakBersih);
                    }
                } 
```

    =========================================================
    Apakah Anda Memiliki Usaha atau Tidak (y/n) : y
    Penghasilan dalam 1 tahun : 600000
    Pajak Usaha Anda dalam 1 tahun: 90000.0
    =================================================
    Contoh data yang ingin diinputkan : 
    1. Perhiasan
    2. Tanah
    3. Surat Berharga
    4. Kendaraan
    5. Dll
    =================================================
    Jumlah data harta kekayaan yang ingin diinputkan : 4
    =================================================
    Harga / Nilai Pasar : 400000
    Harga / Nilai Pasar : 700000
    Harga / Nilai Pasar : 30000
    Harga / Nilai Pasar : 20000
    Total Harta kekayaan : 1150000
    =================================================
    Apakah Sudah berkeluarga (y/n) : 

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


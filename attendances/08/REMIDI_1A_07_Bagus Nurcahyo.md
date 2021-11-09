Identitas Diri

Nim : [2131710120]

Nama: [Bagus Nurcahyo]

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

//library Scanner
import java.util.Scanner;
Scanner in=new Scanner(System.in);
String namaMak, namaMin;

//input nama makanan dan minuman
System.out.print("Nama makanan: ");
namaMak=in.nextLine();
System.out.print("Nama minuman: ");
namaMin=in.nextLine();
System.out.println();

//input harga makanan dan minuman
int hargaMak, hargaMin;
System.out.print("Harga makanan: Rp.");
hargaMak=in.nextInt();
System.out.print("Harga minuman: Rp.");
hargaMin=in.nextInt();
System.out.println();

//input jumlah makanan dan minuman
int jmlBeliMak, jmlBeliMin;
System.out.print("Jumlah makanan yang dibeli: ");
jmlBeliMak=in.nextInt();
System.out.print("Jumlah minuman yang dibeli: ");
jmlBeliMin=in.nextInt();
System.out.println();

//menghitung diskon, plastik, ppn, dan total
int diskonMin, diskonMinFinal;
int totalHargaMak=hargaMak*jmlBeliMak;
int totalHargaMin=hargaMin*jmlBeliMin;
int total;
if(jmlBeliMin==3){//diskon minuman
    diskonMin=hargaMin*jmlBeliMin;
    diskonMinFinal=diskonMin-5000;
    System.out.println("Nama makanan yang dibeli " +namaMak+ " dengan harga Rp." +hargaMak+ " yang berjumlah "+jmlBeliMak+ " [Rp."+totalHargaMak+"]");
    System.out.println("Nama minuman yang dibeli " +namaMin+ " dengan harga Rp." +hargaMin+ " yang berjumlah "+jmlBeliMin+ "  [Rp."+diskonMinFinal+"]");
    total=totalHargaMak+diskonMinFinal;

    int plastik;
    System.out.print("Apakah perlu plastik?(1=y, 2=n) ");
    plastik=in.nextInt();
    if(plastik==1){//plastik rp200
    int plastikyDiskon;
        plastikyDiskon=total-200;
        if(plastikyDiskon>=1000000){//ppn
            int ppn=plastikyDiskon-7000;
            System.out.println("TOTAL = "+ppn);
        }else{
            System.out.println("TOTAL = "+plastikyDiskon);
        }
    }else{
        plastik=total;
        if(plastik>=1000000){
            int ppn=plastik-7000;
            System.out.println("TOTAL = "+ppn);
        }else{
            System.out.println("TOTAL = "+plastik);
        }
    }
}else{// no diskon
    System.out.println("Nama makanan yang dibeli " +namaMak+ " dengan harga Rp." +hargaMak+ " yang berjumlah "+jmlBeliMak+ " [Rp."+totalHargaMak+"]");
    System.out.println("Nama minuman yang dibeli " +namaMin+ " dengan harga Rp." +hargaMin+ " yang berjumlah "+jmlBeliMin+ " [Rp."+totalHargaMin+"]");
    total=totalHargaMak+totalHargaMin;

    int plastik;
    System.out.print("Apakah perlu plastik?(1=y, 2=n) ");
    plastik=in.nextInt();
    if(plastik==1){//plastik rp200
    int plastikyDiskon;
        plastikyDiskon=total-200;
        if(plastikyDiskon>=1000000){//ppn
            int ppn=plastikyDiskon-7000;
            System.out.println("TOTAL = "+ppn);
        }else{
            System.out.println("TOTAL = "+plastikyDiskon);
        }
    }else{
        plastik=total;
        if(plastik>=1000000){
            int ppn=plastik-7000;
            System.out.println("TOTAL = "+ppn);
        }else{
            System.out.println("TOTAL = "+plastik);
        }
    }
}
```

    Nama makanan: SariRoti
    Nama minuman: GoodDay
    
    Harga makanan: Rp.3000
    Harga minuman: Rp.5000
    
    Jumlah makanan yang dibeli: 3
    Jumlah minuman yang dibeli: 1
    
    Nama makanan yang dibeli SariRoti dengan harga Rp.3000 yang berjumlah 3 [Rp.9000]
    Nama minuman yang dibeli GoodDay dengan harga Rp.5000 yang berjumlah 1 [Rp.5000]
    Apakah perlu plastik?(1=y, 2=n) 1
    TOTAL = 13800


2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java
// tulis jawaban di sini

//library Scanner
import java.util.Scanner;
Scanner pi= new Scanner(System.in);

//membuat variabel
char usaha;
int jenisHarta;
String hartaBenda;

//inputan nama barang dan nilai jual
System.out.print("Nama barang Kekayaan ");
hartaBenda=pi.nextLine();
System.out.print("Masukkan nilai jual: Rp.");
int nilaiJual=pi.nextInt();

System.out.println();

//menginput pengusaha apkah iya atau tidak
System.out.print("Apakah anda pengusaha? ");
usaha=pi.next().charAt(0);
int penghasilan;

//jika iya
if(usaha=='y'){
    System.out.print("Penghasilan satu tahun Rp.");
    penghasilan=pi.nextInt();
    int pajak=penghasilan+1500000;
    System.out.println("Pasca pajak=Rp."+pajak);
//jika tidak
}else{
    System.out.print("Penghasilan satu tahun Rp.");
    penghasilan=pi.nextInt();
}

System.out.println();

//total kekayaan
int totalKekayaan=penghasilan+nilaiJual;
System.out.println("Total kekayaan Rp."+totalKekayaan);

//membuat inputan apakah sudah beranak
System.out.print("Apakah sudah beranak? ");
char beranak=pi.next().charAt(0);

//jika sudah
if(beranak=='y'){
    System.out.println("1. SD");
    System.out.println("2. SMP");
    System.out.println("3. SMK");
    System.out.println("4. Kuliah");
    System.out.print("Masukkan pendidikan anak ");
    int pendidikan=pi.nextInt();
    if(pendidikan==1){//jika anak masih sd
        if(totalKekayaan<50000000){
            int potong=totalKekayaan-500000;
            System.out.println("HASIL > Rp."+potong);
        }
    }else if(pendidikan==2){//jika anak masih smp
        if(totalKekayaan<50000000){
            int potong=totalKekayaan-500000;
            System.out.println("HASIL > Rp."+potong);
        }
    }else if(pendidikan==3){//jika anak sudah smk
        if(totalKekayaan>=50000000){
            int potong=totalKekayaan-1000000;
            System.out.println("HASIL > Rp."+potong);
        }else{
            int potong=totalKekayaan-500000;
            System.out.println("HASIL > Rp."+potong);
        }
    }else if(pendidikan==4){//jika anak sudah kuliah
        if(totalKekayaan>=50000000){
            int potong=totalKekayaan-1000000;
            System.out.println("HASIL > Rp."+potong);
        }else{
            int potong=totalKekayaan-500000;
            System.out.println("HASIL > Rp."+potong);
        }
    }
//jika belum mempunyai anak
}else{
    if(totalKekayaan<50000000){
        int potong=totalKekayaan-500000;
        System.out.println("HASIL > Rp."+potong);
    }
}



```

    Nama barang Kekayaan Motor
    Masukkan nilai jual: Rp.5000000
    
    Apakah anda pengusaha? y
    Penghasilan satu tahun Rp.5000000
    Pasca pajak=Rp.6500000
    
    Total kekayaan Rp.10000000
    Apakah sudah beranak? y
    1. SD
    2. SMP
    3. SMK
    4. Kuliah
    Masukkan pendidikan anak 2
    HASIL > Rp.9500000


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


Identitas Diri

Nim : 2131710093

Nama: Arya Wildhani Putra

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
public class main {
public static void main(String args[]) {
     
        
System.out.println("=============== ");
System.out.println("---Daftar Menu---");
System.out.println("=============== ");
System.out.println("---Makanan---");
System.out.println("1. Bakpia :  100 ");
System.out.println("2. Roti : 200 ");
System.out.println("3. Cakue : 400 ");
System.out.println("=============== ");
System.out.println("---Minuman---");
System.out.println("1. Jasjus : 100 ");
System.out.println("2. Sisri : 200 ");
System.out.println("3. Pop Ice : 300 ");
        
Scanner sc = new Scanner(System.in);
    
String nama, jenisBarang;
int harga, jumlah, total, diskon;
char plastik;
    
    
System.out.print("Jenis Menu : ");
jenisBarang= sc.nextLine(); 
System.out.print("Nama Menu : ");
nama= sc.nextLine();  
System.out.print("jumlah yang akan dipesan : ");
jumlah= sc.nextInt();
System.out.print("Harga : ");
harga= sc.nextInt();
        
if(jumlah == 3){
    diskon = harga * 5 / 100;
} else {
    diskon = 0;
}
    
System.out.println("Apakah Anda ingin menggunakan kantong plastik? (0=tidak, 1=ya)");
plastik = sc.next().charAt(0);
if(plastik == '1'){
    total = harga * jumlah - diskon + 200;
} else {
    total = harga * jumlah - diskon;
}

System.out.print("Total belanja Anda  " +total);         
        
        }
        
}
    
 =============== 
---Daftar Menu---
=============== 
---Makanan---
1. Bakpia :  100 
2. Roti : 200 
3. Cakue : 400 
=============== 
---Minuman---
1. Jasjus : 100 
2. Sisri : 200 
3. Pop Ice : 300 
Jenis Menu : makanan
Nama Menu : Bakpia
jumlah yang akan dipesan : 3
Harga : 100
Apakah Anda ingin menggunakan kantong plastik? (0=tidak, 1=ya)
0
Total belanja Anda  2300   
    

```

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


Identitas Diri

Nim : 2131710150

Nama: Akbar Rahmadani

### Soal UTS 2021-2022


1. Buatlah sebuah program untuk menghitung biaya yang harus dikeluarkan oleh pembeli dalam sebuah toko dengan spesifikasi sebagai berikut
    + Jumlah barang yang akan diinputkan belum diketahui jumlahnya
    + Terdapat 3 buah inputan, jenis barang(minuman,makanan), nama, dan harga
    + Ketika jumlah minuman adalah 3 buah, maka akan mendapatkan potongan harga sebesar 5% dari harga minuman.
    + Ketika diakhir belanja seorang pembeli ditanya oleh kasir, apakah mau beli kantong plastic atau tidak. Jika mau, maka harus membayar Rp.200.
    + Ketika total pembelian lebih besar sama dengan 1 juta, maka harus dikenai PPN 7%.


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String nama;
int minum, makan, harga, jumlah = 0, diskon = 0;
double total = 0;
int hargamakanan = 15000,hargaminuman = 5000;
char kresek;

System.out.println("Masukkan jenis pesanan : ");
nama = sc.nextLine();
if(nama.equalsIgnoreCase("Makanan")) {
    System.out.println("Jumlah pesanan : ");
    jumlah = sc.nextInt();
    total = hargamakanan * jumlah; 
    System.out.println("Jumlah : " + jumlah);    
    System.out.println("Harga : " + hargamakanan);
    System.out.println("Total : " + total);
} else if(nama.equalsIgnoreCase("Minuman")) {
    jumlah = sc.nextInt();
    total = hargaminuman * jumlah; 
    System.out.println("Jumlah : " + jumlah);    
} else System.out.println("Pilihan Tidak Ada!");
if(jumlah >= 3){
    total = total * 0.05;
}
System.out.println("Total : " + total);

System.out.println("Menggunakan kresek atau tidak (Y/T)");
sc.nextLine();
kresek = sc.nextLine().charAt(0);
if(kresek == ('Y')) {
    total += 200;
} else if(kresek == ('T')) {
    
} else System.out.println("Pilihan Tidak Ada!");

if(total > 1000000) total = total * 0.07;
System.out.println("Total Belanja anda : " + total);

```

    Masukkan jenis pesanan : 
    Makanan
    Jumlah pesanan : 
    5
    Jumlah : 5
    Harga : 15000
    Total : 75000.0
    Total : 3750.0
    Menggunakan kresek atau tidak (Y/T)
    Y
    Total Belanja anda : 3950.0


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)


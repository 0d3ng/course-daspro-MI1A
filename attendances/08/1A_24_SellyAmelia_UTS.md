Identitas Diri

Nim : 2131710142

Nama: Selly Amelia Putri

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

System.out.println("===============================================");
System.out.println("--------------STRUK BELANJA ANDA---------------");
System.out.println("===============================================");

Scanner input = new Scanner(System.in);
String namaBarang, jenisBarang;
int jumlahBarang;
double hargaBarang, diskon, ppn, totalHarga;
char kantongPlastik;

System.out.print("Nama Makanan/Minuman : ");
namaBarang = input.nextLine();

System.out.print("Jenis Barang (Makanan/Minuman) : ");
jenisBarang = input.nextLine();

System.out.print("Jumlah Pesan: ");
jumlahBarang = input.nextInt();

System.out.print("Harga : ");
hargaBarang = input.nextDouble();

if(jenisBarang.equalsIgnoreCase ("Minuman")){
    if(jumlahBarang >= 3){
        diskon = hargaBarang * 5 / 100 ;
    } else {
    diskon = 0;
    }
}

System.out.print("Memakai kantong plastik (0=ya, 1=tidak): ");
kantongPlastik = input.next().charAt(0);

if(kantongPlastik == '0'){
    totalHarga = hargaBarang * jumlahBarang - diskon + 200;
} else {
    totalHarga = hargaBarang * jumlahBarang - diskon;
}

System.out.println("================================================");
System.out.println("Total pesanan yang harus dibayar : " +totalHarga);
System.out.println("================================================");
```

    ===============================================
    --------------STRUK BELANJA ANDA---------------
    ===============================================
    Nama Makanan/Minuman : Jus
    Jenis Barang (Makanan/Minuman) : Minuman
    Jumlah Pesan: 5
    Harga : 10000
    Memakai kantong plastik (0=ya, 1=tidak): 1
    ================================================
    Total pesanan yang harus dibayar : 49500.0
    ================================================


// Penjelasan kode program
1. import java.util.Scanner; = Library Scanner
2. Scanner input = new Scanner(System.in); = Memasukkan inputan dari keyboard
3. String namaBarang, jenisBarang;, int jumlahBarang;, double hargaBarang, diskon, ppn, totalHarga;, char kantongPlastik; = Tipedata dan variabel
4. System.out.print........ = Untuk memasukkan inputan yang diminta
5. namaBarang = input.nextLine();, jenisBarang = input.nextLine();, jumlahBarang = input.nextInt();, hargaBarang = input.nextDouble(); = Method untuk mengambil sebuah user dari tipedata dan variabel
6. if(jenisBarang.equalsIgnoreCase = Untuk membandingkan 2 buah variable, yang bertipe data String
7. if else = Untuk menyambung beberapa perintah IF ELSE menjadi sebuah kesatuan. Jika kondisi pertama tidak terpenuhi atau bernilai false, maka kode program akan lanjut ke kondisi selanjutnya

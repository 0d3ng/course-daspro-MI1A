# JOBSHEET 13. Fungsi 1

Farhan Asyam Alfitra

MI-1A/11

2131710138

## Tujuan
* Mahasiswa mampu memahami penggunaan fungsi static pada Java dengan parameter dan mengembalikan nilai.
* Mahasiswa mampu membuat program menggunakan fungsi static dan mengeksekusi fungsi tersebut.


## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Fungsi Void (tidak menggunakan return value)

1.	Buat fungsi **beriSalam** bertipe void yang digunakan untuk mencetak **“Halo! Selamat Pagi”**.
![Gambar 1](images/1.1.png)

2. Eksekusi atau panggil fungsi **beriSalam**.
![Gambar 2](images/1.2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1 & 2
static void beriSalam(){
System.out.println("Halo! Selamat Pagi");
}
beriSalam();
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam() {
    System.out.println("Halo! Selamat Pagi");
}
static void beriUcapan(String ucapan) {
    System.out.println(ucapan);
}
beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam)
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

Pada beriSalam, tidak menggunakan parameter


pada beriUcap, menggunakan parameter



2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Tidak Menggunakan parameter :  beriSalam(){

Menggunakan Parameter : beriUcapan(String ucapan) {
    System.out.println(ucapan);
}
beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam)


### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

    int luasan = luasPersegi(5);
    System.out.println("Luas Pesegi dengan sisi 5 = " + luasan);
```

    Luas Pesegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

luasPersegi hanya menghasilkan saja tidak disimpan, maka diperlukan variabel baru

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

diatas tertulis return luas; yang dimana fungsi tersebut untuk kembali ke "Luas"

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.print("Input Panjang Sisi : ");
int pjgSisi = input.nextInt();

static int luasPersegi(int psisi) {
    int luas = psisi * psisi;
    return luas;
}

int luasan = luasPersegi(pjgSisi); 
System.out.printf("Luas Persegi dengan sisi %d = %d", pjgSisi, luasan);
```

    Input Panjang Sisi : 4
    Luas Persegi dengan sisi 4 = 16




    java.io.PrintStream@1616c0bf



### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain
Pada Percobaan 3, kode program yang dibuat digunakan untuk mengimplementasikan bahwa fungsi dapat meng-CALL fungsi yang lain. Dimana dalam percobaan ini terdapat fungsi **Kali dan Kurang**. 
1. Buatlah fungsi **Kali** yang mengembalikan nilai H (int) dan parameter masukan C dan D (int).
![Gambar 9](images/3.1.png)

2.	Buatlah fungsi **Kurang** yang mengembalikan nilai X (int) dan parameter masukan A dan B (int) dan memanggil fungsi Kali.
![Gambar 10](images/3.2.png)

3. Lakukan import class Scanner sebagai inputan di langkah selajutnya.

4. Eksekusi atau panggil fungsi **Kurang** .
![Gambar 11](images/3.4.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1, 2, 3 & 4
static int kali(int C, int D){
    int H;
    H = (C + 10) % (D + 19);
    return H;
}
static int kurang (int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = kali (A, B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1:");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2 = input.nextInt();
int hasil = kurang (nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    9
    Masukkan Nilai 2:
    8
    Hasil akhir adalah 26


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
static int Kali(int C, int D) {
    int H;
    C = + 10;
    D = + 19;
    H = Kurang(C, D);
    return H;
}

static int Kurang(int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = A - B;
    return X;
}

int nilaia, nilaib;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan Nilai A:");
nilaia = input.nextInt();

System.out.println("Masukkan Nilai B:");
nilaib = input.nextInt();

int hasil = Kali(nilaia, nilaib);
System.out.println("Hasil akhir " + hasil);
```

    Masukkan Nilai A:
    99
    Masukkan Nilai B:
    2
    Hasil akhir -6


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

input nilaia, nilaib. 

input dari nilaia, nilaib digunakan memproses fungsi. 

nilaia, nilaib diproses dengan fungsi kali, pada bagian fungsi kali ada penambahan nilai C = + 10 D = + 19.

nilaia, nilaib diproses dengan fungsi kurang, pada bagian fungsi kurang ada penambahan nilai a+7,b+4

Terakhir yaitu pemberian nilai output dari hasil proses yang dilakukan





### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang ");
p=input.nextInt();
System.out.println("Masukkan lebar ");
l=input.nextInt();
System.out.println("Masukkan tinggi ");
t=input.nextInt();

L = p * l;
System.out.println("Luas persegi panjang adalah " + L);

vol = p * l * t;
System.out.println("Volume balok adalah " + vol);
```

    Masukkan panjang 
    3
    Masukkan lebar 
    5
    Masukkan tinggi 
    8
    Luas persegi panjang adalah 15
    Volume balok adalah 120


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas (int pjg, int lb) {
    int Luas = pjg * lb;
    return Luas;
}

static int hitungVolume (int tinggi, int a, int b) {
    int volume = hitungLuas(a,b) * tinggi;
    return volume;
}

Scanner input = new Scanner(System.in);

int p, l, t, L, vol;

System.out.println("Masukkan panjang");
p = input.nextInt();

System.out.println("Masukkan lebar");
l = input.nextInt();

System.out.println("Masukkan tinggi");
t = input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah " + L);
vol = hitungVolume(t,p,l);
System.out.println("Volume Balok adalah " + vol);
```

    Masukkan panjang
    5
    Masukkan lebar
    7
    Masukkan tinggi
    9
    Luas Persegi Panjang adalah 35
    Volume Balok adalah 315


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

hitungLuas menyimpan pjg(panjang) dan lb (lebar)

hitungVolume menyimpan pjg(panjang), lb (lebar), Tinggi

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

fungsi, karena dapat memanggil yang dibutuhkan saja 

### Percobaan 5: Fungsi Menggunakan Array dan Variabel Global
Pada Percobaan 5, kode program yang dibuat digunakan untuk menghitung total nilai yang ada didalam array dengan membuat 3 fungsi yaitu isiarray, hitTol, dan tampilArray.
1. Buatlah **variable global total dan i** bertipe int
![Gambar 9](images/5.1pertama.png)

2. Buatlah fungsi **isiarray** bertipe int dengan parameter angka bertipe int 

![Gambar 10](images/5.1.png)

3. Buatlah fungsi **tampilArray** bertipe **void** dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.2.png)

4. Buatlah fungsi **hitTot** bertipe int dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.3.png)

5. Import dan deklarasikan Scanner dengan nama **input**

![Gambar 10](images/4.1.png)

6. Eksekusi atau panggil ketiga fungsi yaitu **isiarray, tampilArray, dan hitTot**, kemudian jalankan program!

![Gambar 10](images/5.6.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1 s/d 6
static int total = 0,i;

static int [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array [] = new int [angka];
    for (i = 0; i < array.length; i++){
        System.out.println("Masukkan data ke- " + i);
        array[i] = input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke- " + i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr){
    for (i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner Input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total Nilai =  " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    3
    Masukkan data ke- 0
    2
    Masukkan data ke- 1
    3
    Masukkan data ke- 2
    4
    Nilai yang anda inputkan ke- 0
    2
    Nilai yang anda inputkan ke- 1
    3
    Nilai yang anda inputkan ke- 2
    4
    Total Nilai =  9


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

tampilarray tidak membutuhkan nilai return

isiarray dan hitot membutuhkan nilai return

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int total = 0 ,i;

static void isiarray (int angka) {
    Scanner input = new Scanner(System.in);
    int array[] = new int [angka];
    for(int i = 0; i < array.length; i++) {
        System.out.println("Masukkan data ke-"+i);
        array[i] = input.nextInt();
    }
    return array;
    
}
static void tampilArray(int [] arr) {
    for (i = 0; i < arr.length; i++) {
        System.out.println("Nilai yang anda inputkan ke " + i);
        System.out.println(arr[i]);
    }
}
static void hitTot(int []arr) {
    for(i = 0; i <arr.length; i++){
        total += arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```


    |       return array;

    incompatible types: unexpected return value

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1, int bil2, int bil3) {
    int max = 0;
    if(bil1 > bil2) max = bil1;
    else if(bil2 > bil3) max = bil2;
    else if(bil3 > bil1) max = bil3;
    
    return max; 
}

    int terbesar = Max3 (80, 90, 55);
System.out.print(terbesar);
```

    90

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
String makanan[] = {"Nasi goreng","Soto","Sate"};
int penjualan[][] = {{20,15,35,24,70},//nasi goreng
                     {30,40,10,28,35},//soto
                     {5,10,50,48,15}};//sate

static void makananFavsel(){
    if(penjualan[0][1] > penjualan[1][1] && penjualan[0][1] > penjualan[2][1]){
        System.out.print("Makanan Favorit Hari Selasa Nasi goreng");
    } else if (penjualan[1][1] > penjualan[0][1] && penjualan[1][1] > penjualan[2][1]){
        System.out.print("Makanan Favorit Hari Selasa Soto");
    } else if (penjualan[2][1] > penjualan[1][1] && penjualan[2][1] > penjualan[0][1]){
        System.out.print("Makanan Favorit Hari Selasa sate");
    }
    
}

makananFavsel();
System.out.println();

static void makananFavjum(){
    if(penjualan[0][4] > penjualan[1][4] && penjualan[0][4] > penjualan[2][4]){
        System.out.print("Makanan Favorit Hari Jumat Nasi goreng");
    } else if (penjualan[1][4] > penjualan[0][4] && penjualan[1][4] > penjualan[2][4]){
        System.out.print("Makanan Favorit Hari Jumat soto");
    } else if (penjualan[2][4] > penjualan[1][4] && penjualan[2][4] > penjualan[0][4]){
        System.out.print("Makanan Favorit Hari Jumat sate");
    }
}

makananFavjum();
System.out.println();
```

    Makanan Favorit Hari Selasa Soto
    Makanan Favorit Hari Jumat Nasi goreng



```Java
static void pemasukan(){
int uangNasigoreng = (penjualan[0][0] + penjualan[0][1] + penjualan[0][2] + penjualan[0][3] + penjualan[0][4]) * 20000;
int uangSoto = (penjualan[1][0] + penjualan[1][1] + penjualan[1][2] + penjualan[1][3] + penjualan[1][4]) * 15000;
int uangSate = (penjualan[2][0] + penjualan[2][1] + penjualan[2][2] + penjualan[2][3] + penjualan[2][4]) * 25000;
int pemasukanTotal = uangNasigoreng + uangSoto + uangSate;
System.out.println("Pemasukan Hari Senin - Jumat: Rp." + pemasukanTotal);
}
pemasukan();
```

    Pemasukan Hari Senin - Jumat: Rp.8625000



```Java
static void makananTerjual(){
int porsiNasi = (penjualan[0][0] + penjualan[0][1] + penjualan[0][2] + penjualan[0][3] + penjualan[0][4]);
int porsiSoto = (penjualan[1][0] + penjualan[1][1] + penjualan[1][2] + penjualan[1][3] + penjualan[1][4]);
int porsiSate = (penjualan[2][0] + penjualan[2][1] + penjualan[2][2] + penjualan[2][3] + penjualan[2][4]);

System.out.println("Total Porsi Nasi Goreng " + porsiNasi);
System.out.println("Total Soto " + porsiSoto);
System.out.println("Total Sate " + porsiSate);
}
makananTerjual();
```

    Total Porsi Nasi Goreng 164
    Total Soto 143
    Total Sate 128


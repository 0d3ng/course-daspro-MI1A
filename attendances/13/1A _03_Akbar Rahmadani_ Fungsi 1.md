# JOBSHEET 13. Fungsi 1

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
static void beriSalam(){ // deklarasi fungsi void beriSalam
    System.out.println("Halo! Selamat Pagi"); // untuk mencetak Halo! Selamat Pagi
}

static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
beriSalam(); // memanggil fungsi
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
static void beriSalam(){ // deklarasi fungsi bertipe void beriSalam
    System.out.println("Halo! Selamat Pagi"); // untuk mencetak Halo! Selamat Pagi
}

static void beriUcapan(String ucapan){ // fungsi void beriUcapan berparameter
    System.out.println(ucapan); 
}
beriSalam(); // memanggil fungsi
String salam = "Selamat datang di pemrogaman Java"; // deklarasi variabel salam bertipe data string
beriUcapan(salam); // memanggil fungsi beriUcapan menggunakan variabel salam
```

    Halo! Selamat Pagi
    Selamat datang di pemrogaman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

**beriSalam**
untuk memanggil kalimat "Halo! Selamat Pagi"

**beriUcapan**
untuk memanggil kalimat "Selamat datang di pemrograman Java"

2. Jelaskan cara pemanggilan sebuah fungsi void yang **berparameter** dan **tanpa parameter**!

**berparameter**
: contoh: beriUcapan(salam); Jika berparameter nama fungsi harus disertai variabel yang dideklarasikan di awalnya

**tanpa parameter** : contoh : beriSalam();  jika tanpa parameter hanya perlu menuliskan nama fungsinya

**parameter** : contoh : beriSalam(); Sedangkan yang tidak berparameter hanya perlu menuliskan nama fungsinya
- 

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
static int luasPersegi(int sisi){ // Fungsi luasPersegi berparameter
    int luas = sisi * sisi; // Rumus luas
    return luas; // menampung dan mengembalikan ke nilai luas
}

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

int luasan = luasPersegi(5); // untuk menampung hasil perhitungan luasPersegi
System.out.println("LUas Persegi dengan sisi 5 = " + luasan); //nmenampilkan hasil luasPersegi dengan variabel penampung luasan
```

    LUas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

- Karena membutuhkan variabel/tempat penampung.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

- Untuk mengembalikan kepada fungsi luasPersegi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
Scanner in = new Scanner(System.in); // deklarasi scanner
System.out.print("Masukkan panjang sisi persegi : "); // untuk mencetak Masukkan panjang sisi persegi
int panjangSisi = in.nextInt(); // variabel untuk menyimpan nilai input dari user

static int luasPersegi(int sisi) { // fungsi luasPersegi berparameter 
    int luas = sisi * sisi; // perhitungan luas
    return luas; //mengembalikan ke nilai luas
}

int luasan = luasPersegi(panjangSisi); // nilai dari input sebelumnya digunakan sebagai nilai parameter fungsi luasPersegi
System.out.printf("Luas Persegi dengan sisi %d = %d", panjangSisi, luasan); // output hasil menggunakan print format
```

    Masukkan panjang sisi persegi : 5
    Luas Persegi dengan sisi 5 = 25




    java.io.PrintStream@d7bd175



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
static int kali(int C, int D){ // fungsi Kali berparameter 2 variabel
    int H; // deklarasi variavel H
    H = (C + 10) % (D + 49); // perhitungan di variabel H
    return H; // output nilai H
}

static int kurang(int A, int B){ // fungsi Kurang berparameter 2 variabel
    int X; // deklarasi variabel X
    A = A + 7; // perhitungan nilai 1
    B = B + 4; // perhitungan nilai 2
    X = kali(A, B); // proses yang terjadi pada variabel X
    return X; // output variabel X
}
                int nilai1, nilai2; // variabel nilai1 dan nilai2
                Scanner input = new Scanner (System.in); // deklarasi Scanner
                System.out.println("Masukkan nilai1 : "); // mencetak nilai 1
                nilai1 = input.nextInt(); // memasukkan nilai 1
                System.out.println("Masukkan Nilai2 : "); // mencetak nilai 2
                nilai2 = input.nextInt(); // memasukkan nilai 2
                int hasil = kurang(nilai1, nilai2); // proses variabel hasil
                System.out.println("Hasil akhir adalah : " + hasil); // mencetak hasil akhir
```

    Masukkan nilai1 : 
    12
    Masukkan Nilai2 : 
    12
    Hasil akhir adalah : 29


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
static int Kali(int C, int D) {
    int H;
    C += 10;
    D += 19;
    H = Kurang(C, D); // Memanggil fungsi Kurang
    return H;
}

static int Kurang(int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = A - B;
    return X; // Mengembalikan hasil akhir
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1:");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2); // Memanggil fungsi kali
System.out.println("Hasil akhir adalah : " + hasil); // Output hasil akhir
```

    Masukkan Nilai 1:
    12
    Masukkan Nilai 2:
    12
    Hasil akhir adalah : -6


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

- Pertama kita akan diminta untuk menginputkan nilai 1 dan nilai 2
- setelah itu angka tersebut akan diolah menjadi hasil (Pada X maka akan di Kurangi)
- Selanjutnya hasil akan di return ke variabel X dimana di variabel tersebut meminta untuk diolah ke fungsi Kali
- Terakhir hasil dari olahan fungsi Kali tersebut merupakan hasil akhirnya.

### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner (System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L = p * l;
System.out.println("Luas Persegi panjang adalah" + L);
vol = p * l * t;
System.out.println("Volume balok adalah" + vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    10
    Masukkan tinggi
    10
    Luas Persegi panjang adalah100
    Volume balok adalah1000


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
static int hitungLuas (int pjg, int lb){
    int Luas = pjg * lb;
    return Luas;
}

static int hitungVolume (int tinggi, int a, int b){
    int volume = hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input = new Scanner (System.in);
int p,l,t,L,vol;
System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L=hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah" + L);
vol = hitungVolume(t,p,l);
System.out.println("Volume Balok adalah" + vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    10
    Masukkan tinggi
    10
    Luas Persegi Panjang adalah100
    Volume Balok adalah1000


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

- Untuk menampung nilai yang akan diolah.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

- Lebih mudah menggunakan tanpa fungsi, karena lebih mudah saya pahami.

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
static int total=0,i;

static int [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array [] = new int[angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- " + 1);
        array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr){
    for (i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai = "+total)
```

    Masukkan jumlah data yang ingin anda inputkan : 
    2
    Masukkan data ke- 1
    10
    Masukkan data ke- 1
    10
    Nilai yang anda inputkan ke 0
    10
    Nilai yang anda inputkan ke 1
    10
    Total nilai = 20


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

- Karena fungsi tampilarray tidak mengembalikan nilai, sedangkan isiArray dan hitTot mengembalikan hasil

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
static void total=0,i;

static void [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array [] = new int[angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- " + 1);
        array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr){
    for (i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai = "+total)
```


    |   static void total=0,i;

    '(' expected

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
Scanner masukan = new Scanner(System.in);
static int Max3(int bil1, int bil2, int bil3) {
    int max = 0;
    if(bil1 > bil2) max = bil1;
    else if(bil2 > bil3) max = bil2;
    else if(bil3 > bil1) max = bil3;
    
    return max; // Mengembalikan nilai tertinggi
}
System.out.println("Program Menjumlahkan Dua Bilangan");
System.out.print("Masukan bilangan 1 : ");
bil1 = masukan.nextInt();
System.out.print("Masukan bilangan 2 : ");
bil2 = masukan.nextInt();
System.out.print("Masukan bilangan 3 : ");
bil3 = masukan.nextInt();
System.out.println("Nilai tertinggi adalah: " + Max3(bil1, bil2, bil3)); // Pemanggilan fungsi Max3
```

    Program Menjumlahkan Dua Bilangan
    Masukan bilangan 1 : 12
    Masukan bilangan 2 : 13
    Masukan bilangan 3 : 14
    Nilai tertinggi adalah: 14


2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
int[][] penjualan = {{20,15,35,24,70},
                     {30,40,10,28,35},
                     {5,10,50,48,15}};
String[] menu = {"Nasi Goreng", "Soto", "Sate"}; // Membuat header menu
String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"}; // Membuat header hari

static void menuFavorit(int hariKe) {
    // hariKe = 1(Senin), 2(Selasa), dst
    hariKe -= 1; // Mengurangi parameter hariKe sebanyak 1 nilai untuk pengambilan data array hari
    int indexFavorit = 0, porsi = penjualan[0][hariKe]; // Deklarasi awal sebagai acuan data untuk perbandingan
    for(int i = 0; i < penjualan.length; i++)
        if(porsi < penjualan[i][hariKe]) indexFavorit = i; // Melakukan pengecekan porsi tertingi
    printf("\nMakanan favorit pada hari %s adalah %s", hari[hariKe], menu[indexFavorit]); // Output hari beserta tipe menu
}


static void pemasukan() {
    double total = 0;
    for(int i = 0; i < penjualan.length; i++) for(int j = 0; j < penjualan[0].length; j++) {
        // Melakukan pengecekan pada masing masing kolom
        if(i == 0) total += (penjualan[i][j] * 20000);
        else if(i == 1) total += (penjualan[i][j] * 15000);
        else if(i == 2) total += (penjualan[i][j] * 25000);
    }
    printf("\nTotal pemasukan restoran: Rp.%.2f", total);
}

static void porsiYangTerjual(int porsiKe) {
    // porsiKe = 1(Nasi Goreng), 2(Soto), 3(Sate)
    int total = 0;
    porsiKe -= 1; // Mengurangi parameter hariKe sebanyak 1 nilai untuk pengambilan data array hari
    for(int i = 0; i < penjualan[0].length; i++) total += penjualan[porsiKe][i];
    printf("\nTotal porsi menu %s yang terjual adalah %d porsi", menu[porsiKe], total );
}

// Pemanggilan Fungsi

menuFavorit(2); // Selasa
menuFavorit(5); // Jumat

pemasukan(); // Total pemasukan

porsiYangTerjual(1); // Nasi Goreng
porsiYangTerjual(2); // Soto
porsiYangTerjual(3); // Sate
```

    
    Makanan favorit pada hari Selasa adalah Soto
    Makanan favorit pada hari Jumat adalah Nasi Goreng
    Total pemasukan restoran: Rp.8625000.00
    Total porsi menu Nasi Goreng yang terjual adalah 164 porsi
    Total porsi menu Soto yang terjual adalah 143 porsi
    Total porsi menu Sate yang terjual adalah 128 porsi


```Java

```

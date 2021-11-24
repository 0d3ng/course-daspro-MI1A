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
// Tuliskan kode program Percobaan 1 Langkah 1 & 2
static void beriSalam(){ // deklarasi fungsi bertipe void beriSalam
    System.out.println("Halo! Selamat Pagi"); // untuk mencetak Halo! Selamat Pagi
}
beriSalam(); // memanggil fungsi
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam(){ // deklarasi fungsi bertipe void beriSalam
    System.out.println("Halo! Selamat Pagi"); // untuk mencetak Halo! Selamat Pagi
}

static void beriUcapan(String ucapan){ // fungsi bertipe void beriUcapan berparameter
    System.out.println(ucapan); // untuk mencetak fungsi beriUcapan menggunakan variabel ucapan
}

beriSalam(); // memanggil fungsi
String salam = "Selamat datang di pemrograman Java"; // deklarasi variabel salam bertipe data string
beriUcapan(salam); // memanggil fungsi beriUcapan menggunakan variabel salam
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

--> beriSalam : untuk memanggil kalimat "Halo! Selamat Pagi"

--> beriUcapan : untuk memanggil kalimat "Selamat datang di pemrograman Java"

Perbedaan lainnya terletak pada beriUcapan yang berparameter.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

--> Jika berparameter nama fungsi harus disertai variabel yang dideklarasikan di awalnya, contoh: beriUcapan(salam);

--> Sedangkan yang tidak berparameter hanya perlu menuliskan nama fungsinya, contoh : beriSalam();

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
static int luasPersegi(int sisi){ // fungsi luasPersegi berparameter 
    int luas = sisi * sisi; // perhtiungan luas
    return luas; // menampung dan mengembalikan ke nilai luas
}

    int luasan = luasPersegi(5); // untuk menampung hasil perhitungan luasPersegi
    System.out.println("Luas Persegi dengan sisi 5 = " + luasan); // untuk menampilkan hasil luasPersegi dengan variabel penampung luasan
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Karena hasil dari perhitungan luas membutuhkan variabel/tempat penampung.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

Untuk mengembalikan kepada fungsi luasPersegi agar data dapat diolah di perintah selanjutnya.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner; // untuk memasukkan inputan dari keyboard
Scanner in = new Scanner(System.in); // deklarasi scanner

static int luasPersegi(int sisi){ // fungsi luasPersegi berparameter 
    int luas = sisi * sisi; // perhtiungan luas
    return luas; // mengembalikan ke nilai luas
}

    int luasan = luasPersegi(5); // untuk menampung hasil perhitungan luasPersegi
    System.out.println("Luas Persegi dengan sisi 5 = " + luasan); // untuk menampilkan hasil luasPersegi dengan variabel penampung luasan
```

    Luas Persegi dengan sisi 5 = 25


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
static int Kali(int C, int D){ // fungsi Kali berparameter 2 variabel
    int H; // deklarasi variabel H
    H = (C + 10) % (D + 19); // perhitungan yang terjadi di variabel H
    return H; // mengembalikan nilai output H
}

static int Kurang(int A, int B){ // fungsi Kurang berparameter 2 variabel
    int X; // deklarasi variabel X
    A = A + 7; // proses perhitungan nilai 1
    B = B + 4; // proses perhitungan nilai 2
    X = Kali(A, B); // proses yang akan dilakukan pada variabel X
    return X; // mengembalikan nilai output ke variabel X
}

int nilai1, nilai2; // deklarasi variabel nilai1 dan nilai2
Scanner input = new Scanner (System.in); // deklarasi Scanner
System.out.println("Masukkan Nilai 1 : "); // mencetak nilai 1
nilai1 = input.nextInt(); // memasukkan nilai 1
System.out.println("Masukkan Nilai 2 : "); // mencetak nilai 2
nilai2 = input.nextInt(); // memasukkan nilai 2
int hasil = Kurang(nilai1, nilai2); // proses yang akan dilakukan pada variabel hasil
System.out.println("Hasil akhir adalah " + hasil); // mencetak hasil akhir
```

    Masukkan Nilai 1 : 
    3
    Masukkan Nilai 2 : 
    4
    Hasil akhir adalah 20


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kurang(int C, int D){ // fungsi Kali berparameter 2 variabel
    int H; // deklarasi variabel H
    H = (C + 10) % (D + 19); // perhitungan yang terjadi di variabel H
    return H; // mengembalikan nilai output H
}

static int Kali(int A, int B){ // fungsi Kurang berparameter 2 variabel
    int X; // deklarasi variabel X
    A = A + 7; // proses perhitungan nilai 1
    B = B + 4; // proses perhitungan nilai 2
    X = Kurang(A, B); // proses yang akan dilakukan pada variabel X
    return X; // mengembalikan nilai output ke variabel X
}

int nilai1, nilai2; // deklarasi variabel nilai1 dan nilai2
Scanner input = new Scanner (System.in); // deklarasi Scanner
System.out.println("Masukkan Nilai 1 : "); // mencetak nilai 1
nilai1 = input.nextInt(); // memasukkan nilai 1
System.out.println("Masukkan Nilai 2 : "); // mencetak nilai 2
nilai2 = input.nextInt(); // memasukkan nilai 2
int hasil = Kali(nilai1, nilai2); // proses yang akan dilakukan pada variabel hasil
System.out.println("Hasil akhir adalah " + hasil); // mencetak hasil akhir
```

    Masukkan Nilai 1 : 
    4
    Masukkan Nilai 2 : 
    3
    Hasil akhir adalah 21


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

Pertama kita akan diminta untuk menginputkan nilai 1 dan nilai 2, setelah itu angka tersebut akan diolah menjadi hasil. Pada variabel hasil maka akan diolah ke fungsi Kurang. Selanjutnya hasil akan di return ke variabel X dimana di variabel tersebut meminta untuk diolah ke fungsi Kali. Terakhir, hasil dari olahan fungsi Kali tersebut merupakan hasil akhirnya.

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
import java.util.Scanner; // untuk memasukkan inputan dari keyboard
Scanner input = new Scanner(System.in); // deklarasi Scanner
int p,l,t,L,vol; // deklarasi variabel

System.out.println("Masukkan panjang"); // mencetak panjang
p = input.nextInt(); // memasukkan panjang
System.out.println("Masukkan lebar"); // mencetak lebar
l = input.nextInt(); // memasukkan lebar
System.out.println("Masukkan tinggi"); // mencetak tinggi
t = input.nextInt(); // memasukkan tinggi

L = p * l; // perhitungan lebar
System.out.println("Luas Persegi panjang adalah " + L); // mencetak hasil perhitungan lebar

vol = p * l * t; // perhitungan volume balok
System.out.println("Volume balok adalah " + vol); // mencetak hasil perhitungan volume balok
```

    Masukkan panjang
    4
    Masukkan lebar
    3
    Masukkan tinggi
    5
    Luas Persegi panjang adalah 12
    Volume balok adalah 60


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas (int pjg, int lb){ // deklarasi fungsi hitungLuas berparameter
    int Luas = pjg * lb; // proses perhitungan luas
    return Luas; // menyimpan hasil luas untuk dilanjutkan ke proses selanjutnya
}

static int hitungVolume (int tinggi, int a, int b){ // deklarasi fungsi hitungVolume berparameter
    int volume = hitungLuas(a,b) * tinggi; // proses perhitungan volume dengan memanggil hasil dari perhitungan fungsi hitungLuas
    return volume; // menyimpan hasil volume untuk dilanjutkan ke proses selanjutnya
}

Scanner input = new Scanner (System.in); // deklarasi scanner
int p,l,t,L,vol; // deklarasi variabel
System.out.println("Masukkan panjang"); // mencetak panjang
p = input.nextInt(); // memasukkan panjang
System.out.println("Masukkan lebar"); // mencetak lebar
l = input.nextInt(); // memasukkan lebar
System.out.println("Masukkan tinggi"); // mencetak tinggi
t = input.nextInt(); // memasukkan tinggi

L = hitungLuas(p,l); // memanggil fungsi hitungLuas
System.out.println("Luas Persegi Panjang adalah " + L); // mencetak hasil Luas persegi panjang
vol = hitungVolume(t,p,l); // memanggil fungsi hitungVolume
System.out.println("Volume Balok adalah " + vol); // mencetak hasil perhitungan volume
```

    Masukkan panjang
    2
    Masukkan lebar
    3
    Masukkan tinggi
    4
    Luas Persegi Panjang adalah 6
    Volume Balok adalah 24


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Berfungsi untuk menampung nilai yang akan diolah.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Menurut saya lebih mudah menggunakan tanpa fungsi, karena lebih mudah saya pahami.

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
static int total = 0, i; // membuat variabel global total dan i bertipe int

static int [] isiarray (int angka) { // deklarasi fungsi isiarray
    Scanner input = new Scanner (System.in); // deklarasi scanner
    int array[] = new int [angka]; // deklarasi dan instansiasi array
    for (i = 0; i < array.length; i++){ // perulangan untuk memasukkan data sebanyak yang diinputkan sebelumnya
    System.out.println("Masukkan data ke- " + i); // mencetak data
    array[i] = input.nextInt(); // memasukkan data
    }
    return array; // menampung hasil masukan data dan akan diolah pada proses selanjutnya
}

static void tampilArray(int [] arr){ // deklarasi fungsi tampilArray
    for (i = 0; i < arr.length; i++){ //perulangan untuk menampilkan data yang dimasukkan sebelumnya
        System.out.println("Nilai yang anda inputkan ke " + i); // mencetak data yang dimasukkan sebelumnya
        System.out.println(arr[i]); // menampilkan data yang dimasukkan
    }
}

static int hitTot (int [] arr){ // deklarasi fungsi hitTot
    for (i = 0; i < arr.length; i++){ // perulangan untuk hitTot
        total += arr[i]; // perhitungan total data yang diinput
    }
    return total; // menampung hasil operasi total dan akan diolah pada proses selanjutnya
}

import java.util.Scanner; // untuk memasukkan inputan dari keyboard
Scanner input = new Scanner(System.in); // deklarasi scanner

System.out.println("Masukkan jumlah data yang ingin anda inputkan: "); // mencetak jumlah data yang ingin di inputkan
int jum = input.nextInt(); // memasukkan jumlah data
int [] dataArray = isiarray(jum); // deklarasi dan instansiasi array
tampilArray(dataArray); // membuat 
total = hitTot(dataArray); // memanggil fungsi hitTot
System.out.println("Total nilai = " + total); // menampilkan hasil hitung total
```

    Masukkan jumlah data yang ingin anda inputkan: 
    2
    Masukkan data ke- 0
    4
    Masukkan data ke- 1
    5
    Nilai yang anda inputkan ke 0
    4
    Nilai yang anda inputkan ke 1
    5
    Total nilai = 9


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Karena pada fungsi tampil array tidak ada perhitungan yang perlu disimpan hasilnya, sedangkan isiarray dan hitTot terdapat perhitungan yang perlu disimpan.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
// **Menurut pendapat saya tidak dapat, karena membutuhkan nilai yang ditampung dan membutuhkan return. Berikut pembuktiannya

static int total = 0, i; // membuat variabel global total dan i bertipe int

static void [] isiarray (int angka) { // deklarasi fungsi isiarray
    Scanner input = new Scanner (System.in); // deklarasi scanner
    int array[] = new int [angka]; // deklarasi dan instansiasi array
    for (i = 0; i < array.length; i++){ // perulangan untuk memasukkan data sebanyak yang diinputkan sebelumnya
    System.out.println("Masukkan data ke- " + i); // mencetak data
    array[i] = input.nextInt(); // memasukkan data
    }
    return array; // menampung hasil masukan data dan akan diolah pada proses selanjutnya
}

static void tampilArray(int [] arr){ // deklarasi fungsi tampilArray
    for (i = 0; i < arr.length; i++){ //perulangan untuk menampilkan data yang dimasukkan sebelumnya
        System.out.println("Nilai yang anda inputkan ke " + i); // mencetak data yang dimasukkan sebelumnya
        System.out.println(arr[i]); // menampilkan data yang dimasukkan
    }
}

static void hitTot (int [] arr){ // deklarasi fungsi hitTot
    for (i = 0; i < arr.length; i++){ // perulangan untuk hitTot
        total += arr[i]; // perhitungan total data yang diinput
    }
    return total; // menampung hasil operasi total dan akan diolah pada proses selanjutnya
}

import java.util.Scanner; // untuk memasukkan inputan dari keyboard
Scanner input = new Scanner(System.in); // deklarasi scanner

System.out.println("Masukkan jumlah data yang ingin anda inputkan: "); // mencetak jumlah data yang ingin di inputkan
int jum = input.nextInt(); // memasukkan jumlah data
int [] dataArray = isiarray(jum); // deklarasi dan instansiasi array
tampilArray(dataArray); // membuat 
total = hitTot(dataArray); // memanggil fungsi hitTot
System.out.println("Total nilai = " + total); // menampilkan hasil hitung total
```


    |   static void [] isiarray (int angka) { // deklarasi fungsi isiarray

    illegal start of expression

    

    |   static void [] isiarray (int angka) { // deklarasi fungsi isiarray

    ';' expected

    

    |   static void [] isiarray (int angka) { // deklarasi fungsi isiarray

    '.class' expected

    

    |   static void [] isiarray (int angka) { // deklarasi fungsi isiarray

    ';' expected

    

    |   static void [] isiarray (int angka) { // deklarasi fungsi isiarray

    unexpected type

      required: value

      found:    class

    

    |       int array[] = new int [angka]; // deklarasi dan instansiasi array

    cannot find symbol

      symbol:   variable angka

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1, int bil2, int bil3){ // deklarasi fungsi Max3 berparameter
    int max = 0; // deklarasi variabel max
    if(bil1 > bil2 && bil1 > bil3){ // pemilihan jika bil1 merupakan bilangan tertinggi
        max = bil1;
    } else if(bil2 > bil3 && bil2 > bil1){ // pemilihan jika bil2 merupakan bilangan tertinggi
        max = bil2;
    } else if(bil3 > bil1 && bil3 > bil2){ // pemilihan jika bil3 merupakan bilangan tertinggi
        max = bil3;
    }
    return max; // menampung bilangan tertinggi dan akan diolah di proses selanjutnya
}
int tertinggi = Max3(3, 5, 1); // variabel baru untuk menampung hasil bilangan yang ada
System.out.print("Bilangan tertinggi adalah : " + tertinggi); // mencetak dan menampilkan bilangan tertinggi
```

    Bilangan tertinggi adalah : 5

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
String menu[] = {"Nasi goreng", "Soto", "Sate"};
int porsi[][]=  {{20,15,35,24,70},{30,40,10,28,35},{5,10,50,48,15}};
// deklarasi dan inisialisasi array

static void favoritSelasa(){ // deklarasi fungsi favoritSelasa
    if(porsi[0][1] > porsi[1][1] && porsi[0][1]>porsi[2][1]){ // pemilihan apabila nasi goreng adalah menu favorit hari Selasa
        System.out.print("Menu favorit pada hari Selasa adalah nasi goreng");
    } else if (porsi[1][1] > porsi[0][1] && porsi[1][1]>porsi[2][1]){ // pemilihan apabila soto adalah menu favorit hari Selasa
        System.out.print("Menu favorit pada hari Selasa adalah soto");
    } else if (porsi[2][1] > porsi[1][1] && porsi[2][1]>porsi[0][1]){ // pemilihan apabila sate adalah menu favorit hari Selasa
        System.out.print("Menu favorit pada hari Selasa adalah sate");
    }
    
}

static void favoritJumat(){ // deklarasi fungsi favoritJumat
    if(porsi[0][4] > porsi[1][4] && porsi[0][4]>porsi[2][4]){ // pemilihan apabila nasi goreng adalah menu favorit hari Jumat
        System.out.print("Menu favorit pada hari Jumat adalah nasi goreng");
    } else if (porsi[1][4] > porsi[0][4] && porsi[1][4]>porsi[2][4]){ // pemilihan apabila soto adalah menu favorit hari Jumat
        System.out.print("Menu favorit pada hari Jumat adalah soto");
    } else if (porsi[2][4] > porsi[1][4] && porsi[2][4]>porsi[0][4]){ // pemilihan apabila sate adalah menu favorit hari Jumat
        System.out.print("Menu favorit pada hari Jumat adalah sate");
    }
    
}

static void pemasukanDanTotal(){ // deklarasi fungsi pemasukkanDanTotal
    double total;
    double total1=0;
    double total2=0;
    double total3=0;
    // deklarasi variabel
    for(int i=0; i<porsi[0].length; i++){ // perulangan untuk menghitung total porsi nasi goreng
        total1+=porsi[0][i];
    }
    for(int i=0; i<porsi[1].length; i++){ // perulangan untuk menghitung total porsi soto
        total2+=porsi[1][i];
    }
    for(int i=0; i<porsi[2].length; i++){ // perulangan untuk menghitung total porsi sate
        total3+=porsi[2][i];
    }
    total=(total1*20000)+(total2*15000)+(total3*25000); // operasi untuk menghitung total pemasukkan
    System.out.println("Total porsi nasi goreng adalah "+total1);
    System.out.println("Total porsi soto adalah "+total2);
    System.out.println("Total porsi sate adalah "+total3);
    System.out.print("Total pemasukan ialah Rp "+total);
}


favoritSelasa(); // memanggil menu favorit hari Selasa
System.out.println(); // menampilkan menu favorit hari Selasa
favoritJumat(); // memanggil menu favorit hari Jumat
System.out.println(); // menampilka menu hari Jumat
pemasukanDanTotal(); // memanggil dan menampilkan fungsi pemasukkanDanTotal
```

    Menu favorit pada hari Selasa adalah soto
    Menu favorit pada hari Jumat adalah nasi goreng
    Total porsi nasi goreng adalah 164.0
    Total porsi soto adalah 143.0
    Total porsi sate adalah 128.0
    Total pemasukan ialah Rp 8625000.0

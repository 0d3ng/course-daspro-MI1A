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
static void beriSalam(){  //membuat fungsi void beriSalam
    System.out.println("Halo! Selamat Pagi"); //perintah dalam fungsi beriSalam yang akan dieksekusi 
}

beriSalam(); //pemanggilan fungsi beriSalam
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam(){ 
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan){ //membuat fungsi void beriUcapan dengan parameter bertipe String bernama ucapan
    System.out.println(ucapan); //perintah dalam fungsi beriUcapan yang akan dieksekusi
}

beriSalam();
String salam = "Selamat datang di pemrograman Java"; //pengisian parameter bertipe String bernama salam
beriUcapan(salam); //pemanggilan fungsi beriUcapan dengan parameter salam yang sudah dibuat
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

#### Jawab
1. Fungsi beriSalam tidak berparameter, sedangkan fungsi beriUcapan berparameter. Selain itu statement dalam kedua fungsi tersebut juga berbeda

2. Pemanggilan fungsi tanpa parameter dilakukan secara langsung dengan nama fungsinya, sedangkan pemanggilan fungsi berparameter harus didului dengan memberi nilai parameter


### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
static int luasPersegi(int sisi){ //membuat fungsi luasPersegi bertipe interger
    int luas = sisi*sisi; //proses menghitung nilai variabel luas
    return luas; //mengembalikan nilai output ke variabel luas
}

int luasan = luasPersegi(5); //nilai variabel luasan diisi dengan pemanggilan fungsi luasPersegi dengan parameter 5
System.out.println("Luas persegi dengan sisi 5 = " + luasan); 
```

    Luas persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

#### Jawab
1. Karena nama variabel luas sudah dideklarasikan dalam fungsi luasPersegi dan hanya bisa diakses dalam fungsi tersebut
2. Untuk mengembalikan nilai dalam variabel luas agar dapat diolah pada proses berikutnya

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 3
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

static int luasPersegi(int sisi){
    int luas = sisi*sisi;
    return luas;
}
System.out.print("Masukkan panjang sisi: ");
int x = sc.nextInt(); //inputan panjang sisi dimasukkan dalam variabel x

int luasan = luasPersegi(x); //memanggil fungsi luasPersegi dengan parameter nilai dalam variabel x
System.out.printf("Luas persegi dengan sisi %d = %d", x, luasan);
```

    Masukkan panjang sisi: 6
    Luas persegi dengan sisi 6 = 36




    java.io.PrintStream@755e41bf



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
static int Kali(int C, int D){ //membuat fungsi Kali bertipe int berparameter int C dan int D
    int H; //deklarasi variabel lokal H bertipe int 
    H = (C+10) % (D+19); 
    return H; //mengembalikan output nilai ke variabel H
}

static int Kurang(int A, int B){ //membuat fungsi Kurang bertipe int berparameter int A dan int B
    int X;//deklarasi variabel lokal X bertipe int
    A = A+7;
    B = B+4;
    X = Kali(A, B); //memanggil fungsi Kali dengan parameter A dan B
    return X; //mengembalikan output nilai ke variabel X
}

import java.util.Scanner; //import Scanner

int nilai1, nilai2;
Scanner sc = new Scanner(System.in); //deklrasi Scanner
System.out.print("Masukkan nilai 1: ");
nilai1 = sc.nextInt(); //memasukkan nilai inputan ke variabel nilai1
System.out.print("Masukkan nilai 2: ");
nilai2 = sc.nextInt(); //memasukkan nilai inputan ke variabel nilai2
int hasil = Kurang(nilai1, nilai2); //mengisi variabel hasil dengan memanggil fungsi Kurang dengan parameter nilai1 dan nilai2
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 5
    Masukkan nilai 2: 3
    Hasil akhir adalah 22


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    C = C+10;
    D = D+19;
    H = Kurang(C, D);
    return H;
}

static int Kurang(int A, int B){
    int X;
    X = (A+7) - (B+4);
    return X;
}

import java.util.Scanner;

int nilai1, nilai2;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai 1: ");
nilai1 = sc.nextInt();
System.out.print("Masukkan nilai 2: ");
nilai2 = sc.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 5
    Masukkan nilai 2: 8
    Hasil akhir adalah -9


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

#### Jawab - Alur Program Percobaan 3
1. input nilai 1 kemudian inputan dimasukkan ke dalam variabel nilai1
2. input nilai 2 kemudian inputan dimasukkan ke dalam variabel nilai2
3. memproses variabel hasil dengan memanggil fungsi Kurang dengan parameter nilai1 dan nilai2
4. dalam fungsi Kurang, nilai1 ditampung dalam int A dan nilai 2 ditampung dalam variabel int B, kemudian diproses dalam fungsi Kurang
5. output fungsi Kurang dikembalikan ke variabel X yaitu pemanggilan fungsi Kali dengan parameter A dan B
6. dalam fungsi Kali, variabel A ditampung dalam variabel C dan variabel B ditampung dalam variabel D, kemudian diproses dalam fungsi Kali
7. output fungsi Kali dikembalikkan ke variabel H yang kemudian menjadi nilai dalam variabel hasil

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
import java.util.Scanner; //import Scanner
Scanner sc = new Scanner(System.in); //deklarasi Scanner

int p,l,t,L,vol; //deklarasi variabel

System.out.println("Masukkan panjang");
p = sc.nextInt(); //memasukkan nilai inputan ke variabel p
System.out.println("Masukkan lebar");
l = sc.nextInt(); //memasukkan nilai inputan ke variabel l
System.out.println("Masukkan tinggi");
t = sc.nextInt(); //memasukkan nilai inputan ke variabel t

L=p*l; //memproses variabel L dengan mengalikan p dan l
System.out.println("Luas persegi panjang adalah "+L);

vol=p*l*t; //memproses variabel vol dengan mengalikan p,l,dan t
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang
    3
    Masukkan lebar
    4
    Masukkan tinggi
    5
    Luas persegi panjang adalah 12
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
static int hitungLuas (int pjg, int lb){ //membuat fungsi hitungLuas bertipe int berparameter int pjg dan int lb
    int Luas=pjg*lb; //deklarasi variabel Luas dan mengisinya dengan mengalikan parameter pjg dan lb
    return Luas; //mengembalikan nilai output ke variabel Luas
}

static int hitungVolume (int tinggi, int a, int b){ //membuat fungsi hitungVolume bertipe int berparameter int tinggi, int a, int b
    int volume = hitungLuas(a,b)*tinggi; //deklarasi variabel volume dan mengisi dengan memanggil fungsi hitungLuas dikalikan nilai dalam variabel tinggi
    return volume; //mengembalikan nilai output ke variabel volume
}

Scanner sc = new Scanner(System.in);
int p,l,t,L,vol;
System.out.println("Masukkan panjang");
p = sc.nextInt();
System.out.println("Masukkan lebar");
l = sc.nextInt();
System.out.println("Masukkan tinggi");
t = sc.nextInt();

L=hitungLuas(p,l); //memanggil fungsi hitungLuas dengan parameter p dan l
System.out.println("Luas persegi panjang adalah "+L);

vol=hitungVolume(t,p,l); //memanggil fungsi hitungVolume dengan parameter t,p,dan l
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang
    3
    Masukkan lebar
    4
    Masukkan tinggi
    5
    Luas persegi panjang adalah 12
    Volume balok adalah 60


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

#### Jawab
1. Sebagai tempat penampung untuk nilai inputan panjang, lebar, dan tinggi yang akan diolah dalam fungsi
2. Lebih efisien menggunakan fungsi karena kita hanya perlu memanggil fungsi tersebut untuk melaksanakan suatu perintah dan jika perintahnya dilakukan berulang kali tidak perlu mengetikkan kode berulang kali

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
static int total = 0,i; //deklarasi variabel global total bertipe int bernilai 0,i

static int [] isiarray (int angka){ //membuat fungsi isiarray bertipe int berparameter int angka
    Scanner sc = new Scanner(System.in); //deklarasi Scanner
    int array[] = new int [angka]; //inisialisasi array dengan jumlah elemen dari nilai dalam variabel angka
    for (i=0; i<array.length; i++){ //perulangan untuk menginput isi elemen array
        System.out.println("Masukkan data ke-"+i);
        array[i]=sc.nextInt(); //memasukkan inputan ke dalam array
    }
    return array; //mengembalikan nilai output ke variabel array
}

static void tampilArray(int [] arr){ //membuat fungsi void tampilArray berparameter int arr 
    for (i=0; i<arr.length; i++){ //perulangan untuk mencetak semua elemen array
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr){ //membuat fungsi hitTot bertipe int berparameter int arr 
    for (i=0; i<arr.length; i++){ //perulangan untuk menjumlahkan semua elemen array dan dimasukkan ke dalam variabel total
        total+=arr[i];
    }
    return total; //mengembalikan nilai output ke variabel total 
}

import java.util.Scanner; //import Scanner
Scanner sc = new Scanner(System.in); //deklarasi Scanner

System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = sc.nextInt(); //inputan dimasukkan dalam variabel jum
int []dataArray = isiarray(jum); //mengisi elemen array dataArray dengan memanggil fungsi isiarray dengan parameter jum
tampilArray(dataArray); //menampiilkan elemen array dengan memanggil fungsi tampilarray dengan parameter dataArray
total = hitTot(dataArray); //memberi nilai dalam variabel total dengan memanggil fungsi hitTot dengan parameter dataArray
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 4
    Masukkan data ke-0
    7
    Masukkan data ke-1
    9
    Masukkan data ke-2
    3
    Masukkan data ke-3
    6
    Nilai yang anda inputkan ke 0
    7
    Nilai yang anda inputkan ke 1
    9
    Nilai yang anda inputkan ke 2
    3
    Nilai yang anda inputkan ke 3
    6
    Total nilai = 25


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

#### Jawab
1. Karena fungsi tampilArray tidak memerlukan return, sedangkan isiArray dan hitTot memerlukan return agar nilai output dapat diolah ke proses berikutnya

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2

// Fungsi isiarray dan hitTot tidak dapat diganti dengan tipe void karena nantinya output nilai array dan total tidak dapat diolah ke proses selanjutnya
static int total = 0,i;

static void [] isiarray (int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int [angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke-"+i);
        array[i]=sc.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = sc.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = "+total);
```


    |   static void [] isiarray (int angka){

    illegal start of expression

    

    |   static void [] isiarray (int angka){

    ';' expected

    

    |   static void [] isiarray (int angka){

    '.class' expected

    

    |   static void [] isiarray (int angka){

    ';' expected

    

    |   static void [] isiarray (int angka){

    unexpected type

      required: value

      found:    class

    

    |       int array[] = new int [angka];

    cannot find symbol

      symbol:   variable angka

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int a, int b, int c){ //membuat fungsi Max3 bertipe int berparameter int a, int b, int c
    int max = 0; //deklarasi variabel lokal int max bernilai 0
    if(a>b && a>c){ //pencarian bilangan terbesar dengan membandingkan antarbilangan yang kemudian nilai dimasukkan ke variabel max
        max = a;
    } else if(b>c && b>a){
        max =b;
    } else {
        max = c;
    }
    return max; //mengembalikan nilai output ke variabel max 
}

import java.util.Scanner;
Scanner sc =new Scanner(System.in);
System.out.print("Bilangan 1: ");
int bil1 = sc.nextInt();
System.out.print("Bilangan 2: ");
int bil2 = sc.nextInt();
System.out.print("Bilangan 3: ");
int bil3 = sc.nextInt();
System.out.print("Bilangan terbesar yaitu "+Max3(bil1, bil2, bil3));
```

    Bilangan 1: 6
    Bilangan 2: 9
    Bilangan 3: 9
    Bilangan terbesar yaitu 9

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int[][] porsi = {
    {20, 15, 35, 24, 70},
    {30, 40, 10, 28, 35},
    {5, 10, 50, 48, 15} //inisialisasi array porsi
};
String[] menu = {"Nasi goreng", "Soto", "Sate"}; //inisialisasi array menu

static int Favorit(int hari){ //membuat fungsi Favorit bertipe int berparameter int hari
    int terbanyak = 0;
    int indeks = 0; //deklarasi variabel terbanyak dan indeks bertipe interger bernilai 0
    for(int i=0; i<porsi.length; i++){ //outer loop untuk mengakses baris dalam array porsi
        for(int j=0; j<porsi[0].length; j++){ //inner loop untuk mengakses kolom dalam array porsi
            if(porsi[i][hari] > terbanyak){ //memeriksa setiap elemen dalam kolom berdasarkan indeks hari 
                terbanyak = porsi[i][hari]; //menyimpan output ke dalam variabel terbanyak
                indeks = i; //menyimpan indeks porsi yang terbanyak
            }
        }
    }
    return indeks; //mengembalikan nilai output ke variabel indeks
}

static int Pemasukan(){ //membuat fungsi Pemasukan bertipe int tanpa parameter
    int nasgor = 0, soto = 0, sate = 0; //deklarasi variabel dan pemberian nilai 0
    for(int i=0; i<porsi.length; i++){ 
        for(int j=0; j<porsi[0].length; j++){
            if(i == 0){
                nasgor += porsi[i][j]*20000; //semua elemen baris 0 dikalikan 20000
            } else if(i == 1){
                soto += porsi[i][j]*15000; //semua elemen baris 1 dikalikan 15000
            } else {
                sate += porsi[i][j]*25000; //semua elemen baris 2 dikalikan 25000
            }
        }
    }
    int total = nasgor+soto+sate; 
    return total; //mengembalikan nilai output ke variabel total 
}

static int Terjual(int indeksMenu){ //membuat fungsi Terjual bertipe int berparameter int indeksMenu
    int jumlah = 0;
    for(int i=0; i<porsi[0].length; i++){
        jumlah += porsi[indeksMenu][i]; //memberi nilai pada variabel jumlah dengan menjumlahkan semua elemen di baris sesuai indeks per menu
    }
    return jumlah; //mengembalikan nilai output ke variabel jumlah
}

int selasa = Favorit(1); //pemanggilan fungsi Favorit dengan parameter 1
System.out.println("Menu favorit pada hari Selasa yaitu "+ menu[selasa]);
int jumat = Favorit(4); //pemanggilan fungsi Favorit dengan parameter 4
System.out.println("Menu favorit pada hari Jumat yaitu "+menu[jumat]);

int masuk = Pemasukan(); //pemanggilan fungsi Pemasukan
System.out.println("Pemasukan mulai hari Senin sampai Jumat sebesar Rp "+masuk);

int pNasgor = Terjual(0); //pemanggilan fungsi Terjual dengan parameter 0
System.out.println("Nasi goreng terjual sebanyak "+pNasgor+" porsi");
int pSoto = Terjual(1); //pemanggilan fungsi Terjual dengan parameter 1
System.out.println("Soto terjual sebanyak "+pSoto+" porsi");
int pSate = Terjual(2); //pemanggilan fungsi Terjual dengan parameter 2
System.out.println("Sate terjual sebanyak "+pSate+" porsi");
```

    Menu favorit pada hari Selasa yaitu Soto
    Menu favorit pada hari Jumat yaitu Nasi goreng
    Pemasukan mulai hari Senin sampai Jumat sebesar Rp 8625000
    Nasi goreng terjual sebanyak 164 porsi
    Soto terjual sebanyak 143 porsi
    Sate terjual sebanyak 128 porsi


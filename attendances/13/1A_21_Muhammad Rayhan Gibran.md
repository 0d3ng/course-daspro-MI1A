# JOBSHEET 13. Fungsi 1

## Tujuan

- Mahasiswa mampu memahami penggunaan fungsi static pada Java dengan parameter dan mengembalikan nilai.
- Mahasiswa mampu membuat program menggunakan fungsi static dan mengeksekusi fungsi tersebut.

## Alat dan Bahan

- PC/Laptop
- Browser
- Koneksi internet
- Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Fungsi Void (tidak menggunakan return value)

1. Buat fungsi **beriSalam** bertipe void yang digunakan untuk mencetak **“Halo! Selamat Pagi”**.
   ![Gambar 1](images/1.1.png)

2. Eksekusi atau panggil fungsi **beriSalam**.
   ![Gambar 2](images/1.2.png)

```Java
// Tuliskan kode program Percobaan 1 Langkah 1 & 2
 static void berisalam() {
     System.out.println("Halo! Selamat Pagi");
 }
     berisalam();
```

    Halo! Selamat Pagi

> kode diatas berisi pendeklarasian fungsi yang yang jika dipanggil maka akan mencetak kata "Halo! Selamat Pagi"

3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
   ![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
   ![Gambar 3](images/1.4.png)

```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
 static void berisalam() {
     System.out.println("Halo! Selamat Pagi");
 }
 static void beriUcapan(String ucapan) {
     System.out.println(ucapan);
 }
     berisalam();
     String salam = "Selamat datang di pemrograman java";
     beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman java

> Kode diatas berisi fungsi yang tidak berparameter dan yang berparameter, fungsi yang berparameter memiliki tipe data string dan jika dipanggil maka akan mencetak kata dari isi variabel yang telah dimasukkan ke fungsi beriUcapan

#### Pertanyaan

1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

> 1. fungsi beriSalam berisi perintah mencetak kata 'Halo! Selamat Pagi' sedangkan fungsi beriUcapan berisi perintah untuk mencetak kata yang dimasukkan ke dalam parameter fungsi beriUcapan.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

> cara pemanggilan sebuah fungsi void tanpa berparamater yaitu dengan mengetikkan nama fungsi void yang ditambah dengan tanda dua kurung (' ( ) ') contoh dari pemanggilan nya seperti dibawah ini

```Java
 static void berisalam() {
     System.out.println("Halo! Selamat Pagi");
 }
     berisalam(); /*seperti barisi ini*/
```

    Halo! Selamat Pagi

> cara pemanggilan sebuah fungsi void berparameter adalah dengan memasukkan tipe data yang akan dieksekusi ke dalam nama fungsi void yang berparameter contohnya seperti dibawah ini

```Java
 static void berisalam() {
     System.out.println("Halo! Selamat Pagi");
 }
 static void beriUcapan(String ucapan) { /* fungsi */
     System.out.println(ucapan); /* perintah yang akan dilakukan kepada tipe data yang dimasukkan ke dalam fungsi beriUcapan*/
 }
     berisalam();
     String salam = "Selamat datang di pemrograman java"; /* mendeklarasikan sebuah tipe data yang akan dieksekusi */
     beriUcapan(salam); /* Memasukkan tipe data yang akan dieksekusi ke dalam nama fungsi void berparameter yang telah dibuat sebelumnya */

```

    Halo! Selamat Pagi
    Selamat datang di pemrograman java

### Percobaan 2: Fungsi dengan return value (Bukan void)

Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.

1. Buat fungsi **luasPersegi** untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
   ![Gambar 4](images/2.1.png)

2. Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
   ![Gambar 5](images/2.2.png)

```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
 static int LuasPersegi(int sisi) {
     int luas = sisi * sisi;
     return luas;
 }

     int Luasan = LuasPersegi(5);
     System.out.println("Luas Persegi dengan sisi 5 = " + Luasan);
```

    Luas Persegi dengan sisi 5 = 25

> Kode diatas berisi pendeklarasian fungsi berparameter yang bertipe int yang berisi operasi perhitungan luas.

#### Pertanyaan

1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

> Karena fungsi LuasPersegi hanya berisi operasi yang akan dijalakan tidak ada angka yang akan dieksekusi di dalam fungsi ini, pendeklarasian variabel baru Luasan digunakan untuk mengisi variabel atau angka yang akan dieksekusi di dalam fungsi operasi perhitungan luas.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

> Kegunaan return luas adalah untuk mengembalikan/memasukkan hasil operasi atau hasil eksekusi fungsi yang telah dilakukan kedalam variabel luas.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!

```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int LuasPersegi(int sisi) {
     int luas = sisi * sisi;
     return luas;
 }

     Scanner sc = new Scanner(System.in);
     System.out.print("Masukkan sisi persegi : ");
     int Luasan = sc.nextInt();
     Luasan =  LuasPersegi(Luasan);
     System.out.println("Luas Persegi : " + Luasan);
```

    Masukkan sisi persegi : 5
    Luas Persegi : 25

> Kode diatas berisi pendeklarasian fungsi berparameter yang bernama LuasPersegi bertipe int yang berisi operasi perhitungan luas persegi lalu user diminta untuk menginput angka,dan angka tersbut akan dimasukkan kedalam fungsi LuasPersegi, setelalh itu hasil dari operasi akan dicetak.

### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain

Pada Percobaan 3, kode program yang dibuat digunakan untuk mengimplementasikan bahwa fungsi dapat meng-CALL fungsi yang lain. Dimana dalam percobaan ini terdapat fungsi **Kali dan Kurang**.

1. Buatlah fungsi **Kali** yang mengembalikan nilai H (int) dan parameter masukan C dan D (int).
   ![Gambar 9](images/3.1.png)

2. Buatlah fungsi **Kurang** yang mengembalikan nilai X (int) dan parameter masukan A dan B (int) dan memanggil fungsi Kali.
   ![Gambar 10](images/3.2.png)

3. Lakukan import class Scanner sebagai inputan di langkah selajutnya.

4. Eksekusi atau panggil fungsi **Kurang** .
   ![Gambar 11](images/3.4.png)

```Java
import java.util.Scanner;

static int kali(int angka1, int angka2) {
     int hasil = (angka1 + 10) % (angka2 + 19);
     return hasil;
 }
static int kurang(int angka1, int angka2) {
    angka1 = angka1 + 7;
    angka2 = angka2 + 4;
     int hasil = kali(angka1, angka2);
     return hasil;
 }
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai 1 : ");
    int nilai1 = input.nextInt();
    System.out.print("Masukkan nilai 2 : ");
    int nilai2 = input.nextInt();
    int hasil = kurang(nilai1, nilai2);
    System.out.println("Hasil akhir adalah : " + hasil);

```

    Masukkan nilai 1 : 4
    Masukkan nilai 2 : 5
    Hasil akhir adalah : 21

> Kode diatas berisi pendeklarasian fungsi berparameter yang bernama 'kali' bertipe integer yang berisi suatu operasi matematika, selain itu ada pendeklarasian fungsi berparameter yang bernama 'kurang' bertipe integer yang berisi suatu operasi matematika, kemudian user diminta untuk memasukkan dua nilai kemudian angka yang telah dimasukkan tadi dimasukkan ke dalam fungsi 'kurang' didalam fungsi ini terdapat perintah memanggil fungsi'kali' setelah diproses di fungsi kali maka akan hasil akhir dikembalikan ke variabel hasil dan yang terakhir sistem kan mencetak hasil akhir tersebut.

#### Pertanyaan

1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali

```Java
import java.util.Scanner;
static int kali(int angka1, int angka2) {
     angka1 = angka1 * 4;
     angka2 = angka2 *2;
     int hasilA = kurang(angka1, angka2);
     return hasilA;
 }
static int kurang(int angka1, int angka2) {
    angka1 = angka1 + 7;
    angka2 = angka2 + 4;
    int hasilB = angka1 * angka2;
    return hasilB;
 }
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai 1 : ");
    int nilai1 = input.nextInt();
    System.out.print("Masukkan nilai 2 : ");
    int nilai2 = input.nextInt();
    int hasil = kali(nilai1, nilai2);
    System.out.println("Hasil akhir adalah : " + hasil);
```

    Masukkan nilai 1 : 4
    Masukkan nilai 2 : 3
    Hasil akhir adalah : 230

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

> Kode diatas berisi pendeklarasian fungsi berparameter yang bernama 'kali' bertipe integer yang berisi suatu operasi matematika, selain itu ada pendeklarasian fungsi berparameter yang bernama 'kurang' bertipe integer yang berisi suatu operasi matematika, kemudian user diminta untuk memasukkan dua nilai kemudian angka yang telah dimasukkan tadi dimasukkan ke dalam fungsi 'kali' di fungsi ini nilai pertama dikali 4 sedangkan nilai ke 2 dikali 2 setelah itu terdapat perintah memanggil fungsi 'kurang' difungsi ini nilai pertama ditambah 7 sedangkan nilai ke 2 ditambah 4 setelah itu nilai pertama dikali nilai kedua setelah diproses di fungsi kali maka akan hasil akhir dikembalikan ke variabel hasil dan yang terakhir sistem kan mencetak hasil akhir tersebut.

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

System.out.print("Masukkan Panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar   : ");
l = input.nextInt();
System.out.print("Masukkan tinggi  : ");
t = input.nextInt();

L = p*l;
System.out.println("Luas Persegi Panjang Adalah : "+L);
vol = p*l*t;
System.out.println("Volume Balok Adalah "+vol);
```

    Masukkan Panjang : 3
    Masukkan lebar   : 4
    Masukkan tinggi  : 5
    Luas Persegi Panjang Adalah : 12
    Volume Balok Adalah 60

> Program diatas berisi pendeklarasian variabel p,l,t,L,vol sebagai tipe data integer selanjutnya user diminta untuk memasukkan angka ke variabel p,l,t selanjutnya variabel L didapat dari perkalian variabel p dikali l sedangkan variabel vol di dapat dari perkalian p,l,t selanjutnya variabel L dan vol di cetak

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)

5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)

```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas (int pjg, int lb){
    int luas = pjg * lb;
    return luas;
    }
static int hitungVolume (int tinggi, int a, int b){
    int volume = hitungLuas(a,b)*tinggi;
    return volume;
    }

Scanner input = new Scanner(System.in);
int p,l,t,L,vol;
System.out.print("Masukkan Panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar   : ");
l = input.nextInt();
System.out.print("Masukkan tinggi  : ");
t = input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang Adalah : "+L);
vol = hitungVolume(t,p,l);
System.out.println("Volume Balok Adalah "+vol);
```

    Masukkan Panjang : 3
    Masukkan lebar   : 4
    Masukkan tinggi  : 5
    Luas Persegi Panjang Adalah : 12
    Volume Balok Adalah 60

> Kode diatas berisi pendeklarasian fungsi hitungLuas yang berisi operasi perhitungan persegi panjang bertipe int, pendeklarasian hitungVolume yang berisi operasi perhitungan volume selanjunya pendeklarasian variabel p,l,t,L,vol sebagai tipe data integer selanjutnya user diminta untuk memasukkan angka ke variabel p,l,t selanjutnya variabel p,l dimasukkan ke fungsi 'hitungLuas' hasil operasi dikembalikan ke variabel pemanggil yaitu variabel L selanjutnya variabel t,p,l dimasukkan ke dalam fungsi 'hitungVolume' fungsi ini mengambil hasil fungsi 'hitungluas' dan dikalikan degan variabel t, hasil akhir akan dikembalikan ke variabel pemanggil yaitu vol lalu dicetak.

#### Pertanyaan

1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

> Parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume digunakan untuk menampung nilai untuk diproses di dalam fungsi tersebut parameter berperan sebagai input untuk fungsi.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

> karena percobaan 4 operasi perhitunganya sedkit maka lebih efisien tanpa fungsi, program fungsi dapat lebih efisien ketika digunakan pada program yang memiliki operasi perhitungan yang banyak.

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
    int array[]= new int[angka];
    for (i=0; i<array.length; i++){
        System.out.printf("Masukkan data ke-%d : ",i);
        array[i] = input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.printf("Nilai yang anda inputkan ke-%d : ",i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner (System.in);

System.out.print("Masukkn jumlah data yang ingin anda inginkan : ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkn jumlah data yang ingin anda inginkan : 4
    Masukkan data ke-0 : 3
    Masukkan data ke-1 : 4
    Masukkan data ke-2 : 5
    Masukkan data ke-3 : 5
    Nilai yang anda inputkan ke-0 : 3
    Nilai yang anda inputkan ke-1 : 4
    Nilai yang anda inputkan ke-2 : 5
    Nilai yang anda inputkan ke-3 : 5
    Total nilai = 17

> Kode diatas berisi pendeklarasian vriabel total sebagai int, pendeklarasian fungsi yang bernama isiarray yang berisi program untuk menginput data ke dalam array, pendeklarasian fungsi yang bernama tampil array yang berisi program perulangan untuk mencetak data array yang diambil dati fungsi 'isiarray', pendeklarasian fungsi yang bernama tampilArray yang berisi perulangan untuk menjumlahkan semua isi data array, pendeklarasian array yang bernama data array, pemanggilan ketiga fungsi tersebut dan yang terakhir menampilkan total penjumlahan dari semua data array

##### Pertanyaan

1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

> Karena fungsi tampil aray tidak perlu "return" atau pengembali nilai untuk diolah pada proses berikutnya sedangkan fungsi isi array dan fungsi hiTot membutuhkan "return" atau pengembali nilai untuk diolah diolah pada proses berikutnya.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

// Tuliskan jawaban nomor 2

> tidak bisa

```Java
static int total = 0,i;

static void int [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array[]= new int[angka];
    for (i=0; i<array.length; i++){
        System.out.printf("Masukkan data ke-%d : ",i);
        array[i] = input.nextInt();
    }
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.printf("Nilai yang anda inputkan ke-%d : ",i);
        System.out.println(arr[i]);
    }
}

static void int hitTot(int []arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
}

import java.util.Scanner;
Scanner input = new Scanner (System.in);

System.out.print("Masukkn jumlah data yang ingin anda inginkan : ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    |   static void int [] isiarray (int angka){

    illegal start of expression



    |   static void int [] isiarray (int angka){

    ';' expected



    |   static void int [] isiarray (int angka){

    ';' expected



    |   static void int [] isiarray (int angka){

    ';' expected



    |       int array[]= new int[angka];

    variable angka might not have been initialized

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut.

```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner (System.in);

int terbesar = 0;

static int Max3(int bil1, int bil2, int bil3){
    for(int j=0; j<3; j++){
    if(bil1>terbesar){
    terbesar = bil1;
        }
    if(bil2>terbesar){
    terbesar = bil2;
        }
    if(bil3>terbesar){
    terbesar = bil3;
        }
    }
    return terbesar;
}

System.out.print("Masukkan angka pertama : ");
int a = input.nextInt();
System.out.print("Masukkan angka kedua   : ");
int b = input.nextInt();
System.out.print("Masukkan angka ketiga  : ");
int c = input.nextInt();
terbesar = Max3(a,b,c);
System.out.println("Angka yang terbesar adalah : " + terbesar);
```

    Masukkan angka pertama : 11
    Masukkan angka kedua   : 23
    Masukkan angka ketiga  : 144
    Angka yang terbesar adalah : 144

> Kode diatas berisi : pendeklarasian variabel global 'terbesar' sebagai integer dan bernilai 0, fungsi yang bernama 'max3' yang bertipe int di fungsi ini terdapat program untuk mencari nilai yang terbesar dari angka yang dimasukkan user dengan menggunakan perulangan for yang didalamnya ada kondisi dimana bilangan terbesar dari ketiga angka yang dimasukkan angka menggantikan isi variabel 'terbesar' setealh itu output akan dikembalikan ke variabel yang meng-call fungsi ini, user diminta memasukkan 3 angka yang akan dimasukkan ke variabel (a,b,c), setelah itu memanggil fungsi 'max3' tadi dan variabel (a,b,c) mengisi fungsi tersebut setealh akan dicetak.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
   ![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:

- Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
- Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
- Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.

```Java
// Tuliskan jawaban nomor 2
static int i;
String hari []= {"Seninn", "Selasa", "Rabuuu", "Kamiss", "Jumatt", "Sabtuu","Minggu"};
String menu []= {"Nasi Goreng", "Soto", "Sate"};
int max1 = 0, max2 = 0, jml1=0, jml2=0, jml3=0, byk1, byk2, byk3;
String laris1,laris2,loop;
long hsl1=0, hsl2=0, hsl3=0, total=0;

static int [][] isiarray (int angka1, int angka2){
    Scanner input = new Scanner (System.in);
    int array[][]= new int[angka1][angka2];
    for (i=0; i<array.length; i++){
         for(int j=0; j< array[0].length; j++){
         System.out.print("Masukkan banyak porsi penjualan " + menu[i] +" Hari " + hari[j]);
         System.out.print(" : ");
         array[i][j] = input.nextInt();
        }
  }
    return array;
}

static String fav1(int [][] arr){
    for (i=0; i<arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
             if(j == 1 && arr[i][j] > max1){
             max1 = arr[i][j];
             laris1 = menu[i];
            }
        }
    }
    return laris1;
}

static String fav2(int [][] arr){
    for (i=0; i<arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
             if(j == 4 && arr[i][j] > max2){
             max2 = arr[i][j];
             laris2 = menu[i];
            }
        }
    }
    return laris2;
}

static long total1(int [][]arr){
    for (i=0; i<arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
        if (i==0){
            jml1 += arr[i][j];
            hsl1 = 20000 * jml1;
          }
        if (i==1){
            jml2 += arr[i][j];
            hsl2 = 15000 * jml2;
          }
        if (i==2){
            jml3 += arr[i][j];
            hsl3 = 25000 * jml3;
          }
        total = hsl1 + hsl2 + hsl3;
        }
    }
    return total;
}

static void banyak(int [][]arr){
    for (i=0; i<arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
        if (i==0){
            byk1 += arr[i][j];
          }
        if (i==1){
            byk2 += arr[i][j];
          }
        if (i==2){
            byk3 += arr[i][j];
          }

        }
    }
}
import java.util.Scanner;
Scanner input = new Scanner (System.in);
for(int y=0 ; ;y++){
System.out.print("Masukkan banyak hari : ");
int kolom = input.nextInt();
int [][]dataArray = isiarray(3, kolom);
String data1 = fav1(dataArray);
System.out.println("\nMakanan Favorit Pada hari selasa adalah "+data1);
String data2 = fav2(dataArray);
System.out.println("Makanan Favorit Pada hari jum'at adalah "+data2);
total = total1(dataArray);
System.out.println("\nTotal penjualan makanan dari hari senin sampai jum'at adalah : Rp."+total);
System.out.println("Total penjualan Nasi Goreng dari hari senin sampai jum'at adalah : Rp."+hsl1);
System.out.println("Total penjualan Soto dari hari senin sampai jum'at adalah : Rp."+hsl2);
System.out.println("Total penjualan Sate dari hari senin sampai jum'at adalah : Rp."+hsl3);
banyak(dataArray);
System.out.printf("\nTotal porsi penjualan Nasi Goreng dari hari senin sampai jum'at adalah : %d Porsi\n",byk1);
System.out.printf("Total porsi penjualan Soto dari hari senin sampai jum'at adalah : %d Porsi\n",byk2);
System.out.printf("Total porsi penjualan Sate dari hari senin sampai jum'at adalah : %d Porsi\n",byk3);

System.out.print("Anda mau mengitung lagi ?(YA/TIDAK) : ");
loop = input.nextLine();
loop = input.nextLine();
    if(loop.equalsIgnoreCase ("YA")){
    System.out.println("OKE SIAP ♥♥♥");
    }
    if(loop.equalsIgnoreCase ("TIDAK")){
    System.out.println("Terima Kasih Telah Menggunakan Program ini ♥♥♥");
    break;
    }
}
```

    Masukkan banyak hari : 5
    Masukkan banyak porsi penjualan Nasi Goreng Hari Seninn : 20
    Masukkan banyak porsi penjualan Nasi Goreng Hari Selasa : 15
    Masukkan banyak porsi penjualan Nasi Goreng Hari Rabuuu : 35
    Masukkan banyak porsi penjualan Nasi Goreng Hari Kamiss : 24
    Masukkan banyak porsi penjualan Nasi Goreng Hari Jumatt : 70
    Masukkan banyak porsi penjualan Soto Hari Seninn : 30
    Masukkan banyak porsi penjualan Soto Hari Selasa : 40
    Masukkan banyak porsi penjualan Soto Hari Rabuuu : 10
    Masukkan banyak porsi penjualan Soto Hari Kamiss : 28
    Masukkan banyak porsi penjualan Soto Hari Jumatt : 35
    Masukkan banyak porsi penjualan Sate Hari Seninn : 5
    Masukkan banyak porsi penjualan Sate Hari Selasa : 10
    Masukkan banyak porsi penjualan Sate Hari Rabuuu : 50
    Masukkan banyak porsi penjualan Sate Hari Kamiss : 48
    Masukkan banyak porsi penjualan Sate Hari Jumatt : 15

    Makanan Favorit Pada hari selasa adalah Soto
    Makanan Favorit Pada hari jum'at adalah Nasi Goreng

    Total penjualan makanan dari hari senin sampai jum'at adalah : Rp.8625000
    Total penjualan Nasi Goreng dari hari senin sampai jum'at adalah : Rp.3280000
    Total penjualan Soto dari hari senin sampai jum'at adalah : Rp.2145000
    Total penjualan Sate dari hari senin sampai jum'at adalah : Rp.3200000

    Total porsi penjualan Nasi Goreng dari hari senin sampai jum'at adalah : 164 Porsi
    Total porsi penjualan Soto dari hari senin sampai jum'at adalah : 143 Porsi
    Total porsi penjualan Sate dari hari senin sampai jum'at adalah : 128 Porsi
    Anda mau mengitung lagi ?(YA/TIDAK) : tidak
    Terima Kasih Telah Menggunakan Program ini ♥♥♥

> Kode diatas berisi : pendeklarasian variabel yang akan dibutuhkan pada fungsi dan main, fungsi pertama berisi program untuk mendeklarsikan array yang banyak kolomnya ditentukan oleh user (maksimal 7, karena dalam satu minggu ada 7 hari) selain itu ada program untuk mengisi data ke dalam array, difungsi kedua berisi program untuk mencari menu makanan yang laris di hari selasa, difungsi ketiga berisi program untuk mencari menu makanan yang laris di hari jumat, difungsi 4 berisi program untuk menghitung seluruh penghasilan makanan dari hari senin sampai jumat, difungsi kelima berisi program untuk mencari total porsi yang laku, pada bagian main, user diminta memasukkan data penjualan makanan setelah itu meng-call fungsi pertama dan dicetak, setelah itu meng-call fungsi kedua dan dicetak,setelah itu meng-call fungsi ketiga dan dicetak,setelah itu meng-call fungsi keempat dan dicetak,setelah itu meng-call fungsi kelima dan dicetak.

```Java

```

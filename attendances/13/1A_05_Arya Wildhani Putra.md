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

static void beriSalam(){ // tanpa parameter 
   System.out.println("Halo! Selamat Pagi");
}
static void beriUcapan(String ucapan){ // dengan parameter 
   System.out.println(ucapan);
}

    beriSalam();
    String salam = "Selamat datang di pemograman Java";
    beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di pemograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

fungsi pada beriSalam tidak terdapat parameter sedangkan pada beriUcapan terdapat parameter berupa String ucapan yang dapat memberikan output jika dipanggil. 

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

pemanggilan sebuah fungsi void tanpa parameter hanya menuliskan nama fungsinya saja tidak dengan isi yang akan ditampilkan, sedangkan pemanggilan yang berparameter perlu menuliskan nama fungsi disertai isi dari outputan.

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
    System.out.println("Luas Persegi dengan sisi 5 = "  + luasan);
```

    Luas Persegi dengan sisi 5 = 25

#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan? karena fungsitersebut akan mengeluarkan nilai yang telah diproses, variabel luasan digunakan untuk menyimpan hasil dari fungsi tersebut

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas! digunakan untuk memanggil nilai dari proses yang telah dilalui oleh kode tersebut

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2

int sisi;
Scanner input = new Scanner (System.in);

System.out.println("Masukkan Jumlah Sisi:  ");
sisi=input.nextInt(); .. // variabel penyimpan nilai input

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

int hasil = luasPersegi(sisi); // nilai dari inputan diatas digunakan sebagai parameter fungsi luasPersegi
System.out.println("Hasil akhir adalah " + hasil); // output hasil
```

    Masukkan Jumlah Sisi:  
    3
    Hasil akhir adalah 9


#### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain
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

static int Kali (int C, int D) {
    int H;
    H = (C + 10 ) % (D + 19);
    return H; // mengembalikan nilai H
}
static int Kurang(int A, int B){
    int X;
    A = A + 7;
    B = B = 4;
    X = Kali(A, B);// ketika selesai dijalankan, maka hasil dari fungsi tersebut akan masuk ke X
    return X;// mengembalikan nilai X
}

int nilai1, nilai2;
Scanner input = new Scanner (System.in);

System.out.println("Masukkan Nilai 1 : ");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2 : ");
nilai2=input.nextInt();

int hasil = Kurang(nilai1, nilai2); // variabel input akan menjadi nilai parameter
System.out.println("Hasil akhir adalah " + hasil);

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
System.out.println("Hasil akhir adalah " + hasil); // Output hasil akhir
```

    Masukkan Nilai 1:
    8
    Masukkan Nilai 2:
    9
    Hasil akhir adalah -7


#### 2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!
dilihat dari hasil yang dibawah, nilai1 dan nilai2 dimasukkan pada int kurang yaitu pada int A dan int B, kemudian diproses dengan ! ditambah dengan 7 dan B ditambah dengan 4, lalu di oper ke int kali, yaitu A menjadi C dan B menjadi D lalu di proses sehingga dengan C ditambah 10 dan D ditambah 19 lalu dimodulus, dimana hasil yang pertama lebih kecil maka itu adalah hasilnya, juika tidak makan akan dikurangi.

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
Scanner input = new Scanner (System.in);

int p, l, t, L, vol;

System.out.println ("Masukkan panjang");
p=input.nextInt ();
System.out.println ("Masukkan lebar");
l=input.nextInt ();
System.out.println ("Masukkan tinggi");
t=input.nextInt ();

L=p*l;
System.out.println ("Luas Persegi panjang adalah "+L);

vol=p*l*t;
System.out.println ("Volume balok adalah "+vol);
```

    Masukkan panjang
    4
    Masukkan lebar
    5
    Masukkan tinggi
    6
    Luas Persegi panjang adalah 20
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
    int Luas = pjg*lb;
    return Luas;
}
static int hitungVolume (int tinggi, int a, int b) {
    int volume= hitungLuas (a,b) *tinggi;
    return volume;
}   
Scanner input = new Scanner (System.in);
int p,l,t,L, vol;
System.out.println ("Masukkan panjang");
p=input.nextInt ();
System.out.println ("Masukkan lebar");
l=input.nextInt ();
System.out.println ("Masukkan tinggi");
t=input.nextInt ();

L=hitungLuas (p,l);
System.out.println ("Luas Persegi Panjang adalah "+L);
vol=hitungVolume (t,p,l);
System.out.println ("Volume Balok adalah "+vol);
```

    Masukkan panjang
    3
    Masukkan lebar
    4
    Masukkan tinggi
    5
    Luas Persegi Panjang adalah 12
    Volume Balok adalah 60


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume! kegunaanya yaitu untuk menampung data atau nilai yang akan di imput oleh keyboard lalu akan diproses

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan! ada kekurangan dan kelebihanya, kalau dilihat keberapa simple dari kode programnya, kode yang tidak menggunakan fungsi terlihat lebih simple namun kedepanya kalau ditambah lagi mungkin akan rumit, sedangkan kode program dengan fungsi memang terlihat rumit dan sulit untuk dicerna, namun kelebihanya ada pada fleksibilitas dimana akan lebih mudah untuk kedepanya jika ada lagi yang akan ditambahkan didalamnya.

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
static int total=0,i; // deklarasi variabel global

static int[] isiarray (int angka) {
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
static int hitTot(int []arr) {
    for(i = 0; i <arr.length; i++){
        total += arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum); // Output dari fungsi isi array
tampilArray(dataArray);
total = hitTot(dataArray); // hasil 
System.out.println("Total nilai = " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    2
    Masukkan data ke-0
    3
    Masukkan data ke-1
    4
    Nilai yang anda inputkan ke 0
    2
    Nilai yang anda inputkan ke 1
    3
    Total nilai = 7    
   

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int! karena tampil array tidak mengembalikan nilai, sedangkan yang lain mengembalikan nilai

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program! tidak bisa karena fungsi tersebut mengembalikkan sebuah nilai atau memiliki return
```Java
// Tuliskan jawaban nomor 2

static int total=0,i;

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

static int Max3(int A, int B, int C){ // deklarasi
    int max = 0;
        if(A>B && A>C){ // kode untuk mencari nilai terbesar
            max = A;
        }else if(B>A && B>C){
            max = B;
        } else{
            max = C;
        }
    return max; // mengembalikan nilai max
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil1,bil2,bil3,max;
System.out.print("angka 1 = ");
bil1=sc.nextInt();
System.out.print("angka 2 = ");
bil2=sc.nextInt();
System.out.print("angka 3 = ");
bil3=sc.nextInt();

max=Max3(bil1,bil2,bil3); //panggilan untuk max3
System.out.print("Nilai Terbesar adalah = "+ max)
```

    angka 1 = 42
    angka 2 = 421
    angka 3 = 444
    Nilai Terbesar adalah = 444

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2

String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"}; // header hari
String menu[] = {"Nasi goreng", "Soto", "Sate"}; // header menu
int porsi[][]=  {{20,15,35,24,70},{30,40,10,28,35},{5,10,50,48,15}};

static void favSel(){
    if(porsi[0][1] > porsi[1][1] && porsi[0][1]>porsi[2][1]){ // kode fungsi untuk mengetahui fav di hari selasa
        System.out.print("Menu favorit pada hari Selasa adalah Nasi goreng");
        
    } else if (porsi[1][1] > porsi[0][1] && porsi[1][1]>porsi[2][1]){
        System.out.print("Menu favorit pada hari Selasa adalah Soto");
        
    } else if (porsi[2][1] > porsi[1][1] && porsi[2][1]>porsi[0][1]){
        System.out.print("Menu favorit pada hari Selasa adalah Sate");
        
    }
    
}

static void favJum(){
    
    if(porsi[0][4] > porsi[1][4] && porsi[0][4]>porsi[2][4]){ // kode fungsi untuk mengetahui fav di hari jum at
        System.out.print("Menu favorit pada hari Jumat adalah Nasi goreng");
        
    } else if (porsi[1][4] > porsi[0][4] && porsi[1][4]>porsi[2][4]){
        System.out.print("Menu favorit pada hari Jumat adalah Soto");
        
    } else if (porsi[2][4] > porsi[1][4] && porsi[2][4]>porsi[0][4]){
        System.out.print("Menu favorit pada hari Jumat adalah Sate");
    }
    
}

static void pemTot(){ 
    double total;
    double total1=0;
    double total2=0;
    double total3=0;
    for(int i=0; i<porsi[0].length; i++){
        //pengecekan masing masing
        total1+=porsi[0][i];
    }
    
    for(int i=0; i<porsi[1].length; i++){
        
        total2+=porsi[1][i];
    }
    
    for(int i=0; i<porsi[2].length; i++){
        
        total3+=porsi[2][i];
    }
    
    total=(total1*20000)+(total2*15000)+(total3*25000);
    System.out.println("Total Nasi Goreng adalah "+total1);
    System.out.println("Total Soto adalah "+total2);
    System.out.println("Total Sate adalah "+total3);
    System.out.print("Total Pemasukan sejumlah Rp"+total);
}
//pemanggilan fungsi
favSel(); // untuk hari selasa
System.out.println();
favJum(); // untuk hari jumat
System.out.println();
pemTot(); // keluaran untuk total
    
```
    Menu favorit pada hari Selasa adalah Soto
    Menu favorit pada hari Jumat adalah Nasi goreng
    Total Nasi Goreng adalah 164.0
    Total Soto adalah 143.0
    Total Sate adalah 128.0
    Total Pemasukan sejumlah Rp8625000.0

```Java

```

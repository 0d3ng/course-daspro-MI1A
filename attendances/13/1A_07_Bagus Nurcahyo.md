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

static void beriSalam(){//Membuat fungsi
    System.out.println("Halo, Selamat Pagi");//keluarang dari fungsi
}

beriSalam();//memanggil keluaran fungsi lewat static
```

    Halo, Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4

static void beriSalam(){//membuat fungsi beriSalam yang menampung outputan "Halo, sugeng enjing"
    System.out.println("Halo, Sugeng enjing");
}

static void beriUcapan(String ucapan){//membuat fungsi bertipe String yang menampung outputan ucapan
    System.out.println(ucapan);
}

beriSalam();//menampilkan outputan dari beriSalam 
String sapa = "Matur Nuwun";//membuat variabel sapa yang berisikan "Matur Nuwun"
beriUcapan(sapa);//Menampilkan variabel sapa 
```

    Halo, Sugeng enjing
    Matur Nuwun


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

- fungsi beriSalam adalah fungsi yang tidak berparameter karena didalam kurung tersebut kosong
- fungsi beriUcapan adalah fungsi yang tidak berparameter karena didalam kurung terdapat variabel 

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

- fungsi void yang berparameter : static void Makan(String tempe){}
- fungsi void yang tanpa berparameter : static void Menyendok(){}

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2

static int luasPersegi(int sisi){//Membuat fungsi yang tanpa menggunakan void yang berparameter int sisi
    int luas;//membuat variabel 
    return luas = sisi * sisi;//Mengembalikan fungsike variabel luasPersegi
}

int luasan = luasPersegi(5);//mengisi nilai variabel luasPersegi yaitu 5
System.out.println("Luas persegi dengan sisi 5 adalah "+luasan);//menampilkan hasil return
```

    Luas persegi dengan sisi 5 adalah 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Karena fungsi luasPersegi adalah fungsi dengan nilai balik 

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

mengembalikan nilai yang ditampung yakni luas sama dengan sisi dikali sisi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2

//membuat deklarasi Scanner
import java.util.Scanner;
Scanner in = new Scanner(System.in);

//membuat fungsi sebagai acuan perhitungan luas
static int luasPersegi(int sisi){
    int luas;
    return luas = sisi * sisi;
}

//Meminta inputan keyboard dengan int panjangSisi
System.out.println("Masukkan panjang sisi ");
int panjangSisi = in.nextInt();

//Menampilkan hasil perhitungan dari luarPersegi tadi
int luasan = luasPersegi(panjangSisi);
System.out.println("Luas persegi dengan sisi "+panjangSisi+" adalah "+luasan);//kalau pakai javac ada printstreamnya pak
```

    Masukkan panjang sisi 
    5
    Luas persegi dengan sisi 5 adalah 25


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

//membuat fungsi Kali yang terdapat return (fungsi yang tidak ada void)
static int Kali(int C, int D){
    int H;
    H = (C+10) % (D+19);
    return H;
}

//membuat fungsi Kurang yang terdapat return (fungsi yang tidak ada void)
static int Kurang(int A, int B){
    int X;
    A = A+7;
    B = B+4;
    X = Kali(A,B);
    return X;
}

//Membuat deklarasi Scanner
import java.util.Scanner;
Scanner in = new Scanner (System.in);

int nilai1, nilai2;//Membuat variabel nilai
System.out.print("Masukkan nilai 1 : ");
nilai1=in.nextInt();// Meminta inputan dari keyboard untuk memasukkan nilai 1

System.out.print("Masukkan nilai 2 : ");
nilai2=in.nextInt();// Meminta inputan dari keyboard untuk memasukkan nilai 2

int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah "+hasil);//Menampilkan hasil dari fungsi int Kurang
```

    Masukkan nilai 1 : 5
    Masukkan nilai 2 : 5
    Hasil akhir adalah 22


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali

DURUNG
```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    H = (C+10)%(D+19);
    return H;
}

static int Kurang(int A, int B){
    int X;
    A=A+7;
    B=B+4;
    X=Kali(A,B);
    return X;
}

import java.util.Scanner;
Scanner in = new Scanner(System.in);

System.out.print("Masukkan nilai 1 : ");
int nilai1=in.nextInt();

System.out.print("Masukkan nilai 2 : ");
int nilai2=in.nextInt();

int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah "+hasil);
```

    Masukkan nilai 1 : 5
    Masukkan nilai 2 : 5
    Hasil akhir adalah 22



2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

//membuat fungsi Kali yang terdapat return (fungsi yang tidak ada void)
static int Kali(int C, int D){
    int H;
    H = (C+10) % (D+19);
    return H;
}

//membuat fungsi Kurang yang terdapat return (fungsi yang tidak ada void)
static int Kurang(int A, int B){
    int X;
    A = A+7;
    B = B+4;
    X = Kali(A,B);
    return X;
}

//Membuat deklarasi Scanner
import java.util.Scanner;
Scanner in = new Scanner (System.in);

int nilai1, nilai2;//Membuat variabel nilai
System.out.print("Masukkan nilai 1 : ");
nilai1=in.nextInt();// Meminta inputan dari keyboard untuk memasukkan nilai 1

System.out.print("Masukkan nilai 2 : ");
nilai2=in.nextInt();// Meminta inputan dari keyboard untuk memasukkan nilai 2

int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah "+hasil);//Menampilkan hasil dari fungsi int Kurang




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

//Deklarasi Scanner
import java.util.Scanner;
Scanner in = new Scanner(System.in);

//membuat variable integer
int p,l,t,L,vol;

//meminta inputan dari keyboard 
System.out.println("Masukkan panjang ");
p=in.nextInt();
System.out.println("Masukkan lebar ");
l=in.nextInt();
System.out.println("Masukkan tinggi ");
t=in.nextInt();

L=p*l;//lebar sama dengan p dikali l
System.out.println("Luas persegi panjang adalah "+L);//menampilkan ke layar hasil dari p dikali l
vol=p*l*t;//volume sama dengan p dikali l dikali t
System.out.println("Volume balok "+vol);//Menampilkan ke layar hasil vol=p*l*t
```

    Masukkan panjang 
    5
    Masukkan lebar 
    5
    Masukkan tinggi 
    5
    Luas persegi panjang adalah 25
    Volume balok 125


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3

//membuat deklarasi fungsi dengan nilai balik
static int hitungLuas(int pjg, int lbr){
    int Luas=pjg*lbr;//membuat variabel Luas yang berisi panjang dikali lebar
    return Luas;
}

//membuat deklarasi fungsi dengan nilai baik
static int hitungVolume(int tinggi, int a, int b){
    int volume=hitungLuas(a,b)*tinggi;//membuat variabel volume yang berisi hitungLuas
    return volume;
}

Scanner in = new Scanner(System.in);//deklarasi Scanner

int p,l,t,L,vol;//Membuat variabel

//Meminta user untuk menginput dari keyboard
System.out.println("Masukkan panjang ");
p=in.nextInt();
System.out.println("Masukkan lebar ");
l=in.nextInt();
System.out.println("Masukkan tinggi ");
t=in.nextInt();

//Menghitung hitungLuas
L=hitungLuas(p,l);
System.out.println("Luas persegi panjang adalah "+L);//Menampilkan hasil dari perhitungan hitungLuas
vol=hitungVolume(t,p,l);
System.out.println("Volume Balok adalah "+vol);//menampilkan hsil hitung hitungVolume
```

    Masukkan panjang 
    5
    Masukkan lebar 
    5
    Masukkan tinggi 
    5
    Luas persegi panjang adalah 25
    Volume Balok adalah 125


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Sebagai acuan fungsi yang berupa sejenis variabel 

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Tanpa fungsi, karena jika tidak menggunakan fungsi maka akan lebih simple karena langsung menghitung serta mendeklarasikannya


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
static int total=0,i;

static int [] isiarray (int angka){
    Scanner in = new Scanner(System.in);
    int array [] = new int[angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke-"+i+": ");
        array[i]=in.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke-"+i+": ");
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr ){
    for(i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner in = new Scanner (System.in);

System.out.println("Masukkan jumlah data yang anda inputkan: ");
int jum=in.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang anda inputkan: 4
    Masukkan data ke-0: 12
    Masukkan data ke-1: 4
    Masukkan data ke-2: 5
    Masukkan data ke-3: 56
    Nilai yang anda inputkan ke-0: 12
    Nilai yang anda inputkan ke-1: 4 
    Nilai yang anda inputkan ke-2: 5 
    Nilai yang anda inputkan ke-3: 56
    Total nilai = 77



#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena tidak mengembalikan nilai apapun setelah dieksekusi, sedangkan isiarray dan hitTot karena method tersebut mengembalikan suatu nilai setelah dieksekusi

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2

//Tidak bisa, karena method void tidak mengembalikan nilai apapun setelah dieksekusi

static int total=0,i;

static void [] isiarray (int angka){
    Scanner in = new Scanner(System.in);
    int array [] = new int[angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke-"+i+": ");
        array[i]=in.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke-"+i+": ");
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr ){
    for(i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner in = new Scanner (System.in);

System.out.println("Masukkan jumlah data yang anda inputkan: ");
int jum=in.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    zz.java:6: error: <identifier> expected
    static void [] isiarray (int angka){
           ^
    zz.java:6: error: '(' expected
    static void [] isiarray (int angka){
            ^
    zz.java:6: error: invalid method declaration; return type required
    static void [] isiarray (int angka){
               ^
    3 errors



## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1

//membuat fungsi yang berparameter, yang menjumlahkan bilangan yang diinputkan
static int jumlah(int a, int b){
    int hasil = a + b;
    return hasil;
}

Scanner in = new Scanner(System.in);//deklarasi scanner
int bil1, bil2, bil3;//membuat variabel

//meminta inputan dari keyboard
System.out.print("Masukkan bilangan 1 : ");
bil1=in.nextInt();
System.out.print("Masukkan bilangan 2 : ");
bil2=in.nextInt();
System.out.print("Masukkan bilangan 3 : ");
bil3=in.nextInt();

System.out.println();//enter

//Melakukan penjumlahan dari bilangan yang diinputkan melalui fungsi
System.out.println("Jumlah bilangan 1 dan bilangan 2 = " + (jumlah(bil1,bil2)) );
System.out.println("Jumlah bilangan 2 dan bilangan 3 = " + (jumlah(bil2,bil3)) );
System.out.println("Jumlah bilangan 1 dan bilangan 3 = " + (jumlah(bil1,bil3)) );

//Menentukan nilai max dari ketiga bilangan dengan mengkombinasikan if else dan fungsi
if( (jumlah(bil1,bil2))>=(jumlah(bil2,bil3)) ){
    System.out.println("Nilai max dari ketiga bilangan tersebut adalah "+(jumlah(bil1,bil2)));
}else if( (jumlah(bil2,bil3))>=bil3 ){
    System.out.println("Nilai max dari ketiga bilangan tersebut adalah "+(jumlah(bil2,bil3)));
}else{
    System.out.println("Nilai max dari ketiga bilangan tersebut adalah "+(jumlah(bil1,bil3)));
}
```

    Masukkan bilangan 1 : 45
    Masukkan bilangan 2 : 65
    Masukkan bilangan 3 : 77

    Jumlah bilangan 1 dan bilangan 2 = 110
    Jumlah bilangan 2 dan bilangan 3 = 142
    Jumlah bilangan 1 dan bilangan 3 = 122
    Nilai max dari ketiga bilangan tersebut adalah 142



2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2

//fungsi untuk menampilkan menu favorit selasa rabu
static void makanan(){

    //membuat variabel menu mengguankan string
    String menu1 = "Nasi Goreng";
    String menu2 = "Soto";
    String menu3 = "Sate";
    System.out.printf("Menu favorit di hari Selasa dan Jumat adalah %s dan %s \n",menu2,menu1);//menampilkan ke layar kode program

}

//fungsi untuk menghitung pemasukan restoran mulai hari senin sampai jumat
static void porsi(){

    //membuat variabel mengguanakan array 1 dimensi
    int porsi1[] = {20,15,35,24,70};//nasgor
    int porsi2[] = {30,40,10,28,35};//soto
    int porsi3[] = {5,10,50,48,15};//sate

    //menghitung beberapa array yang disimpan ke dalam variabel
    int pemasukanNasGor = (porsi1[0] + porsi1[1] + porsi1[2] + porsi1[3] + porsi1[4]) * 20000;
    int pemasukanSoto = (porsi2[0] + porsi2[1] + porsi2[2] + porsi2[3] + porsi2[4]) * 15000;
    int pemasukanSate = (porsi3[0] + porsi3[1] + porsi3[2] + porsi3[3] + porsi3[4]) * 25000;
    int pemasukanTotal = pemasukanNasGor + pemasukanSoto + pemasukanSate;
    System.out.println("Pemasukan restoran dari Senin sampai Jumat = Rp."+pemasukanTotal);//menampilkan ke layar penghitungan yang dibuat
}

//fungsi untuk menghitung porsi yang terjual untuk masing masing menu
static void porsiTerjual(){
    //membuat variabel menggunakan array 1 dimensi
    int porsi1[] = {20,15,35,24,70};//nasgor
    int porsi2[] = {30,40,10,28,35};//soto
    int porsi3[] = {5,10,50,48,15};//sate

    //menghitung penjualan tiap hari yang disimpan dalam variabel
    int terjualSenin = porsi1[0] + porsi2[0] + porsi3[0];
    int terjualSelasa = porsi1[1] + porsi2[1] + porsi3[1];
    int terjualRabu = porsi1[2] + porsi2[2] + porsi3[2];
    int terjualKamis = porsi1[3] + porsi2[3] + porsi3[3];
    int terjualJumat = porsi1[4] + porsi2[4] + porsi3[4];

    //menampilkan hasil perhitungan penjualan tiap hari
    System.out.printf("Porsi yang terjual pada hari Senin sebanyak %d porsi\n",terjualSenin);
    System.out.printf("Porsi yang terjual pada hari Selasa sebanyak %d porsi\n",terjualSelasa);
    System.out.printf("Porsi yang terjual pada hari Rabu sebanyak %d porsi\n",terjualRabu);
    System.out.printf("Porsi yang terjual pada hari Kamis sebanyak %d porsi\n",terjualKamis);
    System.out.printf("Porsi yang terjual pada hari Jumat sebanyak %d porsi",terjualJumat);
}

//public static void main(String[] args)
    makanan();
    porsi();
    System.out.println("\n"+"====Porsi yang terjual untuk masing-masing menu dari hari Senin sampai Jumat====");
    porsiTerjual();

```

    Menu favorit di hari Selasa dan Jumat adalah Soto dan Nasi Goreng 
    Pemasukan restoran dari Senin sampai Jumat = Rp.8625000

    ====Porsi yang terjual untuk masing-masing menu dari hari Senin sampai Jumat====
    Porsi yang terjual pada hari Senin sebanyak 55 porsi 
    Porsi yang terjual pada hari Selasa sebanyak 65 porsi
    Porsi yang terjual pada hari Rabu sebanyak 95 porsi  
    Porsi yang terjual pada hari Kamis sebanyak 100 porsi
    Porsi yang terjual pada hari Jumat sebanyak 120 porsi



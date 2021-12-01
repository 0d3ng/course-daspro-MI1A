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
static void beriSalam(){
    System.out.println("Halo Selamat Pagi");
}
static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}

    beriSalam();
    String salam = "Selamat datang di pemrograman Java";
    beriUcapan(salam);
```

    Halo Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!
   
      fungsi **beriSalam** adalah untuk mengeluarkan / memanggil "Halo! Selamat Pagi" 
    
    sedangkan fungsi **beriUcapan** adalah untuk mengeluarkan "Selamat datang di pemrograman Java"
   

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

   
       cara memanggil fungsi void yang berparameter adalah dengan menambahkan 
 
    beriUcapan(salam);
    
    cara memanggil fungsi tanpa parameter adalah dengan mengetikkan beriSalam(); agar "Halo selamat pagi" bisa keluar

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
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

karena untuk memanggil fungsi berparameter sehingga diperlukan membuat variable baru

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

untuk mengembalikan nilai pada fungsi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor  
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
int sisi;
System.out.println("Masukkan sisi");
sisi=sc.nextInt();
int luasan = luasPersegi(sisi);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Masukkan sisi
    5
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
static int Kali(int C, int D) {
    int H;
    H = (C + 10) % (D + 19);
    return H;
}
 
static int Kurang(int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2=input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    10
    Masukkan Nilai 2:
    20
    Hasil akhir adalah 27


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    H = (C + 10) % (D + 19);
    H = Kurang(H, H);
    return H;
}

static int Kurang(int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = A - B;
    return X;
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);

```

    Masukkan Nilai 1: 
    10
    Masukkan Nilai 2: 
    20
    Hasil akhir adalah 3



```Java
// 2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

1. Menginput nilai 1 dan 2
2. deklarasikan variable hasil dengang fungsi kurang
3. fungsi kurang akan mengambil kali kurang lalu dikembalikan (return) ke fungsi kurang
4. mengeluarkan output yang merupakan hasil proses nilai 1 dan 2
```

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
Scanner in = new Scanner(System.in);

int p,l,t,L,vol;
System.out.println("Masukkan panjang");
p=in.nextInt();
System.out.println("Masukkan lebar");
l=in.nextInt();
System.out.println("Masukkan tinggi");
t=in.nextInt();

L=p*1;
System.out.println("Luas persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    5
    Masukkan tinggi
    15
    Luas persegi panjang adalah 10
    Volume balok adalah 750


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
    int Luas=pjg*lb;
    return Luas;
}
static int hitungVolume (int tinggi, int a, int b){
    int volume= hitungLuas(a,b)*tinggi;
    return volume;
}
Scanner input =new Scanner (System.in);
int p,l,t,L,vol;
System.out.println("Masukkan panjang");
p=in.nextInt();
System.out.println("Masukkan lebar");
l=in.nextInt();
System.out.println("Masukkan tinggi");
t=in.nextInt();

L=hitungLuas(p,1);
System.out.println("Luas Persegi Panjang adalah "+L);
vol=hitungVolume(p,l,t);
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan panjang
    20
    Masukkan lebar
    10
    Masukkan tinggi
    15
    Luas Persegi Panjang adalah 20
    Volume Balok adalah 3000


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

hitungLuas digunakan untuk menyimpan panjang dan lebar
hitungVOlume digunakan untuk menyinpan panjang, tinggi, dan lebar

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

memakai fungsi lebih efisien, karena dengan menggunakan fungsi dapat memanggil ulang suatu program tanpa harus mengetikkan kode panjang-panjang

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
    Scanner input = new Scanner (System.in);
    int array[]=new int[angka];
    for (i=0; i<array.length; i++){
    System.out.println("Masukkan data ke- "+i);
    array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
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
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: "); 
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    5
    Masukkan data ke- 0
    5
    Masukkan data ke- 1
    10
    Masukkan data ke- 2
    20
    Masukkan data ke- 3
    30
    Masukkan data ke- 4
    40
    Nilai yang anda inputkan ke 0
    5
    Nilai yang anda inputkan ke 1
    10
    Nilai yang anda inputkan ke 2
    20
    Nilai yang anda inputkan ke 3
    30
    Nilai yang anda inputkan ke 4
    40
    Total nilai = 105


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena fungsi tampil array tidak mengembalikan nilai apapun, sedangkan pada isiarray dan hittot mengembalikan nilai


2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
static int total=0,i;
static void [] isiarray (int angka){
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke-" + i);
        array[i] = input.nextInt();
    }
    return array;
} 
static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke " + i);
        System.out.println(arr[i]);
    }
}
static void hitTot(int [] arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total); 

// tidak bisa diubah ke void karena void tidak berisikan variabel, sementara pada isiarray dan hitTot memiliki variabel
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

    

    |       int array[] = new int[angka];

    cannot find symbol

      symbol:   variable angka

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1,int bil2,int bil3){
    int NilaiTertinggi = 0;
    if (bil1>bil2)NilaiTertinggi = bil1;
    else if (bil2>bil3)NilaiTertinggi = bil2;
    else if (bil3>bil1)NilaiTertinggi = bil3;
    return NilaiTertinggi;
}  
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil1, bil2, bil3, hasil;
System.out.print("bil 1 = ");
bil1=sc.nextInt();
System.out.print("bil 2 = ");
bil2=sc.nextInt();
System.out.print("bil 3 = ");
bil3=sc.nextInt();

hasil=Max3(bil1,bil2,bil3);
System.out.print("Nilai Terbesar adalah = "+ hasil);

```

    bil 1 = 10
    bil 2 = 20
    bil 3 = 30
    Nilai Terbesar adalah = 30

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int[][] menu = {{20,15,35,24,70}, 
                {30,40,10,28,35},
                {5,10,50,48,15}};
String[] namaMenu = {"Nasi Goreng", "Soto", "Sate"};
String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
static void menuFav(int favorit){
    int menuEnak = menu[0][favorit]; 
    int bykJual = 0; 
    for(int i = 0; i < menu.length; i++){ 
    if(menu[i][favorit] > menuEnak){ 
        menuEnak = menu[i][favorit]; 
        bykJual = i;  
    }
}System.out.printf("\nPorsi tertinggi di hari %s dengan jumlah %d porsi adalah %s", namaHari[bykJual], menuEnak, namaMenu[bykJual]);
}

static void pemasukan() {
    double total = 0;
    for(int i = 0; i < menu.length; i++) for(int j = 0; j < menu[0].length; j++) {
        if(i == 0) total += (menu[i][j] * 20000);
        else if(i == 1) total += (menu[i][j] * 15000);
        else if(i == 2) total += (menu[i][j] * 25000);
    }
     printf("\nTotal pemasukan restoran: Rp.%.2f", total);
}

static void jumlahPorsi(int porsiTerjual){ 
    int totalHitung = 0, jmlhPorsi = 0; 
    for(int j = 0; j<menu[0].length; j++){ 
            totalHitung += menu[porsiTerjual][j]; 
        }
    jmlhPorsi = totalHitung; 
    System.out.printf("\nPorsi yang terjual dari %s berjumlah %d porsi",namaMenu[porsiTerjual], jmlhPorsi); 
}

menuFav(1);
menuFav(4);

pemasukan();

jumlahPorsi(0);
jumlahPorsi(1);
jumlahPorsi(2);



```

    
    Porsi tertinggi di hari Selasa dengan jumlah 40 porsi adalah Soto
    Porsi tertinggi di hari Senin dengan jumlah 70 porsi adalah Nasi Goreng
    Total pemasukan restoran: Rp.8625000.00
    Porsi yang terjual dari Nasi Goreng berjumlah 164 porsi
    Porsi yang terjual dari Soto berjumlah 143 porsi
    Porsi yang terjual dari Sate berjumlah 128 porsi

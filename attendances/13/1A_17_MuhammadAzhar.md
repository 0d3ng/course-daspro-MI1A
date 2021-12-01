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
    System.out.println("Halo! Selamat Pagi!");
}

static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}
beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);
```

    Halo! Selamat Pagi!
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

fungsi beriSalam tidak menggunakan parameter sedangan fungsi beriUcapan menggunakan parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

menggunakan parameter: mengetik nama fungsi beserta parameter
tanpa parameter: langsung mengetik nama fungsi tanpa parameter


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

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

fungsi diatas untunk menghitung luas persegi. ketika sudah selesai proses, hasil akan dikembalikan. setelah itu, nilai yang sudah dikembalikan dimasukkan ke dalam variabel baru bernama luasan. Kemudian variabel luasan dipanggil untuk ditampilkan

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

untuk mengembalikan nilai luas

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
static int luasPersegi(int panjangSisi){
    int luas = panjangSisi * panjangSisi;
    return luas;
}

int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
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
static int Kali (int C, int D){
    int H;
    H = (C+10) % (D+19);
    return H;
}


static int Kurang (int A, int B){
    int X;
    A= A + 7;
    B= B + 4;
    X= Kali (A, B);
    return X;
}

int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1: 
    10
    Masukkan Nilai 2: 
    12
    Hasil akhir adalah 27


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kurang (int C, int D){
    int H;
    H = (C+10) % (D+19);
    return H;
}


static int Kali (int A, int B){
    int X;
    A= A + 7;
    B= B + 4;
    X= Kurang (A, B);
    return X;
}

int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1: 
    12
    Masukkan Nilai 2: 
    14
    Hasil akhir adalah 29


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

menampilkan output "Masukkan nilai 1 & 2" dan mengambil inputan menggunakan scanner. inputan disimpan ke dalam variabel nilai1 dan nilai2. Kemudian diproses di fungsi kurang. nilai1 menjadi variabel a + 7 dan nilai2 menjadi variabel b + 4. Setelah itu nilai di kembalikan. Kemudian di proses di fungsi kurang. variabel a menjadi c + 10 dan variabel b menjadi d + 19. Hasil keduanya di modulus dan nilainya dikemabilkan. Setelah data dikembalikan, ditampilkan 

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

System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

L = p*l;
System.out.println("Luas Persegi Panjang adalah "+L);

vol = p*l*t;
System.out.println("Volume balok adalah");
```

    Masukkan panjang
    10
    Masukkan lebar
    11
    Masukkan tinggi
    12
    Luas Persegi Panjang adalah 110
    Volume balok adalah


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pjg, int lb){
    int Luas=pjg*lb;
    return Luas;
}

static int hitungVolume(int tinggi, int a, int b){
    int volume=hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input = new Scanner (System.in);
int p,l,t,L,vol;
System.out.println("Masukkan panjang ");
p=input.nextInt();
System.out.println("Masukkan lebar ");
l=input.nextInt();
System.out.println("Masukkan tinggi ");
t=input.nextInt();

L=hitungLuas(p,l);
System.out.println("Luas persegi panjang adalah "+L);
vol=hitungVolume(t,p,l);
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang 
    10
    Masukkan lebar 
    11
    Masukkan tinggi 
    20
    Luas persegi panjang adalah 110
    Volume balok adalah 2200


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

untuk diinputkan ke dalam fungsi agar bisa diproses tersebut

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Lebih efisien menggunakan fungsi. Kita tidak perlu mengulang proses tetapi hanya memanggil fungsi tsb

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
static int total=0, i;
static int[] isiArray(int angka){
    Scanner input = new Scanner (System.in);
    int array[] = new int[angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
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
System.out.println("masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();
int []dataArray=isiArray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    masukkan jumlah data yang ingin anda inputkan : 
    10
    Masukkan data ke- 0
    11
    Masukkan data ke- 1
    12
    Masukkan data ke- 2
    13
    Masukkan data ke- 3
    14
    Masukkan data ke- 4
    15
    Masukkan data ke- 5
    16
    Masukkan data ke- 6
    17
    Masukkan data ke- 7
    19
    Masukkan data ke- 8
    10
    Masukkan data ke- 9
    20
    Nilai yang anda inputkan ke 0
    11
    Nilai yang anda inputkan ke 1
    12
    Nilai yang anda inputkan ke 2
    13
    Nilai yang anda inputkan ke 3
    14
    Nilai yang anda inputkan ke 4
    15
    Nilai yang anda inputkan ke 5
    16
    Nilai yang anda inputkan ke 6
    17
    Nilai yang anda inputkan ke 7
    19
    Nilai yang anda inputkan ke 8
    10
    Nilai yang anda inputkan ke 9
    20
    Total nilai = 147


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!
karena fungsi TampilArray hanya menampilkan saja sedangkan isiArray dan hitTot menyimpan nilai kemudian dikembalikan

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
// Tuliskan kode program Percobaan 4 Langkah 1 s/d 6
static int total=0, i;
static int[] isiArray(int angka){
    Scanner input = new Scanner (System.in);
    int array[] = new int[angka];
    for (i=0; i<array.length; i++){
        System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
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
Scanner input = new Scanner(System.in);
System.out.println("masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();
int []dataArray=isiArray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);

//Tidak bisa karea fungsi tersebut membutuhkan nilai yang bisa dikembalikan/return
```


    |       return total;

    incompatible types: unexpected return value

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1, int bil2, int bil3){
    int max=0;
    if(bil1>bil2 && bil1 > bil3){
        max=bil1;
    } else if(bil2>bil1 && bil2>bil3){
        max=bil2;
    } else if(bil3>bil1 && bil3>bil2){
        max=bil3;
    }
    return max;
}
int tertinggi=Max3(3,19,1);
System.out.print(tertinggi);
```

    19


```Java
//Penjelasan
Fungsi diatas digunakan untuk mencari nilai terbesar. Fungsi diatas adalah fungsi dengan return value. menuliskan tipe data int 
karena mengunakan angka, parameter bil1, bil2, bil3, untuk menyimpan nilai. kemudian mengisi variabel max dengan nilai 0. Setelah itu
dilakukan percabangan dengn kondisi diatas. Setelah itu mengembalikan nilai max. kemudian membuat variabel int untuk mengisi parameter 
fungsi diatas. Terakhir menampilkan fungsi diatas dengan variabel tertinggi
```

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

static void favSelasa(){
    if(porsi[0][1] > porsi[1][1] && porsi[0][1]>porsi[2][1]){
        System.out.print("Menu favorit pada hari Selasa adalah nasi goreng");
    } else if (porsi[1][1] > porsi[0][1] && porsi[1][1]>porsi[2][1]){
        System.out.print("Menu favorit pada hari Selasa adalah soto");
    } else if (porsi[2][1] > porsi[1][1] && porsi[2][1]>porsi[0][1]){
        System.out.print("Menu favorit pada hari Selasa adalah sate");
    }
    
}

static void favJumat(){
    if(porsi[0][4] > porsi[1][4] && porsi[0][4]>porsi[2][4]){
        System.out.print("Menu favorit pada hari Jumat adalah nasi goreng");
    } else if (porsi[1][4] > porsi[0][4] && porsi[1][4]>porsi[2][4]){
        System.out.print("Menu favorit pada hari Jumat adalah soto");
    } else if (porsi[2][4] > porsi[1][4] && porsi[2][4]>porsi[0][4]){
        System.out.print("Menu favorit pada hari Jumat adalah sate");
    }
    
}

static void pemasukanDanTotal(){
    double total;
    double total1=0;
    double total2=0;
    double total3=0;
    for(int i=0; i<porsi[0].length; i++){
        total1+=porsi[0][i];
    }
    for(int i=0; i<porsi[1].length; i++){
        total2+=porsi[1][i];
    }
    for(int i=0; i<porsi[2].length; i++){
        total3+=porsi[2][i];
    }
    total=(total1*20000)+(total2*15000)+(total3*25000);
    System.out.println("Total Nasi Goreng "+total1);
    System.out.println("Total Soto "+total2);
    System.out.println("Total Sate "+total3);
    System.out.print("Total pemasukan sejumlah Rp"+total);
}



favSelasa();
System.out.println();
favJumat();
System.out.println();
pemasukanDanTotal();
```

    Menu favorit pada hari Selasa adalah soto
    Menu favorit pada hari Jumat adalah nasi goreng
    Total Nasi Goreng 164.0
    Total Soto 143.0
    Total Sate 128.0
    Total pemasukan sejumlah Rp8625000.0


```Java
Pada program diatas, yang pertama membuat array untuk hari, menu dan porsi. Selanjutnya membuat fungsi void bernama favSelasa yang berfungi
untuk mengetahui menu favorit dihari selasa. Membuat fungsi void kedua bernama favJumat untuk mengetahui menu favorit dihari jumat.
Fungsi ketiga untuk menghitung pemasukan dan total. Terakhir memanggil semua fungsi untuk ditampilkan. saya menambahkan System.out.println tanpa
isi untuk memberi enter pada baris.
```


    |   Pada program diatas, yang pertama membuat array untuk hari, menu dan porsi. Selanjutnya membuat fungsi void bernama favSelasa yang berfungi

    ';' expected

    



```Java

```

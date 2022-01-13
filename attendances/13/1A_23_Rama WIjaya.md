# JOBSHEET 13. Fungsi 1

## Perbaikan
#### Nama   : Rama Wijaya
#### Kelas  : 1A
#### NIM    : 2131710107

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
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}

    beriSalam();
    String salam = "Selamat datang di pemrograman Java";
    beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

Jika fungsi beriSalam tidak menggunakan parameter di dalamnya, sedangkan fungsi beriUcapan menggunakan parameter untuk mendefinisikan nilai input, yang dimana parameter fungsi beriUcapan bertipe String.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

- Cara pemanggilan sebuah fungsi void yang berparameter:

namaFungsi(input nilai sesuai parameter);
- Cara pemanggilan sebuah fungsi void yang tidak berparameter:

public static void main(String[]args){namaFungsi();}

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

Ketika memanggil fungsi luasPersegi harus membuat variabel luasan karena variabel int luasan berfungsi untuk menampung hasil dari fungsi luasPersegi dengan menginputkan sisi pada parameter yaitu sisi = 5.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return luas berfungsi untuk mengembalikan nilai int luas, pernyataan di atas merupakan fungsi dengan kata kunci static int dan terdapat pernyataan return.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
    int sisi, L;
    System.out.print("Masukkan panjang sisi: ");
    sisi= sc.nextInt();
    L = luasPersegi(sisi);
    System.out.println("Luas Persegi adalah "+L);// Tuliskan jawaban nomor 2
```

    Masukkan panjang sisi: 5
    Luas Persegi adalah 25


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
static int Kali(int C, int D){
    int H;
    H = (C + 10) % (D + 19);
        return H;
}
static int Kurang(int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1:");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    4
    Masukkan Nilai 2:
    5
    Hasil akhir adalah 21


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    C = C + 10;
    D = D + 19;
    H = Kurang (C, D);    
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
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1:");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    10
    Masukkan Nilai 2:
    2
    Hasil akhir adalah 2


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

User diminta untuk menginputkan nilai 1 dan 2. Input ini berfungsi sebagai parameter fungsi kurang. Pada fungsi ini, nilai 1 akan ditambah dengan 7 dan niai 2 akan ditambah dengan 4. Setelah itu, hasil penambahan tersebut digunakan sebagai parameter fungsi kali. Kemudian pada fungsi ini dilakukan perhitungan (C + 10) % (D + 19);. C dan D merupakan hasil input yang dilakukan penambahan nilai pada fungsi kurang. Setelah itu, terdapat output hasil akhir.

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

System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L=p*l;
System.out.println("Luas Persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    5
    Masukkan tinggi
    4
    Luas Persegi panjang adalah 50
    Volume balok adalah 200


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int  hitungLuas (int pjg, int lb){
    int Luas = pjg*lb;
    return Luas;
}
static int hitungVolume(int tinggi, int a, int b){
    int volume = hitungLuas(a,b)*tinggi;
    return volume;
}
Scanner input = new Scanner(System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah "+L);
vol = hitungVolume(t,p,l);
System.out.println("Volume balok adalah " +vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    20
    Masukkan tinggi
    4
    Luas Persegi Panjang adalah 200
    Volume balok adalah 800


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Kegunaan parameter yang terdapat didalam fungsi hitungLuas yaitu sebagai variabel penampung untuk nilai inputan fungsi hitungLuas dan hitungVolume. Sehingga kita dapat memanggil fungsi tersebut dengan nilai yang berbeda. 

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Menurut saya program yang lebih efisien adalah yang menggunakan fungsi, karena perhitungannya dapat dipanggil berkali-kali dengan nilai yang berbeda-beda.

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

static int hitTot(int []arr ){
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
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    2
    Masukkan data ke- 0
    10
    Masukkan data ke- 1
    30
    Nilai yang anda inputkan ke 0
    10
    Nilai yang anda inputkan ke 1
    30
    Total nilai = 40


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Karena pada fungsi tampil array tidak memerlukan pengembalian nilai yang menggunakan perintah return. Sehingga fungsi tersebut bertipe array. Sedangkan pada fungsi isiarray dan hitTot bertipe data int karena bertujuan untuk mengembalikan suatu nilai bertipe int sehingga menggunakan perintah return.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

Fungsi isiarray dan hitTot bisa diganti dengan tipe void dengan menghapus perintah return total dan diganti dengan perintah untuk menampilkan variabel total. Kemudian perintah return array pada fungsi isiarray dihapus dan parameter angka diganti dengan array. Pada akhir program dicall isiarray(dataArray).


```Java
// Tuliskan jawaban nomor 2
static int total=0,i;
static void isiarray (int[] array){
    Scanner input = new Scanner (System.in);

    for (i=0; i<array.length; i++){
    System.out.println("Masukkan data ke- "+i);
    array[i]=input.nextInt();
    }
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr ){
    for (i=0; i<arr.length; i++){
            total+=arr[i];
    }
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int []dataArray=new int[jum];
isiarray(dataArray);
tampilArray(dataArray);
hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    2
    Masukkan data ke- 0
    1
    Masukkan data ke- 1
    2
    Nilai yang anda inputkan ke 0
    1
    Nilai yang anda inputkan ke 1
    2
    Total nilai = 3


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;

static int Max3(int a, int b, int c){
    int key = 0;
    
    if(a > b && a > c){
        key = a;
    }else if(b > a && b > c){
        key = b;
    }else if(c > a && c > b){
        key = c;
    }else if(a == b){
        key = a;
    }else if(a == c){
        key = a;
    }else if(b == c){
        key = b;
    }
    return key;
}


Scanner sc = new Scanner(System.in);
int bil1, bil2, bil3, terbesar;

    System.out.println("=========== Program Identifikasi Bilangan Terbesar ==========");
    System.out.print("Masukkan Bilangan Pertama: ");
    bil1 = sc.nextInt();
    System.out.print("Masukkan Bilangan Kedua: ");
    bil2 = sc.nextInt();
    System.out.print("Masukkan Bilangan Ketiga: ");
    bil3 = sc.nextInt();

    terbesar = Max3(bil1, bil2, bil3);
    System.out.println("Bilangan Maximum dari Ketiga Bilangan Tersebut adalah "+terbesar);
```

    =========== Program Identifikasi Bilangan Terbesar ==========
    Masukkan Bilangan Pertama: 10
    Masukkan Bilangan Kedua: 15
    Masukkan Bilangan Ketiga: 5
    Bilangan Maximum dari Ketiga Bilangan Tersebut adalah 15


**- Penjelasan script function main:**

1. **import java.util.Scanner; dan Scanner sc = new Scanner(System.in);** = pertama adalah mendeklarasikan sebuah scanner untuk melakukan input kepada program.

2. **int bil1, bil2, bil3, terbesar;** = mendeklarasikan variabel yang akan digunakan untuk menerima inputan dari user dan sebuah variabel yang akan menerima nilai terbesarnya.

3. **System.out.println("=========== Program Identifikasi Bilangan Terbesar =========="); System.out.print("Masukkan Bilangan Pertama: "); bil1 = sc.nextInt(); System.out.print("Masukkan Bilangan Kedua: "); bil2 = sc.nextInt(); System.out.print("Masukkan Bilangan Ketiga: "); bil3 = sc.nextInt();** = user melakukan proses input dengan mengisialisasi masing-masing variabel bil1, bil2, dan bil3.

4. **terbesar = Max3(bil1, bil2, bil3);** = melakukan pemanggilan function mengembalikan nilai Max3 untuk mengisialisasi variabel terbesar.

5. **System.out.println("Bilangan Maximum dari Ketiga Bilangan Tersebut adalah "+terbesar);** = melakukan output untuk nilai bilangan terbesar.

**- Penjelasan script function Max3:**
1. **static int Max3(int a, int b, int c){** = pertama menambahkan parameter pada function Max3. Terdapat 3 parameter yang mana 3 parameter tersebut akan diisi oleh bil1, bil2, dan bil3.

2. **int key = 0;** = selanjutnya adalah melakukan deklarasi dan menginisialisasi sebuah variabel bernama key yang memiliki nilai 0. Variabel key ini digunakan untuk menampung nilai terbesar pada bilangan yang diinput oleh user.

3. **if(a > b && a > c){ key = a; }else if(b > a && b > c){ key = b; }else if(c > a && c > b){ key = c;** = selanjutnya adalag menggunakan if else. 3 if else ini digunakan untuk mengetahui nilai terbesar pada ke-3 bilangan yang diinput user. Dan meletakannya di variabel key untuk dikembalikan lagi pada fungsi main.

4. **}else if(a == b){ key = a; }else if(a == c){ key = a; }else if(b == c){ key = b; }** = 3 if else ini digunakan untuk mengetahui nilai terbesar jika ada 2 nilai yang sama. Hal ini dikarenakan ketika ada 2 nilai yang mempunyai nilai yang sama dan nilai ke 3 lebih kecil dari pada 2 nilai tersebut akan menghasilkan nilai key = 0. Oleh karena itu, saya menambahkan 3 if else di bagian akhir ini agar dilakukan pemilihan terlebih dahulu oleh 3 if else pertama.

5. **return key;** = setelah mendapat nilai key yang tepat maka program akan mengembalikannya kepada function main.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int dataPorsi[][] = {{20, 15, 35, 24, 70},{30, 40, 10, 28, 35}, {5, 10, 50, 48, 15}};
String namaMakanan[] = {"Nasi goreng","Soto","Sate"};
   String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
  
   static void menuFavo1(){
     int fav1 = 0;
     int max1 = 0;
     for(int a = 0; a<namaMakanan.length; a++){
       if(dataPorsi[a][1] > max1){
         max1 = dataPorsi[a][1];
         fav1 = a;
       }}
     System.out.println("Menu makanan favorit pada hari Selasa yaitu " + namaMakanan[fav1]);
   }
  
   static void menuFavo2(){
     int fav2 = 0;
     int max2 = 0;
     for(int b = 0; b < namaMakanan.length; b++){
       if (dataPorsi[b][4]>max2){
         max2 = dataPorsi[b][4];
         fav2 = b;
       }}
    System.out.println("Menu makanan favorit pada hari Jumat yaitu " + namaMakanan[fav2]);
   }
  
   static void Pendapatan(){
     
    int totalPorsiNasigoreng = 0, totalPorsiSoto = 0, totalPorsiSate = 0;
    int hargaNasigoreng = 20000, hargaSoto = 15000, hargaSate = 25000;
  
     for(int a = 0; a < dataPorsi[0].length; a++){
       totalPorsiNasigoreng = totalPorsiNasigoreng + dataPorsi[0][a];
       totalPorsiSoto = totalPorsiSoto + dataPorsi[1][a];
       totalPorsiSate = totalPorsiSate + dataPorsi[2][a];
     }
     float pemasukanNasigoreng = (totalPorsiNasigoreng * hargaNasigoreng);
     float pemasukanSoto = (totalPorsiSoto * hargaSoto);
     float pemasukanSate = (totalPorsiSate * hargaSate);
  
     float totalPemasukan = pemasukanNasigoreng + pemasukanSoto + pemasukanSate;
     System.out.println("Pemasukan restoran tersebut mulai hari Senin sampai Jumat adalah Rp."+totalPemasukan);
   }
  
   static void banyakTerjual(){
     int banyakNasigoreng = 0, banyakSoto = 0, banyakSate = 0;
     
     for(int a = 0; a < dataPorsi[0].length; a++){
       banyakNasigoreng = banyakNasigoreng + dataPorsi[0][a];
       banyakSoto = banyakSoto + dataPorsi[1][a];
       banyakSate = banyakSate + dataPorsi[2][a];
     }
     System.out.println("Banyak nasi goreng yang terjual ada "+banyakNasigoreng + " porsi");
     System.out.println("Banyak Soto yang terjual ada "+banyakSoto + " porsi");
     System.out.println("Banyak Sate yang terjual ada "+banyakSate + " porsi");
   }
  
   menuFavo1();
   menuFavo2();
   Pendapatan();
   banyakTerjual();
```

    Menu makanan favorit pada hari Selasa yaitu Soto
    Menu makanan favorit pada hari Jumat yaitu Nasi goreng
    Pemasukan restoran tersebut mulai hari Senin sampai Jumat adalah Rp.8625000.0
    Banyak nasi goreng yang terjual ada 164 porsi
    Banyak Soto yang terjual ada 143 porsi
    Banyak Sate yang terjual ada 128 porsi


**Penjelasan Kode Program**

1. **int dataPorsi[][] = {{20, 15, 35, 24, 70},{30, 40, 10, 28, 35}, {5, 10, 50, 48, 15}};** = inisialisasi array jumlah porsi.

2. **String namaMakanan[] = {"Nasi goreng","Soto","Sate"};** = inisialisasi array nama makanan.

3. **String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};** = inisialisasi array hari buka.

4. **static void menuFavo1(){** = deklarasi fungsi menuFavo1 yang merupakan menu pada hari Selasa.

5. **int fav1 = 0; int max1 = 0;** = deklarasi variabel fav1 dan max1 bertipe data integer bernilai 0.

6. **for(int a = 0; a<namaMakanan.length; a++){** = kemudian berupa outer loop untuk mengakses baris dalam array dataPorsi.

7. **if(dataPorsi[a][1] > max1){** = memeriksa setiap elemen dalam baris berdasarkan indeks hari.

8. **max1 = dataPorsi[a][1];** = menyimpan output ke dalam variabel max1.

9. **fav1 = a;** = menyimpan indeks porsi terbanyak.

10. **System.out.println("Menu makanan favorit pada hari Selasa yaitu " + namaMakanan[fav1]);** = menampilan output makanan favorit pada hari Selasa.

11. **static void menuFavo2(){** = deklarasi fungsi menuFavo1 yang merupakan menu pada hari Selasa.

12. **int fav2 = 0; int max2 = 0;** = deklarasi variabel fav1 dan max1 bertipe data integer bernilai 0.

13. **for(int b = 0; b < namaMakanan.length; b++){** = inner loop untuk mengakses array data prosi.

14. **if (dataPorsi[b][4]>max2){** = memeriksa setiap elemen dalam kolom berdasarkan indeks hari.

15. **max2 = dataPorsi[b][4];** = menyimpan output ke dalam indeks max2.

16. **fav2 = b;** = menyimpan indeks porsi terbanyak.

17. **System.out.println("Menu makanan favorit pada hari Jumat yaitu "+ namaMakanan[fav2]);** = menampilan output makanan favorit pada hari Jumat.

18. **static void Pendapatan(){** = setelah itu membuat fungsi Pendapatan bertipe data int tanpa parameter.

19. **int totalPorsiNasigoreng =0, totalPorsiSoto =0, totalPorsiSate =0;** = deklarasi variabel dengan tipe data int dan bernilai 0.

20. **for(int a = 0; a < dataPorsi[0].length; a++){ totalPorsiNasigoreng = totalPorsiNasigoreng + dataPorsi[0][a]; totalPorsiSoto = totalPorsiSoto + dataPorsi[1][a]; totalPorsiSate = totalPorsiSate + dataPorsi[2][a];** = perulangan untuk menghitung total porsi.

21. **pemasukanNasigoreng = (totalPorsiNasigoreng * hargaNasigoreng); int pemasukanSoto = (totalPorsiSoto * hargaSoto); int pemasukanSate = (totalPorsiSate * hargaSate);** = untuk menghitung harga tiap menu dengan total porsi dengan cara total porsi menu dikali harga menu.

22. **float totalPemasukan = pemasukanNasigoreng + pemasukanSoto + pemasukanSate; System.out.println("Pemasukkan restoran tersebut mulai hari Senin sampai Jumat adalah Rp. "+totalPemasukan);** = setelah ketiga makanan tersebut dihitung, maka ketiga makanan tersebut dijumlahkan. Kemudian terdapat output pemasukan restoran dari hari Senin sampai Jumat.

23. **static void banyakTerjual(){** = deklarasi fungsi banyakTerjual.

24. **int banyakNasigoreng = 0, banyakSoto = 0, banyakSate = 0;** = deklarasi variabel dengan tipe data int bernilai 0.

25. **for(int a = 0; a < dataPorsi[0].length; a++){ banyakNasigoreng = banyakNasigoreng + dataPorsi[0][a]; banyakSoto = banyakSoto + dataPorsi[1][a]; banyakSate = banyakSate + dataPorsi[2][a];** = perulangan untuk menghitung total masing-masing menu.

26. **System.out.println("Banyak nasi goreng yang terjual ada "+banyakNasigoreng + " porsi"); System.out.println("Banyak Soto yang terjual ada "+banyakSoto + " porsi"); System.out.println("Banyak Sate yang terjual ada "+banyakSate + " porsi");** = kemudian menampilkan output banyaknya masing-masing menu yang terjual.

27. **menuFavo1();** = memanggil fungsi menuFavo1 yang berupa menu favorit pada hari Selasa.

28. **menuFavo2();** = memanggil fungsi menuFavo2 yang berupa menu favorit pada hari Jumat.

29. **Pendapatan();** = memanggil fungsi  Pendapatan yang merupakan pemasukan dari hari Senin sampai Jumat. 

30. **banyakTerjual();** = memanggil fungsi banyakTerjual yang merupakan banyak porsi yang terjual daring masing-masing menu makanan. 

31. Setelah seluruh output ditampilkan maka kode program akan berhenti dan selesai.
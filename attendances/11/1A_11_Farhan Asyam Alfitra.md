# JOBSHEET 11. ARRAY 2

Farhan Asyam Alfitra


2131710138

## Tujuan
* Mahasiswa mampu memahami pembuatan array dua dimensi
* Mahasiswa mampu menyelesaikan studi kasus dengan memanfaatkan array dua dimensi

## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
Pada Percobaan 1, kode program yang dibuat digunakan untuk menyimpan nilai praktikum dari 2 orang mahasiswa pada 3 mata kuliah yang berbeda.
1.	Buat array bertipe **integer** dengan nama **nilai** dengan kapasitas baris 2 elemen (menyatakan jumlah mahasiswa) dan kolom 3 elemen (menyatakan jumlah mata kuliah)
![Gambar 1](images/percobaan1-1.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai [0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai [1][2]);
```

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
tidak, array tidak harus melalui elemen pertama, karena array memiliki sifat Random Acess dimana Setap elemen di dalam struktur array dapat dicapai secara individual, langsung ke lokasi yang diinginkan

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int i = 0; i < nilai.length; i++){
    for (int j = 0; j < nilai[0].length; j++){
        System.out.printf(" %d  ",nilai[i][j]);
        
    }
    System.out.println("");
}
```

     75   90   88  
     79   82   67  


### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 3
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 3
    
    Masukkan rating pengguna 3 untuk restoran 0 : 4
    Masukkan rating pengguna 3 untuk restoran 1 : 5
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    5 4 
    4 3 
    5 3 
    4 5 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
tidak bisa, karena akan terjadi error 
```


    |   tidak bisa, karena akan terjadi error; 

    ';' expected

    


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2

import java.util.Scanner;
Scanner input = new Scanner(System.in);
int x, y;

System.out.print("Masukkan Angka Untuk Ditampilkan di Bagian Baris : ");
x = input.nextInt();
System.out.print("Masukkan Angka Untuk Ditampilkan di Bagian Kolom : ");
y = input.nextInt();
int[][] rating = new int[x][y];

System.out.print("Baris " + x + " kolom " + y );
```

    Masukkan Angka Untuk Ditampilkan di Bagian Baris : 5
    Masukkan Angka Untuk Ditampilkan di Bagian Kolom : 6
    Baris 5 kolom 6

### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int [][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i < harga.length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga [%d] [%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga [i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.3f\n", i,rata);
}
```

    Masukkan harga [0] [0]: 5000
    Masukkan harga [0] [1]: 4000
    Masukkan harga [0] [2]: 3500
    Masukkan harga [0] [3]: 2500
    Masukkan harga [0] [4]: 4000
    Masukkan harga [0] [5]: 6000
    Rata-rata harga bahan ke-0 adalah 4166.667
    Masukkan harga [1] [0]: 9000
    Masukkan harga [1] [1]: 4500
    Masukkan harga [1] [2]: 8000
    Masukkan harga [1] [3]: 5000
    Masukkan harga [1] [4]: 2000
    Masukkan harga [1] [5]: 6500
    Rata-rata harga bahan ke-1 adalah 5833.333
    Masukkan harga [2] [0]: 5000
    Masukkan harga [2] [1]: 6000
    Masukkan harga [2] [2]: 2000
    Masukkan harga [2] [3]: 2500
    Masukkan harga [2] [4]: 9000
    Masukkan harga [2] [5]: 5500
    Rata-rata harga bahan ke-2 adalah 5000.000


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

untuk memasukkan nilai pada bagian kolom 

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2

jika tidak diletakkan dalam for pada bagian pertama maka nilai akan terus bertambah tanpa terjadinya reset

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);

double suhu[][] = new double[5][7];
int x, y;
double max = 0;

for (x = 0; x < suhu.length; x++){
    for(y = 0; y < suhu[0].length; y++){
        System.out.print("Suhu Di Jepang Sekarang : ");
        suhu[x][y] = input.nextInt();
         if(suhu[x][y] > max)
            max = suhu[x][y];
    }
}
 System.out.print("Suhu Maksimal di Jepang Adalah : " + max);
```

    Suhu Di Jepang Sekarang : 22
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 43
    Suhu Di Jepang Sekarang : 12
    Suhu Di Jepang Sekarang : 16
    Suhu Di Jepang Sekarang : 27
    Suhu Di Jepang Sekarang : 25
    Suhu Di Jepang Sekarang : 35
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 19
    Suhu Di Jepang Sekarang : 28
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 22
    Suhu Di Jepang Sekarang : 17
    Suhu Di Jepang Sekarang : 31
    Suhu Di Jepang Sekarang : 27
    Suhu Di Jepang Sekarang : 24
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 32
    Suhu Di Jepang Sekarang : 13
    Suhu Di Jepang Sekarang : 29
    Suhu Di Jepang Sekarang : 27
    Suhu Di Jepang Sekarang : 32
    Suhu Di Jepang Sekarang : 14
    Suhu Di Jepang Sekarang : 26
    Suhu Di Jepang Sekarang : 28
    Suhu Di Jepang Sekarang : 32
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 42
    Suhu Di Jepang Sekarang : 12
    Suhu Di Jepang Sekarang : 34
    Suhu Di Jepang Sekarang : 34
    Suhu Di Jepang Sekarang : 23
    Suhu Di Jepang Sekarang : 43
    Suhu Di Jepang Sekarang : 25
    Suhu Maksimal di Jepang Adalah : 43.0

## 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2

import java.util.Scanner;
Scanner input = new Scanner(System.in);

int[][] mahasiswa = {{19,51,155},
                     {18,55,163},
                     {18,45,153},
                     {20,46,158},
                     {19,58,160}};

String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int ttinggi = 0;
int mhstt;
int tp = mahasiswa[0][1];
int tt = mahasiswa[0][0];

for(int x = 0; x < mahasiswa.length; x++)
    for(int y = 0; y < mahasiswa[0].length; y++) {
        if(y == 1 && tp > mahasiswa[x][y]) tp = mahasiswa[x][y];
        else if(y == 2) ttinggi += mahasiswa[x][y];
        else if(y == 0 && tt < mahasiswa[x][y]) {
            mhstt = x;
            tt = mahasiswa[x][y];
        }
    }

System.out.println("Berat badan terendah diantara kelima mahasiswa adalah : " + tp);
System.out.println("Rata-rata tinggi badan dari kelima mahasiswa : " + ((double) ttinggi / mahasiswa.length));
System.out.printf("\nMahasiswa Tertua adalah %s di antara kelima mahasiswa dengan umur %d", namaMahasiswa[mhstt], tt );
```

    Berat badan terendah diantara kelima mahasiswa adalah : 45
    Rata-rata tinggi badan dari kelima mahasiswa : 157.8
    
    Mahasiswa Tertua adalah Beky di antara kelima mahasiswa dengan umur 20




    java.io.PrintStream@66fc049f



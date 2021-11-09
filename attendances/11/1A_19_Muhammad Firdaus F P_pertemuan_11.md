# JOBSHEET 11. ARRAY 2

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
int[][] nilai = new int[2][3]
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
System.out.println(nilai [0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai [1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
System.out.println("Jika menggunakan array 2 dimensi tidak harus berurutan mulai indeks 0, array 2 dimensi , berikut contohnya");
int[][] contoh = new int[2][4];
contoh[1][3] = 82;
System.out.println(contoh[1][3]);
```

    Jika menggunakan array 2 dimensi tidak harus berurutan mulai indeks 0, array 2 dimensi , berikut contohnya
    82


2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i <= nilai.length; i++)
for(int a = 0; a <= nilai.length; a++) System.out.println(nilai[i][a]);
```

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
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
for(int i = 0; i < rating.length; i++) {
    for(int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 1
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 2
    Masukkan rating pengguna 3 untuk restoran 0 : 2
    Masukkan rating pengguna 3 untuk restoran 1 : 5



```Java
4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)
```


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg: rating) {
    for(int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    3 5 
    3 1 
    5 2 
    2 5 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
System.out.println("Tidak bisa, karena pada indeks tertentu data tidak ditemukan dan akhirnya menghasilkan error pada pertengahan proses program");

for(int i = 0; i < rating.length; i++) {
    for(int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + j + " untuk restoran " + i + " : ");
        rating[j][i] = sc.nextInt();
    }
}
```

    Tidak bisa, karena pada indeks tertentu data tidak ditemukan dan akhirnya menghasilkan error pada pertengahan proses program
    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 1 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    Masukkan rating pengguna 0 untuk restoran 2 : 5



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#18:1)


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
System.out.print("Masukkan jumlah baris: ");
int b = sc.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int k = sc.nextInt();
int[][] rating = new int[b][k];

System.out.println("Jumlah baris adalah: " + rating.length);
System.out.println("Jumlah kolom adalah: " + rating[0].length);
```

    Masukkan jumlah baris: 10
    Masukkan jumlah kolom: 20
    Jumlah baris adalah: 10
    Jumlah kolom adalah: 20


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
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; 1 < harga.length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0]. length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 5000
    Masukkan harga[0][1]: 3000
    Masukkan harga[0][2]: 2000
    Masukkan harga[0][3]: 1000
    Masukkan harga[0][4]: 500
    Masukkan harga[0][5]: 200
    Rata-rata harga bahan ke-0 adalah 1950.00
    Masukkan harga[1][0]: 100
    Masukkan harga[1][1]: 50
    Masukkan harga[1][2]: 20
    Masukkan harga[1][3]: 10
    Masukkan harga[1][4]: 1
    Masukkan harga[1][5]: 5
    Rata-rata harga bahan ke-1 adalah 31.00
    Masukkan harga[2][0]: 8000
    Masukkan harga[2][1]: 2000
    Masukkan harga[2][2]: 4000
    Masukkan harga[2][3]: 5000
    Masukkan harga[2][4]: 7000
    Masukkan harga[2][5]: 10000
    Rata-rata harga bahan ke-2 adalah 6000.00
    Masukkan harga[3][0]: 


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    	at .(#17:7)


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
System.out.println("Harga[0].length akan menginputkan panjang dari array dimensi ke 2");
```

    Harga[0].length akan menginputkan panjang dari array dimensi ke 2


2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
System.out.println("Agar setiap perulangan ke 6 akan mengulang lagi hingga 3 kali");
```

    Agar setiap perulangan ke 6 akan mengulang lagi hingga 3 kali


## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double[5][7];
double max = 0;

for(int x = 0; x < suhu.length; x++) {
    for(int y = 0; y < suhu[0].length; y++) {
        System.out.print("Masukkan suhu: ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max) max = suhu[x][y];
    }
}

System.out.println("Max = " + max);
```

    Masukkan suhu: 50
    Masukkan suhu: 79
    Masukkan suhu: 80
    Masukkan suhu: 20
    Masukkan suhu: 10
    Masukkan suhu: 39
    Masukkan suhu: 40
    Masukkan suhu: 33
    Masukkan suhu: 67
    Masukkan suhu: 99
    Masukkan suhu: 22
    Masukkan suhu: 45
    Masukkan suhu: 67
    Masukkan suhu: 99
    Masukkan suhu: 10
    Masukkan suhu: 20
    Masukkan suhu: 66
    Masukkan suhu: 99
    Masukkan suhu: 90
    Masukkan suhu: 300
    Masukkan suhu: 20
    Masukkan suhu: 11
    Masukkan suhu: 23
    Masukkan suhu: 44
    Masukkan suhu: 56
    Masukkan suhu: 90
    Masukkan suhu: 100
    Masukkan suhu: 150
    Masukkan suhu: 160
    Masukkan suhu: 500
    Masukkan suhu: 200
    Masukkan suhu: 200000
    Masukkan suhu: 21
    Masukkan suhu: 0
    Masukkan suhu: 1
    Max = 200000.0


2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] mahasiswa = {{19,51,155},
                     {18,55,163},
                     {18,45,153},
                     {20,46,158},
                     {19,58,160}};
String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int totalTinggi = 0;
int mahasiswaTertua;

int terendah = mahasiswa[0][1];
int tertua = mahasiswa[0][0];

for(int i = 0; i < mahasiswa.length; i++)
    for(int j = 0; j < mahasiswa[0].length; j++) {
        if(j == 1 && terendah > mahasiswa[i][j]) terendah = mahasiswa[i][j];
        else if(j == 2) totalTinggi += mahasiswa[i][j];
        else if(j == 0 && tertua < mahasiswa[i][j]) {
            mahasiswaTertua = i;
            tertua = mahasiswa[i][j];
        }
    }

System.out.println("Berat badan terendah " + terendah);
System.out.println("Rata-rata tinggi badan " + ((double) totalTinggi/mahasiswa.length));
System.out.printf("\nMahasiswa Tertua %s dengan umur %d", namaMahasiswa[mahasiswaTertua], tertua );
```

    Berat badan terendah 45
    Rata-rata tinggi badan 157.8
    
    Mahasiswa Tertua Beky dengan umur 20




    java.io.PrintStream@2ba0f88d




```Java

```

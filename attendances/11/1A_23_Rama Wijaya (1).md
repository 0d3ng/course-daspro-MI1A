# JOBSHEET 11. ARRAY 2
#### Nama : Rama Wijaya
#### NIM : 2131710107
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
int [][] nilai = new int [2][3];
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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
#### jawaban
1. sebenarnya tidak harus urut, melainkan sesuai dengan indeks tertentu

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2

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
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating penguna " + i + "untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
 }
```

    Masukkan rating penguna 0untuk restoran 0 : 5
    Masukkan rating penguna 0untuk restoran 1 : 4
    Masukkan rating penguna 1untuk restoran 0 : 2
    Masukkan rating penguna 1untuk restoran 1 : 1
    Masukkan rating penguna 2untuk restoran 0 : 2
    Masukkan rating penguna 2untuk restoran 1 : 1
    Masukkan rating penguna 3untuk restoran 0 : 0
    Masukkan rating penguna 3untuk restoran 1 : 1


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
}
```

    5 4 2 1 2 1 0 1 

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!

// Tuliskan jawaban nomor 1
#### Jawaban
1. tidak bisa, karena jika ditukar maka outputnya akan berbeda tidak sesuai indeks.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!

// Tuliskan jawaban nomor 2

### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
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
for (int i = 0; i < harga[0].length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata Rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 3000
    Masukkan harga[0][1]: 5000
    Masukkan harga[0][2]: 7000
    Masukkan harga[0][3]: 9000
    Masukkan harga[0][4]: 10000
    Masukkan harga[0][5]: 1000
    Rata Rata harga bahan ke-0 adalah 5833.33
    Masukkan harga[1][0]: 5000
    Masukkan harga[1][1]: 6000
    Masukkan harga[1][2]: 8000
    Masukkan harga[1][3]: 5000
    Masukkan harga[1][4]: 8000
    Masukkan harga[1][5]: 7000
    Rata Rata harga bahan ke-1 adalah 6500.00
    Masukkan harga[2][0]: 9000
    Masukkan harga[2][1]: 8500
    Masukkan harga[2][2]: 4500
    Masukkan harga[2][3]: 9000
    Masukkan harga[2][4]: 10000
    Masukkan harga[2][5]: 3000
    Rata Rata harga bahan ke-2 adalah 7333.33
    Masukkan harga[3][0]: 


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    	at .(#30:7)


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
#### Jawaban 
1. untuk menghitung rata rata setiap bahan dari total yang dibagi harga

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
#### Jawaban
2. output dari rata rata akan menunjukkan dari nilai keseluran bahan/ semua bahan tanpa dipisahkan

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[][] rating = new int[5][7];
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan suhu kota " + i + "untuk hari ke " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
 }
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
}
```

    Masukkan suhu kota 0untuk hari ke 0 : 65
    Masukkan suhu kota 0untuk hari ke 1 : 70
    Masukkan suhu kota 0untuk hari ke 2 : 90
    Masukkan suhu kota 0untuk hari ke 3 : 45
    Masukkan suhu kota 0untuk hari ke 4 : 65
    Masukkan suhu kota 0untuk hari ke 5 : 75
    Masukkan suhu kota 0untuk hari ke 6 : 35
    Masukkan suhu kota 1untuk hari ke 0 : 65
    Masukkan suhu kota 1untuk hari ke 1 : 38
    Masukkan suhu kota 1untuk hari ke 2 : 47
    Masukkan suhu kota 1untuk hari ke 3 : 32
    Masukkan suhu kota 1untuk hari ke 4 : 65
    Masukkan suhu kota 1untuk hari ke 5 : 24
    Masukkan suhu kota 1untuk hari ke 6 : 25
    Masukkan suhu kota 2untuk hari ke 0 : 45
    Masukkan suhu kota 2untuk hari ke 1 : 68
    Masukkan suhu kota 2untuk hari ke 2 : 65
    Masukkan suhu kota 2untuk hari ke 3 : 45
    Masukkan suhu kota 2untuk hari ke 4 : 87
    Masukkan suhu kota 2untuk hari ke 5 : 35
    Masukkan suhu kota 2untuk hari ke 6 : 98
    Masukkan suhu kota 3untuk hari ke 0 : 65
    Masukkan suhu kota 3untuk hari ke 1 : 45
    Masukkan suhu kota 3untuk hari ke 2 : 75
    Masukkan suhu kota 3untuk hari ke 3 : 34
    Masukkan suhu kota 3untuk hari ke 4 : 15
    Masukkan suhu kota 3untuk hari ke 5 : 25
    Masukkan suhu kota 3untuk hari ke 6 : 34
    Masukkan suhu kota 4untuk hari ke 0 : 45
    Masukkan suhu kota 4untuk hari ke 1 : 36
    Masukkan suhu kota 4untuk hari ke 2 : 45
    Masukkan suhu kota 4untuk hari ke 3 : 54
    Masukkan suhu kota 4untuk hari ke 4 : 25
    Masukkan suhu kota 4untuk hari ke 5 : 65
    Masukkan suhu kota 4untuk hari ke 6 : 35
    65 70 90 45 65 75 35 65 38 47 32 65 24 25 45 68 65 45 87 35 98 65 45 75 34 15 25 34 45 36 45 54 25 65 35 

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


int terendah = mahasiswa[0][1]; 
int tertua = mahasiswa[0][0];
int totalTinggi = 0;
int mahasiswaTertua;

for(int i = 0; i < mahasiswa.length; i++)
    for(int j = 0; j < mahasiswa[0].length; j++) {
        
        if(j == 1 && terendah > mahasiswa[i][j]) terendah = mahasiswa[i][j]; 
        else if(j == 2) totalTinggi += mahasiswa[i][j]; 
        else if(j == 0 && tertua < mahasiswa[i][j]) {
            mahasiswaTertua = i; 
            tertua = mahasiswa[i][j]; 
        }
    }


System.out.println("Berat badan terendah adalah " + terendah);
System.out.println("Rata-rata tinggi badan adalah " + ((double) totalTinggi/mahasiswa.length));
System.out.printf("\nMahasiswa Tertua adalah %s dengan umur %d", namaMahasiswa[mahasiswaTertua], tertua );
```

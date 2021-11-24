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
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75; // menginput / mengisi nilai array 2 dimensi
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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]); // untuk menampilkan output yaitu elemen array dengan menuliskan indeksnya
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
     Untuk pengisian elemen array tidak harus dilakukan secara berurutan karena program tetap bisa berjalan. 
    Tetapi urutan array kita akan berubah sesuai dengan yang kita rubah
```


    |        untuk pengisian elemen array tidak harus dilakukan secara berurutan karena program tetap bisa berjalan. 

    ';' expected

    


2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
 for (int i = 0; i < nilai.length; i++) // perulangan untuk menggantikan fungsi langkah ke 3 diatas
     for (int j = 0; j < nilai[0].length; j++){
          System.out.println(nilai[i][j]);
     }

     

```

    75
    90
    88
    79
    82
    67


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
int[][] rating = new int[4][2]; // ukuran array
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) { // length pertama (rating.length) menghasilkan jumlah barisnya (dimensi pertama) yaitu 4
    for (int j = 0; j < rating[0].length; j++) { // rating[0].length menghasilkan jumlah kolomnya (dimensi kedua) yaitu 2
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : "); // output tulisan
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 0
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 9
    
    Masukkan rating pengguna 2 untuk restoran 0 : 7
    Masukkan rating pengguna 2 untuk restoran 1 : 9
    
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 6
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) { // perulangan untuk menampilkan elemen array
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
} 
```

    0 4 
    8 9 
    7 9 
    7 6 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
tidak bisa, karena pada indeks tidak bisa ditemukan yang menyebabkan error
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner; // deklarasi scanner
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan jumlah baris: "); // menginput jumlah baris secara manual
int a = sc.nextInt();
System.out.print("Masukkan jumlah kolom: "); // menginput jumlah kolom secara manual
int b = sc.nextInt();
int[][] rating = new int[a][b]; // jumlah arrray

for (int i=0; i < rating.length; i++){ 
    for (int j=0; j < rating[0].length; j++){ 
        System.out.print("Masukkan rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println("");
}
```

    Masukkan jumlah baris: 4
    Masukkan jumlah kolom: 2
    Masukkan rating pengguna 0 untuk restoran 0 : 7
    Masukkan rating pengguna 0 untuk restoran 1 : 8
    
    Masukkan rating pengguna 1 untuk restoran 0 : 9
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 7
    
    Masukkan rating pengguna 3 untuk restoran 0 : 6
    Masukkan rating pengguna 3 untuk restoran 1 : 9
    


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
```

    Masukkan harga[0][0]: 5000
    Masukkan harga[0][1]: 6000
    Masukkan harga[0][2]: 7000
    Masukkan harga[0][3]: 5500
    Masukkan harga[0][4]: 4500
    Masukkan harga[0][5]: 5000
    Rata-rata harga bahan ke-0 adalah 5500.00
    Masukkan harga[1][0]: 7000
    Masukkan harga[1][1]: 8000
    Masukkan harga[1][2]: 7500
    Masukkan harga[1][3]: 6500
    Masukkan harga[1][4]: 5000
    Masukkan harga[1][5]: 4000
    Rata-rata harga bahan ke-1 adalah 6333.33
    Masukkan harga[2][0]: 7000
    Masukkan harga[2][1]: 8000
    Masukkan harga[2][2]: 7500
    Masukkan harga[2][3]: 5000
    Masukkan harga[2][4]: 6000
    Masukkan harga[2][5]: 7500
    Rata-rata harga bahan ke-2 adalah 6833.33
    Masukkan harga[3][0]: 


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    	at .(#18:7)


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
Untuk menghitung rata-rata dan harga[0].length untuk menampilkan / menghitung kolom pada array
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
total = 0;
rata = 0;
for (int i = 0; 1 < harga.length; i++) {
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0]. length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata); 
}

// karena jika dilakukan diluar perulangan pertama akan menghasilkan hasil rata-rata yang tidak sesuai seperti contoh yang saya coba diatas


```

    Masukkan harga[0][0]: 5000
    Masukkan harga[0][1]: 4000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 2000
    Masukkan harga[0][4]: 4000
    Masukkan harga[0][5]: 5000
    Rata-rata harga bahan ke-0 adalah 3833.33
    Masukkan harga[1][0]: 4000
    Masukkan harga[1][1]: 4000
    Masukkan harga[1][2]: 5000
    Masukkan harga[1][3]: 5000
    Masukkan harga[1][4]: 4000
    Masukkan harga[1][5]: 5000
    Rata-rata harga bahan ke-1 adalah 8333.33
    Masukkan harga[2][0]: 8000
    Masukkan harga[2][1]: 4000
    Masukkan harga[2][2]: 8000
    Masukkan harga[2][3]: 4000
    Masukkan harga[2][4]: 8000
    Masukkan harga[2][5]: 4000
    Rata-rata harga bahan ke-2 adalah 14333.33
    Masukkan harga[3][0]: 


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    	at .(#22:1)


## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner; // deklarasi scanner
Scanner sc = new Scanner(System.in);

double[][]suhu = new double[5][7]; // mendeklarasikan array 2 dimensi (ukuran array)
int x, y; // tipe data
double max = 0;
    
for (x = 0; x < suhu.length; x++){ // perulangan, suhu.length untuk menampilkan baris yaitu 5
    for (y = 0; y < suhu[0].length; y++){ // suhu[0].length untuk menampilkan kolom yaitu 7
    System.out.printf("Masukkan suhu kota ke-%d hari ke-%d : ", x, y);
    suhu[x][y] = sc.nextDouble();
    if(suhu[x][y] > max) max = suhu[x][y];
}
}
System.out.printf("Suhu terbesar kota adalah : " + max) // output menampilkan suhu terbesar di kota

```

    Masukkan suhu kota ke-0 hari ke-0 : 21
    Masukkan suhu kota ke-0 hari ke-1 : 23
    Masukkan suhu kota ke-0 hari ke-2 : 24
    Masukkan suhu kota ke-0 hari ke-3 : 25
    Masukkan suhu kota ke-0 hari ke-4 : 25
    Masukkan suhu kota ke-0 hari ke-5 : 26
    Masukkan suhu kota ke-0 hari ke-6 : 27
    Masukkan suhu kota ke-1 hari ke-0 : 18
    Masukkan suhu kota ke-1 hari ke-1 : 19
    Masukkan suhu kota ke-1 hari ke-2 : 20
    Masukkan suhu kota ke-1 hari ke-3 : 21
    Masukkan suhu kota ke-1 hari ke-4 : 22
    Masukkan suhu kota ke-1 hari ke-5 : 23
    Masukkan suhu kota ke-1 hari ke-6 : 24
    Masukkan suhu kota ke-2 hari ke-0 : 31
    Masukkan suhu kota ke-2 hari ke-1 : 32
    Masukkan suhu kota ke-2 hari ke-2 : 31
    Masukkan suhu kota ke-2 hari ke-3 : 30
    Masukkan suhu kota ke-2 hari ke-4 : 28
    Masukkan suhu kota ke-2 hari ke-5 : 21
    Masukkan suhu kota ke-2 hari ke-6 : 30
    Masukkan suhu kota ke-3 hari ke-0 : 12
    Masukkan suhu kota ke-3 hari ke-1 : 17
    Masukkan suhu kota ke-3 hari ke-2 : 19
    Masukkan suhu kota ke-3 hari ke-3 : 18
    Masukkan suhu kota ke-3 hari ke-4 : 20
    Masukkan suhu kota ke-3 hari ke-5 : 20
    Masukkan suhu kota ke-3 hari ke-6 : 21
    Masukkan suhu kota ke-4 hari ke-0 : 38
    Masukkan suhu kota ke-4 hari ke-1 : 37
    Masukkan suhu kota ke-4 hari ke-2 : 35
    Masukkan suhu kota ke-4 hari ke-3 : 36
    Masukkan suhu kota ke-4 hari ke-4 : 32
    Masukkan suhu kota ke-4 hari ke-5 : 31
    Masukkan suhu kota ke-4 hari ke-6 : 30
    Suhu terbesar kota adalah : 38.0




    java.io.PrintStream@4d6a3fdb



2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2 
int[][] mahasiswa = {{19,51,155}, // inisialiasasi array 2 dimensi
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

System.out.println("Berat badan terendah " + terendah); // output
System.out.println("Rata-rata tinggi badan " + ((double) totalTinggi/mahasiswa.length));
System.out.printf("\nMahasiswa Tertua %s dengan umur %d", namaMahasiswa[mahasiswaTertua], tertua );
```

    Berat badan terendah 45
    Rata-rata tinggi badan 157.8
    
    Mahasiswa Tertua Beky dengan umur 20




    java.io.PrintStream@34711421



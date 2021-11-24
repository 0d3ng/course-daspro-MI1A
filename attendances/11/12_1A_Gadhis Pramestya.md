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
int[][] nilai = new int [2][3];
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
nilai[0][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 67
    79 82 0


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

Jika menggunakan looping harus dimulai dari index 0, tetapi jika input langsung dari keyboard di source code tidak harus urut.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i=0; i<nilai.length; i++){
    for(int j=0; j<nilai[0].length; j++){
        System.out.print(nilai[i][j] + " ");
    }
    System.out.println();
}
```

    75 90 67 
    79 82 0 


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
int[][]rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 60
    Masukkan rating pengguna 0 untuk restoran 1 : 70
    
    Masukkan rating pengguna 1 untuk restoran 0 : 80
    Masukkan rating pengguna 1 untuk restoran 1 : 76
    
    Masukkan rating pengguna 2 untuk restoran 0 : 90
    Masukkan rating pengguna 2 untuk restoran 1 : 93
    
    Masukkan rating pengguna 3 untuk restoran 0 : 82
    Masukkan rating pengguna 3 untuk restoran 1 : 87
    


penjelasan
- for (int i=0; i<rating.length; i++) = outer loop 
- for (int j=0; j<rating[0].length; j++) = inner loop
- System.out.print = menampilkan tulisan dalam array beserta indeks i dan - rating[i][j] = sc.nextInt(); = memasukkan inputan dalam array rating

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

    60 70 
    80 76 
    90 93 
    82 87 


penjelasan
- for (int j=0; j<rating.length; j++) = outer loop
- for (int i=0; i<rating[0].length; i++) = inner loop
- System.out.print(r + " "); = menampilkan isi elemen array rating
- System.out.println(""); = berganti baris setiap inner loop selesai dieksekusi

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1

bisa, karena i dan j hanya sebuah variabel

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 

System.out.print("Baris : ");
int x = sc.nextInt();
System.out.print("Kolom : ");
int y = sc.nextInt();
int[][] rating = new int[x][y];

for (int i=0; i<rating.length; i++){ 
    for (int j=0; j<rating[0].length; j++){ 
        System.out.print("Rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println("");
}
```

    Baris : 3
    Kolom : 2
    Rating pengguna 0 untuk restoran 0 : 77
    Rating pengguna 0 untuk restoran 1 : 69
    
    Rating pengguna 1 untuk restoran 0 : 80
    Rating pengguna 1 untuk restoran 1 : 86
    
    Rating pengguna 2 untuk restoran 0 : 90
    Rating pengguna 2 untuk restoran 1 : 96
    


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
for (int i = 0; i < harga.length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 56000
    Masukkan harga[0][1]: 78000
    Masukkan harga[0][2]: 90000
    Masukkan harga[0][3]: 65000
    Masukkan harga[0][4]: 43000
    Masukkan harga[0][5]: 32000
    Rata-rata harga bahan ke-0 adalah 60666.67
    Masukkan harga[1][0]: 13000
    Masukkan harga[1][1]: 65000
    Masukkan harga[1][2]: 99000
    Masukkan harga[1][3]: 27000
    Masukkan harga[1][4]: 67000
    Masukkan harga[1][5]: 62000
    Rata-rata harga bahan ke-1 adalah 55500.00
    Masukkan harga[2][0]: 52000
    Masukkan harga[2][1]: 77000
    Masukkan harga[2][2]: 19000
    Masukkan harga[2][3]: 15000
    Masukkan harga[2][4]: 20000
    Masukkan harga[2][5]: 26000
    Rata-rata harga bahan ke-2 adalah 34833.33


### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

untuk menghitung total harga dan harga dengan membaginya agar menghasilkan rata rata harga tersebut

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
total = 0;
    rata = 0;
for (int i = 0; i < harga.length; i++) {
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 88000
    Masukkan harga[0][1]: 46000
    Masukkan harga[0][2]: 12000
    Masukkan harga[0][3]: 70000
    Masukkan harga[0][4]: 23000
    Masukkan harga[0][5]: 76000
    Rata-rata harga bahan ke-0 adalah 52500.00
    Masukkan harga[1][0]: 65000
    Masukkan harga[1][1]: 32000
    Masukkan harga[1][2]: 65000
    Masukkan harga[1][3]: 74000
    Masukkan harga[1][4]: 18000
    Masukkan harga[1][5]: 29000
    Rata-rata harga bahan ke-1 adalah 99666.67
    Masukkan harga[2][0]: 34000
    Masukkan harga[2][1]: 74000
    Masukkan harga[2][2]: 90000
    Masukkan harga[2][3]: 32000
    Masukkan harga[2][4]: 28000
    Masukkan harga[2][5]: 7000
    Rata-rata harga bahan ke-2 adalah 143833.33


penjelasan 
karena rata-rata akan dihitung setiap nomor. jika variabel tsb diletakkan di luar perulangan for perhitungan rata-rata tidak sesuai karena perhitungan diatasnya akan ikut terhitun

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double[5][7];
int x, y;
double max = 0;

for(int x = 0; x < suhu.length; x++){
    for(int y = 0; y < suhu.length; y++) {
        System.out.print("Suhu di kota jepang: ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max) max = suhu[x][y];
    }
}

System.out.println("Max Suhu : " + max);
```

    Suhu di kota jepang: 4
    Suhu di kota jepang: 6
    Suhu di kota jepang: 7
    Suhu di kota jepang: 1
    Suhu di kota jepang: 2
    Suhu di kota jepang: 3
    Suhu di kota jepang: 9
    Suhu di kota jepang: 10
    Suhu di kota jepang: 13
    Suhu di kota jepang: 14
    Suhu di kota jepang: 1
    Suhu di kota jepang: 12
    Suhu di kota jepang: 16
    Suhu di kota jepang: 17
    Suhu di kota jepang: 18
    Suhu di kota jepang: 20
    Suhu di kota jepang: 21
    Suhu di kota jepang: 22
    Suhu di kota jepang: 23
    Suhu di kota jepang: 25
    Suhu di kota jepang: 27
    Suhu di kota jepang: 29
    Suhu di kota jepang: 30
    Suhu di kota jepang: 2
    Suhu di kota jepang: 3
    Max Suhu : 30.0



```Java
penjelasan : 
```

##### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] dataMhs = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160}
};

int i,j;
int minbb=100;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[1].length; j++){
        if(dataMhs[i][1] < minbb){
            minbb = dataMhs[i][1];
        }
    }
}
System.out.print("Berat badan terendah dari kelima mahasiswa adalah " + minbb);

double totaltb = 0;
double ratatb = 0;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[0].length; j++){
    if(j == 2)
        totaltb += dataMhs[i][j];
    }
}
ratatb = totaltb / dataMhs.length;
System.out.printf('\n' + "Total tinggi badan = " + totaltb);
System.out.print('\n'+ "Rerata tinggi badan dari kelima mahasiswa adalah " + ratatb);

String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int indeks;
int tua=0;
for(i=0; i<dataMhs.length; i++){
    for(j=0; j<dataMhs[0].length; j++){
        if(dataMhs[i][0] > tua){
            tua = dataMhs[i][0];
            indeks = i;
        }
    }
}
System.out.print('\n'+"Umur tertua dari kelima mahasiswa tersebut yaitu " +tua +" bernama " + nama[indeks]);
```

    Berat badan terendah dari kelima mahasiswa adalah 45
    Total tinggi badan = 789.0
    Rerata tinggi badan dari kelima mahasiswa adalah 157.8
    Umur tertua dari kelima mahasiswa tersebut yaitu 20 bernama Beky


```Java

```

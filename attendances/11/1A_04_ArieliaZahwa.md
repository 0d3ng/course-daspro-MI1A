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


```Java
// Tuliskan jawaban nomor 1
tidak, karena array 2 dimensi
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i<2; i++){
    for(int j = 0; j<3; j++){
    System.out.println(nilai[i][j]);
    }
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
Scanner sc = new Scanner (System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int [4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int j = 0; j<rating.length; j++){
    for(int i = 0; i<rating[0].length; i++){
        System.out.print("Masukkan rating pengguna" + j + "untuk restoran " + i + " : ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna0untuk restoran 0 : 100
    Masukkan rating pengguna0untuk restoran 1 : 90
    
    Masukkan rating pengguna1untuk restoran 0 : 90
    Masukkan rating pengguna1untuk restoran 1 : 90
    
    Masukkan rating pengguna2untuk restoran 0 : 90
    Masukkan rating pengguna2untuk restoran 1 : 90
    
    Masukkan rating pengguna3untuk restoran 0 : 90
    Masukkan rating pengguna3untuk restoran 1 : 90
    


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

    100 90 
    90 90 
    90 90 
    90 90 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
Tidak bisa, karena akan menghasilkan error pada proses program
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
System.out.print("Masukkan jumlah baris: ");
int baris = sc.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int kolom = sc.nextInt();
int[][] rating = new int[baris][kolom];

System.out.println("Jumlah baris sekarang adalah: " + rating.length);
System.out.println("Jumlah kolom sekarang adalah: " + rating[0].length); 
```

    Masukkan jumlah baris: 3
    Masukkan jumlah kolom: 6
    Jumlah baris sekarang adalah: 3
    Jumlah kolom sekarang adalah: 6


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

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 2000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 5000
    Masukkan harga[0][5]: 6000
    Rata-rata harga bahan ke-0 adalah 3500.00
    Masukkan harga[1][0]: 7000
    Masukkan harga[1][1]: 8000
    Masukkan harga[1][2]: 9000
    Masukkan harga[1][3]: 10000
    Masukkan harga[1][4]: 11000
    Masukkan harga[1][5]: 12000
    Rata-rata harga bahan ke-1 adalah 9500.00
    Masukkan harga[2][0]: 13000
    Masukkan harga[2][1]: 14000
    Masukkan harga[2][2]: 15000
    Masukkan harga[2][3]: 16000
    Masukkan harga[2][4]: 17000
    Masukkan harga[2][5]: 18000
    Rata-rata harga bahan ke-2 adalah 15500.00


# Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk menghitung rata-rata nilai sesuai inputan
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
agar setiap perulangan ke 6 akan mengulang lagi hingga 3 kali
```

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
        if(suhu[x][y] > max) max = suhu[x][y]; // Mengubah nilai variabel dengan data tertinggi
    }
}

System.out.println("Max = " + max);
```

    Masukkan suhu: 20
    Masukkan suhu: 21
    Masukkan suhu: 22
    Masukkan suhu: 23
    Masukkan suhu: 24
    Masukkan suhu: 25
    Masukkan suhu: 26
    Masukkan suhu: 27
    Masukkan suhu: 28
    Masukkan suhu: 29
    Masukkan suhu: 30
    Masukkan suhu: 20
    Masukkan suhu: 21
    Masukkan suhu: 23
    Masukkan suhu: 24
    Masukkan suhu: 5
    Masukkan suhu: 26
    Masukkan suhu: 27
    Masukkan suhu: 28
    Masukkan suhu: 29
    Masukkan suhu: 30
    Masukkan suhu: 20
    Masukkan suhu: 21
    Masukkan suhu: 22
    Masukkan suhu: 23
    Masukkan suhu: 24
    Masukkan suhu: 25
    Masukkan suhu: 26
    Masukkan suhu: 27
    Masukkan suhu: 28
    Masukkan suhu: 29
    Masukkan suhu: 30
    Masukkan suhu: 20
    Masukkan suhu: 21
    Masukkan suhu: 22
    Max = 30.0


## 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] dataMahasiswa = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160}
};

int i,j;
int minimalberatbadan=100;
for(i=0; i<dataMahasiswa.length; i++){
    for(j=0; j<dataMahasiswa[1].length; j++){
        if(dataMahasiswa[i][1] < minimalberatbadan){
            minbb = dataMahasiswa[i][1];
        }
    }
}
System.out.print("Berat badan terendah dari kelima mahasiswa tersebut yaitu " + minbb);

double totaltinggibadan = 0;
double ratatinggibadan = 0;
for(i=0; i<dataMahasiswa.length; i++){
    for(j=0; j<dataMahasiswa[0].length; j++){
    if(j == 2)
        totaltb += dataMahasiswa[i][j];
    }
}
ratatinggibadan = totaltinggibadan / dataMahasiswa.length;
System.out.printf('\n' + "Total tinggi badan = " + totaltinggibadan);
System.out.print('\n'+ "Rerata tinggi badan dari kelima mahasiswa tersebut yaitu " + ratatinggibadan);

String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int indeks;
int tua=0;
for(i=0; i<dataMahasiswa.length; i++){
    for(j=0; j<dataMahasiswa[0].length; j++){
        if(dataMahasiswa[i][0] > tua){
            tua = dataMahasiswa[i][0];
            indeks = i;
        }
    }
}
System.out.print('\n'+"Umur tertua dari kelima mahasiswa tersebut yaitu " +tua +" bernama " + nama[indeks]);
```

    Berat badan terendah dari kelima mahasiswa tersebut yaitu 58
    Total tinggi badan = 0.0
    Rerata tinggi badan dari kelima mahasiswa tersebut yaitu 0.0
    Umur tertua dari kelima mahasiswa tersebut yaitu 20 bernama Beky


```Java

```

NAMA : BENAYA LASKAR FIRDAUS 

KELAS : 1A-MI 

NIM : 2131710083

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
int [] [] nilai = new int [2] [3];

```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai [0] [0] = 75;  
nilai [0] [1] = 90;
nilai [0] [2] = 88;
nilai [1] [0] = 79;
nilai [1] [1] = 82;
nilai [1] [2] = 67;
```




    67



kode program diatas digunakan untuk mengisi elemen dari setiap array sesuai dengan perintah

3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2

System.out.println(nilai[0] [0] + " " + nilai [0] [1] + " " + nilai [0] [2]);
System.out.println(nilai[1] [0] + " " + nilai [1] [1] + " " + nilai [1] [2]);


```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

1. tidak harus berurutan, bisa sesuai keinginan dan kebutuhan kita.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int i = 0; i < nilai.length;) {
    for (int j =0; j < nilai[0].length; j++){
  System.out.print(nilai [i] [j]);
        System.out.print(" ");
    if (j == 2)
        System.out.println(" ");
}
    i++;
}

```

    75 90 88  
    79 82 67  


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
int[] [] rating = new int [4] [2];

```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna" + i + " untuk restoran " + j + " : ");
        rating [i] [j] = sc.nextInt();
    }
    System.out.println(" ");
}
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna" + i + " untuk restoran " + j + " : ");
        rating [i] [j] = sc.nextInt();
    }
    System.out.println(" ");
}

```

    Masukkan rating pengguna0 untuk restoran 0 : 90
    Masukkan rating pengguna0 untuk restoran 1 : 90
     
    Masukkan rating pengguna1 untuk restoran 0 : 90
    Masukkan rating pengguna1 untuk restoran 1 : 98
     
    Masukkan rating pengguna2 untuk restoran 0 : 89
    Masukkan rating pengguna2 untuk restoran 1 : 90
     
    Masukkan rating pengguna3 untuk restoran 0 : 99
    Masukkan rating pengguna3 untuk restoran 1 : 98
     
    Masukkan rating pengguna0 untuk restoran 0 : 97
    Masukkan rating pengguna0 untuk restoran 1 : 97
     
    Masukkan rating pengguna1 untuk restoran 0 : 89
    Masukkan rating pengguna1 untuk restoran 1 : 90
     
    Masukkan rating pengguna2 untuk restoran 0 : 99
    Masukkan rating pengguna2 untuk restoran 1 : 98
     
    Masukkan rating pengguna3 untuk restoran 0 : 89
    Masukkan rating pengguna3 untuk restoran 1 : 90
     


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r : rtg) {
        System.out.print(r + " ");
    }
    System.out.println("\n");
}

```

    97 97 
    
    89 90 
    
    99 98 
    
    89 90 
    


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!

1. bisa, karena variabel nya sama "i"

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int kolom;
int baris;

System.out.print("Berapa banyak restaurant yang akan direview?");
kolom = input.nextInt();

System.out.print("Berapa banyak orang yang akan me-review tiap restaurant?");
baris = input.nextInt();

int[][] rating = new int[baris][kolom];
for(int i = 0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " +i+ " untuk restoran " +j+ " : ");
        rating[i][j] = input.nextInt();
    }
}

for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Berapa banyak restaurant yang akan direview?2
    Berapa banyak orang yang akan me-review tiap restaurant?2
    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    Masukkan rating pengguna 1 untuk restoran 0 : 5
    Masukkan rating pengguna 1 untuk restoran 1 : 5
    5 5 
    5 5 


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
int [] [] harga = new int [3] [6];
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
        System.out.printf("Masukkan harga[%d] [%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i] [j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0] [0]: 21
    Masukkan harga[0] [1]: 20
    Masukkan harga[0] [2]: 31
    Masukkan harga[0] [3]: 22
    Masukkan harga[0] [4]: 45
    Masukkan harga[0] [5]: 32
    Rata-rata harga bahan ke-0 adalah 28.50
    Masukkan harga[1] [0]: 24
    Masukkan harga[1] [1]: 33
    Masukkan harga[1] [2]: 45
    Masukkan harga[1] [3]: 65
    Masukkan harga[1] [4]: 66
    Masukkan harga[1] [5]: 43
    Rata-rata harga bahan ke-1 adalah 46.00
    Masukkan harga[2] [0]: 23
    Masukkan harga[2] [1]: 12
    Masukkan harga[2] [2]: 34
    Masukkan harga[2] [3]: 45
    Masukkan harga[2] [4]: 23
    Masukkan harga[2] [5]: 34
    Rata-rata harga bahan ke-2 adalah 28.50


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

1. fungsinya yaitu untuk memberikan fungsi perhitungan rata rata air data yang di inputkan.

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

2. berada di dalam for yang pertama agar niai dari setiap looping yang berjalan bisa ter-reset, jika kedua variabel tersebut berada diluar perulangan, maka nilainya akan bertambah terus dan tidak tereset.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
//memasukkan scanner pada program
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
//inisialisasi data awal
double[][] suhu = new double[5][7];
double max = 0;
//proses looping sesuai permintaan dari flowchart
for(int x = 0; x < suhu.length; x++) {
    for(int y = 0; y < suhu[0].length; y++) {
        System.out.print("Masukkan suhu: ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max) max = suhu[x][y]; 
    }
}

System.out.println("Max = " + max);
```

    Masukkan suhu: 12
    Masukkan suhu: 21
    Masukkan suhu: 13
    Masukkan suhu: 14
    Masukkan suhu: 15
    Masukkan suhu: 16
    Masukkan suhu: 17
    Masukkan suhu: 12
    Masukkan suhu: 31
    Masukkan suhu: 23
    Masukkan suhu: 12
    Masukkan suhu: 14
    Masukkan suhu: 24
    Masukkan suhu: 25
    Masukkan suhu: 26
    Masukkan suhu: 27
    Masukkan suhu: 78
    Masukkan suhu: 87
    Masukkan suhu: 23
    Masukkan suhu: 34
    Masukkan suhu: 12
    Masukkan suhu: 32
    Masukkan suhu: 4
    Masukkan suhu: 5
    Masukkan suhu: 4
    Masukkan suhu: 3
    Masukkan suhu: 6
    Masukkan suhu: 7
    Masukkan suhu: 8
    Masukkan suhu: 9
    Masukkan suhu: 7
    Masukkan suhu: 8
    Masukkan suhu: 9
    Masukkan suhu: 1
    Masukkan suhu: 8
    Max = 87.0


Paada program diatas, dirangkai untuk memberikan data suhu tertinggi selama 7 hari berturut-turut, untuk penjelasan lebih detail bisa dilihat pada bagian comment dalam kode program diatas

## 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
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

// mendefinisikan nilai awal untuk data pertama.
int terendah = mahasiswa[0][1]; 
int tertua = mahasiswa[0][0];
int totalTinggi = 0;
int mahasiswaTertua;

for(int i = 0; i < mahasiswa.length; i++)
    for(int j = 0; j < mahasiswa[0].length; j++) {
        // proses system untuk menentukan berat terendah dari nilai yang telah didefinisikan.
        if(j == 1 && terendah > mahasiswa[i][j]) terendah = mahasiswa[i][j]; // Mengubah nilai variabel, bila variabel terendah lebih dari nilai saat ini
        // Proses System dalam penghitungan rata-rata tinggi badan.
        else if(j == 2) totalTinggi += mahasiswa[i][j]; // Menghitung tinggi pada setiap data yang tersimpan
        // Mencari mahasiswa tertua
        else if(j == 0 && tertua < mahasiswa[i][j]) {
            mahasiswaTertua = i; // System bekerja untuk merubah variabel dengan indeks untuk mengambil nama dari data.
            tertua = mahasiswa[i][j]; // System bekerja untuk merubah variable dengan mahasiswa tertua.
        }
    }

// Output dari penugasan yang tertera
System.out.println("Berat badan mahasiswa yang paling terendah adalah " + terendah);
System.out.println("Rata-rata tinggi badan ke-5 mahasiswa tersebut adalah " + ((double) totalTinggi/mahasiswa.length));
System.out.printf("\nUmur Mahasiswa yang Tertua jatuh kepada %s dengan umur %d", namaMahasiswa[mahasiswaTertua], tertua );
```

    Berat badan mahasiswa yang paling terendah adalah 45
    Rata-rata tinggi badan ke-5 mahasiswa tersebut adalah 157.8
    
    Umur Mahasiswa yang Tertua jatuh kepada Beky dengan umur 20




    java.io.PrintStream@7e46efb3



Dalam program tersebut, dirangkai sebuah program yang akan menentukan output sesuai perintah awal tugas, diantaranya seperti berat badan dari mahasiswa yang paling terendah, rata rata tinggi badan mahasiswa, dan umur tertua dari mahasiswa yang sudah dimasukkan ke dalam data. Untuk penjelasan lebih detail dari kode program bisa dilihat pada bagian comment di setiap pernyataan kode yang ada di atas.


```Java

```

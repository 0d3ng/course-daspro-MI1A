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

int[] [] nilai = new int [2][3]; // mengalokasikan memori untuk 6 array 
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai [0][0] = 75; // nilai pada array
nilai [0][1] = 90;
nilai [0][2] = 88;
nilai [1][0] = 79;
nilai [1][1] = 82;
nilai [1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 3

System.out.println(nilai[0][0] + " " + nilai [0][1] + " " + nilai [0] [2]); // menampilkan nilai dari [0][0], [0][1], [0][2]
System.out.println(nilai[1][0] + " " + nilai [1][1] + " " + nilai [1] [2]); // menampilkan nilai dari [1][0], [1][1], [1][2]
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1

ya, pengisian array dimulai dari 0 dan dilakukan boleh dengan berurutan maupun tidak, atau boleh secara random
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2

String[][]nilai = {
            {"75","90","88"}, // deklarasi
            {"79","82","67"},
        };
        for (int i = 0; i < nilai.length ; i++){        // isi array perulangan
            for (int j = 0; j < nilai[i].length ; j++){
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println();
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
Scanner sc = new Scanner(System.in); // membuat scanner
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2

int[][] rating = new int[4][2]; .. // array berisi 4 x 2
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3

for(int i = 0; i < rating.length; i++) { // kode perulangan
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print(" Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

     Masukkan rating pengguna 0 untuk restoran 0 : 9
     Masukkan rating pengguna 0 untuk restoran 1 : 7
    
     Masukkan rating pengguna 1 untuk restoran 0 : 8
     Masukkan rating pengguna 1 untuk restoran 1 : 7
    
     Masukkan rating pengguna 2 untuk restoran 0 : 9
     Masukkan rating pengguna 2 untuk restoran 1 : 6
    
     Masukkan rating pengguna 3 untuk restoran 0 : 8
     Masukkan rating pengguna 3 untuk restoran 1 : 6
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4

// menampilkan semua isi array
for (int[] rtg : rating){  
    for (int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    9 7 
    8 7 
    9 6 
    8 6 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1

for(int j = 0; j < rating.length; j++) {
    for (int i = 0; i < rating[0].length; i++) {
        System.out.print(" Masukkan rating pengguna " + j + " untuk restoran " + i + " : ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println("");
}
// sama saja, karena hanya huruf saja yang berganti nama tidak ada perubahan 
```

     Masukkan rating pengguna 0 untuk restoran 0 : 89
     Masukkan rating pengguna 0 untuk restoran 1 : 78
    
     Masukkan rating pengguna 1 untuk restoran 0 : 67
     Masukkan rating pengguna 1 untuk restoran 1 : 46
    
     Masukkan rating pengguna 2 untuk restoran 0 : 67
     Masukkan rating pengguna 2 untuk restoran 1 : 89
    


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2

import java.util.Scanner; 
Scanner sc = new Scanner(System.in);  // membuat scanner

System.out.print("Masukkan panjang baris : "); // kode program untuk menginput baris
int x = sc.nextInt();
System.out.print("Masukkan panjang kolom : "); // kode program untuk menginput kolom
int y = sc.nextInt();
int[][] rating = new int[x][y];  // untuk menangkap si x dan y

for (int i=0; i<rating.length; i++){ // kode perulangan
    for (int j=0; j<rating[0].length; j++){ 
        System.out.print("Masukkan rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println(""); // output
}
```

    Masukkan panjang baris : 2
    Masukkan panjang kolom : 3
    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    Masukkan rating pengguna 0 untuk restoran 2 : 5
    
    Masukkan rating pengguna 1 untuk restoran 0 : 6
    Masukkan rating pengguna 1 untuk restoran 1 : 6
    Masukkan rating pengguna 1 untuk restoran 2 : 7
    


###### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1

import java.util.Scanner;
Scanner sc = new Scanner(System.in); // membuat scanner
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2

int[][] harga = new int [3][6]; //membuat variabel
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3

for(int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga [i][j];
        
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 100
    Masukkan harga[0][1]: 200
    Masukkan harga[0][2]: 300
    Masukkan harga[0][3]: 100
    Masukkan harga[0][4]: 100
    Masukkan harga[0][5]: 200
    Rata-rata harga bahan ke-0 adalah 166.67
    Masukkan harga[1][0]: 300
    Masukkan harga[1][1]: 400
    Masukkan harga[1][2]: 340
    Masukkan harga[1][3]: 400
    Masukkan harga[1][4]: 200
    Masukkan harga[1][5]: 450
    Rata-rata harga bahan ke-1 adalah 348.33
    Masukkan harga[2][0]: 500
    Masukkan harga[2][1]: 2000
    Masukkan harga[2][2]: 300
    Masukkan harga[2][3]: 500
    Masukkan harga[2][4]: 490
    Masukkan harga[2][5]: 400
    Rata-rata harga bahan ke-2 adalah 698.33


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1

fungsi dari rata = total / harga[0].length! adalah untuk menghitung rata rata 
dari mulai harga pertama sampai ke enam dengan menjumlah semuanya lalu di bagi 
dengan banyaknya harga
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
kareana total dan rata dimulai dari 0 semua dan jika diletakan di luar perulangan for
maka yang terjadi adalah semua input yang dimasukkan akan menjadi 0 kembali
```


```Java
for(int i = 0; i < harga.length; i++){ //kode perulangan
    for (int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga [i][j];
    } // batas perulangan
    total = 0; // diluar perulangan
    rata = 0;
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}

```

    Masukkan harga[0][0]: 12
    Masukkan harga[0][1]: 23
    Masukkan harga[0][2]: 34
    Masukkan harga[0][3]: 45
    Masukkan harga[0][4]: 56
    Masukkan harga[0][5]: 76
    Rata-rata harga bahan ke-0 adalah 0.00
    Masukkan harga[1][0]: 54
    Masukkan harga[1][1]: 34
    Masukkan harga[1][2]: 23
    Masukkan harga[1][3]: 53
    Masukkan harga[1][4]: 45
    Masukkan harga[1][5]: 23
    Rata-rata harga bahan ke-1 adalah 0.00
    Masukkan harga[2][0]: 53
    Masukkan harga[2][1]: 43
    Masukkan harga[2][2]: 14
    Masukkan harga[2][3]: 63
    Masukkan harga[2][4]: 45
    Masukkan harga[2][5]: 34
    Rata-rata harga bahan ke-2 adalah 0.00


## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1

import java.util.Scanner;
Scanner sc = new Scanner(System.in); // membuat scanner
// membuat variabel
double[][] suhu = new double [5][7];
int x, y;
double max=0;

for (x=0; x<suhu.length; x++){ // kode perulangan
    for (y=0; y<suhu[0].length; y++){
        System.out.print("Masukkan suhu kota " +(x+1)+ " hari ke "+(y+1)+ " : ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y]>max){ // jika angka ada yang lebih besar maka akan disimpan
            max = suhu[x][y];
        }
    }System.out.println();
}
System.out.print("Suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah "+max);
```

    Masukkan suhu kota 1 hari ke 1 : 20
    Masukkan suhu kota 1 hari ke 2 : 20
    Masukkan suhu kota 1 hari ke 3 : 20
    Masukkan suhu kota 1 hari ke 4 : 23
    Masukkan suhu kota 1 hari ke 5 : 22
    Masukkan suhu kota 1 hari ke 6 : 24
    Masukkan suhu kota 1 hari ke 7 : 25
    
    Masukkan suhu kota 2 hari ke 1 : 30
    Masukkan suhu kota 2 hari ke 2 : 31
    Masukkan suhu kota 2 hari ke 3 : 33
    Masukkan suhu kota 2 hari ke 4 : 31
    Masukkan suhu kota 2 hari ke 5 : 32
    Masukkan suhu kota 2 hari ke 6 : 34
    Masukkan suhu kota 2 hari ke 7 : 33
    
    Masukkan suhu kota 3 hari ke 1 : 15
    Masukkan suhu kota 3 hari ke 2 : 16
    Masukkan suhu kota 3 hari ke 3 : 17
    Masukkan suhu kota 3 hari ke 4 : 17
    Masukkan suhu kota 3 hari ke 5 : 16
    Masukkan suhu kota 3 hari ke 6 : 17
    Masukkan suhu kota 3 hari ke 7 : 17
    
    Masukkan suhu kota 4 hari ke 1 : 22
    Masukkan suhu kota 4 hari ke 2 : 27
    Masukkan suhu kota 4 hari ke 3 : 24
    Masukkan suhu kota 4 hari ke 4 : 25
    Masukkan suhu kota 4 hari ke 5 : 26
    Masukkan suhu kota 4 hari ke 6 : 27
    Masukkan suhu kota 4 hari ke 7 : 29
    
    Masukkan suhu kota 5 hari ke 1 : 37
    Masukkan suhu kota 5 hari ke 2 : 36
    Masukkan suhu kota 5 hari ke 3 : 38
    Masukkan suhu kota 5 hari ke 4 : 39
    Masukkan suhu kota 5 hari ke 5 : 38
    Masukkan suhu kota 5 hari ke 6 : 39
    Masukkan suhu kota 5 hari ke 7 : 38
    
    Suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah 39.0

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2

// array dari penduduk
int penduduk[][] = {{19,51,155}, 
                   {18,55,163},
                   {18,45,153},
                   {20,46,158},
                   {19,58,160}};
  // variabel                 
int beratRendah = 2000; 
int umurT = 0;
double rerataTinggi;
int totTinggi;
    
    for(int i = 0; i<penduduk.length; i++){ //kode perulangan
        for(int j = 0; j<penduduk[0].length; j++){
           
            if(penduduk[i][1]<beratRendah){ // jika ada yang lebih rendah maka akan disimpan
                beratRendah = penduduk[i][1];
            }
            if(penduduk[i][0]>umurT){  // jika ada yang lebih besar maka akan disimpan
                umurT = penduduk[i][0];
            }
            
        }
        totTinggi += penduduk[i][2]; // fungsi dari total tinggi
        
    }
    rerataTinggi = totTinggi/penduduk.length; // penghitungan rata rata
    System.out.print("Berat Badan Terendah   :  "+beratRendah); // menampilkan dari beratRendah
    System.out.println("\nRata-rata Tinggi Badan :  "+rerataTinggi); // menampilkan dari rerataTinggi
    System.out.print( "\nUmur Tertua            :  "+umurT); // menampilkan dari UmurT
```

    Berat Badan Terendah   :  45
    Rata-rata Tinggi Badan :  157.0
    
    Umur Tertua            :  20


```Java

```

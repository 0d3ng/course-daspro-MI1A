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
System.out.printf("%d %d %d",nilai[0][0],nilai[0][1],nilai[0][2]);
System.out.printf("%d %d %d",nilai[1][0],nilai[1][1],nilai[1][2]);
```

    75 90 8879 82 67




    java.io.PrintStream@a737ed2



#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
Bisa karena tidak error saat saya coba

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i<nilai.length; i++){
    for(int j = 0; j<nilai[0].length; j++){
    System.out.print(" "+nilai[i][j]);
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

##### // Tuliskan kode program Percobaan 2 Langkah 3
for (int j = 0; j<rating.length; j++){
    for(int i = 0; i<rating[0].length; i++){
        System.out.print("Masukkan rating pengguna" + j + "untuk restoran " + i + " : ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println("");
}

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

    2 3 
    4 5 
    6 2 
    3 4 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi i? Jelaskan alasannya!

// Tuliskan jawaban nomor 1
bisa karena itu hanya variable doang

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan Baris : ");
int baris = sc.nextInt();
System.out.print("Masukkan Kolom : ");
int kolom = sc.nextInt();
int kolbar[][] = new int[baris][kolom];

for (int j = 0; j<kolbar.length; j++){
    for(int i = 0; i<kolbar[0].length; i++){
        System.out.print("Masukkan rating pengguna" + j + "untuk restoran " + i + " : ");
        kolbar[j][i] = sc.nextInt();
    }
    System.out.println("");
}
for (int[] rtg : kolbar) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}


```

    Masukkan Baris : 2
    Masukkan Kolom : 3
    Masukkan rating pengguna0untuk restoran 0 : 3
    Masukkan rating pengguna0untuk restoran 1 : 4
    Masukkan rating pengguna0untuk restoran 2 : 5
    
    Masukkan rating pengguna1untuk restoran 0 : 2
    Masukkan rating pengguna1untuk restoran 1 : 3
    Masukkan rating pengguna1untuk restoran 2 : 4
    
    3 4 5 
    2 3 4 


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
for(int i = 0; i< harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d] : ",i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0] : 40000
    Masukkan harga[0][1] : 60000
    Masukkan harga[0][2] : 50000
    Masukkan harga[0][3] : 80000
    Masukkan harga[0][4] : 40000
    Masukkan harga[0][5] : 50000
    Rata-rata harga bahan ke-0 adalah 53333.33
    Masukkan harga[1][0] : 60000
    Masukkan harga[1][1] : 70000
    Masukkan harga[1][2] : 80000
    Masukkan harga[1][3] : 70000
    Masukkan harga[1][4] : 50000
    Masukkan harga[1][5] : 40000
    Rata-rata harga bahan ke-1 adalah 61666.67
    Masukkan harga[2][0] : 70000
    Masukkan harga[2][1] : 80000
    Masukkan harga[2][2] : 67000
    Masukkan harga[2][3] : 56000
    Masukkan harga[2][4] : 48000
    Masukkan harga[2][5] : 35000
    Rata-rata harga bahan ke-2 adalah 59333.33


##### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
melakukan perhitungan rata rata dengan membagikan hasil total dengan harga[0].length yang nilai nya berarti 6
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
karena jika diluar perulangan semisal kita sudah menginputkan di kolom pertama dan akan melanjutkan ke kolom yang ke 2 total dan rata nya tidak tereset
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int suhu[][] = new int[5][7];
double max = 0;
    
for (int j = 0; j<suhu.length; j++){
    for(int i = 0; i<suhu[0].length; i++){
        System.out.print("Masukkan suhu kota "  + (j + 1)+ " hari ke " + (i + 1)+ " : ");
        suhu[j][i] = sc.nextInt();
         if(suhu[j][i]>max){
            max = suhu[j][i];
         }
    }
    System.out.println("");
}

  System.out.print("Max suhu tertinggi adalah = "+max);
```

    Masukkan suhu kota 1 hari ke 1 : 23
    Masukkan suhu kota 1 hari ke 2 : 12
    Masukkan suhu kota 1 hari ke 3 : 12
    Masukkan suhu kota 1 hari ke 4 : 52
    Masukkan suhu kota 1 hari ke 5 : 61
    Masukkan suhu kota 1 hari ke 6 : 4
    Masukkan suhu kota 1 hari ke 7 : 34
    
    Masukkan suhu kota 2 hari ke 1 : 34
    Masukkan suhu kota 2 hari ke 2 : 53
    Masukkan suhu kota 2 hari ke 3 : 43
    Masukkan suhu kota 2 hari ke 4 : 21
    Masukkan suhu kota 2 hari ke 5 : 32
    Masukkan suhu kota 2 hari ke 6 : 52
    Masukkan suhu kota 2 hari ke 7 : 16
    
    Masukkan suhu kota 3 hari ke 1 : 32
    Masukkan suhu kota 3 hari ke 2 : 42
    Masukkan suhu kota 3 hari ke 3 : 51
    Masukkan suhu kota 3 hari ke 4 : 32
    Masukkan suhu kota 3 hari ke 5 : 52
    Masukkan suhu kota 3 hari ke 6 : 64
    Masukkan suhu kota 3 hari ke 7 : 75
    
    Masukkan suhu kota 4 hari ke 1 : 34
    Masukkan suhu kota 4 hari ke 2 : 53
    Masukkan suhu kota 4 hari ke 3 : 62
    Masukkan suhu kota 4 hari ke 4 : 43
    Masukkan suhu kota 4 hari ke 5 : 32
    Masukkan suhu kota 4 hari ke 6 : 41
    Masukkan suhu kota 4 hari ke 7 : 32
    
    Masukkan suhu kota 5 hari ke 1 : 53
    Masukkan suhu kota 5 hari ke 2 : 63
    Masukkan suhu kota 5 hari ke 3 : 23
    Masukkan suhu kota 5 hari ke 4 : 31
    Masukkan suhu kota 5 hari ke 5 : 35
    Masukkan suhu kota 5 hari ke 6 : 36
    Masukkan suhu kota 5 hari ke 7 : 23
    
    Max suhu tertinggi adalah = 75.0

### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int keseluruhan[][] = {{19,51,155},
                     {18,55,163},
                     {18,45,153},
                     {20,46,158},
                     {19,58,160}};
int beratRendah = 2000;
int umurTua = 0;
double rataTinggi;
int totalTinggi;

for(int i = 0;i<keseluruhan.length; i++){
    for(int j = 0;j<keseluruhan[0].length; j++){
        
        if(keseluruhan[i][1]<beratRendah){
            beratRendah = keseluruhan[i][1];
        }
        if(keseluruhan[i][0]>umurTua){
            umurTua = keseluruhan[i][0];
        }
        
    }
    totalTinggi += keseluruhan[i][2];
    
}
rataTinggi = totalTinggi/keseluruhan.length;
System.out.print("Berat badan terendah adalah : "+beratRendah);
System.out.println("\nRata-rata tinggi badan adalah : "+rataTinggi);
System.out.print("Umur tertua adalah : "+umurTua);
```

    Berat badan terendah adalah : 45
    Rata-rata tinggi badan adalah : 157.0
    Umur tertua adalah : 20


```Java

```

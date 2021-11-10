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
int [][] nilai = new int [2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai [0][0] = 75;
nilai [0][1] = 90;
nilai [0][2] = 88;
nilai [1][0] = 79;
nilai [1][1] = 82;
nilai [1][2] = 67;  
```

3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai [0][1] + " " + nilai [0][2]);
System.out.println(nilai [1][0] + " " +nilai [1][1] + " " + nilai [1][2]);
```

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
Tidak, pengisian elemen array bisa dilakukan sesuka hati kita
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int i=0; i<nilai.length; i++){
    for (int j=0;j<nilai[0].length; j++){
        System.out.printf("%d ", nilai [i][j]);
    }
    System.out.println();
}
```

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in)
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int [][] rating = new int [4][2]
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i=0; i<rating.length; i++){
    for (int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j +":");
        rating [i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0:100
    Masukkan rating pengguna 0 untuk restoran 1:100
    
    Masukkan rating pengguna 1 untuk restoran 0:20
    Masukkan rating pengguna 1 untuk restoran 1:90
    
    Masukkan rating pengguna 2 untuk restoran 0:40
    Masukkan rating pengguna 2 untuk restoran 1:50
    
    Masukkan rating pengguna 3 untuk restoran 0:90
    Masukkan rating pengguna 3 untuk restoran 1:100
    


## 4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r+" ");
    }
    System.out.println("");
}
```

    100 100 
    20 90 
    40 50 
    90 100 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
bisa, i dan j adalah nama variabel. Jadi jika posisi antara i dan j ditukar, program akan tetap berjalan
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2

```

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
int [][] harga = new int [3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i<harga.length; i++){
    total = 0;
    rata = 0;
    for (int j = 0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ", i, j);
        harga [i][j] = sc.nextInt();
        total += harga [i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0][0]: 1000
    Masukkan harga [0][1]: 1000
    Masukkan harga [0][2]: 1000
    Masukkan harga [0][3]: 1000
    Masukkan harga [0][4]: 1000
    Masukkan harga [0][5]: 1000
    Rata-rata harga bahan ke-0 adalah 1000.00
    Masukkan harga [1][0]: 20000
    Masukkan harga [1][1]: 23
    Masukkan harga [1][2]: 50000
    Masukkan harga [1][3]: 14000
    Masukkan harga [1][4]: 14000
    Masukkan harga [1][5]: 14000
    Rata-rata harga bahan ke-1 adalah 18670.50
    Masukkan harga [2][0]: 20000
    Masukkan harga [2][1]: 30000
    Masukkan harga [2][2]: 23000
    Masukkan harga [2][3]: 23000
    Masukkan harga [2][4]: 92000
    Masukkan harga [2][5]: 10000
    Rata-rata harga bahan ke-2 adalah 33000.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk mencari nilai rata rata dengan menghitung total dibagi dengan panjang array baris
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

```Java
// Tuliskan jawaban nomor 2
Agar perhitungan 
berikutnya tetap dimulai dengan 0. Jika inisialisasi variabel diletakkan diluar perulangan, maka ketika menghitung rata rata dan total pada bahan kedua dan ketiga, variabel sudah terisi nilai bahan yang pertama
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double [5][7];
int x,y;
double max=0;

for(x=0; x<suhu.length; x++){
    for(y=0; y<suhu[0].length; y++){
        System.out.print("Masukkan suhu kota " +(x+1) +" hari ke " +(y+1) + " : ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y]>max){
            max = suhu[x][y];
        }
    }
    System.out.println();
}
System.out.print("Suhu tertinggi dari 5 kota di Jepang selama 7 hari berturut-turut adalah "+ max)
```
```Java
// Penjelasan
Pertama memasukkan library scanner untuk inputan. Kedua menambahkan array suhu dengan tipe double. Baris 5 dan kolom 7. setelah itu menambahkan int x, y dan variabel max dengan isian 0. Selanjutnya membuat perulangan outer dan inner(baris dan kolom). Kemudian menampilkan "Masukkan suhu kota " +(x+1) +" hari ke " +(y+1) + " : ". fungsi ditambah 1 agar output dimulai dari angka 1. kemudian inputan dimasukkan ke dalam aray suhu. sintaks selanjutnya, jika array suhu lebih dari max(nilai awal 0), maka inputan akan tersimpan kedalam variabel max. Terakhir menampilkan variabel max
```


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
    for(int j = 0; j < mahasiswa[1].length; j++) {
        
        if(j == 1 && terendah > mahasiswa[i][j]) terendah = mahasiswa[i][j]; 
 
        else if(j == 2) totalTinggi += mahasiswa[i][j]; 

        else if(j == 0 && tertua < mahasiswa[i][j]) {
            mahasiswaTertua = i; 
            tertua = mahasiswa[i][j]; 
        }
    }


System.out.println("Berat badan mahasiswa yang paling terendah adalah " + terendah);
System.out.println("Rata-rata tinggi badan ke-5 mahasiswa tersebut adalah " + ((double) totalTinggi/mahasiswa.length));
System.out.printf("\nUmur Mahasiswa yang Tertua jatuh kepada %s dengan umur %d", namaMahasiswa[mahasiswaTertua], tertua );
```
```Java
// Penjelasan
Pertama inisialsiasi array mahasiswa tipe integer dan juga mengisi data ke dalam array tsb. kemudian membuat variabel string namaMahasiswa beserta pengisian variabel. Selanjutnya membuat array dengan tipe data int sejumlah 2 (terendah dengan panjang baris 1, kolom 2 dan tertua dengan panjang baris 1 dan kolom 1). Selanjutnya membuat variabel totalTinggi tipe int dengan nilai 0 dan variabel mahasiswaTertua dengan tipe data int. Kemudian membuat outerloop untuk baris dan inerloop untuk kolom berindeks 1. Jika elemen lebih kecil dari nilai variabel terendah. maka nilai akan tersimpan di variabel terendah. Jika pemilihan pertama false maka akan tereksekusi ke tinggi mahahsiswa. jika memenuhi akan menabah nilai totalTinggi. Terakhir untuk mencari data mahasiswa tertua jika kurang dari nilai array mahasiswa[i][j] maka nilai mahasiswaTertua akan disimpan di variabel i. dan array mahasiswa akan tersimpan di variabel tertua. Terakhir menampilkan output variabel terendah, menampilkan rata rata dengan proses totalTinggi/mahasiswa.length dan mahasiswa tertua dengan output umur dan nama
```
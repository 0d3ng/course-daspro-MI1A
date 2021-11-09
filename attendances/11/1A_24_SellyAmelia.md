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

Penjelasan : Instansiasi array nilai bertipe int dengan jumlah baris 2 dan jumlah kolom 3

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



Penjelasan : Untuk pengisian elemen nilai array

3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


Penjelasan : Untuk menampilkan isi elemen dari array 

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

Jika menggunakan looping harus dimulai dari index 0 sampai index n, tetapi jika input langsung dari keyboard di source code tidak harus urut (bisa langsung). Karena tetap bisa mengakses index elemen yang akan diisi.

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

Penjelasan : Library Scanner

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];
```

Penjelasan : Instansiasi array rating bertipe int dengan jumlah baris 4 dan jumlah kolom 2

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

    Masukkan rating pengguna 0 untuk restoran 0 : 9
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 9
    Masukkan rating pengguna 2 untuk restoran 1 : 9
    
    Masukkan rating pengguna 3 untuk restoran 0 : 8
    Masukkan rating pengguna 3 untuk restoran 1 : 
    8
    


Penjelasan : 
1. for (int i=0; i<rating.length; i++) = outer loop 
2. for (int j=0; j<rating[0].length; j++) = inner loop
3. System.out.print = menampilkan tulisan dalam array beserta indeks i dan j
4. rating[i][j] = sc.nextInt(); = memasukkan inputan dalam array rating

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

    9 9 
    8 8 
    9 9 
    8 8 


Penjelasan : 
1. for (int j=0; j<rating.length; j++) = outer loop
2. for (int i=0; i<rating[0].length; i++) = inner loop
3. System.out.print(r + " "); = menampilkan isi elemen array rating
4. System.out.println(""); = berganti baris setiap inner loop selesai dieksekusi

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
for (int j = 0; j < rating.length; j++) {
    for (int i = 0; i < rating[0].length; i++) {
        System.out.print("Masukkan rating pengguna " + j + " untuk restoran " + i + " : ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 8
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 9
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 9
    
    Masukkan rating pengguna 3 untuk restoran 0 : 8
    Masukkan rating pengguna 3 untuk restoran 1 : 9
    


Alasan : 
Tetap bisa berjalan Karena i dan j hanya sebuah variabel

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

    Baris : 2
    Kolom : 2
    Rating pengguna 0 untuk restoran 0 : 8
    Rating pengguna 0 untuk restoran 1 : 9
    
    Rating pengguna 1 untuk restoran 0 : 9
    Rating pengguna 1 untuk restoran 1 : 8
    


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

Penjelasan : Library Scanner

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int[][] harga = new int[3][6];
double total, rata;
```

Penjelasan : 
1. int[][] harga = new int[3][6]; = instansiasi array harga bertipe interger dengan jumlah baris 3 dan jumlah kolom 6
2. double total, rata; = deklarasi variabel 

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

    Masukkan harga[0][0]: 9000
    Masukkan harga[0][1]: 8000
    Masukkan harga[0][2]: 7000
    Masukkan harga[0][3]: 9000
    Masukkan harga[0][4]: 8000
    Masukkan harga[0][5]: 9000
    Rata-rata harga bahan ke-0 adalah 8333.33
    Masukkan harga[1][0]: 8700
    Masukkan harga[1][1]: 8200
    Masukkan harga[1][2]: 9100
    Masukkan harga[1][3]: 9300
    Masukkan harga[1][4]: 7500
    Masukkan harga[1][5]: 8500
    Rata-rata harga bahan ke-1 adalah 8550.00
    Masukkan harga[2][0]: 6900
    Masukkan harga[2][1]: 2900
    Masukkan harga[2][2]: 3400
    Masukkan harga[2][3]: 7100
    Masukkan harga[2][4]: 8200
    Masukkan harga[2][5]: 4600
    Rata-rata harga bahan ke-2 adalah 5516.67


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

Fungsi tersebut adalah untuk menghitung rata-rata dengan cara total dibagikan dengan harga yang sudah dihitung dengan angka indeks terakhir pada i atau j.

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

    Masukkan harga[0][0]: 7000
    Masukkan harga[0][1]: 9100
    Masukkan harga[0][2]: 5600
    Masukkan harga[0][3]: 9200
    Masukkan harga[0][4]: 3200
    Masukkan harga[0][5]: 1900
    Rata-rata harga bahan ke-0 adalah 6000.00
    Masukkan harga[1][0]: 4000
    Masukkan harga[1][1]: 7000
    Masukkan harga[1][2]: 3500
    Masukkan harga[1][3]: 1900
    Masukkan harga[1][4]: 3990
    Masukkan harga[1][5]: 4790
    Rata-rata harga bahan ke-1 adalah 10196.67
    Masukkan harga[2][0]: 3840
    Masukkan harga[2][1]: 7580
    Masukkan harga[2][2]: 7483
    Masukkan harga[2][3]: 7832
    Masukkan harga[2][4]: 8394
    Masukkan harga[2][5]: 7382
    Rata-rata harga bahan ke-2 adalah 17281.83


Penjelasan :
Insialisasi variabel total = 0 dan rata = 0 berada di dalam perulangan for yang pertama karena rata-rata akan dihitung setiap nomor. dan jika variabel tersebut diletakkan di luar perulangan for perhitungan rata-rata tidak sesuai karena perhitungan diatasnya akan ikut terhitung.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double [5][7];
int x, y;
double max=0; 

for(x=0; x < suhu.length; x++){ 
    for(y=0; y<suhu[0].length; y++){ 
        System.out.print("Suhu " +(x+1) +" hari ke " +(y+1) + " : ");
        suhu[x][y] = sc.nextDouble(); 
        if(suhu[x][y]>max){ 
            max = suhu[x][y]; 
        }
    }
    System.out.println();
}
System.out.print("Suhu Max : "+ max); 
```

    Suhu 1 hari ke 1 : 21
    Suhu 1 hari ke 2 : 22
    Suhu 1 hari ke 3 : 23
    Suhu 1 hari ke 4 : 24
    Suhu 1 hari ke 5 : 25
    Suhu 1 hari ke 6 : 26
    Suhu 1 hari ke 7 : 27
    
    Suhu 2 hari ke 1 : 29
    Suhu 2 hari ke 2 : 30
    Suhu 2 hari ke 3 : 28
    Suhu 2 hari ke 4 : 26
    Suhu 2 hari ke 5 : 25
    Suhu 2 hari ke 6 : 21
    Suhu 2 hari ke 7 : 23
    
    Suhu 3 hari ke 1 : 25
    Suhu 3 hari ke 2 : 24
    Suhu 3 hari ke 3 : 27
    Suhu 3 hari ke 4 : 30
    Suhu 3 hari ke 5 : 21
    Suhu 3 hari ke 6 : 26
    Suhu 3 hari ke 7 : 22
    
    Suhu 4 hari ke 1 : 20
    Suhu 4 hari ke 2 : 21
    Suhu 4 hari ke 3 : 23
    Suhu 4 hari ke 4 : 25
    Suhu 4 hari ke 5 : 28
    Suhu 4 hari ke 6 : 29
    Suhu 4 hari ke 7 : 24
    
    Suhu 5 hari ke 1 : 29
    Suhu 5 hari ke 2 : 31
    Suhu 5 hari ke 3 : 28
    Suhu 5 hari ke 4 : 27
    Suhu 5 hari ke 5 : 26
    Suhu 5 hari ke 6 : 22
    Suhu 5 hari ke 7 : 26
    
    Suhu Max : 31.0

Penjelasan : 
1. import java.util.Scanner; Scanner sc = new Scanner(System.in); = Library Scanner
2. double[][] suhu = new double [5][7]; = inisialisasi array suhu dengan tipe data double 5 baris dan 7 kolom
3. int x,y; = tipe data int dengan variabel x dan y
4. double max=0; = deklarasi variabel
5. for(x=0; x<suhu.length; x++) = outer loop.
6. for(y=0; y<suhu[0].length; y++) = inner loop
7. System.out.print = untuk menampilkan teks ke layar monitor
8. suhu[x][y] = sc.nextDouble(); = inputan dimasukkan ke dalam array suhu
9. if(suhu[x][y]>max){ max = suhu[x][y]; = inputan akan dimasukkan ke dalam variabel max, jika nilai inputan lebih besar dari nilai variabel max
10. System.out.print("Suhu tertinggi dari 5 kota di Jepang selama 7 hari berturut-turut adalah "+ max); = akan menampilkan inputan suhu maksimal

## 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
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
System.out.print("Berat badan terendah dari kelima mahasiswa tersebut yaitu " + minbb);

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
System.out.print('\n'+ "Rerata tinggi badan dari kelima mahasiswa tersebut yaitu " + ratatb);

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

    Berat badan terendah dari kelima mahasiswa tersebut yaitu 45
    Total tinggi badan = 789.0
    Rerata tinggi badan dari kelima mahasiswa tersebut yaitu 157.8
    Umur tertua dari kelima mahasiswa tersebut yaitu 20 bernama Beky

Penjelasan : 
1. for(i=0; i<dataMhs.length; i++){ = outer loop
2. for(j=0; j<dataMhs[1].length; j++){ = inner loop
3. totaltb += dataMhs[i][j]; = menjumlahkan data dalam kolom 2
4. String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"}; = inisialisasi nama dalam array
5. tua = dataMhs[i][0]; = jika suatu elemen lebih besar dari variabel tua maka elemen tersebut dimasukkan ke dalam variabel tua

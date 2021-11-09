### Nama: Muhammad Helmi Permana Agung
### Kelas/No: MI-1A/20
### NIM: 2131710140

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
int[][] nilai = new int[2][3]; //inisialisasi variabel array nilai
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
nilai[1][2] = 67; //mengisi array nilai
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0]+" "+nilai[0][1]+" "+nilai[0][2]);
System.out.println(nilai[1][0]+" "+nilai[1][1]+" "+nilai[1][2]); //membuat output dari isi array
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1<br>
tidak harus, karena pengisian elemen array dilakukan dengan pengalamatan indeks array, sehingga dapat diisi dahulu indeks yang dikehendaki. Akan tetapi, pada umumnya, array diisi secara runtut untuk memudahkan pengisian data dengan looping

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int a=0;a<nilai.length;){
    for(int b=0;b<nilai[0].length;b++){
        System.out.print(nilai[a][b]);
        System.out.print(" ");
        if(b == 2){
            System.out.println();
        }
    }
    a++;
}
//membuat for untuk membuat output dari array secara berurutan
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
Scanner sc = new Scanner(System.in); //mengimpor scanner
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2]; //inisialisasi variabel array rating
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for(int i = 0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " +i+ " untuk restoran " +j+ " : ");
        rating[i][j] = sc.nextInt();
    }
} //mengisi array rating secara berurut 
```

    Masukkan rating pengguna 0 untuk restoran 0 : 8
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 10
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 8
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 6


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
} //menguraikan array untuk dioutput langsung
```

    8 9 
    8 10 
    8 8 
    7 6 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1<br>
bisa, jika semuanya yang i ditukar dengan j, maka program berjalan dengan baik. tapi jika hanya sebagian kemungkinan terjadi error atau output tidak sesuai yang diinginkan

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int kolom;
int baris;
//untuk menginisialisasi variabel untuk berapa banyak kolom dan baris yang dibutuhkan
System.out.print("Berapa restaurant yang akan direview?");
kolom = input.nextInt();
//menginput banyak kolom
System.out.print("Berapa orang yang akan mereview tiap restaurant?");
baris = input.nextInt();
//menginput banyak baris
int[][] rating = new int[baris][kolom]; //inisialisasi variabel array rating dengan baris dan kolom berdasarkan variabel baris dan kolom
for(int i = 0; i<rating.length; i++){
    for(int j=0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " +i+ " untuk restoran " +j+ " : ");
        rating[i][j] = input.nextInt();
    }
}
//menginput nilai pada array rating secara berurutan
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
//menguraikan array rating menjadi lebih sederhana dan mengoutput nya
```

    Berapa restaurant yang akan direview?3
    Berapa orang yang akan mereview tiap restaurant?2
    Masukkan rating pengguna 0 untuk restoran 0 : 9
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    Masukkan rating pengguna 0 untuk restoran 2 : 8
    Masukkan rating pengguna 1 untuk restoran 0 : 7
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    Masukkan rating pengguna 1 untuk restoran 2 : 5
    9 6 8 
    7 8 5 


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in); //import scanner
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int[][] harga = new int[3][6];
double total, rata;
//inisialisasi variabel array harga dan variabel total
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i<harga.length; i++){
    total=0;
    rata=0;
    for(int j=0; j<harga[0].length;j++){
        System.out.printf("Masukkan harga[%d][%d]: ",i,j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    //menginput nilai ke array secara berurutan
    rata = total/harga[0].length; //menghitung rata rata pada kolom
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata); //output rata rata
}
```

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 2000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 5000
    Masukkan harga[0][5]: 60
    Rata-rata harga bahan ke-0 adalah 2510.00
    Masukkan harga[1][0]: 2000
    Masukkan harga[1][1]: 1000
    Masukkan harga[1][2]: 3000
    Masukkan harga[1][3]: 2500
    Masukkan harga[1][4]: 1500
    Masukkan harga[1][5]: 3500
    Rata-rata harga bahan ke-1 adalah 2250.00
    Masukkan harga[2][0]: 4500
    Masukkan harga[2][1]: 5000
    Masukkan harga[2][2]: 6000
    Masukkan harga[2][3]: 6500
    Masukkan harga[2][4]: 5500
    Masukkan harga[2][5]: 4800
    Rata-rata harga bahan ke-2 adalah 5383.33


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1<br>
menghitung rata rata dari total, dengan membagi total dengan panjang indeks kedua dari array harga

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2<br>
jika diluar perulangan, maka inisialisasi variabel hanya sekali, sehingga akan berpengaruh di perulangan kedua dan nilai operasi rata dan total

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double suhu[][] = new double[5][7];
int x, y;
double max = 0; //inisialisasis variabel array suhu, x, y, dan variabel max


for(x = 0; x < suhu.length; x++){
    for(y = 0; y< suhu[0].length; y++){
        System.out.print("Masukkan suhu : ");
        suhu [x][y] = sc.nextDouble(); //menginput nilai pada array secara berurutan
    
    if(suhu[x][y] > max)
        max = suhu[x][y]; //kondisi jika input lebih besar dari nilai variabel max, maka  nilai variabel max akan digantikan input tersebut
    
    
}
} 

System.out.print("Hasil max suhu adalah: " + max); //output max
```

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

String[] mahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

double umurMax = 0;
String nama;
double totalTinggi;
double beratMin = 10000;
double[][] tabel = new double[5][3];
int x=0;
int y=0;
double max = 0; //inisialisasi variabel yang dibutuhkan
for(int y=0; y<tabel[0].length;y++){ //perulangan pertama
if(y==0){ //kondisi untuk y = 0 
    for(int x=0;x<tabel.length;){ //perulangan jika kondisi terpenuhi, yaitu input pada baris x kolom y secara berurut
        System.out.print("Masukkan umur " + mahasiswa[x] +" ");
        tabel[x][y] = input.nextInt();
        if(tabel[x][y]>umurMax){
            umurMax=tabel[x][y];
            nama=mahasiswa[x];
        }
        x++;
    }
}
else if(y==1){ //kondisi untuk y = 1
    for(int x=0;x<tabel.length;){ //perulangan jika kondisi terpenuhi, yaitu input pada baris x kolom y secara berurut
        System.out.print("Masukkan berat badan " + mahasiswa[x]+" ");
        tabel[x][y] = input.nextInt();
                         if(tabel[x][y]<beratMin){
                             beratMin=tabel[x][y];
                         }
        x++;
    }
}
else if(y==2){ //kondisi untuk y = 2
    for(int x=0;x<tabel.length;){ //perulangan jika kondisi terpenuhi, yaitu input pada baris x kolom y secara berurut
        System.out.print("Masukkan tinggi badan " + mahasiswa[x]+" ");
        tabel[x][y] = input.nextInt();
        totalTinggi+=tabel[x][y];
        x++;
    }
}
}        
double rataTinggi = totalTinggi/5;
System.out.println("Berat badan terendah diantara mahasiswa adalah seberat "+beratMin);
System.out.println("Rata-rata tinggi badan para mahasiswa adalah "+rataTinggi);
System.out.println("Mahasiswa tertua adalah "+nama+" dengan umur "+umurMax);
//output yang diminta
```
